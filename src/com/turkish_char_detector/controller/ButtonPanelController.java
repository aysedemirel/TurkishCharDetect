package com.turkish_char_detector.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.turkish_char_detector.view.ButtonPanelView;
import com.turkish_char_detector.view.MainFrame;

public class ButtonPanelController {
  private MainFrame mainFrame;
  private ButtonPanelView buttonPanelView;

  public ButtonPanelController(MainFrame mainFrame) {
    this.mainFrame = mainFrame;
    buttonPanelView = mainFrame.getButtonPanelView();
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
        buttonPanelView.getBackButton().setEnabled(true);
        if (mainFrame.getBrowserPageView().isVisible()) {
          mainFrame.remove(mainFrame.getBrowserPageView());
          mainFrame.getBrowserPageView().setVisible(false);
          mainFrame.add(mainFrame.getFilesFoundPageView());
          mainFrame.getFilesFoundPageView().setVisible(true);
          // FIXME: Langutil
          mainFrame.setTitle("Bulunan Dosyalar");
          mainFrame.pack();
          mainFrame.revalidate();
          mainFrame.repaint();
        } else if (mainFrame.getFilesFoundPageView().isVisible()) {
          mainFrame.remove(mainFrame.getFilesFoundPageView());
          mainFrame.getFilesFoundPageView().setVisible(false);
          mainFrame.add(mainFrame.getProgressPanelView());
          mainFrame.getProgressPanelView().setVisible(true);
          // FIXME: Langutil
          mainFrame.setTitle("Lütfen bekleyiniz ...");
          mainFrame.pack();
          mainFrame.revalidate();
          mainFrame.repaint();
          buttonPanelView.getBackButton().setEnabled(false);
          buttonPanelView.getNextButton().setEnabled(false);
        }
      }
    });
  }

  private void addBackButtonListener() {
    buttonPanelView.getBackButton().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Back");
        buttonPanelView.getNextButton().setEnabled(true);
        if (mainFrame.getFilesFoundPageView().isVisible()) {
          mainFrame.remove(mainFrame.getFilesFoundPageView());
          mainFrame.getFilesFoundPageView().setVisible(false);
          mainFrame.add(mainFrame.getBrowserPageView());
          mainFrame.getBrowserPageView().setVisible(true);
          // FIXME: Langutil
          mainFrame.setTitle("Lütfen proje yolunu seçiniz");
          mainFrame.pack();
          mainFrame.revalidate();
          mainFrame.repaint();
          buttonPanelView.getBackButton().setEnabled(false);
        }
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
