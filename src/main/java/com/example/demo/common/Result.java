package com.example.demo.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Result<T> implements Serializable {

  private static final long serialVersionUID = 8268876203456580386L;
  private String code;
  private String message;
  private T data;

  public String getCode() {
    return code == null ? "0" : code;
  }

  public String getMessage() {
    return message == null ? "OK" : message;
  }

  public Result() {
  }

  public Result(T data) {
    this.data = data;
  }

  public Result(String code, String msg) {
    this.code = code;
    this.message = msg;
  }

}
