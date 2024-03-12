//Ejercicio 34

/*
Un algoritmo en programación Java es una secuencia de instrucciones o pasos lógicos diseñados para realizar una tarea específica o 
resolver un problema.
Estos algoritmos son escritos en lenguaje Java, un lenguaje de programación de alto nivel ampliamente utilizado en el desarrollo de 
aplicaciones, desde aplicaciones de escritorio hasta aplicaciones web y móviles.
Los algoritmos en Java pueden abordar una variedad de problemas, desde cálculos matemáticos simples hasta algoritmos complejos de 
inteligencia artificial.
*/

//Ejercicio 35

package aplicacion;

import dominio.SumaNNumeros;

public class Principal {

    public static void main(String[] args) {
        int n = 8; 
        SumaNNumeros utils = new SumaNNumeros();
        System.out.println("Suma recursiva de los primeros " + n + " números naturales: " + utils.sumaRecursiva(n));
        System.out.println("Suma iterativa de los primeros " + n + " números naturales: " + utils.sumaIterativa(n));
    }
}

package dominio;

public class SumaNNumeros {

    // Algoritmo recursivo
    public int sumaRecursiva(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumaRecursiva(n - 1);
        }
    }

    // Algoritmo iterativo
    public int sumaIterativa(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}


//Ejercicio 36

/*
Cuando decimos que un algoritmo tiene una complejidad O(n), significa que su tiempo de ejecución aumenta de manera proporcional al 
tamaño de la entrada (n).

Imagina que tienes una lista con n elementos y quieres hacer algo con cada uno de ellos. Si el algoritmo tiene una complejidad O(n), 
significa que si duplicas el tamaño de la lista, el tiempo que tardará el algoritmo aproximadamente se duplicará también.
 */


//Ejercicio 37

/* 
 * La complejidad temporal de la formula presentada del espacio recorido es constante, independiente del valor de "t", ya que solo 
 * sigue dos instrucciones.
*/


//Ejercicio 38

/*
 * En el método primero, se accede directamente al primer elemento de la lista utilizando lista.get(0), lo que tiene una complejidad 
 * de tiempo constante O(1) porque la operación de acceso a un elemento por índice en un ArrayList es de tiempo constante.
 * 
 * En el método nEsimo, se accede al elemento en la posición n de la lista utilizando lista.get(n), lo cual también tiene una complejidad 
 * de tiempo constante O(1) por la misma razón mencionada anteriormente.
 */


//Ejercicio 39

/*
* El algoritmo recursivo realiza una suma recursiva de los números desde n hasta 1. La función se llama a sí misma n veces, reduciendo 
* n en 1 en cada llamada hasta que n llega a 0. Por lo tanto, el número total de llamadas recursivas será n.
* La complejidad temporal de este algoritmo se puede expresar como O(n), donde n es el valor de entrada.
* 
* El algoritmo iterativo utiliza un bucle for que se ejecuta n veces, donde n es el valor de entrada. Dentro del bucle, realiza una 
* suma acumulativa. Dado que el bucle se ejecuta n veces y cada operación dentro del bucle tiene un tiempo de ejecución constante, la 
* complejidad temporal es lineal en términos de n. por lo tanto, la complejidad temporal de este algoritmo también es O(n).
 */


//Ejercicio 40

/*
 * He escogido el apartado 5, el metodo de una media de una lista de numeros.
 * 
 * La función sumaLista calcula la suma de todos los elementos de la lista. Si consideramos que n es el tamaño de la lista, la 
 * complejidad de sumaLista sería O(n), ya que debe sumar cada uno de los elementos de la lista.
 * 
 * Después de obtener la suma de todos los elementos, se realiza una división y una conversión de tipo para obtener la media. Estas 
 * operaciones tienen una complejidad constante, O(1).
 * 
 * Si consideramos como la operación dominante a la suma de la lista (O(n)), la complejidad temporal total del método mediaLista sería O(n).
 */


//Ejercicio 41

