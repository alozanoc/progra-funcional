package pe.edu.upao.poo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tarea> misTareas = new ArrayList();
        misTareas.add(new TareaHija1());
        misTareas.add(new TareaHija2());
        misTareas.add(new TareaHija1());
        misTareas.add(new TareaHija3());

        for (Tarea tarea : misTareas) {
            tarea.ejecutar();
        }
    }
}
