package br.com.mycompany.pagamentos.model;

import javax.persistence.Entity;
import java.math.BigDecimal;
@Entity
public class PagamentoAtrasadoModel extends  PagamentoModel{

    public PagamentoAtrasadoModel(Long id, String status, BigDecimal valorAPagar, BigDecimal diferencaValor) {
        super(id, status, valorAPagar, diferencaValor);
    }

    public PagamentoAtrasadoModel() {
    }



    @Override
    public BigDecimal valorPago() {
        return this.getValorApagar().add(this.getDiferencaValor()) ;
    }
}
