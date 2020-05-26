package com.turkish_char_detector.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.turkish_char_detector.view.BrowserPageView;

public class BrowserPageController {

  private BrowserPageView browserPageView;

  public BrowserPageController(BrowserPageView browserPageView) {
    this.browserPageView = browserPageView;
    addListeners();
  }

  private void addListeners() {
    addBrowserButtonListener();
    addLanguageComboboxListener();
  }

  private void addBrowserButtonListener() {
    browserPageView.getBrowserButton().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Browser");
      }
    });
  }

  private void addLanguageComboboxListener() {
    browserPageView.getLanguageCombobox().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Language");
      }
    });
  }
}
