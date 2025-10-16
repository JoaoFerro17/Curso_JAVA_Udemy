package listas;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TipoList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Bob");
        list.add("Alex");
        list.add("Anna");
        list.add(2, "Marco"); //como adicionar elementos na lista;

        System.out.println(list.size()); //mostra o tamanho da lista;

        for (String x : list){
            System.out.println(x);
        }

        list.remove("Anna"); //é capaz de remover um valor por comparação de dados;
        list.remove(1); // é possivel remover usando a posição na lista;

        list.removeIf(x -> x.charAt(0) == 'M'); //removendo usando predicado; como  se lê: pega um valor x, do tipo string e me retorna se esse x.charAt(0 é igual a 'M'

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("Index of Bob: " + list.indexOf("Bob")); // para encontrar a posição de um elemento;
        System.out.println("Index of Marco: " + list.indexOf("Marco")); //quando o  index.of não encontra o elemento ele retorna -1

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // procurar todos os nomes que começam com A

        for (String x : result){
            System.out.println(x);
        }

        //Para encontrar o primeiro elemento com a letra A
        String name = list.stream().filter(x ->  x.charAt(0) =='A').findFirst().orElse(null);
        System.out.println(name);
    }
}
