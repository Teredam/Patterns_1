package S0301.Nivel2;

public class ContactoSpain implements FactoryContacto{
    @Override
    public String getNumTelefono(String phone) {
        return "+" + 0034 + "(" + phone + ")";
    }
    @Override
    public String getDireccion(String tipo, String nombre, int numero, String cp, String pais){
        return tipo + " " + nombre + " " + numero + ", " + cp + ", " + pais;
    }
}
