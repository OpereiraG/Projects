package Class23Java;

public class WebBroswerTest {

    public static void main(String[] args) {
        WebDriver webDriver = new Chrome();

        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();


    }
}
