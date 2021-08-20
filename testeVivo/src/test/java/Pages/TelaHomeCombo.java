package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaHomeCombo {
	WebDriver navegador;

	public TelaHomeCombo(WebDriver navegador) {
		this.navegador = navegador;
	}

	public void selecionarMonteCombo() {
		// SELECIONAR COMBO
		navegador.findElement(By.xpath("//*[@class='menu-item-list-2']")).click();
		navegador.findElement(By.xpath("(//*[@class='destaque-banner__item__content'])[13]")).click();
	}

	public void preencherDadosDisponibilidade() throws InterruptedException {
		Thread.sleep(2000);
		// PREENCHER DADOS DE DISPONIBILIDADE
		navegador.findElement(By.xpath("//*[@id='first_field_cc']")).sendKeys("James Adolfo");
		navegador.findElement(By.xpath("//*[@id='telefone_1']")).sendKeys("11978438579");
		navegador.findElement(By.xpath("//*[@id='cep_1']")).sendKeys("04551000");
		navegador.findElement(By.xpath("//*[@id='number']")).sendKeys("66");
		Thread.sleep(2000);
		navegador.findElement(By.xpath("//button[@class='btn-consult btn-orange']")).click();

	}

}
