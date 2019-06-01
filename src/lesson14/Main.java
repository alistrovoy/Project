package lesson14;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);
        System.out.println("Матрица 1 ");
        System.out.println("Количество строк " + matrix.getRows());
        System.out.println("Количество столбцов " + matrix.getColumns());

        matrix.setValueAt(0, 1, 7.9);


        matrix.printToConsole();
        System.out.println("Проверка на единичную матрицу "+ matrix.isIdentityMatrix());


        Matrix matrix1 = new Matrix(3,3);
        matrix1.setValueAt(0,0,1);
        matrix1.setValueAt(1,1,1);
        matrix1.setValueAt(2,2,1);

        System.out.println("Матрица 2 ");
        System.out.println("Проверка на единичную матрицу "+ matrix1.isIdentityMatrix());




    }
}
