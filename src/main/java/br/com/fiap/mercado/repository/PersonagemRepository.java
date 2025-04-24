package br.com.fiap.mercado.repository;

import br.com.fiap.mercado.model.Personagem;
import br.com.fiap.mercado.model.Personagem.Classe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonagemRepository extends JpaRepository<Personagem, Long> {
    List<Personagem> findByNomeContainingIgnoreCase(String nome);
    List<Personagem> findByClasse(Classe classe);
}
