package Homework.lesson4;

public class Task3Again {
    public static void main(String[] args) {

        String [] massive = {"q","w","e","r","t","y"};
        String [] Reversemassive = new String[massive.length];

        int j = Reversemassive.length-1;

        for(int i = 0; i<massive.length; i++){
            Reversemassive[i] = massive[j];
            j--;

        }
            for(int i = 0; i<Reversemassive.length; i++){
                System.out.println(Reversemassive[i]);

            }


    }
}
