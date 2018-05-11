package exe.arinuel;

class Vehicle {
    int passengers;
    int fuelcap;
    double lkm;

    Vehicle(int p, int f, double l) {
        passengers = p;
        fuelcap = f;
        lkm = l;
    }

    int range(){
         return (int) (fuelcap / lkm * 100);
    }

    double fuelNeeded(int km) {
        return (double) km / 100 * lkm;
    }
}

class VehicleDemo {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(7, 65, 9.1);
        Vehicle mercedes = new Vehicle(5, 55, 10.1);
        double liters;
        int dist = 456;



        liters = minivan.fuelNeeded(dist);

       System.out.println("Aby przejechać " + dist + " kilometrów, minivan potrzebuje " + liters + " litrów paliwa");

        liters = mercedes.fuelNeeded(dist);
       System.out.println("Aby przejechać " + dist + " kilometrów, mercedes potrzebuje " + liters + " litrów paliwa");

    }
}