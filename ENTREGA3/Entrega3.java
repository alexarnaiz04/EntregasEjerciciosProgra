//Ejercicio 12

/*
 * Las expresiones lambda en Java son una forma de definir la correspondencia entre ciertos argumentos y un resultado. Básicamente, nos 
 * permiten establecer reglas de cómo convertir unos valores de entrada en un valor de salida. Estas expresiones lambda se utilizan para
 * definir funciones o subrutinas de manera anónima, lo que significa que podemos crear funciones sin darles un nombre explícito.
 */

//Ejercicio 13

import java.util.Scanner;
import java.util.function.Function;

public class lambdaListas {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introduzca a continuacion el límite inferior:");
            double limiteInferior = scanner.nextDouble();

            System.out.println("Introduzca a continuacion el límite superior:");
            double limiteSuperior = scanner.nextDouble();

            System.out.println("Ingrese el paso:");
            double paso = scanner.nextDouble();

            double integral = calcularIntegral(limiteInferior, limiteSuperior, paso, x -> Math.pow(Math.exp(x), 2));

            System.out.println("La integral de e^x^2 desde el limite " + limiteInferior + " hasta el limite " + limiteSuperior + " con un paso de " + paso + " es: " + integral);
        }
    }

    public static double calcularIntegral(double a, double b, double h, Function<Double, Double> funcion) {
        double resultado = 0;
        for (double x = a; x < b; x += h) {
            resultado += funcion.apply(x) * h;
        }
        return resultado;
    }
}

//Ejercicio 14

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Ejercicio14 {
    public static void main(String[] args) {
        // 1. Generar un stream de números mediante el método estático of de la clase IntStream.
        IntStream apartado1 = IntStream.of(1, 2, 3, 4, 5);
        System.out.println("Generar un stream de números mediante el método estático of de la clase IntStream.");
        apartado1.forEach(System.out::println);

        // 2. Generar un stream de números mediante el método estático range de la clase IntStream.
        IntStream apartado2 = IntStream.range(1, 9); 
        System.out.println("Generar un stream de números mediante el método estático range de\r\n" + "la clase IntStream.");
        apartado2.forEach(System.out::println);

        // 3. Generar un stream de números mediante el método estático iterate de la clase IntStream.
        System.out.println("Generar un stream utilizando el método estático iterate de la clase IntStream:");
        IntStream stream3 = IntStream.iterate(2, n -> n + 1).limit(10); // Comienza en 1, incrementa en 1, y toma 5 elementos
        stream3.forEach(System.out::println);
        System.out.println();

        // 4. Generar un stream de números aleatorios utilizando el método doubles de la clase Random.
        System.out.println("Generar un stream de números aleatorios utilizando el método doubles de la clase Random:");
        Random random = new Random();
        DoubleStream stream4 = random.doubles(5); // Genera 5 números aleatorios
        stream4.forEach(System.out::println);
    }
}

//Ejercicio 15

package Aplicacion;

import java.util.*;

public class Principal {
    public static void main(String[] args) {

        System.out.println("1. Suma hasta 9: " + Dominio.Mates.sumahasta(8));
        System.out.println("2. Factorial de 6: " + Dominio.Mates.factorial(4));
        System.out.println("3. Potencia de 2^3: " + Dominio.Mates.potencia(5, 3));

        List<Integer> numeros = Arrays.asList(2, 4, 6, 8, 12);
        System.out.println("4. Suma de la lista: " + Dominio.Mates.sumaLista(numeros));
        System.out.println("5. Media de la lista: " + Dominio.Mates.media(numeros));
        System.out.println("6. Desviación típica de la lista: " + Dominio.Mates.desviacionTipica(numeros));
        System.out.println("7. Suma de los primeros pares hasta 9: " + Dominio.Mates.sumaPares(9));

        List<Integer> numerosPares = Arrays.asList(1, 3, 5, 7);
        System.out.println("8. Suma de los pares en la lista: " + Dominio.Mates.sumaParesLista(numerosPares));

        List<Integer> listaInicial = Arrays.asList(3, 6, 15, 21);
        System.out.println("9. Lista de pares de la lista inicial: " + Dominio.Mates.obtenerListaPares(listaInicial));
        System.out.println("10. Lista de pares hasta 9: " + Dominio.Mates.listaPares(9));

        List<Integer> lista1 = Arrays.asList(1, 2, 3);
        List<Integer> lista2 = Arrays.asList(2, 4, 6);
        System.out
                .println("11. Producto escalar de las listas: " + Dominio.Mates.calcularProductoEscalar(lista1, lista2));

        
    }
}

package Dominio;

import java.util.*;
import java.util.stream.*;

public class Mates {


    public static int sumahasta(int n) {
        return IntStream.rangeClosed(0, n).sum();
    }

    public static int factorial(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }

    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    public static int sumaLista(List<Integer> numeros) {
        return numeros.stream().mapToInt(Integer::intValue).sum();
    }

