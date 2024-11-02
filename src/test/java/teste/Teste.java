package teste;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import elementos.Elementos;
import metodos.Metodos;
import navegadores.Navegadores;

public class Teste extends Elementos {

	Metodos metodo = new Metodos();
	Navegadores navegador = new Navegadores();

	@Test
	public void pesquisarSapato() throws InterruptedException {
		navegador.abrirNavegador();
		metodo.escrever(pesquisar, "Botas");
		metodo.clicar(btnPesquisar);
		metodo.clicar(selectBota);
		metodo.clicar(selectTamanho);
		Thread.sleep(3000);
		metodo.clicar(btnComprar);
		Thread.sleep(4000);
		metodo.validarResumoCompra(resumoCompra, "R$ 159,99");

	}

	@AfterEach
	public void encerrarTeste() {
		navegador.fecharNavegador();

	}

}
