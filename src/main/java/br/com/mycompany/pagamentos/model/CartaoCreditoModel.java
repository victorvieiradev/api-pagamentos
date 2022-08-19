package br.com.mycompany.pagamentos.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;

@NoArgsConstructor
@Entity
public class CartaoCreditoModel extends RecebimentoModel{
    public CartaoCreditoModel(Long id, String status, BigDecimal valorRecebido) {
        super(id, status, valorRecebido);
    }

    @Override
    public BigDecimal receberPagamento() {
        BigDecimal valorRecebido = this.getValorRecebido();
        BigDecimal porcentagem = valorRecebido.multiply(new BigDecimal(0.037));
        this.setValorLiquido(valorRecebido.subtract(porcentagem));
        return this.getValorLiquido();
    }
}
