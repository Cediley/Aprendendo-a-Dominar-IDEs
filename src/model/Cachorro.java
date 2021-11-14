package model;

import java.util.Objects;

public class Cachorro {
    private String cor;
    private String nome;
    private Integer idade;

    public Cachorro() {}

    public Cachorro(String cor, String nome, Integer idade) {
        this.cor = cor;
        this.nome = nome;
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cachorro cachorro = (Cachorro) o;
        return Objects.equals(cor, cachorro.cor) && Objects.equals(nome, cachorro.nome) && Objects.equals(idade, cachorro.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, nome, idade);
    }
}
