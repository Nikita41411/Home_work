package edu.praktikum.sprint3.models;

import java.util.Comparator;

public class Proton implements SpaceShip, Comparable<SpaceShip> {

    private final int crewCount;

    public Proton(int crewCount) {
        this.crewCount = crewCount;
    }

    @Override
    public int getCrewCount() {
        return crewCount;
    }

    @Override
    public boolean isCargo() {
        return true;
    }

    @Override
    public String toString() {
        return "Proton{" +
                "crewCount=" + crewCount +
                '}';
    }

    @Override
    public int compareTo(SpaceShip o) {
        return Comparator.comparingInt((SpaceShip obj) -> obj.getCrewCount())
                .thenComparing((SpaceShip obj) -> obj.isCargo())
                .compare(this, o);
    }
}
