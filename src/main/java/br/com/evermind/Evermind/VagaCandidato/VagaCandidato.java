package br.com.evermind.Evermind.VagaCandidato;

import br.com.evermind.Evermind.Candidato.Candidato;
import br.com.evermind.Evermind.Vaga.Vaga;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class VagaCandidato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long candidato_id;
    private Long vaga_id;

}
