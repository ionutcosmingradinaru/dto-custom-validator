package com.ionutgradinaru.learning.validators.exceptions;

public class StartDateIsNull extends BaseException {

  private final static long code = 101L;
  private final static String message = "The start date is invalid.";

  public StartDateIsNull() {
    super(message, code);
  }
}