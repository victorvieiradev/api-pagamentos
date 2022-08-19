package br.com.mycompany.pagamentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pagamento")
public abstract class PagamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private BigDecimal valorApagar;
    private BigDecimal diferencaValor;
    private BigDecimal valorPago;

    public PagamentoModel(Long id, String status, BigDecimal valorApagar, BigDecimal diferencaValor) {
        this.id = id;
        this.status = status;
        this.valorApagar = valorApagar;
        this.diferencaValor = diferencaValor;
    }

    public abstract BigDecimal valorPago();
}
