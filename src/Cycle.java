
public class Cycle extends Vehicle {


    public Cycle(double Dungtich, String Kieudang, String Mausac, double maxSpeed, double gasConsumption) {
        super(Dungtich, Kieudang, Mausac, maxSpeed, gasConsumption);
    }

    @Override
    public void HienThi() {
        super.HienThi();
    }

    @Override
    public void Tiengkeu(){
        System.out.println("Bing Boong");
    }
}

