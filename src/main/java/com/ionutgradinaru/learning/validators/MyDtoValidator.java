package com.ionutgradinaru.learning.validators;

import com.ionutgradinaru.learning.validators.exceptions.NameInvalidException;
import com.ionutgradinaru.learning.validators.exceptions.StartDateIsNull;
import lombok.SneakyThrows;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MyDtoValidator implements ConstraintValidator<MyAnnotation, MyDto> {

  private static final String ONLY_STATUS = "only_status";

  private final Predicate<String> nameIsValid = name -> Objects.nonNull(name) && !name.isBlank();
  private final BiPredicate<LocalDate, LocalDate> datesAreValid = LocalDate::isBefore;
  private final Predicate<String> statusExists = status -> Objects.equals(ONLY_STATUS, status);

  @SneakyThrows
  @Override
  public boolean isValid(MyDto value, ConstraintValidatorContext context) {
    if (!nameIsValid.test(value.getName())) {
      throw new NameInvalidException();
    } else if (Objects.isNull(value.getStartTime())) {
      throw new StartDateIsNull();
    } else if (Objects.isNull(value.getEndTime())) {
      throw new RuntimeException("The end time is null.");
    } else if (!datesAreValid.test(value.getStartTime(), value.getStartTime())) {
      throw new RuntimeException("The start time is after end time.");
    } else if (!statusExists.test(value.getStatus())) {
      throw new RuntimeException("The status value doesn't exist.");
    }

    return true;
  }
}
