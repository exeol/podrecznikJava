package exe.arinuel;

class Vehicle {
    int passengers;
    int fuelcap;
    double lkm;

    void range(){
        System.out.println("Zasięg (km): " + (int) (fuelcap / lkm * 100));
    }
}

class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle mercedes = new Vehicle();


        minivan.passengers = 7;
        minivan.fuelcap = 65;
        minivan.lkm = 9.1;

        mercedes.passengers = 5;
        mercedes.fuelcap = 55;
        mercedes.lkm = 10.1;

       System.out.println("minivan ma ");
       minivan.range();
       System.out.println("mercedes ma ");
       mercedes.range();

    }
}