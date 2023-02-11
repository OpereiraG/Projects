package Class23Java;

public class WebDriver {

    public void startBrowser(){
        System.out.println("starting the broswer");
    }
    public void openURL(){
        System.out.println("navigate to URL");
    }
    public void testLoginPage(){
        System.out.println("checking if login page works");
    }
    public void closeBrowser(){
        System.out.println("Closing the Google Chrome");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening the Chrome Browser");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the URL in Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Test login page in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the browser");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opening the Safari Browser");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the URL in Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Test login page in Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the browser");
    }
}
