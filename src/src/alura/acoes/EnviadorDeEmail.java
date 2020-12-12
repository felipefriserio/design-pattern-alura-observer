package src.alura.acoes;

import src.alura.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota{
	public void executa(NotaFiscal nf){
		System.out.println("enviei email");
	}
}
