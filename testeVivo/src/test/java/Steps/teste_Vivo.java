package Steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.TelaDadosRestantes;
import Pages.TelaHomeCombo;
import Pages.TelaLoja;
import Pages.TelaMonteSeuCombo;
import Pages.TelaProdutosEServicos;
import Pages.TelaValidaCombo;
import Pages.TelaValidaEndereco;
import Screenshot.CriarPasta;
import Screenshot.GerarDataArquivo;
import Screenshot.GerarPrint;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class teste_Vivo {
	private WebDriver navegador;
	private CriarPasta pasta = new CriarPasta();

	@Rule
	public TestName testName = new TestName();

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src//test//resources//Driver//chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.manage().window().maximize();
		navegador.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@Dado("que estou no site https://www.vivo.com.br")
	public void queEstouNoSiteHttpsWwwVivoComBr() {
		navegador.get("https://www.vivo.com.br");

	}

	@E("seleciono Monte seu Combo e preencho meus dados")
	public void selecionoMonteSeuComboEPreenchoMeusDados() throws InterruptedException, IOException {
		pasta.criarPasta("fluxo1");
		TelaHomeCombo telaHomeCombo = new TelaHomeCombo(navegador);
		telaHomeCombo.selecionarMonteCombo();
		Thread.sleep(1000);
		String screenshotArquivo = pasta.getPasta() + "//" + GerarDataArquivo.dataHoraParaArquivo()
				+ testName.getMethodName() + ".png";
		GerarPrint.take(navegador, screenshotArquivo);

		TelaHomeCombo telaHomeCombo1 = new TelaHomeCombo(navegador);
		telaHomeCombo1.preencherDadosDisponibilidade();
		Thread.sleep(1000);
		String screenshotArquivo1 = pasta.getPasta() + "//" + GerarDataArquivo.dataHoraParaArquivo()
				+ testName.getMethodName() + ".png";
		GerarPrint.take(navegador, screenshotArquivo1);

	}

	@E("monto meu combo")
	public void montoMeuCombo() throws InterruptedException, IOException {
		TelaMonteSeuCombo telaMonteSeuCombo = new TelaMonteSeuCombo(navegador);
		telaMonteSeuCombo.montarCombo();
		Thread.sleep(1000);
		String screenshotArquivo = pasta.getPasta() + "//" + GerarDataArquivo.dataHoraParaArquivo()
				+ testName.getMethodName() + ".png";
		GerarPrint.take(navegador, screenshotArquivo);

	}

	@E("forneco os dados restantes")
	public void fornecoOsDadosRestantes() throws InterruptedException, IOException {
		TelaDadosRestantes telaDadosRestantes = new TelaDadosRestantes(navegador);
		telaDadosRestantes.preencherDados();
		Thread.sleep(1000);
		String screenshotArquivo = pasta.getPasta() + "//" + GerarDataArquivo.dataHoraParaArquivo()
				+ testName.getMethodName() + ".png";
		GerarPrint.take(navegador, screenshotArquivo);

	}

	@Entao("valido se botao de finalizar pedido esta clicavel")
	public void validoSeBotaoDeFinalizarPedidoEstaClicvel() throws InterruptedException, IOException {
		TelaValidaCombo telaValidaCombo = new TelaValidaCombo(navegador);
		telaValidaCombo.validarCombo();
		Thread.sleep(1000);
		String screenshotArquivo = pasta.getPasta() + "//" + GerarDataArquivo.dataHoraParaArquivo()
				+ testName.getMethodName() + ".png";
		GerarPrint.take(navegador, screenshotArquivo);

	}

	@Quando("clico Produtos e Servicos")
	public void clicoProdutosEServicos() throws IOException, InterruptedException {
		pasta.criarPasta("fluxo2");
		TelaProdutosEServicos telaProdutosEServicos = new TelaProdutosEServicos(navegador);
		telaProdutosEServicos.escolherProduto();
		Thread.sleep(1000);
		String screenshotArquivo = pasta.getPasta() + "//" + GerarDataArquivo.dataHoraParaArquivo()
				+ testName.getMethodName() + ".png";
		GerarPrint.take(navegador, screenshotArquivo);

	}

	@Quando("clico no icone da Aura e pesquiso por lojas")
	public void clicoNoIconeDaAuraEPesquisoPorLojas() throws InterruptedException, IOException {
		TelaLoja telaLoja = new TelaLoja(navegador);
		telaLoja.falarAura();
		Thread.sleep(1000);
		String screenshotArquivo = pasta.getPasta() + "//" + GerarDataArquivo.dataHoraParaArquivo()
				+ testName.getMethodName() + ".png";
		GerarPrint.take(navegador, screenshotArquivo);

		TelaLoja telaLoja1 = new TelaLoja(navegador);
		telaLoja1.procurarLoja();
		Thread.sleep(1000);
		String screenshotArquivo1 = pasta.getPasta() + "//" + GerarDataArquivo.dataHoraParaArquivo()
				+ testName.getMethodName() + ".png";
		GerarPrint.take(navegador, screenshotArquivo1);

	}

	@Entao("valido o endereco de destino")
	public void validoOEnderecoDeDestino() throws IOException, InterruptedException {
		TelaValidaEndereco telaValidaEndereco = new TelaValidaEndereco(navegador);
		telaValidaEndereco.validarEndereco();
		Thread.sleep(1000);
		String screenshotArquivo = pasta.getPasta() + "//" + GerarDataArquivo.dataHoraParaArquivo()
				+ testName.getMethodName() + ".png";
		GerarPrint.take(navegador, screenshotArquivo);

	}
}
