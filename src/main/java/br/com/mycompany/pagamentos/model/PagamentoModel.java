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
@Table(name = "pagamentos")
public abstract class PagamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private BigDecimal valorAPagar;
    private BigDecimal diferencaValor;
    public abstract BigDecimal valorPago();

    public PagamentoModel(String status, BigDecimal valorAPagar, BigDecimal diferencaValor) {
        this.status = status;
        this.valorAPagar = valorAPagar;
        this.diferencaValor = diferencaValor;
    }
}
