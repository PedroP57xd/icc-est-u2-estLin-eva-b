package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {
         Queue<String> colaPersonas = new LinkedList<>(Arrays.asList());
         colaPersonas.add("Ana");
         colaPersonas.add("Luis");
         colaPersonas.add("Pedro");

         Queue<String> colaPersonasR = new LinkedList<>(Arrays.asList());
         for (String c: colaPersonas) {

         }
        return new LinkedList<>(Arrays.asList()); // Simulación de resultado
    }

    /**
     * Intercala los elementos de dos colas en una nueva.
     * Si una cola tiene más elementos, se añaden al final.
     * 
     * Ejemplo:
     * Entrada:
     * cola1: [1, 3, 5]
     * cola2: [2, 4, 6, 8]
     * Salida:
     * [1, 2, 3, 4, 5, 6, 8]
     *
     * @param cola1 primera cola
     * @param cola2 segunda cola
     * @return nueva cola con elementos intercalados
     */
    public Queue<Integer> intercalarColas(Queue<Integer> cola1, Queue<Integer> cola2) {
        Queue<Integer> colaP = new LinkedList<>(Arrays.asList());
        cola1.add(1);
        cola1.add(3);
        cola1.add(5);
        Queue<Integer> colaS = new LinkedList<>(Arrays.asList());
        cola2.add(2);
        cola2.add(4);
        cola2.add(6);
        cola2.add(8);
        Queue<Integer> colaR = new LinkedList<>(Arrays.asList());
        for (int i: cola2 ) {
            colaR.add(cola1.peek()+1);
        }
        return new LinkedList<>(Arrays.asList()); // Simulación de resultado
    }

}
