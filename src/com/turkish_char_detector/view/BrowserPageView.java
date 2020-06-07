package com.turkish_char_detector.view;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.turkish_char_detector.controller.BrowserPageController;
import com.turkish_char_detector.model.ProgrammingLanguageNames;
import com.turkish_char_detector.util.Icon;
import com.turkish_char_detector.util.LangUtil;

public class BrowserPageView extends JPanel {
  private static final long serialVersionUID = 1L;

  private JLabel explanationText;
  private JTextField projectFolderPath;
  private JButton browserButton;
  private JLabel languageText;
  private JComboBox<ProgrammingLanguageNames> languageCombobox;
  private JFileChooser projectPathChooser;

  public BrowserPageView() {
    createPage();
    new BrowserPageController(this);
  }

  private void createPage() {
    add(getBrowserPanel());
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

  public JTextField getProjectFolderPath() {

    if (projectFolderPath == null) {
      projectFolderPath = new JTextField("", 12);
      projectFolderPath.setBackground(Color.WHITE);
      projectFolderPath.setOpaque(true);
      projectFolderPath.setEditable(false);
      projectFolderPath.setFocusable(false);
      projectFolderPath.setMaximumSize(new Dimension(600, 30));
      projectFolderPath.setPreferredSize(new Dimension(600, 30));
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

  public JComboBox<ProgrammingLanguageNames> getLanguageCombobox() {
    if (languageCombobox == null) {
      languageCombobox = new JComboBox<ProgrammingLanguageNames>();
      languageCombobox.setModel(
          new DefaultComboBoxModel<ProgrammingLanguageNames>(ProgrammingLanguageNames.values()));
      languageCombobox.setBackground(Color.WHITE);
    }
    return languageCombobox;
  }

  public JFileChooser getProjectPathChooser() {
    if (projectPathChooser == null) {
      projectPathChooser = new JFileChooser();
      projectPathChooser.setCurrentDirectory(new java.io.File("."));
      projectPathChooser.setDialogTitle(LangUtil.getString("CHOOSER_TITLE"));
      projectPathChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      projectPathChooser.setAcceptAllFileFilterUsed(false);
    }
    return projectPathChooser;
  }

  public File getSelectedProjectPath() {
    return projectPathChooser.getSelectedFile();
  }

  public String getSelectedProjectName() {
    String projectPath = projectPathChooser.getSelectedFile().getPath();
    int beginningIndex = projectPath.lastIndexOf('\\') + 1;
    String projectName = projectPath.substring(beginningIndex, projectPath.length());
    return projectName;
  }

  public String getSelectedLanguage() {
    return languageCombobox.getSelectedItem().toString();
  }
}
