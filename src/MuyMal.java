import java.util.Scanner;

public class MuyMal {
    public static void main(String[] args) throws Exception {
        Scanner o = new Scanner(System.in);

        int i = 1;
        int Total = 0;
        int Multiplo = 0;
        int noMultiplo = 0;

        System.out.println("Ingrese un número límite:");
        int inicio = o.nextInt();

        while (i <= inicio) {
            if (i % 3 == 0) {
                Total = Total + i;
                System.out.println(i + " es múltiplo de 3");
            }

            if (i % 5 == 0) {
                Multiplo = Multiplo + i;
                System.out.println(i + " es múltiplo de 5");
            }

            if (i % 3 != 0 && i % 5 != 0) {
                noMultiplo = noMultiplo + i;
                System.out.println(i + " no es múltiplo de 3 ni 5");
            }

            i = i + 1;
        }

        System.out.println("Suma de múltiplos de 3: " + Total);
        System.out.println("Suma de múltiplos de 5: " + Multiplo);
        System.out.println("Suma del resto: " + noMultiplo);
    }
}