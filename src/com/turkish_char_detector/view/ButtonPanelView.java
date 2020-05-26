package com.turkish_char_detector.view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import com.turkish_char_detector.util.Icon;

public class ButtonPanelView extends JPanel {
  private static final long serialVersionUID = 1L;

  private static ButtonPanelView instance;

  private JButton nextButton;
  private JButton backButton;
  private JButton cancelButton;

  public static ButtonPanelView getInstance() {
    if (instance == null) {
      instance = new ButtonPanelView();
    }
    return instance;
  }

  public ButtonPanelView() {
    add(getBackButton());
    add(getNextButton());
    add(getCancelButton());
  }

  public JButton getBackButton() {
    if (backButton == null) {
      backButton = new JButton(Icon.getBackIcon());
      backButton.setBackground(Color.WHITE);
    }
    return backButton;
  }

  public JButton getNextButton() {
    if (nextButton == null) {
      nextButton = new JButton(Icon.getNextIcon());
      nextButton.setBackground(Color.WHITE);
    }
    return nextButton;
  }

  public JButton getCancelButton() {
    if (cancelButton == null) {
      cancelButton = new JButton(Icon.getCancelIcon());
      cancelButton.setBackground(Color.WHITE);
    }
    return cancelButton;
  }
}
