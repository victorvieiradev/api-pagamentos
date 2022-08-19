package br.com.mycompany.pagamentos.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;
@NoArgsConstructor
@Entity
public class PagamentoEmdiaModel extends PagamentoModel{
    public PagamentoEmdiaModel(Long id, String status, BigDecimal valorAPagar, BigDecimal diferencaValor) {
        super(id, status, valorAPagar, diferencaValor);
    }
    @Override
    public BigDecimal valorPago() {
        this.setValorPago(this.getValorApagar().subtract(this.getDiferencaValor()));
        return this.getValorPago();
    }
}
