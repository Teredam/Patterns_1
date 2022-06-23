package S0301.Nivel1;

import java.util.Scanner;

public class Main {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opc;

        do{
            opc = menu();
            switch (opc){
                case 1:
                    try {
                        System.out.println("Ingrese nombre del producto para pedir: ");
                        String producto = entrada.nextLine();
                        System.out.println("Ingrese la cantidad del producto: ");
                        int cant = Integer.parseInt(entrada.nextLine());
                        Undo.getInstancia().agregarPedido(producto, cant);
                    }catch (NumberFormatException e){
                        System.out.println("Error, debe colocar números enteros");
                    }
                    break;
                case 2:
                    System.out.println(Undo.getInstancia().toString());
                    break;
                case 3:
                    Undo.getInstancia().eliminarPedido();
                    break;
                case 4:
                    System.out.println("Cerrando programa");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }while (opc != 4);
    }
    private static int menu(){
        System.out.println(
                "\nMENÚ DE OPCIONES"
                        + "\n1. Registrar nuevo pedido."
                        + "\n2. Consultar historial de pedidos."
                        + "\n3. Eliminar pedido."
                        + "\n4. Salir del programa."
                        + "\nSeleccione Opción: "
        );
        try {
            return Integer.parseInt(entrada.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Ingrese una opción válida entre 1 y 4: ");
        }
        return Integer.parseInt(entrada.nextLine());
    }
}
