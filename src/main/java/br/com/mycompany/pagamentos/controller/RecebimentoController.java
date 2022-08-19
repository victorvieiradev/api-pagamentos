package br.com.mycompany.pagamentos.controller;

import br.com.mycompany.pagamentos.model.DadosRecebimentoModel;
import br.com.mycompany.pagamentos.model.RecebimentoModel;
import br.com.mycompany.pagamentos.service.RecebimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecebimentoController {
    @Autowired
    private RecebimentoService recebimentoService;
    @PostMapping(path = "/recebimento")
    @ResponseStatus(HttpStatus.CREATED)
    public RecebimentoModel novoRecebimento(@RequestBody DadosRecebimentoModel recebimento){
        return  recebimentoService.novoRecebimento(recebimento);
    }
    @GetMapping(path = "/recebimento")
    public List<RecebimentoModel> exibirRecebimentos(){
        return recebimentoService.exibirPagamentos();
    }

}
