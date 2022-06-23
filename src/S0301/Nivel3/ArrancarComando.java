package S0301.Nivel3;

public class ArrancarComando implements IOrder {
    @Override
    public void execute(Vehiculo vehiculo){
        System.out.println("[COMANDO ARRANCAR] = Arrancando " + vehiculo.getTipo());
    }
}
