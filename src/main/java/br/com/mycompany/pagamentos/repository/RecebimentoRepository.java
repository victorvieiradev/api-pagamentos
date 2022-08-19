package br.com.mycompany.pagamentos.repository;

import br.com.mycompany.pagamentos.model.RecebimentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecebimentoRepository extends JpaRepository<RecebimentoModel, Long> {
}
