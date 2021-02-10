package se.lexicon.ReineMoberg.model;

import java.io.Serializable;

public class Player implements Serializable {

    private int id;
    private String firstName;
    private String lastName;

    public Player() {
    }

    public Player(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
