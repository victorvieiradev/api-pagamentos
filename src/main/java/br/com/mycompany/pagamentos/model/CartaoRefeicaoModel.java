package br.com.mycompany.pagamentos.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;

@NoArgsConstructor
@Entity
public class CartaoRefeicaoModel extends  RecebimentoModel{
    public CartaoRefeicaoModel(Long id, String status, BigDecimal valorRecebido) {
        super(id, status, valorRecebido);
    }

    @Override
    public BigDecimal receberPagamento() {
        BigDecimal valorRecebido = this.getValorRecebido();
        this.setValorLiquido(valorRecebido.multiply(new BigDecimal(0.042)));
        return this.getValorLiquido();
    }
}
