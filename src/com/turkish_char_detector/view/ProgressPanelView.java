package com.turkish_char_detector.view;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import com.turkish_char_detector.controller.ProgressPanelController;

public class ProgressPanelView extends JPanel {
  private static final long serialVersionUID = 1L;

  private JLabel expTextLabel;
  private JProgressBar progressBar;

  public ProgressPanelView() {
    createView();
    new ProgressPanelController(this);
  }

  private void createView() {
    add(getProgressBox());
  }

  private Box getProgressBox() {
    Box progressBox = Box.createVerticalBox();
    progressBox.add(Box.createVerticalStrut(5));
    progressBox.add(getProgressExpTextLabel());
    progressBox.add(Box.createVerticalStrut(5));
    progressBox.add(getProgressBar());
    progressBox.add(Box.createVerticalStrut(5));
    return progressBox;
  }

  private JLabel getProgressExpTextLabel() {
    if (expTextLabel == null) {
      // FIXME: Langutil
      expTextLabel =
          new JLabel("Dosyalar içindeki Türkçe karakterler dönüþtürülüyor.Lütfen bekleyiniz ... ");
    }
    return expTextLabel;
  }

  private JProgressBar getProgressBar() {
    if (progressBar == null) {
      progressBar = new JProgressBar();
    }
    return progressBar;
  }


}
