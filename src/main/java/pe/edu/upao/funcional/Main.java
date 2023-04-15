package pe.edu.upao.funcional;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Runnable> misTareas = new ArrayList();
        misTareas.add(new TareaHija1());
        misTareas.add(new TareaHija2());
        misTareas.add(new TareaHija1());
        misTareas.add(new TareaHija3());
        misTareas.add(new Runnable() {
            @Override
            public void run() {
                System.out.println("Tarea desde clase anonima");
            }
        });

        misTareas.add(() -> System.out.println("Tarea desde lambda"));

        for (Runnable tarea : misTareas) {
            tarea.run();
        }
    }
}
