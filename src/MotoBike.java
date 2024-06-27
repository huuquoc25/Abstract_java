public class MotoBike extends Vehicle{

    public MotoBike(double Dungtich, String Kieudang, String Mausac, double maxSpeed, double gasConsumption) {
        super(Dungtich, Kieudang, Mausac, maxSpeed, gasConsumption);
    }



    @Override
    public void Tiengkeu(){
        System.out.println("Keng Keng");
    }

    @Override
    public void HienThi() {
        super.HienThi();
    }
}
