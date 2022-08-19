package br.com.mycompany.pagamentos.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;
@NoArgsConstructor
@Entity
public class DinheiroModel extends  RecebimentoModel{
    public DinheiroModel(Long id, String status, BigDecimal valorRecebido) {
        super(id, status, valorRecebido);
    }

    @Override
    public BigDecimal receberPagamento() {
        this.setValorLiquido(this.getValorLiquido());
        return this.getValorLiquido();
    }
}
