package br.com.fiap.mercado.model;

import jakarta.persistence.*;

@Entity
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Classe classe;

    private int nivel;

    private double moedas;

    public enum Classe {
        GUERREIRO, MAGO, ARQUEIRO
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Classe getClasse() { return classe; }
    public void setClasse(Classe classe) { this.classe = classe; }
    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }
    public double getMoedas() { return moedas; }
    public void setMoedas(double moedas) { this.moedas = moedas; }
}
