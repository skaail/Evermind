package br.com.evermind.Evermind.VagaCandidato;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaCandidatoRepository extends JpaRepository<VagaCandidato, Long> {
}
