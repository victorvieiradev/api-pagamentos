package br.com.mycompany.pagamentos.service;

import br.com.mycompany.pagamentos.model.DadosPagamento;
import br.com.mycompany.pagamentos.model.PagamentoModel;
import br.com.mycompany.pagamentos.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {
    @Autowired
    private PagamentoRepository pagamentoRepository;
    @Autowired
    private PagamentoFactory pagamentoFactory;
    public Iterable<PagamentoModel> exibirPagamentos(){
        return pagamentoRepository.findAll();
    }
    public PagamentoModel salvarPagamento(DadosPagamento dadosPagamento){
        PagamentoModel pagamento = pagamentoFactory.gerarPagamento(dadosPagamento);
        pagamento.valorPago();
        return pagamentoRepository.save(pagamento);
    }
    public void excluirPagamento(Long id){
        pagamentoRepository.deleteById(id);
    }
}
