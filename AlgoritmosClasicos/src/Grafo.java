import java.util.*;

public class Grafo {
    private int numVertices;
    private List<Character> vertices;
    private List<List<Character>> listaAdyacencia;

    public Grafo(char[] vertices) {
        this.numVertices = vertices.length;
        this.vertices = new ArrayList<>();
        this.listaAdyacencia = new ArrayList<>();

        // Inicializamos los vértices y la lista de adyacencia
        for (char vertice : vertices) {
            this.vertices.add(vertice);
            this.listaAdyacencia.add(new ArrayList<>());
        }
    }

    // Obtenemos el índice de un vértice
    private int obtenerIndice(char vertice) {
        return vertices.indexOf(vertice);
    }

    // Agregamos aristas
    public void agregarArista(char origen, char destino) {
        int indiceOrigen = obtenerIndice(origen);
        int indiceDestino = obtenerIndice(destino);

        // Las agregamos en ambas direcciones en un grafo no dirigido
        listaAdyacencia.get(indiceOrigen).add(destino);
        listaAdyacencia.get(indiceDestino).add(origen);
    }

    // Calculamos la secuencia de grados
    public List<Integer> calcularSecuenciaGrados() {
        List<Integer> grados = new ArrayList<>();

        // Calculamos el grado de cada vértice
        for (List<Character> adyacentes : listaAdyacencia) {
            grados.add(adyacentes.size());
        }

        // Ordenamos en orden descendente
        Collections.sort(grados);
        Collections.reverse(grados);

        return grados;
    }

    // Imprimimos la lista de adyacencia
    public void imprimirListaAdyacencia() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(vertices.get(i) + " => ");
            System.out.println(listaAdyacencia.get(i));
        }
    }
}
