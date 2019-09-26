import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords


public class MyKeywords {
	@Keyword
	def hello(){
		println "asdas"
	}

	@Keyword
	def jSClick(TestObject el){
		WebElement element = WebUiBuiltInKeywords.findWebElement(el);
		JavascriptExecutor jsClick = (JavascriptExecutor) DriverFactory.getWebDriver();
		jsClick.executeScript("arguments[0].click();", element)
	}
}
