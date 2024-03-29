package loja.usuarios;

import loja.usuarios.data.DataNascimento;
import loja.usuarios.produtos.Produto;
import loja.usuarios.produtos.ProdutosCadastrados;

import java.util.ArrayList;


public class Funcionario extends Usuario implements iLista {

    private final ArrayList<Produto> produtosCadastrados = ProdutosCadastrados.getProdutosCadastrados();  // Recebe lista estatica dos produtos ja divulgados a venda

    public Funcionario(String nome, DataNascimento dataNascimento, String login, String senha) {
        super(nome, dataNascimento, login, senha);
    }


    public void verProdutosDivulgados() { // Vê os produtos divulgados a venda
        mostrarProdutosDaLista(produtosCadastrados, ProdutosCadastrados.getTipoLista());
    }

    public void cadastrarProduto(Produto produto) { // Cadastra um produto para venda
        for (Produto produtoCadastrado : produtosCadastrados) {
            String produtoAnalisado = produtoCadastrado.getNome();
            if (produtoAnalisado.equals(produto.getNome())) {
                System.out.println("O produto já está no sistema");
                return;
            }
        }
        adicionarProduto(produtosCadastrados, produto);
    }


    public void removerProdutoDoCarrinho(Produto produto) { // Remove um produto da venda
        removerProduto(produtosCadastrados, produto, ProdutosCadastrados.getTipoLista());
    }
}
