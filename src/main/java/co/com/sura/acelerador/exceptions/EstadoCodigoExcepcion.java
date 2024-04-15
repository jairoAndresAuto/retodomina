package co.com.sura.acelerador.exceptions;

public class EstadoCodigoExcepcion extends AssertionError{
    public static final String MSJ_EXCEP_STAT_CODE = "El servicio no respondio 200";

    public EstadoCodigoExcepcion(String message, Throwable cause){
        super(message,cause);
    }

}
