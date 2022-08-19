package br.com.mycompany.pagamentos.model;

import javax.persistence.Entity;
import java.math.BigDecimal;
@Entity
public class PagamentoEmdiaModel extends PagamentoModel{
    public PagamentoEmdiaModel(Long id, String status, BigDecimal valorAPagar, BigDecimal diferencaValor) {
        super(id, status, valorAPagar, diferencaValor);
    }
    @Override
    public BigDecimal valorPago() {
        return this.getValorApagar().subtract(this.getDiferencaValor());
    }
}
