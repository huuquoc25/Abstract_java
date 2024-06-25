public class Car extends Vehicle {
    public int Chongoi;
    public Car(double Dungtich, String Kieudang, String Mausac,int Chongoi) {

        super(Dungtich, Kieudang, Mausac);
        this.Chongoi= Chongoi;
    }


    @Override
    public void Tiengkeu(){
        System.out.println("Beeo Beep");
    }

    @Override
    public void HienThi() {
        super.HienThi();
        System.out.println(this.Chongoi);
    }
}