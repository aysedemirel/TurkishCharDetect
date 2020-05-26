package com.turkish_char_detector.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.turkish_char_detector.view.ButtonPanelView;

public class ButtonPanelController {
  private ButtonPanelView buttonPanelView;

  public ButtonPanelController(ButtonPanelView buttonPanelView) {
    this.buttonPanelView = buttonPanelView;
    addListeners();
  }

  private void addListeners() {
    addNextButtonListener();
    addBackButtonListener();
    addCancelButtonListener();
  }

  private void addNextButtonListener() {
    buttonPanelView.getNextButton().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Next");
      }
    });
  }

  private void addBackButtonListener() {
    buttonPanelView.getBackButton().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Back");
      }
    });
  }

  private void addCancelButtonListener() {
    buttonPanelView.getCancelButton().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
  }
}
