package beecrowd_1006;

import java.util.Scanner;
public class Main {
    public static void main (String args []){
        Scanner teclado = new Scanner(System.in);

        double A, B, C, MEDIA;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        if(A <= 10.0 && B <= 10.0 && C <=10.0 ){

            MEDIA = ( A*2 + B*3 + C*5) /10.0;
            System.out.printf("MEDIA = %.1f%n", MEDIA);
        teclado.close();
        }
    }
}
