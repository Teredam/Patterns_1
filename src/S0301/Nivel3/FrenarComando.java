package S0301.Nivel3;

public class FrenarComando implements IOrder {
    @Override
    public void execute(Vehiculo vehiculo){
        System.out.println("[COMANDO FRENAR] = Frenando " + vehiculo.getTipo());
    }
}
