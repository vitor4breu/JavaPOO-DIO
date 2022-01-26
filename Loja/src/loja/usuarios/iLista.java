package loja.usuarios;


import loja.usuarios.produtos.Produto;
import loja.usuarios.produtos.ProdutosCadastrados;

import java.util.ArrayList;

interface iLista {
    default void mostrarProdutosDaLista(ArrayList<Produto> lista, String tipo) {
        System.out.println(tipo + ":");
        for (Produto produto : lista) {
            System.out.println(produto.getNome() + " " + produto.getValor());
        }
    }
    default void adicionarProduto(ArrayList<Produto> lista, Produto produto){
        lista.add(produto);
    }

    default void removerProduto(ArrayList<Produto> lista, Produto produto, String tipo){

        for (int i = 0; i < lista.size(); i++) {
            Produto produtoEmVerificacao = lista.get(i);
            if (produtoEmVerificacao.getNome().equals(produto.getNome())){
                lista.remove(produtoEmVerificacao);
                System.out.println("O produto "+produto.getNome()+" foi retirado do "+tipo);
                return;
            }
        }
        System.out.println("O produto "+produto.getNome()+" não está no "+tipo);
    }
}
