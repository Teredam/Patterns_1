package S0301.Nivel3;

public class Invoker {
    public void execute(IOrder metodo, Vehiculo v){
        metodo.execute(v);
    }
}
