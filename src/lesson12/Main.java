package lesson12;

public class Main {


    public static void main(String[] args) {
        FractionNumberImpl number1 = new FractionNumberImpl(1, 4);

        FractionNumberImpl number2 = new FractionNumberImpl(3, 5);
        //number2.setDividend(3);
        //number2.setDivisor(5);


        FractionNumberOperationImpl operation = new FractionNumberOperationImpl();
        FractionNumber resultAdd = operation.add(number1, number2);

        resultAdd.printToConsole();


        FractionNumberOperationImpl subOperation;
        subOperation = new FractionNumberOperationImpl();
        FractionNumber resultSub = operation.sub(number1, number2);
        resultSub.printToConsole();


    }
}
