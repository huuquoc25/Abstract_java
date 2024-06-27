public class Main {
    public static void main(String[] args){

    Car car = new Car(5,"sedan","grey",150,25);
    car.HienThi();
    car.Tiengkeu();
        System.out.println(car.getGasConsumption1());
        System.out.println(car.getMaxSpeed1());
    }
}
