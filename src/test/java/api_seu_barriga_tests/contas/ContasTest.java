package api_seu_barriga_tests.contas;

import org.junit.BeforeClass;
import org.junit.Test;

import api_seu_barriga_tests.login.LoginLogic;

public class ContasTest {
	private ContasLogic conta;
	private LoginLogic login;

	@BeforeClass
	public void fazerLogin() {
		login = new LoginLogic();
		login.fazerLogin();
		conta = new ContasLogic();
		conta.listarContas();
	}

	@Test
	public void id_0003DeveAdicionarUmaContaComSucesso() {
		conta.adicionarNovaConta();
	}

	@Test
	public void id_0004DeveAlterarNomeDaConta() {
		conta.alterarNomeDaConta();
	}

	@Test
	public void id_0005DeveValidarMenssagemDeErroDeCadastroDeConta() {
		conta.validarMenssagemDeErroDeCriacaoDeContaJaExistente();
	}

	@Test
	public void id_0008DeveValidarErroDeExclusaoDeContaComMovimentacao() {

		conta.validarMenssagemDeErroDeExclusaoDeContaComMovimentacao();
	}
}
