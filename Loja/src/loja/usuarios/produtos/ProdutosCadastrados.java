package loja.usuarios.produtos;

import java.util.ArrayList;

public class ProdutosCadastrados{

    public static String tipoLista = "Sistema";

    public static ArrayList<Produto> produtosCadastrados = new ArrayList<Produto>();

    public static ArrayList<Produto> getProdutosCadastrados() {
        return produtosCadastrados;
    }

    public static void setProdutosCadastrados(ArrayList<Produto> produtosCadastrados) {
        ProdutosCadastrados.produtosCadastrados = produtosCadastrados;
    }

    public static String getTipoLista() {
        return tipoLista;
    }
}

