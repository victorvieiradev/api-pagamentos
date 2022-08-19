package br.com.mycompany.pagamentos.model;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class DadosPagamento {
    private Long id;
    private String status;
    private BigDecimal valorApagar;
    private BigDecimal diferencaValor;
}
