package loja.usuarios.produtos;

public class Produto {

    String nome; // Nome e valor do Produto
    float valor;

    public Produto(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }
}
