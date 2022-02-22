package com.ionutgradinaru.learning.validators.exceptions;

import lombok.ToString;

@ToString
public class BaseException extends RuntimeException {

  private final String message;
  private final long code;

  public BaseException(final String message, final long code) {
    this.message = message;
    this.code = code;
  }
}
