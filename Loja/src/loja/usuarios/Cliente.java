package loja.usuarios;

import loja.usuarios.data.DataNascimento;
import loja.usuarios.produtos.Carrinho;
import loja.usuarios.produtos.Produto;
import loja.usuarios.produtos.ProdutosCadastrados;

import java.util.ArrayList;

public class Cliente extends Usuario implements iLista {

    Carrinho carrinho = new Carrinho(); // Cada cliente possui um carrinho unico
    ArrayList<Produto> produtosNoCarrinho = carrinho.getCarrinho();

    private final ArrayList<Produto> produtosCadastrados = ProdutosCadastrados.getProdutosCadastrados();// O cliente recebe a lista de produtos ESTATICA

    public Cliente(String nome, DataNascimento dataNascimento, String login, String senha) {
        super(nome, dataNascimento, login, senha);
    }

    public void verCarrinho() { // Cliente ve os produtos contidos no carrinho dele
        mostrarProdutosDaLista(produtosNoCarrinho, carrinho.getTipoLista());
    }

    public void verProdutosDivulgados() { // Cliente ve os produtos divulgados para venda, contidos na variavel produtosCadastrados
        mostrarProdutosDaLista(produtosCadastrados, ProdutosCadastrados.getTipoLista());
    }

    public void adicionarProdutoAoCarrinho(Produto produto) { // Cliente adiciona um produto ao seu carrinho
        for (Produto produtoCadastrado : produtosCadastrados) {
            String produtoAnalisado = produtoCadastrado.getNome();
            if (produtoAnalisado.equals(produto.getNome())) {
                adicionarProduto(produtosNoCarrinho, produto);
                return;
            }

        }
        System.out.println("O produto não está no sistema");
    }

    public void removerProdutoDoCarrinho(Produto produto) { // Cliente remove um produto do seu carrinho
        removerProduto(produtosNoCarrinho, produto, carrinho.getTipoLista());
    }

}

