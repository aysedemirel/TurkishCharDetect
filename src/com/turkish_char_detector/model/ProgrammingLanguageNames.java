package com.turkish_char_detector.model;

public enum ProgrammingLanguageNames {

  JAVA("Java"), C_PLUS("C++");

  private final String displayValue;

  private ProgrammingLanguageNames(String displayValue) {
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
