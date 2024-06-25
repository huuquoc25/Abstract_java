
public class Cycle extends Vehicle {
    public String Xedap;
    public Cycle(double Dungtich, String Kieudang, String Mausac, String Xedap) {

        super(Dungtich, Kieudang, Mausac);
        this.Xedap=Xedap;
    }

    @Override
    public void HienThi() {
        super.HienThi();
        System.out.println(this.Xedap);
    }

    @Override
    public void Tiengkeu(){
        System.out.println("Bing Boong");
    }
}

