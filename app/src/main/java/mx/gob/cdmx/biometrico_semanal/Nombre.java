package mx.gob.cdmx.biometrico_semanal;

public class Nombre  {

    /*
    �lvaro Obreg�n
    Azcapotzalco
    Benito Ju�rez
    Coyoac�n
    Cuajimalpa de Morelos
    Cuauht�moc
    Gustavo A. Madero
    Iztacalco
    Iztapalapa
    La Magdalena Contreras
    Miguel Hidalgo
    Milpa Alta
    Tl�huac
    Tlalpan
    Venustiano Carranza
    Xochimilco
    */

    public static final String customURL = "https://opinion.cdmx.gob.mx/encuestas/";
    public static final String encuesta = "biometrico_semanal";
    public static final String USUARIO = "usuario";
    public static final String ALCALDIA = "Cuauht�moc";
    public static final String PADRON = "padron";
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String IMEI = "imei";

    public String nombreEncuesta(){

        final String nombreEncuesta = "biometrico_semanal";
        return nombreEncuesta;
    }

    public String nombreDatos(){

        final String nombreEncuesta = "datos_biometrico_semanal";
        return nombreEncuesta;
    }

}	 