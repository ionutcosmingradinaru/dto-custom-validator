package com.ionutgradinaru.learning.validators;

import com.ionutgradinaru.learning.validators.exceptions.NameInvalidException;
import com.ionutgradinaru.learning.validators.exceptions.StartDateIsNull;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyErrorHandler {

  @ExceptionHandler(NameInvalidException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  private String nameInvalidExceptionHandler(NameInvalidException e) {
    return "Response: " + e;
  }

  @ExceptionHandler(StartDateIsNull.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ResponseBody
  private String startDateInvalidExceptionHandler(StartDateIsNull e) {
    return "Response: " + e;
  }
}
