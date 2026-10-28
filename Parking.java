interface ParkingCharge {
    double calculateCharge();
    void displayParkingDetails();
}

class Vehicle {
    String vehicleNumber;
    String vehicleType;
    int parkingHours;

    Vehicle(String vehicleNumber, String vehicleType, int parkingHours) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }
}

class TwoWheeler extends Vehicle implements ParkingCharge {
    TwoWheeler(String vehicleNumber, int parkingHours) {
        super(vehicleNumber, "TwoWheeler", parkingHours);
    }

    public double calculateCharge() {
        if (parkingHours <= 2)
            return parkingHours * 20;
        else
            return 2 * 20 + (parkingHours - 2) * 10;
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Parking Charge: Rs. " + calculateCharge());
    }
}

class FourWheeler extends Vehicle implements ParkingCharge {
    FourWheeler(String vehicleNumber, int parkingHours) {
        super(vehicleNumber, "FourWheeler", parkingHours);
    }

    public double calculateCharge() {
        if (parkingHours <= 2)
            return parkingHours * 50;
        else
            return 2 * 50 + (parkingHours - 2) * 30;
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Parking Charge: Rs. " + calculateCharge());
    }
}

public class Parking {
    public static void main(String args[]) {
        ParkingCharge p;

        p = new TwoWheeler("KA07AB3432", 4);
        p.displayParkingDetails();

        System.out.println();

        p = new FourWheeler("KA07EX9160", 3);
        p.displayParkingDetails();
    }
}
