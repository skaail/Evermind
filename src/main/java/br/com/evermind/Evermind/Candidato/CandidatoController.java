package br.com.evermind.Evermind.Candidato;

import br.com.evermind.Evermind.Vaga.Vaga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {
    @Autowired
    private CandidatoService service;
    @Autowired
    private CandidatoRepository repository;

    @GetMapping
    public List<Candidato> listarCandidatos(){
        return service.listarCandidatos();
    }

    @PostMapping
    public Candidato criarCandidato(@RequestBody Candidato candidato){
        return  service.criarCandidato(candidato);
    }

    @GetMapping("/{id}")
    public Candidato buscarVagaPorId(@PathVariable Long id){
        return service.buscarCandidatoPorId(id);
    }


    @GetMapping("/login")
    public ResponseEntity<List<Candidato>> login(@RequestBody Candidato candidato){
        return new ResponseEntity<List<Candidato>>(repository.findByEmailAndSenha(candidato.getEmail(), candidato.getSenha()), HttpStatus.OK);
    }
}
