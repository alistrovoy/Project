package lesson9;

public class Phone {


   private double diagonal;           //поля это переменные класса, которые ...
   private String model;               //модифмкатор доступа это слово, которое определяет область видимости (ограничивает доступ)
   private int price;                  //пишем перед классом, переменной, перед конструктором, перед методом.
                                        //public,protected, private, default().

    public void setPrice(int newPrice){
        price = newPrice;
    }
    public int getPrice(){
        return price;
    }
    public void setDiagonal(double newDiagonal){
        diagonal = newDiagonal;
    }

    public double getDiagonal(){
        return diagonal;
    }

}

