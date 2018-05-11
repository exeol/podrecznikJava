package exe.arinuel;

class Vehicle {
    int passengers;
    int fuelcap;
    double lkm;

    int range(){
         return (int) (fuelcap / lkm * 100);
    }

    double fuelNeeded(int km) {
        return (double) km / 100 * lkm;
    }
}

class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle();
        Vehicle mercedes = new Vehicle();
        double liters;
        int dist = 456;


        minivan.passengers = 7;
        minivan.fuelcap = 65;
        minivan.lkm = 9.1;

        mercedes.passengers = 5;
        mercedes.fuelcap = 55;
        mercedes.lkm = 10.1;

        liters = minivan.fuelNeeded(dist);

       System.out.println("Aby przejechać " + dist + " kilometrów, minivan potrzebuje " + liters + " litrów paliwa");

        liters = mercedes.fuelNeeded(dist);
       System.out.println("Aby przejechać " + dist + " kilometrów, mercedes potrzebuje " + liters + " litrów paliwa");

    }
}