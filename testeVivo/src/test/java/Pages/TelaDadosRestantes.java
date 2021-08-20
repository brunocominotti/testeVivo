package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TelaDadosRestantes {
	WebDriver navegador;

	public TelaDadosRestantes(WebDriver navegador) {
		this.navegador = navegador;
	}

	public void preencherDados() throws InterruptedException {
		Thread.sleep(2000);
		// CLICAR CHECBOX
		navegador.findElement(By.xpath("(//input[@class='radioBtnClass'])[1]")).click();
		navegador.findElement(By.xpath("(//input[@class='radioBtnClass'])[5]")).click();
		// DADOS PESSOAIS
		navegador.findElement(By.xpath("//*[@id='name']")).sendKeys("James Adolfo");
		navegador.findElement(By.xpath("//*[@id='birthday']")).sendKeys("01/01/2001");
		navegador.findElement(By.xpath("//*[@id='email']")).sendKeys("J.A@google.com.br");
		navegador.findElement(By.xpath("//*[@id='email-confirm']")).sendKeys("J.A@google.com.br");
		navegador.findElement(By.xpath("//*[@id='cpf']")).sendKeys("780.746.050-43");
		navegador.findElement(By.xpath("//*[@id='mother-name']")).sendKeys("Alice Pausa");
		// DATA DE INSTALAÇÃO e telefone
		Thread.sleep(1000);
		navegador.findElement(By.xpath("//*[@id='phone']")).sendKeys("11978438579");
		navegador.findElement(By.xpath("//select[@id='day-payment']")).sendKeys(Keys.ARROW_DOWN);
		navegador.findElement(By.xpath("//select[@id='day-payment']")).sendKeys(Keys.ENTER);
		((RemoteWebDriver) navegador).executeScript("scrollBy(0,350)", "");
		Thread.sleep(1000);
		navegador.findElement(By.xpath("//*[@id='InstallDate']")).click();
		navegador.findElement(By.xpath("//*[@data-handler='selectDay']")).click();
		Thread.sleep(1000);
		navegador.findElement(By.xpath("//*[@id='InstallDate2']")).click();
		navegador.findElement(By.xpath("//*[@data-handler='selectDay']")).click();
		Thread.sleep(1000);
		navegador.findElement(By.xpath("//*[@id='InstallDate3']")).click();
		navegador.findElement(By.xpath("//*[@data-handler='selectDay']")).click();
		// CLICAR BTN FINLIZAR PEDIDO
		navegador.findElement(By.xpath("//*[@id='terms-conditions']")).click();
		navegador.findElement(By.xpath("(//*[@class='ico-finalizar'])[2]")).click();

	}

}
