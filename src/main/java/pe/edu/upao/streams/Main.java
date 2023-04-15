package pe.edu.upao.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("Juan");
        lista.add("Pedro");
        lista.add("Mateo");

        List<String> result = new ArrayList<>();
        for (String nombre : lista) {
            result.add(nombre.toUpperCase(Locale.ROOT));
        }

        List<String> result2 = result.stream().map(nombre -> nombre.toUpperCase(Locale.ROOT))
                .toList();

        List<String> resultJ = result.stream()
                .map(nombre -> nombre.toUpperCase(Locale.ROOT))
                .filter(it -> it.startsWith("J"))
                .toList();


        System.out.println("-----------------");
        for (String mayus : result) {
            System.out.println(mayus);
        };
    }
}
