package com.senai.ApresentacaoSenai.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.ApresentacaoSenai.Models.Contatos;
import com.senai.ApresentacaoSenai.Repository.ContatosRepository;


@Service
public class ContatosService {
    
    @Autowired
    private ContatosRepository contatosRepo;

    public Contatos findById(Long id){
        Optional<Contatos> contato = this.contatosRepo.findById(id);
        return contato.orElse(null);
    }

    public List<Contatos> findAll(){
        return this.contatosRepo.findAll();
    }

    public Contatos update(Long id, Contatos obj){
        Contatos contatos = this.findById(id);
        contatos.setId(obj.getId());
        contatos.setEmail(obj.getEmail());
        contatos.setEndereco(obj.getEndereco());
        contatos.setNome(obj.getNome());
        contatos.setEndereco(obj.getEndereco());
        this.contatosRepo.delete(this.findById(id));
        return this.contatosRepo.save(contatos);
    }
    
    public Contatos create(Contatos obj){
        return this.contatosRepo.save(obj);
    }

    public void deleteById(Long id){
        this.contatosRepo.deleteById(id);
    }
        
}
