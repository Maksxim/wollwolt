package by.tms.collections.work2;

public class TestGarage {

    public static void main(String[] args) {
        Garage garage = new Garage();

        Car bmw = new PassengerCar("BMW","M5",2007,"petrol","Black",240);
        Car tesla = new PassengerCar("tesla","s",2013,"electric","red",300);
        Car man = new Truck("Man","TGM",2005,"diesel","orange",14);
        Car man1 = new Truck("Man","TGX",2008,"petrol","white",14);
        Car foton = new Bus("Foton","BJ6108U7BHB-1",2010,"diesel","black",24);
        Car baw = new Bus("Baw","2245 Street Line",2012,"Diesel","green",20);
        garage.park(bmw);
        garage.park(bmw);
        garage.park(bmw);
        garage.park(tesla);
        garage.park(tesla);
        garage.park(man);
        garage.park(man);
        garage.park(man);
        garage.park(man);
        garage.park(man1);
        garage.park(man1);
        garage.park(man1);
        garage.park(foton);
        garage.park(foton);
        garage.park(baw);
        garage.unPark(tesla);
        garage.unPark(bmw);
        garage.unPark(man);
        garage.unPark(man);
        garage.unPark(foton);
        garage.unPark(baw);
        System.out.println(garage);
        System.out.println("PassengerCar:" + garage.getCountByClass(PassengerCar.class) + "\n" +
                "Truck:" + garage.getCountByClass(Truck.class) + "\n" +
                "Bus:" + garage.getCountByClass(Bus.class));
    }
}
