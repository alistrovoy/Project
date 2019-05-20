package lesson8;

public class CallTours {
    public static void main(String[] args) {
        String [] [] result = {{"Spain", "15000", "hotel", "7days"},
                                 {"France", "200000", "hostel", "14days"},
                                 {"Egypt", "100000", "motel", "14days"},
                                 {"Spain", "50000", "apartment", "12days"}};

        Tours.ToursUtil(result, "Spain");

        System.out.println();
        Tours.printMaxPrice(result);

        System.out.println();
        System.out.println();
        Tours.averagePrice(result);

    }

}