/*
El algoritmo escogido es una función recursiva que calcula la suma de los elementos en una lista de enteros.

Complejidad temporal:

En cada llamada recursiva, el algoritmo realiza operaciones de acceso y eliminación del primer elemento de la lista. Ambas operaciones 
tienen una complejidad de O(1) en listas enlazadas como las implementadas por la clase ArrayList de Java. Sin embargo, la operación 
lista.remove(0) tiene una complejidad de O(n) en listas enlazadas simples, donde n es el tamaño de la lista. Esto se debe a que después 
de eliminar el primer elemento, los elementos restantes deben moverse hacia la izquierda para llenar el espacio vacío. Por lo tanto, el 
peor caso de tiempo para esta operación en cada llamada recursiva sería O(n).
Entonces, la complejidad temporal total del algoritmo será O(n^2) en el peor de los casos, ya que para cada llamada recursiva, se puede 
requerir un tiempo O(n) para eliminar el primer elemento de la lista.

Complejidad espacial:

Está determinada por el número máximo de llamadas recursivas pendientes en la pila de llamadas (stack). En este caso, como la función 
se llama recursivamente para cada elemento en la lista, la profundidad máxima de la pila de llamadas será igual al número de elementos en la lista.
Por lo tanto, la complejidad espacial del algoritmo será O(n), donde n es el tamaño de la lista.

Comparación con el enfoque iterativo:

Un enfoque iterativo para calcular la suma de los elementos de la lista tendría una complejidad temporal y espacial de O(n), ya que 
simplemente recorrería la lista una vez, sumando los elementos en el camino sin requerir llamadas recursivas adicionales.
En términos de complejidad, el enfoque iterativo sería más eficiente tanto en tiempo como en espacio, ya que evitaría la sobrecarga de 
llamadas recursivas y el potencial costo asociado con la eliminación de elementos de la lista en cada llamada recursiva.
*/


//Ejercicio 42

/* 
Si queremos calcular la complejidad temporal de un algoritmo que ejecuta una instrucción para cada elemento del producto cartesiano 
de A × A, donde A es un conjunto con cardinalidad n, podríamos usar un bucle anidado para iterar sobre cada elemento del producto 
cartesiano. Esto conduciría a una complejidad temporal de O(n^2), donde n es la cardinalidad del conjunto A. 
*/


//Ejercicio 43

/*
Para calcular la complejidad temporal de este método, debemos considerar el tiempo que tarda en recorrer todos los elementos de la 
matriz. El bucle exterior for recorre todas las filas de la matriz, por lo que se ejecuta m veces. Por lo tanto, el tiempo de ejecución 
total del método es aproximadamente O(m * n), donde m es el número de filas de la matriz y n es el número de columnas. 
*/


//Ejercicio 44

public static boolean buscar(int e, int[] array) {

    if (array[0] == e || array[array.length - 1] == e) {
        return true;
    }
    
    for (int i = 1; i < array.length - 1; i++) {
        if (array[i] == e) {
            return true; 
        }
    }
    
    return false; 
}

/*
Peor caso: O(n)
Mejor caso: O(1)
Caso promedio: O(n) 
*/


//Ejercicio 45

public static boolean buscar(int e, int[] array) {
    return buscarRecursivo(e, array, 0, array.length - 1);
}

private static boolean buscarRecursivo(int e, int[] array, int inicio, int fin) {
    if (inicio > fin) {
        return false;
    }
    
    int medio = encontrarMedio(inicio, fin);
    
    if (array[medio] == e) {
        return true;
    } else if (array[medio] < e) {
        return buscarRecursivo(e, array, medio + 1, fin);
    } else {
        return buscarRecursivo(e, array, inicio, medio - 1);
    }
}

private static int encontrarMedio(int inicio, int fin) {
    return inicio + (fin - inicio) / 2;
}

/*
La complejidad en el peor caso, en cada paso del algoritmo se reduce el rango de búsqueda a la mitad, por lo que la complejidad temporal 
en el peor caso es logarítmica respecto al tamaño del array. Por lo tanto, la complejidad en el peor caso es O(log n), donde n es el 
número de elementos en el array. 
*/


//Ejercicio 46

/*
Complejidad temporal: Exponencial, O(2^n) en el peor caso. Esto se debe a que en cada llamada recursiva se realizan dos llamadas 
adicionales, lo que genera un crecimiento exponencial del tiempo de ejecución conforme n aumenta.

Complejidad espacial: Lineal, O(n) en el peor caso. La profundidad de la pila de llamadas recursivas es n, lo que significa que el 
espacio necesario en la memoria aumenta linealmente con n.
 */


//Ejercicio 47

/*
 * A medida que el valor de "n" aumenta, el tiempo que tarda el programa en ejecutarse también aumenta. Esto ocurre porque el bucle 
 * "for" se ejecuta "n" veces, y cada vez que se aumenta "n", el bucle hace más trabajo. Esto se llama complejidad temporal lineal. 
 * Aunque hay otros factores que pueden influir, como el tiempo de acceso a la memoria y la sobrecarga del sistema, en general, a 
 * medida que "n" se hace más grande, el tiempo de ejecución del programa también se incrementa.
 */


//Ejercicio 48

/*
 * Los tiempos de ejecución del método sumaNPrimeros aumentan mucho cuando n crece. Esto se debe a que el método hace más trabajo a 
 * medida que n se vuelve más grande. El método tiene un bucle dentro de otro bucle, lo que significa que el tiempo de ejecución 
 * aumenta cuadráticamente con respecto al tamaño de n. Por lo tanto, cuanto más grande sea n, más tiempo tomará ejecutar el método. 
 * Los tiempos de ejecución en el cuadro 2 muestran este patrón: se incrementan notablemente a medida que n aumenta.
 */


