package com.senai.ApresentacaoSenai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.ApresentacaoSenai.Models.Contatos;
import com.senai.ApresentacaoSenai.Services.ContatosService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/contatos")
public class ContatosController {

    @Autowired
    private ContatosService contatosService;

    @GetMapping
    public ResponseEntity<List<Contatos>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(this.contatosService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Contatos> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(this.contatosService.findById(id));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.contatosService.deleteById(id);
        return ResponseEntity.noContent().build();
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity<Contatos> update(@PathVariable Long id, @RequestBody Contatos obj){
        return ResponseEntity.status(HttpStatus.OK).body(this.contatosService.update(id, obj));
    }

    @PutMapping(value = "/create")
    public ResponseEntity<Contatos> create(@RequestBody Contatos obj){
        return ResponseEntity.status(HttpStatus.OK).body(this.contatosService.create(obj));
    }


}
