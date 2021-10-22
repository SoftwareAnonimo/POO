class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND452"));
        car.passegengers = 4;
        car.printDataCar();
        
        Car car2 = new Car("HYM792", new Account("Andrea Miller", "TSW058"));
        car2.passegengers = 3;
        car2.printDataCar();
    }
}