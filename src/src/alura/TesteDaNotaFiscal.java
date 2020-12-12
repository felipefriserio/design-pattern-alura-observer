package src.alura;

import src.alura.acoes.EnviadorDeEmail;
import src.alura.acoes.EnviadorDeSms;
import src.alura.acoes.Impressora;
import src.alura.acoes.NotaFiscalDao;

public class TesteDaNotaFiscal {
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new EnviadorDeSms());
		builder.adicionaAcao(new Impressora());

		NotaFiscal nf = builder
				 .paraEmpresa("Caelum")
                 .comCnpj("123.456.789/0001-10")
                 .com(new ItemDaNota("item 1", 200.0))
                 .com(new ItemDaNota("item 2", 300.0))
                 .com(new ItemDaNota("item 3", 400.0))
                 .comObservacoes("entregar nf pessoalmente")
                 .constroi();
		 
		 System.out.println(nf.getValorBruto());
	}
}
