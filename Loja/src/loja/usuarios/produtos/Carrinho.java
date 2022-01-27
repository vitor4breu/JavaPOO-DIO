package loja.usuarios.produtos;

import java.util.ArrayList;

public class Carrinho {

    public static String tipoLista = "Carrinho";

    public ArrayList<Produto> carrinho = new ArrayList<Produto>();

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<Produto> carrinho) {
        ProdutosCadastrados.produtosCadastrados = carrinho;
    }

    public String getTipoLista() {
        return tipoLista;
    }

}
