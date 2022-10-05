package javapractice02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel Gonzales
 */
public class Pedidos {

    // Un menú de servicios está formado por un  conjunto  de platos principales 
    // y bebidas (Piensa en qué tipo puede ser),
    // Se podrá crear de dos formas, indicándoles nosotros el tamaño o con un 
    // tamaño por defecto (10).
    private final int ARREGLO_LIMITE = 10;

    // Lista de arreglos.
    // Sera una matriz 10 x 2
    // An1 = platoPrincipal
    // An2 = bebida
    private final ArrayList<String[]> pedidos = new ArrayList<>();

    public void aniadirPedidos(String platoPrincipal, String bebida) {

        String[] pedido = {platoPrincipal, bebida};

        // El limite son 10 pedidos.
        // con el if se comprueba que la cantidad de pedidos
        // es menor al límite (10), si es menor
        // agrega los pedidos, si no, no se agregan.
        if (pedidos.size() < ARREGLO_LIMITE) {
            pedidos.add(pedido);
            System.out.println("agregado correctamente: " + pedido[0] + " " + pedido[1]);
        } else {
            System.out.println("lleno!, no se agrego: " + pedido[0] + " " + pedido[1]);
        }
        System.out.println();
    }

    public void listarPedidos() {
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println(pedidos.get(i)[0] + " " + pedidos.get(i)[1]);
        }
        System.out.println();
    }

    public void mostrarMenus() {

        Scanner scan = new Scanner(System.in);

        boolean enEjecucion = true;
        int eleccion;

        while (enEjecucion) {
            System.out.println("1. Añadir pedidos");
            System.out.println("2. Listar pedidos");
            System.out.println("0. Salir");

            eleccion = scan.nextInt();
            scan.nextLine();
            System.out.println();

            switch (eleccion) {
                case 0:
                    System.out.println("Adios :(");
                    enEjecucion = false;
                    break;
                case 1:
                    String[] pedidoLocal = new String[2];
                    System.out.println("Ingresa el plato principal");
                    pedidoLocal[0] = scan.nextLine();

                    System.out.println("Ingresa la bebida");
                    pedidoLocal[1] = scan.nextLine();

                    aniadirPedidos(pedidoLocal[0], pedidoLocal[1]);
                    break;
                case 2:
                    listarPedidos();
                    break;
            }
        }
    }
}
