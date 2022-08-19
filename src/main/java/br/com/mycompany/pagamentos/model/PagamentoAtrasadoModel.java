package br.com.mycompany.pagamentos.model;

import java.math.BigDecimal;

public class PagamentoAtrasadoModel extends  PagamentoModel{
    public PagamentoAtrasadoModel(String status, BigDecimal valorAPagar, BigDecimal diferencaValor) {
        super(status, valorAPagar, diferencaValor);
    }

    @Override
    public BigDecimal valorPago() {
        return this.getValorAPagar().add(this.getDiferencaValor()) ;
    }
}
