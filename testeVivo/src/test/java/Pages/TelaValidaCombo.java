package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaValidaCombo {
	WebDriver navegador;

	public TelaValidaCombo(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	public void validarCombo() throws InterruptedException {
		Thread.sleep(2000);
		  WebElement confirmacao = navegador.findElement(By.xpath("(//button[@class='modal-confirmation-button'])[1]"));
	        String texto = confirmacao.getText();
	        Assert.assertEquals("Confirmar", texto);
	        System.out.println("_____________________________________");
	        System.out.println("               " + texto);
	        System.out.println("_____________________________________");
	        
	    }
	

}