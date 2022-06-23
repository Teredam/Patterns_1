package S0301.Nivel2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        FactoryProductor llamada = new FactoryProductor();

        HashMap<String, String> datosContacto = new HashMap<>();

        FactoryContacto fcUSA = llamada.getLlamada(TipoCodigoPais.codigoDigito1USA);

        datosContacto.put(fcUSA.getNumTelefono("650545454"), fcUSA.getDireccion("Avenue", "Melrose", 324,
                "83448", "EEUU"));

        System.out.println(datosContacto);

        FactoryContacto fcSpain = llamada.getLlamada(TipoCodigoPais.codigoDigito2Spain);

        datosContacto.put(fcSpain.getNumTelefono("650545454"), fcSpain.getDireccion("Calle", "Merida", 324,
                "08030", "Spain"));

        FactoryContacto fcGGroelandia = llamada.getLlamada(TipoCodigoPais.codigoDigito3Groelandia);

        datosContacto.put(fcGGroelandia.getNumTelefono("650545454"), fcGGroelandia.getDireccion("Street", "Qooqut", 3900,
                "3900", "Groelandia"));

        FactoryContacto fcJamaica = llamada.getLlamada(TipoCodigoPais.getCodigoDigito4Jamaica);

        datosContacto.put(fcJamaica.getNumTelefono("650545454"), fcJamaica.getDireccion("Blvr", "Place", 12,
                "07030", "Jamaica"));

        System.out.println(datosContacto);


    }
}
