package S0301.Nivel2;

public class ContactoUsa implements FactoryContacto{
    @Override
    public String getNumTelefono(String phone) {
        return "+" + 001 + "(" + phone + ")";
    }
    @Override
    public String getDireccion(String tipo, String nombre, int numero, String cp, String pais){
        return numero + " " + nombre + " " + tipo + ", " + cp + ", " + pais;
    }
}
