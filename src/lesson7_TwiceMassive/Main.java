package lesson7_TwiceMassive;

public class Main {
    public static void main(String[] args) {

        int[][] massive = new int[4][4];
//        System.out.print(massive[0][0]+ " ");
//        System.out.print(massive[0][1]+ " ");
//        System.out.print(massive[0][2]+ " ");
//        System.out.print(massive[0][3]+ " ");
//        System.out.println();
//
//        System.out.print(massive[1][0]+ " ");
//        System.out.print(massive[1][1]+ " ");
//        System.out.print(massive[1][2]+ " ");
//        System.out.print(massive[1][3]+ " ");
//        System.out.println();
//
//        System.out.print(massive[2][0]+ " ");
//        System.out.print(massive[2][1]+ " ");
//        System.out.print(massive[2][2]+ " ");
//        System.out.print(massive[2][3]+ " ");
//        System.out.println();

        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                if (i==j) {
                    System.out.print(massive[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();


        }
    }
}
