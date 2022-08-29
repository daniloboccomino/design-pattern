package br.com.daniloboccomino;

import br.com.daniloboccomino.desconto.Desconto;
import br.com.daniloboccomino.desconto.DescontoPorQuantidadeItens;
import br.com.daniloboccomino.desconto.DescontoPorValor;
import br.com.daniloboccomino.desconto.DescontoZero;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calcular(IPedido pedido) {
        // Chain of Responsibility - monta uma cadeia/sequencia de verificacoes passando o proximo elo/etapa
        Desconto cadeiaDeDesconto = new DescontoPorValor(
                                    new DescontoPorQuantidadeItens(
                                    new DescontoZero(
                                    )));
        return cadeiaDeDesconto.calcular(pedido);
    }

}
