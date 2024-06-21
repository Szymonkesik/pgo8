public class Main {
    public static void main(String[] args) {

        Car car = new Car("audi", "rs6", 2020, 300, 100);
        Truck truck = new Truck("volvo", "jfkalq", 2019, 30000, 7000, 8);

        System.out.println( car.calculateFuelEfficiency());
        System.out.println( truck.calculateFuelEfficiency());
    }
}