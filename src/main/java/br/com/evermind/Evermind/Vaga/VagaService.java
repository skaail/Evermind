package br.com.evermind.Evermind.Vaga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VagaService {
    @Autowired
    private VagasRepository repository;

    public List<Vaga> listarVagas(){
        return repository.findAll();
    }

    public Vaga criarVaga(Vaga vaga){
        return repository.save(vaga);
    }

    public Vaga buscarVagaPorId(Long id){
        return repository.findById(id).orElse(null);
    }
}
