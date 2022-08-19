package br.com.mycompany.pagamentos.service;

import br.com.mycompany.pagamentos.model.DadosPagamento;
import br.com.mycompany.pagamentos.model.PagamentoAtrasadoModel;
import br.com.mycompany.pagamentos.model.PagamentoEmdiaModel;
import br.com.mycompany.pagamentos.model.PagamentoModel;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public class PagamentoFactory {
    public PagamentoModel gerarPagamento(DadosPagamento dadosPagamento){
        if ("PAGAMENTO_EM_DIA".equalsIgnoreCase(dadosPagamento.getStatus())){
            return new PagamentoEmdiaModel(dadosPagamento.getStatus(), dadosPagamento.getValorApagar(), dadosPagamento.getDiferencaValor());
        }else if ("PAGAMENTO_ATRASADO".equalsIgnoreCase(dadosPagamento.getStatus())){
            return new PagamentoAtrasadoModel(dadosPagamento.getStatus(), dadosPagamento.getValorApagar(), dadosPagamento.getDiferencaValor());
        }
        throw  new IllegalArgumentException();
    }
}
