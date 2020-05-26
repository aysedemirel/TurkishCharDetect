package com.turkish_char_detector.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.turkish_char_detector.util.Icon;
import com.turkish_char_detector.util.LangUtil;

public class BrowserPageView extends JFrame {
  private static final long serialVersionUID = 1L;
  // TODO: make languge-items enum
  private static final String[] LANGUAGE_ITEMS = {"Java", "C++"};

  private JLabel explanationText;
  private JTextField projectFolderPath;
  private JButton browserButton;
  private JLabel languageText;
  private JComboBox<String> languageCombobox;

  public BrowserPageView() {
    createPage();
  }

  private void createPage() {
    GridBagLayout grid = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    setLayout(grid);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.CENTER;
    gbc.insets = new Insets(10, 10, 10, 10);
    gbc.weighty = 1.0;

    add(getBrowserPanel(), gbc);
    gbc.gridy = 1;
    gbc.ipady = 0;
    gbc.anchor = GridBagConstraints.PAGE_END;
    gbc.gridwidth = 2;
    add(ButtonPanelView.getInstance(), gbc);
  }

  private Box getBrowserPanel() {
    Box browserBox = Box.createVerticalBox();
    browserBox.add(getExplanationJLabel());
    browserBox.add(Box.createVerticalStrut(10));
    browserBox.add(getBrowserBox());
    browserBox.add(Box.createVerticalStrut(10));
    browserBox.add(getLanguageBox());
    browserBox.add(Box.createVerticalStrut(10));
    return browserBox;
  }

  private JLabel getExplanationJLabel() {
    if (explanationText == null) {
      explanationText = new JLabel(LangUtil.getString("EXPLANATION_TEXT"));
    }
    return explanationText;
  }

  private Box getBrowserBox() {
    Box browserBox = Box.createHorizontalBox();
    browserBox.add(getProjectFolderPath());
    browserBox.add(Box.createHorizontalStrut(10));
    browserBox.add(getBrowserButton());
    return browserBox;
  }

  private JTextField getProjectFolderPath() {

    if (projectFolderPath == null) {
      projectFolderPath = new JTextField("", 12);
      projectFolderPath.setBackground(Color.WHITE);
      projectFolderPath.setOpaque(true);
      projectFolderPath.setEditable(false);
      projectFolderPath.setFocusable(false);
      projectFolderPath.setMaximumSize(new Dimension(400, 30));
    }
    return projectFolderPath;
  }

  public JButton getBrowserButton() {
    if (browserButton == null) {
      browserButton = new JButton(Icon.getSearchIcon());
      browserButton.setBackground(Color.WHITE);
    }
    return browserButton;
  }

  private Box getLanguageBox() {
    Box languageBox = Box.createHorizontalBox();
    languageBox.add(getLanguageTextLabel());
    languageBox.add(Box.createHorizontalStrut(10));
    languageBox.add(getLanguageCombobox());
    return languageBox;
  }

  private JLabel getLanguageTextLabel() {
    if (languageText == null) {
      languageText = new JLabel(LangUtil.getString("LANGUAGE") + ":");
    }
    return languageText;
  }

  public JComboBox<String> getLanguageCombobox() {
    if (languageCombobox == null) {
      languageCombobox = new JComboBox<>(LANGUAGE_ITEMS);
      languageCombobox.setBackground(Color.WHITE);
    }
    return languageCombobox;
  }
}
