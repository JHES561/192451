import java.util.Scanner;

public class ejercicioDeLogica {
    public static void main(String[] args) throws Exception {
        Scanner plus = new Scanner(System.in);

        System.out.println("favor escriba <1> para empezar");
        int play = plus.nextInt();

        while (play <= 1) {

            System.out.println("Ingrese Su Velocidad");
            int velocidad1 = plus.nextInt();

            if (velocidad1 > 60) {
                System.out.println("Multa Aplicada");
            }
            if (velocidad1 < 60)
                System.out.println("FELICITACIONES");
            plus.close();

        }
    }
}