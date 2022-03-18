package br.com.daniloboccomino;

import br.com.daniloboccomino.desconto.Desconto;
import br.com.daniloboccomino.desconto.DescontoPorQuantidadeItens;
import br.com.daniloboccomino.desconto.DescontoPorValor;
import br.com.daniloboccomino.desconto.DescontoZero;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calcular(Pedido pedido) {
        // Chain of Responsibility - monta uma cadeia/sequencia de varificacoes passando o proximo elo/etapa
        Desconto cadeiaDeDesconto = new DescontoPorValor(
                                    new DescontoPorQuantidadeItens(
                                    new DescontoZero(
                                    )));
        return cadeiaDeDesconto.calcular(pedido);
    }

}
