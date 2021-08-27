package exam04;

import iot.DimmingLights;
import iot.Elevator;
import iot.Lighting;
import iot.Security;

import javax.swing.*;

public class OkJavaGoingHomeInput {
    // parameter 매개변수
    public static void main(String[] args) {

        String id = args[0];
        String bright = args[1];

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

        DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
        moodLamp.setBright(Double.parseDouble(bright)); //  밝기
        moodLamp.on();
    }
}
