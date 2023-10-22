public class Car {
    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startFuelSystem() {
        System.out.println("Fuel system work");
    }
    private void  startCommand(){
        System.out.println("Start work");
    }
    private void startElectricity(){
        System.out.println("Start electrik work");
    }
}
