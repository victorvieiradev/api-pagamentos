package br.com.mycompany.pagamentos.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;
@NoArgsConstructor
@Entity
public class PixModel extends RecebimentoModel{
    public PixModel(Long id, String status, BigDecimal valorRecebido) {
        super(id, status, valorRecebido);
    }

    @Override
    public BigDecimal receberPagamento() {
        this.setValorLiquido(this.getValorRecebido());
        return this.getValorLiquido();
    }
}
