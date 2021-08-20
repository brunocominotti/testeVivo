package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaLoja {
	WebDriver navegador;

	public TelaLoja(WebDriver navegador) {
		this.navegador = navegador;
	}

	public void falarAura() throws InterruptedException {
		// CLICAR PRA FALAR COM A AURA
		navegador.findElement(By.xpath("//*[@id='launch_button']")).click();
		navegador.findElement(By.xpath("//*[@id='btnComecar']")).click();
		// CLICAR NO CAMPO, PREENCHER E CLICAR EM PROCURAR
		Thread.sleep(2000);
		navegador.findElement(By.xpath("//*[@id='chatSend']")).sendKeys("Encontre uma loja");
		navegador.findElement(By.xpath("//*[@id='fab_send']")).click();
		// CLICAR LOCALIZAR LOJA
		Thread.sleep(2000);
		navegador.findElement(By.xpath("//*[@href='http://vivo.tl/lojasvivo']")).click();
	}

	public void procurarLoja() throws InterruptedException {
		// INSERIR CEP
		for (String winHandle : navegador.getWindowHandles()) {
			navegador.switchTo().window(winHandle);
		}
		Thread.sleep(2000);
		navegador.findElement(By.xpath("//input[@name='search']")).sendKeys("04551-000");
		navegador.findElement(By.xpath("//*[@class='map__result-list--focus']")).click();
		// CLICAR ENDEREÇO LOJA
		navegador.findElement(By.xpath("(//h4[@class='body black'])[1]")).click();
		navegador.findElement(By.xpath("//*[@class='button__transparent button__strong']")).click();

	}

}
