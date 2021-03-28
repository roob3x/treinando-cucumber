package Pages;

import org.openqa.selenium.By;

public class Leftnavmenu {
    public static By DROPBOX_input_Forms = By.xpath("//a[contains( text(), 'Input Forms')]");
    public static By DROPBOX_DATE_PICKERS = By.xpath("//a[contains( text(), 'Date pickers')]");
    public static By DROPBOX_TABLE = By.xpath("//a[contains( text(), 'Table')]");
    public static By ALERT_LEARN_SELENIUM = By.xpath("//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]");
    public static By MENU_LIST_TABLE = By.xpath("//li[@class=\"tree-branch\"]//a[contains( text(), 'Table')]");
    public static By MENU_LIST_TABLE_SORT = By.xpath("//li[@class=\"tree-branch\"]//a[contains( text(), 'Table Sort')]");
    public static By TABLE_SORT_POSITION_0 = By.xpath("//div[@id=\"example_wrapper\"]//tbody//td[2]");
}
