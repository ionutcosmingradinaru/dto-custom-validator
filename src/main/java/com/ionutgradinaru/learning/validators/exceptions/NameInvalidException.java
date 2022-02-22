package com.ionutgradinaru.learning.validators.exceptions;


public class NameInvalidException extends BaseException {

  private static final long code = 100L;
  private static final String message = "The name is invalid.";

  public NameInvalidException() {
    super(message, code);
  }
}
