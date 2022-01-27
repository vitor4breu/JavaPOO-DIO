package loja.usuarios.data;

public class DataNascimento { // Cria um objeto data de nascimento, capaz de retornar a data no formato dia/mes/ano
    final private int dia;
    final private int mes;
    final private int ano;

    public DataNascimento(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String retornarData(){
        return(dia+"/"+mes+"/"+ano);
    }


}
