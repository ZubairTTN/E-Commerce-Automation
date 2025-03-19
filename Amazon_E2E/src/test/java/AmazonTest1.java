import com.my.app.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest1 extends Base {
    @Test(priority = 1)
    public void searchAndToCart1() throws InterruptedException {
        HomePage homePage = new HomePage(driver, wait);
        homePage.searchProduct("Gaming Monitor");

        SearchPage searchPage = new SearchPage(driver, wait);
        searchPage.selectProduct(7);

        ProductPage productPage = new ProductPage(driver, wait);
        productPage.addToCartFunc();
    }

    @Test(priority = 2)
    public void searchAndToCart2() throws InterruptedException {
        HomePage homePage = new HomePage(driver, wait);
        homePage.searchProduct("Samsung S24");

        SearchPage searchPage = new SearchPage(driver, wait);
        searchPage.selectProduct(2);

        ProductPage productPage = new ProductPage(driver, wait);
        productPage.addToCartFunc();
    }

    @Test(priority = 3)
    public void addToCartFunc() throws InterruptedException {
        CartPage cartPage = new CartPage(driver, wait);
        cartPage.checkCart();
        cartPage.checkOutFunc();
        Assert.assertTrue(cartPage.checkOutPageVerify(), "CheckOut Button Not Visible");
    }
}
