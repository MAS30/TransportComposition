public class Main {
    public static void main(String[] args) {
        // Transport 1: Combustion engine + human driver
        Transport truck = new Transport(new CombustionEngine(), new Human());
        truck.deliver("Warehouse B", "Food Supplies");

        System.out.println("----------");

        // Transport 2: Electric engine + robot driver
        Transport drone = new Transport(new ElectricEngine(), new Robot());
        drone.deliver("City Center", "Medical Kits");
    }
}
