package com.turkish_char_detector.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.ImageIcon;

public class Icon {
  private static final String ROOT_PATH = "resources\\icons\\";
  private static final String ICON_CONFIG_PATH = ROOT_PATH + "Icons.xml";
  private static Icon instance;
  private static Properties iconProps;

  public static Icon getInstance() {
    if (instance == null) {
      instance = new Icon();
    }
    return instance;
  }

  public Icon() {
    loadFromXML();
  }

  private void loadFromXML() {
    iconProps = new Properties();
    try {
      iconProps.loadFromXML(new FileInputStream(ICON_CONFIG_PATH));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static ImageIcon getBackIcon() {
    return new ImageIcon(iconProps.getProperty("backIcon"));
  }

  public static ImageIcon getNextIcon() {
    return new ImageIcon(iconProps.getProperty("nextIcon"));
  }

  public static ImageIcon getCancelIcon() {
    return new ImageIcon(iconProps.getProperty("cancelIcon"));
  }

  public static ImageIcon getSearchIcon() {
    return new ImageIcon(iconProps.getProperty("searchIcon"));
  }
}
