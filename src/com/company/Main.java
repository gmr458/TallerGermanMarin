package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la cantidad de edades");
        int cantEdades = scanner.nextInt();

        int[] edades = new int[cantEdades];

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Digita la edad de la posicion " + i);
            edades[i] = scanner.nextInt();
        }

        System.out.println("Opciones:");
        System.out.println("1. Obtener y mostrar cual es la mayor y la menor edad almacenada en dicho vector original");
        System.out.println("2. Obtener e imprimir las edades de las personas mayores de edad y cuántas menores de edad hay");
        System.out.println("3. Leer una edad cualquiera, calcular y mostrar el número de personas que tienen esa edad");
        System.out.println("4. Calcular y mostrar el promedio de edades que se guardaron, obtener y mostrar las edades que son superiores a ese promedio");
        System.out.println("5. Ordenar las edades de mayor a menor y con base en ese ordenamiento mostrar la menor y la mayor edad y calcular cuántas personas tienen la mayor edad y cuántas la menor");
        System.out.println("6. Salir");

        System.out.println("Elija una opcion:");
        int opcion = scanner.nextInt();

        while (opcion != 6) {

            switch (opcion) {
                case 1 -> {
                    for (int recorrido = 0; recorrido < edades.length - 1; recorrido++) {
                        for (int elemento = 0; elemento < edades.length - 1; elemento++) {
                            if (edades[elemento] > edades[elemento + 1]) {
                                int t = edades[elemento];
                                edades[elemento] = edades[elemento + 1];
                                edades[elemento + 1] = t;
                            }
                        }
                    }
                    System.out.println("La mayor edad es: " + edades[edades.length - 1]);
                    System.out.println("La menor edad es: " + edades[0]);
                    System.out.println("----------------------------------------");
                }
                case 2 -> {
                    System.out.println("Las edades de las personas mayores de edad son: ");
                    for (int edad : edades) {
                        if (edad >= 18) {
                            System.out.println(edad);
                        }
                    }

                    int cantidadMenorEdad = 0;
                    for (int edad : edades) {
                        if (edad < 18) {
                            cantidadMenorEdad += 1;
                        }
                    }

                    System.out.println("La cantidad de menores de edad que hay es " + cantidadMenorEdad);
                    System.out.println("----------------------------------------");
                }
                case 3 -> {
                    System.out.println("Digite una edad:");
                    int edadIngresada = scanner.nextInt();

                    int cantPersonasConEdad = 0;
                    for (int edad : edades) {
                        if (edad == edadIngresada) {
                            cantPersonasConEdad += 1;
                        }
                    }

                    System.out.println("La cantidad de personas que tienen esa edad son: " + cantPersonasConEdad);
                    System.out.println("----------------------------------------");
                }
                case 4 -> {
                    double sumaDeEdades = 0;
                    for (int edad : edades) {
                        sumaDeEdades += edad;
                    }

                    double promedio = sumaDeEdades / edades.length;

                    System.out.println("El promedio de las edades es: " + promedio);

                    System.out.println("Las edades superiores al promedio son:");
                    for (int edad : edades) {
                        if (edad > promedio) {
                            System.out.println(edad);
                        }
                    }
                    System.out.println("----------------------------------------");
                }
                case 5 -> {
                    for (int recorrido = edades.length - 1; recorrido > 0; recorrido--) {
                        for (int elemento = edades.length - 1; elemento > 0; elemento--) {
                            if (edades[elemento] > edades[elemento - 1]) {
                                int t = edades[elemento];
                                edades[elemento] = edades[elemento - 1];
                                edades[elemento - 1] = t;
                            }
                        }
                    }

                    System.out.println("Edades ordenadas de mayor a menor");
                    for (int edad : edades) {
                        System.out.println(edad);
                    }

                    int mayorEdad = edades[0];
                    int menorEdad = edades[edades.length - 1];

                    int cantPersonasMayorEdad = 0;
                    int cantPersonasMenorEdad = 0;
                    for (int edad : edades) {
                        if (edad == mayorEdad) {
                            cantPersonasMayorEdad += 1;
                        }
                        if (edad == menorEdad) {
                            cantPersonasMenorEdad += 1;
                        }
                    }

                    System.out.println("Cantidad de personas que tiene la mayor edad: " + cantPersonasMayorEdad);
                    System.out.println("Cantidad de personas que tiene la menor edad: " + cantPersonasMenorEdad);
                    System.out.println("----------------------------------------");

                }

            }

            System.out.println("Elija una opcion:");
            opcion = scanner.nextInt();

        }

        scanner.close();

    }

}
