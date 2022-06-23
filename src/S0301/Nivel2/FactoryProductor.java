package S0301.Nivel2;

public class FactoryProductor {
    public FactoryContacto getLlamada(TipoCodigoPais tipoCodigoPais){
        FactoryContacto contacto = null;

        if (tipoCodigoPais.equals(TipoCodigoPais.codigoDigito1USA)){
            contacto = new ContactoUsa();
        }

        if (tipoCodigoPais.equals(TipoCodigoPais.codigoDigito2Spain)){
            contacto = new ContactoSpain();
        }

        if (tipoCodigoPais.equals(TipoCodigoPais.codigoDigito3Groelandia)){
            contacto = new ContactoGroelandia();
        }

        if (tipoCodigoPais.equals(TipoCodigoPais.getCodigoDigito4Jamaica)){
            contacto = new ContactoJamaica();
        }
        return contacto;
    }
}
