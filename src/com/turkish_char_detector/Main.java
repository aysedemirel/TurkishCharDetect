package com.turkish_char_detector;

import com.turkish_char_detector.util.Icon;
import com.turkish_char_detector.util.LangUtil;
import com.turkish_char_detector.view.MainFrame;

public class Main {

  public Main() {
    LangUtil.getInstance();
    Icon.getInstance();
    new MainFrame();
  }

  public static void main(String[] args) {
    new Main();
  }
}
