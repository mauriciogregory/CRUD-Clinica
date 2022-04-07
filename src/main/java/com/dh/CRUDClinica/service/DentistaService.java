package com.dh.CRUDClinica.service;

import com.dh.CRUDClinica.model.Dentista;
import com.dh.CRUDClinica.repository.DentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DentistaService {

    @Autowired
    private DentistaRepository dentistaRepository;

    public Dentista salvar(Dentista dentista){
        return dentistaRepository.save(dentista);
    }

    public Optional<Dentista> mostrarPorID(Integer id){
        return dentistaRepository.findById(id);
    }

    public List<Dentista> buscarTodos(){
        return dentistaRepository.findAll();
    }

    public void deletar(Integer id){
        dentistaRepository.deleteById(id);
    }
}
