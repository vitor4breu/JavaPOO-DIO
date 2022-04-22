package loja;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class TesteListas {
    public static void main(String[] args) {

        List<String> listaNumerica = Arrays.asList("1","0","2","3","4","5");

        List<Integer> listaPar = listaNumerica.stream()
                .map(Integer::parseInt)
                .collect(C              ollectors.toList());
        listaPar.removeIf(i -> (i % 2 == 0));
        listaPar.forEach(System.out::println);

        //mapToInt - transforma em uma Stream de inteiros
        //listaNumerica.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        // filter - Executa um predicate e caso verdadeiro o número se mantem
        //List<Integer> lista = listaNumerica.stream()
        //       .map(Integer::parseInt)
        //       .filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());

        // map - Executa uma função para cada elemento da Stream.
        //listaNumerica.stream().map(i -> Integer.parseInt(i));

        // collect  - Utiliza um collector / muda o tipo da coleção
        //Set<String> listaNumeric = listaNumerica.stream().collect(Collectors.toSet());

        // forEach - Executa um consumer, recebe somente um argumento e não tem retorno.
        //listaNumerica.stream().forEach(n -> System.out.println(n));

        // limit() - Limita a quantidade de elementos que vão ser considerados
        //listaNumerica.stream().limit(3).forEach(System.out :: println);

        // anyMatch() - Verifica se algum elemento dentro da coleção combina com o predicate fornecido
        //System.out.println(listaNumerica.stream().anyMatch(s -> s.equals("0")));

        // count() - Retorna o tamanho da stream
        //System.out.println(listaNumerica.stream().distinct());


    }
}

