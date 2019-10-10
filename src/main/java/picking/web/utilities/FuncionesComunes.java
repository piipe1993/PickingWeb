package picking.web.utilities;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.time.InternalSystemClock;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class FuncionesComunes extends PageObject {

    public void waitElement(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementTxt(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class);
        wait.until(ExpectedConditions.textToBePresentInElement(element, "�En cuantas cuotas deseas pagar?"));
    }

    public void waitLstElement(List<WebElement> element) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class);
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }


    public void waitElementClicleable(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public void waitElementInvisibility(WebElement element) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class);
        wait.until(ExpectedConditions.invisibilityOf((element)));
    }


    public void scrollUp() {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        //jse.executeScript("arguments[0].scrollIntoView();", lstAddToCart.get(i));
        jse.executeScript("scroll(250, 0)");
    }

    public void scrollDown(String tam) {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("scroll(0, " + tam + ")");
    }

    public String normalizeString(String str) {
        str = str.replace("�", "a").replace("�", "e").replace("�", "i").replace("�", "o").replace("�", "u").replace("�", "n").
                replace("�", "A").replace("�", "E").replace("�", "I").replace("�", "O").replace("�", "U").replace("�", "N");

        return str;
    }

    public String createEmail() {

        String strCreateEmail = "";
        String strUnregisteredEmail = "";
        String[] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        for (int i = 0; i <= 10; i++) {

            int numRandon = (int) Math.round(Math.random() * 25);
            strCreateEmail = strCreateEmail + abecedario[numRandon];

        }

        strUnregisteredEmail = strCreateEmail + "@GMAIL.COM";
        return strUnregisteredEmail;

    }

	public static void waitTime(int seconds) {
		new InternalSystemClock().pauseFor(seconds * 1000);
	}


	public boolean waitForJSandJQueryToLoad() {

		WebDriverWait wait = new WebDriverWait(getDriver(), 30);

		// wait for jQuery to load
		ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				try {
					return ((Long)((JavascriptExecutor)getDriver()).executeScript("return jQuery.active") == 0);
				}
				catch (Exception e) {
					// no jQuery present
					return true;
				}
			}
		};

		// wait for Javascript to load
		ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor)getDriver()).executeScript("return document.readyState")
						.toString().equals("complete");
			}
		};

		return wait.until(jQueryLoad) && wait.until(jsLoad);
	}


	public void waitWhileElementHasAttributeValue(WebElement webElement, String attribute, String value) {
		while(webElement.getAttribute(attribute).contains(value)) {
			int timeout = 20;
			if(timeout > 0) {
				timeout--;
				try {
					System.out.println(attribute + "t" + value);
					Thread.sleep(2000);
				} catch(Exception e) {

				}
			}
		}
	}

	public static void fluentWaitVisibility(WebDriver webDriver, WebElement webElement, String text) {
		new FluentWait<>(webDriver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(java.util.NoSuchElementException.class)
				.until(ExpectedConditions.textToBePresentInElement(webElement, text));
	}

}
