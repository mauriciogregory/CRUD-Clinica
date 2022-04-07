package com.dh.CRUDClinica.controller;

import com.dh.CRUDClinica.service.DentistaService;
import com.dh.CRUDClinica.model.Dentista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dentistas")
public class DentistaController {

    @Autowired
    private DentistaService dentistaService;

    @PostMapping
    public ResponseEntity<Dentista> salvar(@RequestBody Dentista dentista){
        return ResponseEntity.ok(dentistaService.salvar(dentista));
    }

    @GetMapping
    public ResponseEntity<List<Dentista>> buscarTodos(){
        return ResponseEntity.ok(dentistaService.buscarTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Integer id){
        ResponseEntity resultado = null;
        if(dentistaService.mostrarPorID(id).isPresent()){
            dentistaService.mostrarPorID(id);
            resultado = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Deletado do BD...");
        } else {
            resultado = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return resultado;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Dentista>> mostrarPorID(@PathVariable Integer id){
        return  ResponseEntity.ok(dentistaService.mostrarPorID(id));
    }



}