    public static double media(List<Integer> numeros) {
        return numeros.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public static double desviacionTipica(List<Integer> numeros) {
        double media = media(numeros);
        double sumaCuadrados = numeros.stream().mapToDouble(x -> Math.pow(x - media, 2)).sum();
        return Math.sqrt(sumaCuadrados / numeros.size());
    }

    public static int sumaPares(int n) {
        return IntStream.rangeClosed(2, n).filter(x -> x % 2 == 0).sum();
    }

    public static int sumaParesLista(List<Integer> numeros) {
        return numeros.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> obtenerListaPares(List<Integer> numeros) {
        return numeros.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }

    public static List<Integer> listaPares(int n) {
        return IntStream.rangeClosed(2, n).filter(x -> x % 2 == 0).boxed().collect(Collectors.toList());
    }

    public static int calcularProductoEscalar(List<Integer> lista1, List<Integer> lista2) {
        return IntStream.range(0, lista1.size()).map(i -> lista1.get(i) * lista2.get(i)).sum();
    }    
}

//Ejercicio 16

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Ejercicio16 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Introduzca a continuacion el límite inferior:");
            double limInf = sc.nextDouble();

            System.out.println("Introduzca a continuacion el límite superior:");
            double limSup = sc.nextDouble();

            System.out.println("Ingrese el paso:");
            double paso = sc.nextDouble();

            double integral = integral(limInf, limSup, paso, x -> Math.pow(Math.exp(x), 2));

            System.out.println("La integral de e^x^2 desde el limite " + limInf + " hasta el limite " + limSup +
                    " con un paso de " + paso + " es: " + integral);
        }
    }

    public static double integral(double a, double b, double h, Function<Double, Double> funcion) {
        DoubleUnaryOperator unaryOperator = x -> funcion.apply(x); 

        return DoubleStream.iterate(a, x -> x + h)
                .limit((long) ((b - a) / h))
                .map(unaryOperator)
                .sum() * h;
    }
}

//Ejercicio 17

package aplicacion;

import java.time.*;
import java.util.*;

import dominio.Persona;
import dominio.Personas;

public class Principal {
    public static void main(String[] args) {
        Personas personas = new Personas();

        Persona persona1 = new Persona("Maria", LocalDate.of(2003, 4, 17));
        Persona persona2 = new Persona("Alex", LocalDate.of(1999, 12, 1));

        personas.anadirPersona(persona1);
        personas.anadirPersona(persona2);

        List<Persona> personasFiltradas = personas.filtrarPorEdad(25, 35);
        System.out.println("Personas entre 18 y 25 años:");
        for (Persona p : personasFiltradas) {
            System.out.println(p.getNombre() + " - " + p.calcularEdad() + " años");
        }

        Persona masJoven = personas.elMasJoven();
        if (masJoven != null) {
            System.out.println("La persona más joven es: " + masJoven.getNombre() +
                    ", con una edad de " + masJoven.calcularEdad() + " años.");
        } else {
            System.out.println("No hay personas en la lista.");
        }

        long sumaEdades = personas.calcularSumaEdades();
        System.out.println("La suma de las edades es: " + sumaEdades);

        long edadMinima = personas.calcularEdadMinima();
        System.out.println("La edad mínima es: " + edadMinima);

        double mediaEdad = personas.calcularMediaDeEdad();
        System.out.println("La media de edad es: " + mediaEdad);
    }
}

package dominio;
import java.time.*;

public class Persona {
    private String nombre;
    private LocalDate fechaDeNacimiento;

    public Persona(String nombre, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public long calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaDeNacimiento, fechaActual).getYears();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Pedro", LocalDate.of(1971, 4, 119));
        long edad = persona.calcularEdad();
        System.out.println(persona.getNombre() + " tiene " + edad + " años.");
    }
}

package dominio;
import java.time.*;
import java.util.*;
import java.util.function.*;

public class Personas {
    private List<Persona> listaDePersonas;

    public Personas() {
        this.listaDePersonas = new ArrayList<>();
    }

    public void anadirPersona(Persona persona) {
        listaDePersonas.add(persona);
    }

    public List<Persona> filtrarPorEdad(int edadMinima, int edadMaxima) {
        Predicate<Persona> filtroEdad = persona -> persona.calcularEdad() >= edadMinima
                && persona.calcularEdad() <= edadMaxima;

        List<Persona> personasFiltradas = new ArrayList<>();
        for (Persona persona : listaDePersonas) {
            if (filtroEdad.test(persona)) {
                personasFiltradas.add(persona);
            }
        }
        return personasFiltradas;
    }

    public Persona elMasJoven() {
        return listaDePersonas.stream()
                .min(Comparator.comparing(Persona::getFechaDeNacimiento))
                .orElse(null);
    }

    public long calcularSumaEdades() {
        return listaDePersonas.stream()
                .mapToLong(Persona::calcularEdad)
                .sum();
    }

    public long calcularEdadMinima() {
        return listaDePersonas.stream()
                .mapToLong(Persona::calcularEdad)
                .min()
                .orElse(0);
    }

    public double calcularMediaDeEdad() {
        return listaDePersonas.stream()
                .mapToLong(Persona::calcularEdad)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        Personas personas = new Personas();

        Persona persona1 = new Persona("Ana", LocalDate.of(1985, 8, 20));
        Persona persona2 = new Persona("Carlos", LocalDate.of(1992, 3, 10));

        personas.anadirPersona(persona1);
        personas.anadirPersona(persona2);

        List<Persona> personasFiltradas = personas.filtrarPorEdad(25, 35);
        System.out.println("Personas entre 25 y 35 años:");
        for (Persona p : personasFiltradas) {
            System.out.println(p.getNombre() + " - " + p.calcularEdad() + " años");
        }

        Persona masJoven = personas.elMasJoven();
        if (masJoven != null) {
            System.out.println("La persona más joven es: " + masJoven.getNombre() +
                    ", con una edad de " + masJoven.calcularEdad() + " años.");
        } else {
            System.out.println("No hay personas en la lista.");
        }

        long sumaEdades = personas.calcularSumaEdades();
        System.out.println("La suma de las edades es: " + sumaEdades);

        long edadMinima = personas.calcularEdadMinima();
        System.out.println("La edad mínima es: " + edadMinima);

        double mediaEdad = personas.calcularMediaDeEdad();
        System.out.println("La media de edad es: " + mediaEdad);
    }
}