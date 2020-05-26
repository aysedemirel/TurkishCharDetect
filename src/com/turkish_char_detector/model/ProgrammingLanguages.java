package com.turkish_char_detector.model;

public enum ProgrammingLanguages {

  JAVA("Java"), C_PLUS("C++");

  private final String displayValue;

  private ProgrammingLanguages(String displayValue) {
    this.displayValue = displayValue;
  }

  public String getDisplayValue() {
    return displayValue;
  }

  @Override
  public String toString() {
    return displayValue;
  }
}
