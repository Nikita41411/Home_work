import factory.SpaceShipFactory;
import ships.Dragon;
import ships.Proton;
import ships.Soyuz;
import ships.SpaceShip; //.

import static constants.Constants.*;


public class Main {

    public static void main(String[] args) {
        SpaceShip[] ships = new SpaceShip[] {
                new Soyuz(3, 7, GENERATION_1),
                new Soyuz(1, 8, GENERATION_2),
                new Soyuz(3, 3, GENERATION_3),
                new Soyuz(4, 11, GENERATION_4),
                new Dragon(2, 14),
                new Proton(5, 4)
        };

        SpaceShipFactory factory = new SpaceShipFactory(ships);

        System.out.println(factory.getTotalMonths());
    }
}