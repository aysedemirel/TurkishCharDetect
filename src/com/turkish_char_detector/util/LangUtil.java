package com.turkish_char_detector.util;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.ResourceBundle;

public class LangUtil {
  private static final String BUNDLE_FILE_NAME = "ApplicationResources";
  private static final File RESOURCE_BUNDLE_FILE = new File("resources\\lang\\");
  private static ClassLoader loader;
  private static ResourceBundle resouceBundle;
  private static URL[] urls;

  private static LangUtil instance;

  public static LangUtil getInstance() {
    if (instance == null) {
      instance = new LangUtil();
    }
    return instance;
  }

  public LangUtil() {
    createBundleLoader();
    loadBundle();
  }

  private void createBundleLoader() {
    try {
      urls = new URL[] {RESOURCE_BUNDLE_FILE.toURI().toURL()};
      loader = new URLClassLoader(urls);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }

  public void loadBundle() {
    try {
      resouceBundle = ResourceBundle.getBundle(BUNDLE_FILE_NAME, Locale.getDefault(), loader);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void setBundleDefaultEng() {
    Locale.setDefault(new Locale("en", "US"));
  }

  public void setBundleDefaultTr() {
    Locale.setDefault(new Locale("tr", "TR"));
  }

  public static String getString(String key) {
    return resouceBundle.getString(key);
  }
}
