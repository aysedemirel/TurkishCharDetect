package com.turkish_char_detector.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import com.turkish_char_detector.controller.ButtonPanelController;

public class MainFrame extends JFrame {
  private static final long serialVersionUID = 1L;

  private static final int MAIN_FRAME_X_SIZE = 1000;
  private static final int MAIN_FRAME_Y_SIZE = 700;
  private static final int MAIN_FRAME_X_LOCATION = 700;
  private static final int MAIN_FRAME_Y_LOCATION = 300;

  private GridBagConstraints gbc;
  private BrowserPageView browserPageView;
  private FilesFoundPageView filesFoundPageView;
  private ProgressPanelView progressPanelView;
  private ResultPanelView resultPanelView;
  private ButtonPanelView buttonPanelView;
  @SuppressWarnings("unused")
  private ButtonPanelController buttonPanelController;

  public MainFrame() {
    initMainFrame();
    initViews();
    initControllers();
  }

  private void initMainFrame() {
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(new Dimension(MAIN_FRAME_X_SIZE, MAIN_FRAME_Y_SIZE));
    setLocation(MAIN_FRAME_X_LOCATION, MAIN_FRAME_Y_LOCATION);
    // FIXME: Langutil
    setTitle("Lütfen proje yolunu seçiniz");
  }

  private void initViews() {
    initGridBagLayout();
    initGridBagConstraints();
    add(getBrowserPageView(), gbc);
    gbc.gridy = 1;
    gbc.ipady = 0;
    gbc.anchor = GridBagConstraints.PAGE_END;
    gbc.gridwidth = 2;
    add(getButtonPanelView(), gbc);
    pack();
  }

  private void initGridBagLayout() {
    GridBagLayout grid = new GridBagLayout();
    setLayout(grid);
  }

  private void initGridBagConstraints() {
    gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.CENTER;
    gbc.insets = new Insets(10, 10, 10, 10);
    gbc.weighty = 1.0;
  }

  private void initControllers() {
    buttonPanelController = new ButtonPanelController(this);
  }

  public BrowserPageView getBrowserPageView() {
    if (browserPageView == null) {
      browserPageView = new BrowserPageView();
      browserPageView.setVisible(true);
    }
    return browserPageView;
  }

  public FilesFoundPageView getFilesFoundPageView() {
    if (filesFoundPageView == null) {
      filesFoundPageView = new FilesFoundPageView();
      filesFoundPageView.setVisible(true);
    }
    return filesFoundPageView;
  }

  public ProgressPanelView getProgressPanelView() {
    if (progressPanelView == null) {
      progressPanelView = new ProgressPanelView();
      progressPanelView.setVisible(true);
    }
    return progressPanelView;
  }

  public ResultPanelView getResultPanelView() {
    if (resultPanelView == null) {
      resultPanelView = new ResultPanelView();
      resultPanelView.setVisible(true);
    }
    return resultPanelView;
  }

  public ButtonPanelView getButtonPanelView() {
    if (buttonPanelView == null) {
      buttonPanelView = new ButtonPanelView();
      buttonPanelView.setVisible(true);
    }
    return buttonPanelView;
  }

}
