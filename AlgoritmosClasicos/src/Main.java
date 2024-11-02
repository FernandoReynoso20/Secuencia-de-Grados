import java.util.*;

public class Main {
    public static void main(String[] args) {
        char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        Grafo grafo = new Grafo(vertices);

        // Se definen las aristas
        char[][] aristas = {
                {'A', 'B'}, {'A', 'C'}, {'B', 'D'}, {'B', 'E'},
                {'C', 'F'}, {'C', 'G'}, {'D', 'E'}, {'D', 'H'},
                {'E', 'I'}, {'F', 'G'}, {'G', 'H'}, {'H', 'I'},
                {'I', 'F'}
        };

        // Agregamos todas las aristas al grafo
        for (char[] arista : aristas) {
            grafo.agregarArista(arista[0], arista[1]);
        }

        // Imprimimos la secuencia de grados
        System.out.println("Secuencia de grados:");
        List<Integer> secuenciaGrados = grafo.calcularSecuenciaGrados();
        System.out.println(secuenciaGrados);

        // E imprimimos la lista de adyacencia
        System.out.println("\nLista de adyacencia:");
        grafo.imprimirListaAdyacencia();
    }
}