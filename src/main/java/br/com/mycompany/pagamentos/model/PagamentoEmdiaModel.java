package br.com.mycompany.pagamentos.model;

import java.math.BigDecimal;

public class PagamentoEmdiaModel extends PagamentoModel{
    public PagamentoEmdiaModel(String status, BigDecimal valorAPagar, BigDecimal diferencaValor) {
        super(status, valorAPagar, diferencaValor);
    }

    @Override
    public BigDecimal valorPago() {
        return this.getValorAPagar().subtract(this.getDiferencaValor());
    }
}
