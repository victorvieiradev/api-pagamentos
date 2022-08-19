package br.com.mycompany.pagamentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "recebimentos")
public abstract class RecebimentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private BigDecimal valorRecebido;
    private BigDecimal valorLiquido;

    public RecebimentoModel(Long id, String status, BigDecimal valorRecebido) {
        this.id = id;
        this.status = status;
        this.valorRecebido = valorRecebido;
        this.receberPagamento();
    }

    public abstract  BigDecimal receberPagamento();
}
