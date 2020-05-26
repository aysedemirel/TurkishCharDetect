package com.turkish_char_detector;

import java.awt.Dimension;
import javax.swing.JFrame;
import com.turkish_char_detector.controller.BrowserPageController;
import com.turkish_char_detector.controller.ButtonPanelController;
import com.turkish_char_detector.util.Icon;
import com.turkish_char_detector.util.LangUtil;
import com.turkish_char_detector.view.BrowserPageView;
import com.turkish_char_detector.view.ButtonPanelView;

public class Main {
  private static final int BROSER_PAGE_X_SIZE = 400;
  private static final int BROSER_PAGE_Y_SIZE = 400;
  private static final int BROSER_PAGE_X_LOCATION = 700;
  private static final int BROSER_PAGE_Y_LOCATION = 300;

  private BrowserPageView browserPageView;
  @SuppressWarnings("unused")
  private BrowserPageController browserPageController;
  @SuppressWarnings("unused")
  private ButtonPanelController buttonPanelController;

  public Main() {
    LangUtil.getInstance();
    Icon.getInstance();
    initViews();
    initControllers();
  }

  private void initViews() {
    browserPageView = new BrowserPageView();
    browserPageView.setVisible(true);
    browserPageView.setSize(new Dimension(BROSER_PAGE_X_SIZE, BROSER_PAGE_Y_SIZE));
    browserPageView.setLocation(BROSER_PAGE_X_LOCATION, BROSER_PAGE_Y_LOCATION);
    browserPageView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  private void initControllers() {
    browserPageController = new BrowserPageController(browserPageView);
    buttonPanelController = new ButtonPanelController(ButtonPanelView.getInstance());
  }

  public static void main(String[] args) {
    new Main();
  }
}
