package Seminar5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {
    /**
     * Напишите автоматизированный тест, который выполнит следующие шаги:
     * 1. Открывает главную страницу Google.
     * 2. Вводит "Selenium" в поисковую строку и нажимает кнопку "Поиск в Google".
     * 3. В результатах поиска ищет ссылку на официальный сайт Selenium
     * (https://www.selenium.dev) и проверяет, что ссылка действительно присутствует среди
     * результатов поиска.
     */
    @Test
    void findSelenium (){
        WebDriver webDriver = new EdgeDriver(); // прописываем драйвер используемого нами браузера
        webDriver.get("https://www.google.ru/");
        WebElement webElement = webDriver.findElement(By.name("q"));
        webElement.sendKeys("Selenium");
        webElement.submit();

        webElement = webDriver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/div/div/div/cite")); // Открыть в браузере интересующий нас сайт, затем открыть инструменты разработчика - исследовать элемент - копировать xpath нужного нам элемента

        assertEquals("https://www.selenium.dev", webElement.getText());
        webDriver.quit();
    }


    /**
     * Нужно написать сквозной тест с использованием Selenium, который авторизует пользователя на
     * сайте https://www.saucedemo.com/.
     * Данные для входа - логин: "standard_user", пароль: "secret_sauce".
     * Проверить, что авторизация прошла успешно и отображаются товары.
     * Вам необходимо использовать WebDriver для открытия страницы и методы sendKeys() для ввода
     * данных в поля формы, и submit() для отправки формы. После этого, проверьте, что на странице
     * отображаются продукты (productsLabel.getText() = "Products").
     */
    @Test
    void AuthorizationTest() {
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://www.saucedemo.com/");

        WebElement webElement = webDriver.findElement(By.name("user-name"));
        webElement.sendKeys("standard_user");
        webElement = webDriver.findElement(By.id("password"));
        webElement.sendKeys("secret_sauce");
        webElement = webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input"));
        webElement.click();
        webElement = webDriver.findElement(By.className("title"));

        assertEquals("Products", webElement.getText());
        webDriver.quit();
    }
}
