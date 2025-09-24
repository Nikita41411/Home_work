package ships;

public class SpaceShip implements Timeriskable {

    private final int amount;
    private final double prodMonths;

    public SpaceShip(int amount, double prodMonths) {
        this.amount = amount;
        this.prodMonths = prodMonths;
    }

    public double getTotalMonths() {
        return amount * prodMonths;
    }
}
