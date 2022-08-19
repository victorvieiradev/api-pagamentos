package br.com.mycompany.pagamentos.service;

import br.com.mycompany.pagamentos.model.*;
import org.springframework.stereotype.Service;

@Service
public class RecebimentoFactory {
    public RecebimentoModel gerarRecebimento(DadosRecebimentoModel recebimentos){
        if ("PIX".equalsIgnoreCase(recebimentos.getStatus())){
            return new PixModel(recebimentos.getId(), recebimentos.getStatus(), recebimentos.getValorRecebido());
        }else if ("DINHEIRO".equalsIgnoreCase(recebimentos.getStatus())){
            return new DinheiroModel(recebimentos.getId(), recebimentos.getStatus(), recebimentos.getValorRecebido());
        }else if ("CHEQUE".equalsIgnoreCase(recebimentos.getStatus())){
            return new ChequeModel(recebimentos.getId(), recebimentos.getStatus(), recebimentos.getValorRecebido());
        }else if ("CREDITO".equalsIgnoreCase(recebimentos.getStatus())){
            return new CartaoCreditoModel(recebimentos.getId(), recebimentos.getStatus(), recebimentos.getValorRecebido());
        }else if ("DEBITO".equalsIgnoreCase(recebimentos.getStatus())){
            return new CartaoDebitoModel(recebimentos.getId(), recebimentos.getStatus(), recebimentos.getValorRecebido());
        }else if ("REFEICAO".equalsIgnoreCase(recebimentos.getStatus())){
            return new CartaoRefeicaoModel(recebimentos.getId(), recebimentos.getStatus(), recebimentos.getValorRecebido());
        }
        return null;
    }
}
