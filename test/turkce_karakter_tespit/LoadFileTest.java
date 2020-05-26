package turkce_karakter_tespit;

import static org.junit.Assert.assertEquals;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.junit.Test;

public class LoadFileTest {

  @Test
  public void testLangProperties() {
    String rootPath = "resources\\lang\\";// Thread.currentThread().getContextClassLoader().getResource("").getPath();
    String engLangPath = rootPath + "ApplicationResources_en_US.properties";
    String trLangPath = rootPath + "ApplicationResources_tr_TR.properties";
    Properties engProps = new Properties();
    Properties trProps = new Properties();
    try {
      engProps.load(new FileInputStream(engLangPath));
      trProps.load(new FileInputStream(trLangPath));
    } catch (IOException e1) {
      e1.printStackTrace();
    }

    assertEquals("Language", engProps.getProperty("LANGUAGE"));
    assertEquals("Dil", trProps.getProperty("LANGUAGE"));
  }

  @Test
  public void testIconXML() {
    String rootPath = "resources\\icons\\";
    String iconConfigPath = rootPath + "Icons.xml";
    Properties iconProps = new Properties();
    try {
      iconProps.loadFromXML(new FileInputStream(iconConfigPath));
    } catch (IOException e) {
      e.printStackTrace();
    }
    assertEquals("resources\\\\icons\\\\back-arrow-32.png", iconProps.getProperty("backIcon"));
    assertEquals("resources\\\\icons\\\\forward-button-32.png", iconProps.getProperty("nextIcon"));
    assertEquals("resources\\\\icons\\\\cancel-32.png", iconProps.getProperty("cancelIcon"));
    assertEquals("resources\\\\icons\\\\search-32.png", iconProps.getProperty("searchIcon"));
  }
}
