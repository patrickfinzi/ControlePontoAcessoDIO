package br.com.globalabs.exemplo.mavem.repository;

import br.com.globalabs.exemplo.mavem.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho, Long> {
}
