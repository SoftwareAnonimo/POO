   class Main {
   public static void main(String[] args) {
      System.out.println("Hola mundo");

      UberX uberX = new UberX("AMQ123 ", new Account("Andres Herrera ", "AND452 "), "Toyota ", "Sonic ");
      uberX.setPassenger(4);
      uberX.printDataCar();

      UberVan uberVan = new UberVan("RDJ836", new Account("Julio Gusman ", "AND452 "));
      uberVan.setPassenger((6));
      uberVan.printDataCar();
      
      // Car car2 = new Car("HYM792", new Account("Andrea Miller", "TSW058"));
      // car2.passegengers = 3;
      // car2.printDataCar();
   }
   }