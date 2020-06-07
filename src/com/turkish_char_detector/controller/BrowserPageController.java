package com.turkish_char_detector.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
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
        setProjectChooser();
      }
    });
  }

  private void setProjectChooser() {
    int projectPathSelect = browserPageView.getProjectPathChooser().showOpenDialog(null);
    if (projectPathSelect == JFileChooser.APPROVE_OPTION) {
      // TODO: Add log system and log selected file path
      System.out.println("getSelectedFile() : " + browserPageView.getSelectedProjectPath());
      browserPageView.getProjectFolderPath().setText(browserPageView.getSelectedProjectName());
    } else {
      // TODO: Log the line
      System.out.println("No Selection ");
    }
  }

  private void addLanguageComboboxListener() {
    browserPageView.getLanguageCombobox().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        // TODO: Log the line
        System.out.println("Language: " + browserPageView.getSelectedLanguage());
      }
    });
  }
}
