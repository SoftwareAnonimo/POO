class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passegengers = 4;
        car.printDataCar();
        
        Car car2 = new Car();
        car2.license = "GWJ820";
        car2.driver = "Andrea Miller";
        car2.passegengers = 3;
        car2.printDataCar();
    }
}