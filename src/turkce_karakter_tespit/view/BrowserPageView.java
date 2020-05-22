package turkce_karakter_tespit.view;

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
import javax.swing.JPanel;
import javax.swing.JTextField;
import turkce_karakter_tespit.util.Icons;

public class BrowserPageView extends JFrame {
  private static final long serialVersionUID = 1L;
  // TODO: create language file and read all strings from it
  private static final String EXPLANATION_TEXT = "Lütfen proje yolunu seçiniz... ";
  private static final String LANGUAGE = "Dil: ";
  private static final String[] LANGUAGE_ITEMS = {"Java", "C++"};

  private JLabel explanationText;
  private JTextField projectFolderPath;
  private JButton browserButton;
  private JLabel languageText;
  private JComboBox<String> languageCombobox;

  private JPanel buttonPanel;
  private JButton nextButton;
  private JButton backButton;
  private JButton cancelButton;

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
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.ipady = 0;
    gbc.weighty = 1.0;
    gbc.anchor = GridBagConstraints.PAGE_END;
    gbc.insets = new Insets(10, 10, 10, 10);
    gbc.gridwidth = 2;
    add(getButtonPanel(), gbc);
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
      explanationText = new JLabel(EXPLANATION_TEXT);
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

  private JButton getBrowserButton() {
    if (browserButton == null) {
      browserButton = new JButton(Icons.SEARCH_ICON);
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
      languageText = new JLabel(LANGUAGE);
    }
    return languageText;
  }

  private JComboBox<String> getLanguageCombobox() {
    if (languageCombobox == null) {
      languageCombobox = new JComboBox<>(LANGUAGE_ITEMS);
      languageCombobox.setBackground(Color.WHITE);
    }
    return languageCombobox;
  }

  private JPanel getButtonPanel() {
    if (buttonPanel == null) {
      buttonPanel = new JPanel();
      buttonPanel.add(getBackButton());
      buttonPanel.add(getNextButton());
      buttonPanel.add(getCancelButton());
    }
    return buttonPanel;
  }

  private JButton getBackButton() {
    if (backButton == null) {
      backButton = new JButton(Icons.BACK_ICON);
      backButton.setBackground(Color.WHITE);
    }
    return backButton;
  }

  private JButton getNextButton() {
    if (nextButton == null) {
      nextButton = new JButton(Icons.NEXT_ICON);
      nextButton.setBackground(Color.WHITE);
    }
    return nextButton;
  }

  private JButton getCancelButton() {
    if (cancelButton == null) {
      cancelButton = new JButton(Icons.CANCEL_ICON);
      cancelButton.setBackground(Color.WHITE);
    }
    return cancelButton;
  }
}
