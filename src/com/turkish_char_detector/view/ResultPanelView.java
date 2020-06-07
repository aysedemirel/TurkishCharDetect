package com.turkish_char_detector.view;

import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import com.turkish_char_detector.controller.ResultPanelController;

public class ResultPanelView extends JPanel {
  private static final long serialVersionUID = 1L;
  // FIXME: example list
  private String[][] fileList =
      {{"101", "Amit", "", ""}, {"101", "Sachin", "", ""}, {"101", "Sachin", "", ""}};
  // FIXME: add to LangUtil -> get from enum
  private String[] tableColumnHeader = {"DOSYA ADI", "SATIR NO", "ÖNCE", "SONRA"};

  private JScrollPane resultListScroll;
  private JTable resultTable;

  public ResultPanelView() {
    createView();
    new ResultPanelController();
  }

  private void createView() {
    add(getResultBox());
  }

  private Box getResultBox() {
    Box resultBox = Box.createVerticalBox();
    resultBox.add(Box.createVerticalStrut(5));
    resultBox.add(getResultTableScroll());
    resultBox.add(Box.createVerticalStrut(5));
    return resultBox;
  }

  private JScrollPane getResultTableScroll() {
    if (resultListScroll == null) {
      resultListScroll = new JScrollPane(getResultTable());
      resultListScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
      resultListScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      resultListScroll.setAutoscrolls(true);
      resultListScroll.setMinimumSize(new Dimension(300, 200));
      resultListScroll.setPreferredSize(new Dimension(300, 100));
    }
    return resultListScroll;
  }

  private JTable getResultTable() {
    if (resultTable == null) {
      resultTable = new JTable(fileList, tableColumnHeader);
      resultTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

    }
    return resultTable;
  }

}
