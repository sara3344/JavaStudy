package exam04;

import iot.Elevator;
import iot.Lighting;
import iot.Security;

public class OkJavaGoingHome {
    public static void main(String[] args) {

        String id = "JAVA APT 104";
        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1); // 엘베 호출, 1층으로 엘배 보내

        // Security off
        Security mySecrurity = new Security(id);
        mySecrurity.off(); // 보안 해제

        // Light on
        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        hallLamp.on(); // 거실 등 켜짐

        Lighting floorLamp = new Lighting(id + " / floorLamp");
        floorLamp.on();
    }
}
