package br.com.evermind.Evermind.VagaCandidato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VagaCandidatoService {
    @Autowired
    private VagaCandidatoRepository repository;

    public List<VagaCandidato> listarVagasCandidatos(){
        return repository.findAll();
    }

    public VagaCandidato cadastrarCandidatoVaga(VagaCandidato vagaCandidato){
        return repository.save(vagaCandidato);
    }
}
