package Homework.lesson6;

public class CalculatedData {

    public static double PloschadTreugolnika(double a, double b, double c) {

        double Poluperimetr = ((a + b + c) / 2);

        double Ploschad = Math.sqrt(Poluperimetr * (Poluperimetr - a) * (Poluperimetr - b) * (Poluperimetr - c));

        return Ploschad;

    }


    public static double SummaDrobey(double a, double b, double c, double d) {

        double summ = (a / c) + (b / d);

        return summ;
    }


    public static void Massive(int[] numbers) {


        for (int i = 0; i < numbers.length; i++) {


            if (numbers[i] % 2 == 0) {

                System.out.println(numbers[i]);

            }
        }

    }


    public static String reverse(String text) {

        String reverse = new StringBuffer(text).reverse().toString();
        System.out.println(reverse);

        return reverse;

    }


    public static int Glas(String text) {


        char[] text1 = text.toCharArray();

        int glas = 0;

        for (int i = 0; i < text.length(); i++) {
            char newchar = text1[i];
            if (newchar == ' ') {
                continue;

            } else {
                if (newchar == 'a' || newchar == 'o' || newchar == 'i' || newchar == 'u' || newchar == 'e' ||
                        newchar == 'A' || newchar == 'O' || newchar == 'I' || newchar == 'U' || newchar == 'E')

                    glas++;
            }


        }
        return glas;
    }


    public static int SoGlas(String text) {


        char[] text1 = text.toCharArray();

        int soglas = 0;

        for (int i = 0; i < text.length(); i++) {
            char newchar = text1[i];
            if (newchar == ' ') {
                continue;

            } else {
                if (newchar == 'b' || newchar == 'c' || newchar == 'd' || newchar == 'f' || newchar == 'g' ||
                        newchar == 'B' || newchar == 'C' || newchar == 'D' || newchar == 'F' || newchar == 'G' ||
                        newchar == 'h' || newchar == 'j' || newchar == 'k' || newchar == 'l' || newchar == 'm' ||
                        newchar == 'H' || newchar == 'J' || newchar == 'K' || newchar == 'L' || newchar == 'M' ||
                        newchar == 'n' || newchar == 'p' || newchar == 'q' || newchar == 'r' || newchar == 's' ||
                        newchar == 'N' || newchar == 'P' || newchar == 'Q' || newchar == 'R' || newchar == 'S' ||
                        newchar == 't' || newchar == 'v' || newchar == 'w' || newchar == 'x' || newchar == 'y' ||
                        newchar == 'T' || newchar == 'V' || newchar == 'W' || newchar == 'X' || newchar == 'Y' ||
                        newchar == 'z' ||
                        newchar == 'Z')

                    soglas++;
            }

        }
        return soglas;
    }
}
