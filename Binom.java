//      axx+bx+c=7

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Binom {
    public static void main(String[] args) {
        double a;
        double x1;
        double x2;
        double b;
        double c;
        double dis;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Pls write a = ");
            a = Double.parseDouble(reader.readLine());

            System.out.print("Pls write b = ");
            b = Double.parseDouble(reader.readLine());

            System.out.print("Pls write c = ");
            c = Double.parseDouble(reader.readLine()) - 7d;

            dis = b * b - 4d * a * c;
            if (dis > 0) {
                x1 = ((b * -1d + Math.sqrt(dis)) / 2d / a);
                x2 = ((b * -1d - Math.sqrt(dis)) / 2d / a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (dis == 0 && a != 0) {
                x1 = ((b * -1d) / 2d / a);
                System.out.println("x = " + x1);
            }  else {
                System.out.println("Discriminant is negative, resolves are imaginary or it is`nt binary equation");
            }

        } catch (IOException e) {
            System.out.println("You wrote wrong params");
            e.printStackTrace();
        }
    }
}
