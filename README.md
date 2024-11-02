# Secuencia de Grados y Lista de Adyacencia

Este programa implementa una estructura de grafo no dirigido, permitiendo la representación de grafos a través de una lista de adyacencia. Los vértices se representan con caracteres, y el programa proporciona dos funcionalidades principales que son la generación de la lista de adyacencia del grafo y el cálculo de la secuencia de grados. La clase Grafo facilita estas operaciones y permite observar la estructura del grafo de manera clara.

Entrada:

Vértices: {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'}
Aristas: { {'A', 'B'}, {'A', 'C'}, {'B', 'D'}, {'B', 'E'}, {'C', 'F'}, {'C', 'G'}, {'D', 'E'}, {'D', 'H'}, {'E', 'I'}, {'F', 'G'}, {'G', 'H'}, {'H', 'I'}, {'I', 'F'} }

Salida:
Secuencia de grados:
[3, 3, 3, 3, 3, 3, 2, 2, 2]

Lista de adyacencia:
A => [B, C]
B => [A, D, E]
C => [A, F, G]
D => [B, E, H]
E => [B, D, I]
F => [C, G, I]
G => [C, F, H]
H => [D, G, I]
I => [E, H, F]

El programa tiene un rendimiento eficiente en términos de tiempo para grafos pequeños a medianos. La complejidad de la mayoría de las operaciones es lineal con respecto al número de vértices y aristas.
