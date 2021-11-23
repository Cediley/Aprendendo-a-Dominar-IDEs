package Hue.br;

import model.Cachorro;

public class FirstProgram {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        System.out.println(cachorro);

       Livro livro = new Livro("Vampiro a Mascara",365);
        System.out.println(livro);
        
       /* int a = 233;
        int b = 100;
        System.out.println("Eu não Estou no Poço, Óbvio! "+"Andar:" + (a+b));*/


    }
}


class Livro {
    private String nome;
    private Integer numpag;

    public Livro(String nome, Integer numpag) {
        this.nome = nome;
        this.numpag = numpag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpag() {
        return numpag;
    }

    public void setNumpag(Integer numpag) {
        this.numpag = numpag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpag=" + numpag +
                '}';
    }
}