package S0301.Nivel3;

import java.util.ArrayList;


public class AccionOrden implements IOrder {
    private ArrayList<IOrder> orderArrayList = new ArrayList<IOrder>();

    public void recibirOrder(IOrder order){
        orderArrayList.add(order);
    }
    @Override
    public void execute(Vehiculo vehiculo){
        for (IOrder c : orderArrayList) {
            if (c instanceof ArrancarComando){
                c.execute(vehiculo);
            } else if (c instanceof AcelerarComando) {
                c.execute(vehiculo);
            } else if (c instanceof FrenarComando) {
                c.execute(vehiculo);
            }
        }
    }
}
