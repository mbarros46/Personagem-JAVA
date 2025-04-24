package br.com.fiap.mercado.controller;

import br.com.fiap.mercado.model.Personagem;
import br.com.fiap.mercado.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {

    @Autowired
    private PersonagemService service;

    @GetMapping
    public List<Personagem> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Personagem salvar(@RequestBody Personagem p) {
        return service.salvar(p);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }

    @GetMapping("/buscar/nome")
    public List<Personagem> buscarPorNome(@RequestParam String nome) {
        return service.buscarPorNome(nome);
    }

    @GetMapping("/buscar/classe")
    public List<Personagem> buscarPorClasse(@RequestParam Personagem.Classe classe) {
        return service.buscarPorClasse(classe);
    }
}
