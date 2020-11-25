package com.kodilla.inheritance;

public class Systems {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1985);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        System.out.println(operatingSystem.getYear());

        Linux linux = new Linux(1991);
        linux.turnOff();
        linux.turnOn();
        System.out.println(linux.getYear());

        iOS iOS = new iOS(2007);
        iOS.turnOn();
        iOS.turnOff();
        System.out.println(iOS.getYear());
    }
}
