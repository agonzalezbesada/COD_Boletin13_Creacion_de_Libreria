/**
 * Libreria para realizar calculos basicos recibiendo dos float y un int de que opcion realizar
 * @version 1.0
 * @author Adrián
 */
public class CalcBasic {

    /**
     * Opcion de suma de dos factores
     */
    public static final int SUMA = 1;
    /**
     * Opcion de resta de dos factores
     */
    public static final int RESTA = 2;
    /**
     * Opcion de multiplicacion de dos factores
     */
    public static final int MULTIPLICACION = 3;
    /**
     * Opcion de division de dos factores
     */
    public static final int DIVISION = 4;
    /**
     * Array resultado de la operacion
     */
    public static final float[] RESULTADO= new float[1];


    /**
     * Realiza calculos matematicos y devuelve el resultado
     * @param numero1 Primer numero
     * @param numero2 Segundo numero
     * @param opcion Eleccion de qué tipo de operacion realizar
     * @return Resultado de la operacion
     */
    public static float[] operacion(float numero1, float numero2, int opcion) {

        /*
        Aqui no se puede tratar el error ya que debido al tipado fuerte de Java, filtra los tipos de dato al recibirlos

         */


        switch (opcion) {

            case SUMA:

                RESULTADO[0] = numero1 + numero2;

                return RESULTADO;

            case RESTA:

                RESULTADO[0] = numero1 - numero2;

                return RESULTADO;

            case MULTIPLICACION:

                RESULTADO[0] = numero1 * numero2;

                return RESULTADO;

            case DIVISION:

                RESULTADO[0] = Math.round(numero1 / numero2);

                return RESULTADO;

            default:

                return null;
        }
    }
}