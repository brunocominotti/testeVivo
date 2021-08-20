package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaValidaEndereco {
	WebDriver navegador;

	public TelaValidaEndereco(WebDriver navegador) {
		this.navegador = navegador;
	}

	public void validarEndereco() {
		for (String winHandle : navegador.getWindowHandles()) {
			navegador.switchTo().window(winHandle);
		}
		navegador.findElement(By.xpath("(//*[@class='section-directions-trip-description'])[1]")).click();
		WebElement confirmacao = navegador
				.findElement(By.xpath("(//span[@class='NkzuOd-trip-header-waypoint-V1ur5d'])[2]"));
		String texto = confirmacao.getText();
		Assert.assertEquals(
				"Joalheria Pandora, Av. Pres. Juscelino Kubitschek, 2041 - Loja 255 - Vila Nova Conceição, São Paulo - SP, 04543-011",
				texto);
		System.out.println(
				"_____________________________________________________________________________________________");
		System.out.println(texto);
		System.out.println(
				"_____________________________________________________________________________________________");
	}

}
