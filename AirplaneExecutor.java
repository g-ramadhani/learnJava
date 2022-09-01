public class AirplaneExecutor{
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.startEngine();
        airplane.takeOff();
        airplane.landing();
        airplane.shutdownEngine();
        Airplane airplane1 = new Airplane("Boeing 737", 500);
        airplane.showDetail();
        airplane1.showDetail();
    }
}
