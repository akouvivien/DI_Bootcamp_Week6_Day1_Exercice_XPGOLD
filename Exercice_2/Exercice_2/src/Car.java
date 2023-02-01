public class Car {
    public String make;
    public String model;
    public int year;
    public String color;
    public double price;

    // creation d'un constructeur vide
    public Car() {
    }

    // constructor avec  les attributs make model and year
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
// constructeur avec tous les attibuts
    public Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public void displayCarInfo() {
        System.out.println(" make : "+ make +" model : "+ model +" year : "+ year +" color :"+color+ " price : "+price);

    }
}