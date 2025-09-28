package edu.praktikum.sprint3.models;

import java.util.Comparator;
import java.util.Objects;

public class Soyuz implements SpaceShip {

    private final int crewCount;

    public Soyuz(int crewCount) {
        this.crewCount = crewCount;
    }

    @Override
    public int getCrewCount() {
        return crewCount;
    }

    @Override
    public boolean isCargo() {
        return false;
    }

    @Override
    public String toString() {
        return "Soyuz{" +
                "crewCount=" + crewCount +
                '}';
    }

    @Override
    public int compareTo(SpaceShip o) {
        return Comparator.comparingInt((SpaceShip obj) -> obj.getCrewCount())
                .thenComparing((SpaceShip obj) -> obj.isCargo())
                .compare(this, o);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Soyuz soyuz = (Soyuz) object;
        return crewCount == soyuz.crewCount;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(crewCount);
    }
}
