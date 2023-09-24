package br.com.evermind.Evermind.Candidato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatoService {

    @Autowired
    private CandidatoRepository repository;

    public List<Candidato> listarCandidatos(){
        return repository.findAll();
    }

    public Candidato criarCandidato(Candidato candidato){
        return repository.save(candidato);
    }
}
