package Ejercicio1WorkShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String placa;
        String marca;
        String modelo;
        int horas;
        int fila;
        int columna;
        boolean fin = false;
        double Totalacumaldo = 0;
        Parqueadero parqueadero = new Parqueadero(30);
        int option;

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        System.out.println("================BIENVENIDO AL PARQUEADERO================");
        System.out.println("Nuestra tarifa por hora es de $30 USD.");
        System.out.println(" ");
        while (!fin) {
            System.out.println("1. Agregar un carro. ");
            System.out.println("2. Mostrar el parqueadero. ");
            System.out.println("3. Salir del sistema. ");
            option = teclado.nextInt();

            switch (option) {
                case 1:

                        System.out.println("Ingrese la placa: ");
                        placa = teclado2.nextLine();
                        System.out.println("Ingrese la marca: ");
                        marca = teclado2.nextLine();
                        System.out.println("Ingrese el modelo: ");
                        modelo = teclado2.nextLine();
                        System.out.println("Ingrese la cantidad de horas: ");
                        horas = teclado.nextInt();
                        System.out.println("Ingrese la fila: ");
                        fila = teclado.nextInt();
                        System.out.println("Ingrese la columna: ");
                        columna = teclado.nextInt();

                        Carro carro = new Carro(placa, marca, modelo, horas);
                        parqueadero.parquearCarro(carro, fila, columna);

                        Totalacumaldo = Totalacumaldo + parqueadero.cobrarPortiempo(carro);
                            break;
                        case 2:
                            System.out.println("============Ejercicio1WorkShop.Parqueadero============");
                            parqueadero.mostrarParqueadero();
                            System.out.println("===================================");
                            break;

                        case 3:
                            fin = true;
                            break;
                        default:
                            return;

            }
        }
        System.out.println("El total acumulado en el dia es de: $" + Totalacumaldo + " USD.");
    }
}