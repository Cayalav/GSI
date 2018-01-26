package gsi;

import java.util.Random;
import java.util.Scanner;

public class GSI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita los numeros a generar");
        int num = sc.nextInt();
        System.out.println("Cuantos digitos quiere que contenga?");
        int dig = sc.nextInt();
        int did1;
        int suma = 0;
        for (int i = 1; i <= dig; i++) {
            suma = 10*10;
            dig1 = 9*suma;
        }
        int dig1 = 9*dig;
        long[] vector = new long[num];

        Random randomGenerator = new Random();
        for (int idx = 1; idx <= num; ++idx) {
            //3 digitos
            //    (9)+1
            //int dig3 = rng.nextInt(900)+100; //siempre 3 digitos
            //int dig5 = rng.nextInt(90000)+10000; //siempre 5 digitos
            //long dig13 = rng.nextLong(9000000000000L)+1000000000000L; //siempre 13 digitos
            long randomInt = randomGenerator.nextInt(900)+100;
            System.out.println(randomInt);
            
//            vector[idx] = randomInt;
            
        }

    }


}
