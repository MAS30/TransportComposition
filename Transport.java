public class Transport {
    private Engine engine;
    private Driver driver;

    public Transport(Engine engine, Driver driver) {
        this.engine = engine;
        this.driver = driver;
    }

    public void deliver(String destination, String cargo) {
        System.out.println("Preparing to deliver " + cargo + "...");
        driver.navigate(destination);
        engine.move();
        System.out.println("Successfully delivered " + cargo + " to " + destination + "!");
    }
}
