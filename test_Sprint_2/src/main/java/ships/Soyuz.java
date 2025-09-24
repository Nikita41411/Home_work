package ships;

import static constants.Constants.GENERATION_1;
import static constants.Constants.SOYUZ_GENERATION_1_MONTHS_RISK;

public class Soyuz extends SpaceShip {

    private final String generation;

    public Soyuz(int amount, double prodMonths, String generation) {
        super(amount, prodMonths);
        this.generation = generation;
    }

    @Override
    public int getMonthsRisk() {
        return GENERATION_1.equals(generation) ? SOYUZ_GENERATION_1_MONTHS_RISK : 0;
    }
}
