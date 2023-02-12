public class Main {
    public static void main(String[] args) {

        float[] prueba = CalcBasic.operacion(7f, 2f, 8);


        try {
            EntradaSalida.salida(String.valueOf(prueba[0]) ,7);
        } catch (NullPointerException exception) {
            System.out.println("\n"+"Error, elija una operación posible");
        }
    }
}