package br.com.fiap.mercado.model;

import jakarta.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    @Enumerated(EnumType.STRING)
    private Raridade raridade;

    private double preco;

    @ManyToOne
    private Personagem dono;

    public enum Tipo {
        ARMA, ARMADURA, POCAO, ACESSORIO
    }

    public enum Raridade {
        COMUM, RARO, EPICO, LENDARIO
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Tipo getTipo() { return tipo; }
    public void setTipo(Tipo tipo) { this.tipo = tipo; }
    public Raridade getRaridade() { return raridade; }
    public void setRaridade(Raridade raridade) { this.raridade = raridade; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public Personagem getDono() { return dono; }
    public void setDono(Personagem dono) { this.dono = dono; }
}
