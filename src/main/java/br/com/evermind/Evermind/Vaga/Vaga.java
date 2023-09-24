package br.com.evermind.Evermind.Vaga;

import br.com.evermind.Evermind.Candidato.Candidato;
import br.com.evermind.Evermind.VagaCandidato.VagaCandidato;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Vaga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Boolean ativa;

}
