package br.com.evermind.Evermind.Candidato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {
    @Autowired
    private CandidatoService service;

    @GetMapping
    public List<Candidato> listarCandidatos(){
        return service.listarCandidatos();
    }

    @PostMapping
    public Candidato criarCandidato(@RequestBody Candidato candidato){
        return  service.criarCandidato(candidato);
    }
}