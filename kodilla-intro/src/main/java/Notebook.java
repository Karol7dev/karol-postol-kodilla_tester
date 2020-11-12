public class Notebook {
    int price;
    int weight;
    int year;
    public Notebook(int price, int weight, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This laptop is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }
    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("Light");
        } else if (this.weight >= 600 && this.weight <= 1200) {
            System.out.println("Not quite heavy");
        } else {
            System.out.println("Very heavy");
        }
    }
    public void checkYear() {
        if (this.price <= 1000 && this.year <= 2014) {
            System.out.println("This laptop is old generation!");
        } else if (this.price > 1000 && this.price <= 1800 && this.year <= 2018) {
            System.out.println("This laptop is good for a students!");
        } else {
            System.out.println("This is laptop foa a gamer's!");
        }
    }
}