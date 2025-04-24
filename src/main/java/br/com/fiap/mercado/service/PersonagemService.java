package br.com.fiap.mercado.service;

import br.com.fiap.mercado.model.Personagem;
import br.com.fiap.mercado.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository repository;

    public List<Personagem> buscarPorNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public List<Personagem> buscarPorClasse(Personagem.Classe classe) {
        return repository.findByClasse(classe);
    }

    public List<Personagem> listarTodos() {
        return repository.findAll();
    }

    public Personagem salvar(Personagem personagem) {
        return repository.save(personagem);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
