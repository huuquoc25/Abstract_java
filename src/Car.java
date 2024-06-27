public class Car extends Vehicle implements ActionVehicle{


    public Car(double Dungtich, String Kieudang, String Mausac, double maxSpeed, double gasConsumption) {
        super(Dungtich, Kieudang, Mausac, maxSpeed, gasConsumption);
    }

    @Override
    public void Tiengkeu(){
        System.out.println("Beeo Beep");
    }

    @Override
    public void HienThi() {
        super.HienThi();

    }

    @Override
    public double getMaxSpeed1() {
        return getMaxSpeed();
    }

    @Override
    public double getGasConsumption1() {
        return getGasConsumption();
    }
}