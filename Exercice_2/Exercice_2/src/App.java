public class App {
    public static void main(String[] args) throws Exception {
        Car voiture1 = new Car("france", "toyota", 2020);
        Car voiture2= new Car("Usa","Mercedes",2022,"red",15000);
        voiture1.displayCarInfo();
        voiture2.displayCarInfo();
    }
}
