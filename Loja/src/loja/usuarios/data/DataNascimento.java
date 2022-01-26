package loja.usuarios.data;

public class DataNascimento {
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
