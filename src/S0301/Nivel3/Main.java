package S0301.Nivel3;

public class Main {
    public static void main(String[] args) {

        AccionOrden a = new AccionOrden();

        a.recibirOrder(new ArrancarComando());
        a.recibirOrder(new AcelerarComando());
        a.recibirOrder(new FrenarComando());

        Vehiculo coche = new Vehiculo();
        coche.setTipo("coche");

        Vehiculo bici = new Vehiculo();
        bici.setTipo("bicicleta");

        Vehiculo avion = new Vehiculo();
        avion.setTipo("avión");

        Vehiculo barco = new Vehiculo();
        barco.setTipo("barco");

        Invoker ivk = new Invoker();
        ivk.execute(a, coche);
        ivk.execute(a, bici);
        ivk.execute(a, avion);
        ivk.execute(a, barco);

    }

}
