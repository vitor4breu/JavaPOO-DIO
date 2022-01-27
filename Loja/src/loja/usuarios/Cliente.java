package loja.usuarios;

import loja.usuarios.data.DataNascimento;
import loja.usuarios.produtos.Carrinho;
import loja.usuarios.produtos.Produto;
import loja.usuarios.produtos.ProdutosCadastrados;

import java.util.ArrayList;

public class Cliente extends Usuario implements iLista {

    Carrinho carrinho = new Carrinho();
    ArrayList<Produto> produtosNoCarrinho = carrinho.getCarrinho();

    private final ArrayList<Produto> produtosCadastrados = ProdutosCadastrados.getProdutosCadastrados();

    public Cliente(String nome, DataNascimento dataNascimento, String login, String senha) {
        super(nome, dataNascimento, login, senha);
    }

    public void verCarrinho() {
        mostrarProdutosDaLista(produtosNoCarrinho, carrinho.getTipoLista());
    }

    public void verProdutosDivulgados() {
        mostrarProdutosDaLista(produtosCadastrados, ProdutosCadastrados.getTipoLista());
    }

    public void adicionarProdutoAoCarrinho(Produto produto) {
        for (Produto produtoCadastrado : produtosCadastrados) {
            String produtoAnalisado = produtoCadastrado.getNome();
            if (produtoAnalisado.equals(produto.getNome())) {
                adicionarProduto(produtosNoCarrinho, produto);
                return;
            }

        }
        System.out.println("O produto não está no sistema");
    }

    public void removerProdutoDoCarrinho(Produto produto) {
        removerProduto(produtosNoCarrinho, produto, carrinho.getTipoLista());
    }

}

