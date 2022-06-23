package S0301.Nivel3;

public class AcelerarComando implements IOrder {
    @Override
    public void execute(Vehiculo vehiculo){
        System.out.println("[COMANDO ACELERAR] = Acelerando " + vehiculo.getTipo());
    }
}
