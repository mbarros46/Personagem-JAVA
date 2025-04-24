package br.com.fiap.mercado.controller;

import br.com.fiap.mercado.model.Item;
import br.com.fiap.mercado.model.Item.Raridade;
import br.com.fiap.mercado.model.Item.Tipo;
import br.com.fiap.mercado.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping
    public List<Item> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Item salvar(@RequestBody Item item) {
        return service.salvar(item);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }

    @GetMapping("/buscar/nome")
    public List<Item> buscarPorNome(@RequestParam String nome) {
        return service.buscarPorNome(nome);
    }

    @GetMapping("/buscar/tipo")
    public List<Item> buscarPorTipo(@RequestParam Tipo tipo) {
        return service.buscarPorTipo(tipo);
    }

    @GetMapping("/buscar/raridade")
    public List<Item> buscarPorRaridade(@RequestParam Raridade raridade) {
        return service.buscarPorRaridade(raridade);
    }

    @GetMapping("/buscar/preco")
    public List<Item> buscarPorPreco(@RequestParam double min, @RequestParam double max) {
        return service.buscarPorPreco(min, max);
    }
}
