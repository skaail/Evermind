package br.com.evermind.Evermind.Candidato;

import br.com.evermind.Evermind.Vaga.Vaga;
import br.com.evermind.Evermind.VagaCandidato.VagaCandidato;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Candidato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;

}
