package com.turkish_char_detector.view;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import com.turkish_char_detector.controller.FilesFoundPageController;

public class FilesFoundPageView extends JPanel {
  private static final long serialVersionUID = 1L;

  private JTable fileListTable;
  // FIXME: example list
  private String[][] fileList = {{"101", "Amit"}, {"101", "Sachin"}, {"101", "Sachin"}};
  // FIXME: add to LangUtil
  private String[] tableColumnHeader = {"FILE", "PATH"};

  private JScrollPane tableScroll;

  public FilesFoundPageView() {
    createPage();
    new FilesFoundPageController(this);
  }

  private void createPage() {
    add(getFilesTableScroll());
  }

  private JTable getFileListTable() {
    if (fileListTable == null) {
      fileListTable = new JTable(fileList, tableColumnHeader);
      fileListTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }
    return fileListTable;
  }

  private JScrollPane getFilesTableScroll() {
    if (tableScroll == null) {
      tableScroll = new JScrollPane(getFileListTable());
      tableScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
      tableScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      tableScroll.setAutoscrolls(true);
      tableScroll.setMinimumSize(new Dimension(300, 200));
      tableScroll.setPreferredSize(new Dimension(300, 100));
    }
    return tableScroll;
  }


}
