package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaProdutosEServicos {
	WebDriver navegador;

	public TelaProdutosEServicos(WebDriver navegador) {
		this.navegador = navegador;
	}

	public void escolherProduto() {
		// CLICAR PRODUTO E SERVICOS
		navegador.findElement(By.xpath("//*[@class='menu-item-list-2']")).click();
	}

}
