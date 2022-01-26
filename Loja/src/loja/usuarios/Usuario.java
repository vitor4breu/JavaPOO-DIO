package loja.usuarios;

import loja.usuarios.data.DataNascimento;
import loja.usuarios.produtos.Produto;

import java.util.ArrayList;

public abstract class Usuario {
    String nome;
    DataNascimento dataNascimento;
    String login;
    String senha;
    String tipo;

    public Usuario(String nome, DataNascimento dataNascimento, String login, String senha) {
    }

    }

