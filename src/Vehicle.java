public abstract class Vehicle {
    public double Dungtich;
    public String Kieudang;
    public String Mausac;
    private double maxSpeed;
    private double gasConsumption;

    public Vehicle(double Dungtich, String Kieudang, String Mausac, double maxSpeed, double gasConsumption){
        this.Dungtich = Dungtich;
        this.Kieudang = Kieudang;
        this.Mausac = Mausac;
        this.maxSpeed = maxSpeed;
        this.gasConsumption = gasConsumption;
    }

    protected Vehicle() {
    }


    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    public abstract void Tiengkeu();
    public void HienThi(){
        System.out.println(this.Dungtich);
        System.out.println(this.Kieudang);
        System.out.println(this.Mausac);
    }
}
