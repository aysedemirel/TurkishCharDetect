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
    // TODO: move next,back,cancel in a private controller
    addNextButtonListener();
    addBackButtonListener();
    addCancelButtonListener();
    addBrowserButtonListener();
    addLanguageComboboxListener();
  }

  private void addNextButtonListener() {
    browserPageView.getNextButton().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Next");
      }
    });
  }

  private void addBackButtonListener() {
    browserPageView.getBackButton().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Back");
      }
    });
  }

  private void addCancelButtonListener() {
    browserPageView.getCancelButton().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
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
