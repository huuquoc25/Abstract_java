public abstract class Vehicle {
    public double Dungtich;
    public String Kieudang;
    public String Mausac;

    public Vehicle(double Dungtich, String Kieudang, String Mausac){
        this.Dungtich = Dungtich;
        this.Kieudang = Kieudang;
        this.Mausac = Mausac;
    }

    public abstract void Tiengkeu();
    public void HienThi(){
        System.out.println(this.Dungtich);
        System.out.println(this.Kieudang);
        System.out.println(this.Mausac);
    }
}
