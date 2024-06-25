public class MotoBike extends Vehicle{
    public String Xemay;

    public MotoBike(double Dungtich, String Kieudang, String Mausac, String Xemay) {

        super(Dungtich, Kieudang, Mausac);
        this.Xemay=Xemay;
    }
    @Override
    public void Tiengkeu(){
        System.out.println("Keng Keng");
    }

    @Override
    public void HienThi() {
        super.HienThi();
        System.out.println(this.Xemay);
    }
}
