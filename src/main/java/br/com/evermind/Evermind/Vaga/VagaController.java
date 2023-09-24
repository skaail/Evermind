package br.com.evermind.Evermind.Vaga;

import br.com.evermind.Evermind.Candidato.Candidato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vagas")
public class VagaController {

    @Autowired
    private VagaService service;

    @GetMapping
    public List<Vaga> listarCandidatos(){
        return service.listarVagas();
    }

    @PostMapping
    public Vaga criarCandidato(@RequestBody Vaga vaga){
        return  service.criarVaga(vaga);
    }

    @GetMapping("/{id}")
    public Vaga buscarVagaPorId(@PathVariable Long id){
        return service.buscarVagaPorId(id);
    }
}
