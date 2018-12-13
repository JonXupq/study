package current.Phaser;

import java.util.concurrent.Phaser;

public class Main {

    public static void main(String[] args) {

        Phaser phaser = new Phaser(3) {
            @Override
            protected boolean onAdvance(int phase, int registeredParties) {
                System.out.println("arrive as pass phase= " + phase + " registeredPatries= " + registeredParties);
                return super.onAdvance(phase, registeredParties);
            }
        };

        System.out.println("Al getPhase= "+ phaser.getPhase()+ " getRegisteredParties= "+ phaser.getRegisteredParties() +" getArrivedParties=" + phaser.getArrivedParties());
        int arrive = phaser.arrive();
        System.out.println(arrive+"Al getPhase= "+ phaser.getPhase()+ " getRegisteredParties= "+ phaser.getRegisteredParties() +" getArrivedParties=" + phaser.getArrivedParties());


        System.out.println("A2 getPhase= "+ phaser.getPhase()+ " getRegisteredParties= "+ phaser.getRegisteredParties() +" getArrivedParties=" + phaser.getArrivedParties());
        int arrive1 = phaser.arrive();
        System.out.println(arrive1+"A2 getPhase= "+ phaser.getPhase()+ " getRegisteredParties= "+ phaser.getRegisteredParties() +" getArrivedParties=" + phaser.getArrivedParties());
    }
}
