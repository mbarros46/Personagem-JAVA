package br.com.fiap.mercado.service;

import br.com.fiap.mercado.model.Item;
import br.com.fiap.mercado.model.Item.Raridade;
import br.com.fiap.mercado.model.Item.Tipo;
import br.com.fiap.mercado.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository repository;

    public List<Item> listarTodos() {
        return repository.findAll();
    }

    public Item salvar(Item item) {
        return repository.save(item);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public List<Item> buscarPorNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public List<Item> buscarPorTipo(Tipo tipo) {
        return repository.findByTipo(tipo);
    }

    public List<Item> buscarPorRaridade(Raridade raridade) {
        return repository.findByRaridade(raridade);
    }

    public List<Item> buscarPorPreco(double min, double max) {
        return repository.findByPrecoBetween(min, max);
    }
}
