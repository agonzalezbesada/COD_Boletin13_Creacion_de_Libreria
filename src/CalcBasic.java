public class CalcBasic {


    public static final int SUMA = 1;

    public static final int RESTA = 2;

    public static final int MULTIPLICACION = 3;

    public static final int DIVISION = 4;

    public static final float[] RESULTADO= new float[2];





    public static float[] operacion(float numero1, float numero2, int opcion) {


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