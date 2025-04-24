package br.com.fiap.mercado.repository;

import br.com.fiap.mercado.model.Item;
import br.com.fiap.mercado.model.Item.Tipo;
import br.com.fiap.mercado.model.Item.Raridade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByNomeContainingIgnoreCase(String nome);
    List<Item> findByTipo(Tipo tipo);
    List<Item> findByRaridade(Raridade raridade);
    List<Item> findByPrecoBetween(double min, double max);
}
