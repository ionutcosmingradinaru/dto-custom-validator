package com.ionutgradinaru.learning.validators;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/test")
public class MyController {

  @PostMapping
  public String test(@Valid @RequestBody MyDto dto) {
    return "Successful!";
  }
}
