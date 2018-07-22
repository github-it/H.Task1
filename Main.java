import entity.Bus;
import entity.Transmission;
import entity.Transport;


public class Main {
    public static void main(String[] args) {
        Transport bus1 = new Bus();
        bus1.setColor("Yellow");
        bus1.setTransmission(Transmission.AUTO);
        bus1.setWheelCount(6);
        bus1.setNavigator(true);
        ((Bus) bus1).setFloorCount(2);
        System.out.println("Цвет: " + bus1.getColor());
        System.out.println("Коробка передач: " + bus1.getTransmission());
        System.out.println("Кол-во колёс: " +((Bus) bus1).getWheelCount() );
        System.out.println("Установлен: " + bus1.isNavigator());
        System.out.println("Кол-во этажей: " + ((Bus) bus1).getFloorCount());
    }
}