//Ejercicio 49

/*
 * La definición dice que una función T(n) está en el orden de otra función f(n) (escrito como T(n) ∈ O(f(n))) si, a partir de cierto 
 * punto (n₀), T(n) es menor o igual a una constante multiplicada por f(n). Esto significa que T(n) no crece más rápido que f(n) a 
 * medida que n aumenta. Es una forma de comparar cómo crecen dos funciones en relación entre sí cuando n se hace grande.
 */


//Ejercicio 50

/*
Para demostrar que T(n) = 3 · log₂(n) + 2 está en el orden O(log₂(n)), podemos elegir k = 5 y n₀ = 1, lo que cumple con la definición 
dada.

Si T(n) ∈ O(log₂(n)), entonces T(n) ∈ O(n) es verdadero, ya que cualquier función logarítmica crece más lentamente que cualquier 
función lineal.

Si T(n) ∈ O(log₃(n)), no necesariamente implica que T(n) ∈ O(log₂(n)), ya que el crecimiento de una función logarítmica base 3 puede 
ser diferente al de una función logarítmica base 2.
 */


//Ejercicio 51

/*
El orden de crecimiento de las funciones, de menor a mayor, sería:
    f0(x) (constante) < f3(x) (logarítmica) < f1(x) (lineal) < f2 (x) (cuadrática) < f4 (x) (exponencial)
Las funciones aumentan en velocidad de crecimiento desde constantes hasta exponenciales.
 */


//Ejercicio 52

/*
El método f se llama recursivamente dos veces con n/2 en cada llamada. Esto crea un árbol de recursión de altura logarítmica. Luego, 
se suma el resultado de estas llamadas y se calcula la suma de los primeros m números naturales, donde m es el valor de retorno de la 
recursión. Esto implica una complejidad de O(n * log(n)) ya que tenemos un crecimiento logarítmico multiplicado por un crecimiento 
lineal.
 */


//Ejercicio 53

/*
Sí, es cierto. La complejidad de la inserción en un ArrayList varía dependiendo de si el ArrayList está ordenado o no.

Cuando el ArrayList no está ordenado, la inserción es rápida (O(1)), ya que simplemente se agrega al final de la lista sin necesidad de 
desplazar otros elementos.

Sin embargo, si el ArrayList está ordenado, la inserción requiere mantener el orden, lo que podría implicar desplazar otros elementos 
para hacer espacio. Esto puede llevar más tiempo (O(n)), ya que se deben mover todos los elementos mayores al nuevo elemento.
 */


//Ejercicio 54

/*
La complejidad temporal de cada expresión determina cuántas veces se ejecutará la instrucción (o bloque de instrucciones) en función 
del tamaño de la entrada (n). Luego, multiplicaremos esta cantidad por el tiempo que tarda cada instrucción para obtener el tiempo requerido.

Suponiendo que una instrucción tarda en ejecutarse 10 ns, calculamos el tiempo requerido para cada caso con las dos configuraciones proporcionadas:


Para n = 100:

log(n): log(100) ≈ 2 (base 10). Tiempo requerido: 2 * 10 ns = 20 ns.
n: 100. Tiempo requerido: 100 * 10 ns = 1000 ns = 1 µs.
nlog(n): 100 * log(100) ≈ 200 (base 10). Tiempo requerido: 200 * 10 ns = 2000 ns = 2 µs.
n^2: 100^2 = 10000. Tiempo requerido: 10000 * 10 ns = 100000 ns = 0.1 ms.
n^8: 100^8 ≈ 10^16. Tiempo requerido: 10^16 * 10 ns = 10^17 ns.
10^n: 10^100. Tiempo requerido: 10^100 * 10 ns = 10^101 ns.


Para n = 100,000 y tiempo de instrucción de 1 ms (10^6 ns):

log(n): log(100000) ≈ 5 (base 10). Tiempo requerido: 5 * 10^6 ns = 5 ms.
n: 100000. Tiempo requerido: 100000 * 10^6 ns = 10^11 ns = 100 s.
nlog(n): 100000 * log(100000) ≈ 500000 (base 10). Tiempo requerido: 500000 * 10^6 ns = 500 s.
n^2: 100000^2 = 10^10. Tiempo requerido: 10^10 * 10^6 ns = 10^16 ns = 10^10 s = 316 años (aproximadamente).
n^8: 100000^8 ≈ 10^32. Tiempo requerido: 10^32 * 10^6 ns = 10^38 ns.
10^n: 10^100000. Tiempo requerido: 10^100000 * 10^6 ns = 10^106 ns.

Estos cálculos muestran cómo el tiempo aumenta significativamente con el tamaño de la entrada y la complejidad de la expresión. 
*/