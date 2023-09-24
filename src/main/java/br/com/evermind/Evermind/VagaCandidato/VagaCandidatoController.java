package br.com.evermind.Evermind.VagaCandidato;

import br.com.evermind.Evermind.Candidato.Candidato;
import br.com.evermind.Evermind.Candidato.CandidatoService;
import br.com.evermind.Evermind.Vaga.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VagaCandidatoController {

    @Autowired
    private VagaCandidatoService service;

    @Autowired
    private CandidatoService candidatoService;

    @Autowired
    private VagaService vagaService;


    @GetMapping("/todasVagas")
    public List<VagaCandidato> listarCandidatos(){
        return service.listarVagasCandidatos();
    }

    @PostMapping("/cadastrarNaVaga")
    public VagaCandidato cadastrarCandidatoVaga(@RequestBody VagaCandidato vagaCandidato){
        return service.cadastrarCandidatoVaga(vagaCandidato);
    }


}
