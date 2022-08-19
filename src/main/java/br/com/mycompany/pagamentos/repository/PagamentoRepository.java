package br.com.mycompany.pagamentos.repository;

import br.com.mycompany.pagamentos.model.PagamentoModel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends PagingAndSortingRepository<PagamentoModel, Long> {
}
