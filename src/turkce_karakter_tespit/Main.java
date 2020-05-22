package turkce_karakter_tespit;

import java.awt.Dimension;
import javax.swing.JFrame;
import turkce_karakter_tespit.view.BrowserPageView;

public class Main {
  private static final int BROSER_PAGE_X_SIZE = 400;
  private static final int BROSER_PAGE_Y_SIZE = 400;
  private static final int BROSER_PAGE_X_LOCATION = 700;
  private static final int BROSER_PAGE_Y_LOCATION = 300;

  private BrowserPageView browserPageView;

  public Main() {
    init();
  }

  private void init() {
    browserPageView = new BrowserPageView();
    browserPageView.setVisible(true);
    browserPageView.setSize(new Dimension(BROSER_PAGE_X_SIZE, BROSER_PAGE_Y_SIZE));
    browserPageView.setLocation(BROSER_PAGE_X_LOCATION, BROSER_PAGE_Y_LOCATION);
    browserPageView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Main();
  }
}
