package br.com.evermind.Evermind.Candidato;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
    @Query("SELECT c from candidato c where c.email =:email and c.senha =:senha")
    Candidato login(@Param("email") String email, @Param("senha") String senha);
}
