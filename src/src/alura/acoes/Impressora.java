package src.alura.acoes;

import src.alura.NotaFiscal;

public class Impressora implements AcaoAposGerarNota{
	public void executa(NotaFiscal nf){
		System.out.println("nota impressa");
	}
}
