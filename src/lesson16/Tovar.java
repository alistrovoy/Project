package lesson16;

public class Tovar {
    private int price;
    private String name;
    private int rate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tovar)) return false;

        Tovar tovar = (Tovar) o;

        if (getPrice() != tovar.getPrice()) return false;
        if (getRate() != tovar.getRate()) return false;
        return getName().equals(tovar.getName());

    }

    @Override
    public int hashCode() {
        int result = getPrice();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getRate();
        return result;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Tovar(int price, String name, int rate) {
        this.price = price;
        this.name = name;
        this.rate = rate;
    }

    public Tovar() {
    }
}
