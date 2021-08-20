package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class TelaMonteSeuCombo {
	WebDriver navegador;

	public TelaMonteSeuCombo(WebDriver navegador) {
		this.navegador = navegador;
	}

	public void montarCombo() throws InterruptedException {
		Thread.sleep(3000);
		// CLICAR NO PLANO VIVO FIBRA
		navegador.findElement(By.xpath("(//*[@title='Adicionar ao carrinho'])[7]")).click();
		// CLICAR NO PLANO VIVO INTERNET E SELECIONAR PACOTE
		navegador.findElement(By.xpath("//div[@class='netflix-tab-container']")).click();
		navegador.findElement(By.id("btn-add-combo-2-hasNetflix")).click();
		// CLICAR BTN CONCLUIR PEDIDO
		Thread.sleep(1000);
		((RemoteWebDriver) navegador).executeScript("scrollBy(0,1350)", "");
		navegador.findElement(By.xpath("//*[@id='btn-forward']")).click();
		
		
	}

}
