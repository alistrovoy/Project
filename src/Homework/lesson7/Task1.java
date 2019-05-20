package Homework.lesson7;

public class Task1 {
    public static void main(String[] args) {
        int[][] massive = new int[5][5];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                if (i + j == 4){
                    System.out.print(massive[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}

