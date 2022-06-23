package S0301.Nivel1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Undo {
    //patrón Singleton para que no se creen varios registros de pedidos sino un solo historial.
    private static Undo instancia; //Consuctor privado para no romper el patron

    private Undo(){
        listado = new ArrayList<>();
    }

    public static Undo getInstancia(){
        if (instancia == null)
            instancia = new Undo();
        return instancia;
    }

    public void agregarPedido(String producto, int cantidad){
        listado.add(new Pedidos(producto, cantidad));
    }

    public void eliminarPedido() {
        System.out.println("Borrando último pedido ingresado: " + listado.get(listado.size()-1));
        listado.remove(listado.size()-1);

    }

    @Override
    public String toString(){
        String s = "\n\nHISTORIAL DE PEDIDOS REALIZADOS."
                + "\n----------------------------------->\n";
        for (Pedidos pedidos: listado)
            s += pedidos.toString();
        return s;
    }

    private ArrayList<Pedidos> listado;


    public class Pedidos {
        private String nombreProducto;
        private int cantidad;
        GregorianCalendar GC;

        public Pedidos(String nombreProducto, int cantidad) {
            this.nombreProducto = nombreProducto;
            this.cantidad = cantidad;
            GC = new GregorianCalendar(); //instanciamos para capturar la fecha y hora de la venta
        }

        @Override
        public String toString() {
            int d = GC.get(Calendar.DAY_OF_MONTH);
            int m = GC.get(Calendar.MONTH);
            int a = GC.get(Calendar.YEAR);
            String fecha = (d < 10 ? "0" : "") + d + "/" + (m < 10 ? "0" : "") + m + "/" + a;
            //Para dar formato a la fecha y se coloque un 0 a los números menores a 10
            int hh = GC.get(Calendar.HOUR);
            int mm = GC.get(Calendar.MINUTE);
            int ss = GC.get(Calendar.SECOND);
            String hora = (hh < 10 ? "0" : "") + hh + ":" + (mm < 10 ? "0" : "") + mm + ":" + (ss < 10 ? "0" : "") + ss;
            //Para dar formato a la hora y se coloque un 0 a las horas menores a 10
            return "\nNombre del Producto: " + nombreProducto
                    + "\nCantidad adquirida: " + cantidad
                    + "\nFecha del pedido: " + fecha
                    + "\nHora del pedido: " + hora + "\n";
        }
    }
}
