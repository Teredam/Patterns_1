package S0301.Nivel2;

public interface FactoryContacto {
    String getNumTelefono(String phone);
    String getDireccion(String tipo, String nombre, int numero, String cp, String pais);
}
