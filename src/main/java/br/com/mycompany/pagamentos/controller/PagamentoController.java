package br.com.mycompany.pagamentos.controller;

import br.com.mycompany.pagamentos.model.DadosPagamento;
import br.com.mycompany.pagamentos.model.PagamentoModel;
import br.com.mycompany.pagamentos.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class PagamentoController {
    @Autowired
    private PagamentoService pagamentoService;
    @GetMapping(path = "/pagamento")
    public Iterable<PagamentoModel> listarPagamentos(){
        return pagamentoService.exibirPagamentos();
    }
    @PostMapping(path = "/pagamento")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoModel salvarPagamento(@RequestBody DadosPagamento dadosPagamento){
        return pagamentoService.salvarPagamento(dadosPagamento);
    }

}
