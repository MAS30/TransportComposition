public class Robot implements Driver {
    @Override
    public void navigate(String destination) {
        System.out.println("Robot driver navigating autonomously to " + destination + "...");
    }
}
