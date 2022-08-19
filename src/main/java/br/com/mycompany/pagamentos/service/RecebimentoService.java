package br.com.mycompany.pagamentos.service;

import br.com.mycompany.pagamentos.model.DadosRecebimentoModel;
import br.com.mycompany.pagamentos.model.RecebimentoModel;
import br.com.mycompany.pagamentos.repository.RecebimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecebimentoService {
    @Autowired
    private RecebimentoRepository recebimentoRepository;
    @Autowired
    private RecebimentoFactory recebimentoFactory;
    public RecebimentoModel novoRecebimento(DadosRecebimentoModel recebimentos){
        RecebimentoModel recibo = recebimentoFactory.gerarRecebimento(recebimentos);
        return recebimentoRepository.save(recibo);
    }
    public List<RecebimentoModel> exibirPagamentos(){
        return  recebimentoRepository.findAll();
    }
}
