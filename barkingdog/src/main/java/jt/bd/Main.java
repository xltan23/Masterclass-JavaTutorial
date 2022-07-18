package jt.bd;

public class Main {
    public static void main(String[] args) {
        boolean wakeUp = BarkingDog.shouldWakeUp(true, 3);
        System.out.println("I have woken: " + wakeUp);
    }
}
