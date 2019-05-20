package lesson8;

public class Tours {
    public static void ToursUtil(String newmassive[][], String country) {
        for (int i = 0; i < newmassive.length; i++) {
            if (newmassive[i][0].equals(country)) {

                System.out.println(newmassive[i][0] + newmassive[i][1] + newmassive[i][2] + newmassive[i][3]);

            }

        }


    }


    public static void printMaxPrice(String[][] tours) {
        int maxPrice = 0;
        for (int i = 0; i < tours.length; i++) {
            int fromString = Integer.parseInt(tours[i][1]);
            if (maxPrice < fromString) {
                maxPrice = fromString;
            }
        }
        System.out.println(maxPrice);
    }


    public static void averagePrice(String [] [] tours){
        int average = 0;
        for(int i =0; i<tours.length; i++){
            int fromString = Integer.parseInt(tours[i][1]);
            average = average + fromString;

        }
        System.out.println(average/tours.length);
    }


}






