package loja.usuarios.produtos;

import java.util.ArrayList;

public class Carrinho {

    public static String tipoLista = "Carrinho"; // Define o tipo da lista de Produtos

    public ArrayList<Produto> carrinho = new ArrayList<>(); // Cria a variavel que contem uma array produtos

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public String getTipoLista() {
        return tipoLista;
    }

}
