package src.alura.acoes;

import src.alura.NotaFiscal;

public class NotaFiscalDao implements AcaoAposGerarNota{
	public void executa(NotaFiscal nf){
		System.out.println("salvei no banco");
	}
}
