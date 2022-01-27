package loja.usuarios;


import loja.usuarios.produtos.Produto;

import java.util.ArrayList;

interface iLista { // interface com metodos capazes de modificar as arrays de Produto (Carrinho e Produtos cadastrados)
    default void mostrarProdutosDaLista(ArrayList<Produto> lista, String tipo) { // Mostra no CMD, os produtos contidos em determinada lista
        System.out.println(tipo + ":");
        for (Produto produto : lista) { // Para cada produto na lista passada ele mostra no formato "- produto valor"
            System.out.println(produto.getNome() + " " + produto.getValor());
        }
    }
    default void adicionarProduto(ArrayList<Produto> lista, Produto produto){ // Adiciona um produto a determiada lista
        lista.add(produto);
    }

    default void removerProduto(ArrayList<Produto> lista, Produto produto, String tipo){ // Remove produto de uma determinada lista

        for (int i = 0; i < lista.size(); i++) {
            Produto produtoEmVerificacao = lista.get(i);
            if (produtoEmVerificacao.getNome().equals(produto.getNome())){ // Verifica se o produto está mesmo contido na lista
                lista.remove(produtoEmVerificacao); // Caso sim, remove
                System.out.println("O produto "+produto.getNome()+" foi retirado do "+tipo);
                return;
            }
        }
        System.out.println("O produto "+produto.getNome()+" não está no "+tipo); // Caso não, avisa que determinado produto não está contido na lista passada
    }

}
