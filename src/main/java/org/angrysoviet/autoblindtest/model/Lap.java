package org.angrysoviet.autoblindtest.model;

import jakarta.persistence.*;

@Entity
public class Lap {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private Boolean played;

    @OneToOne
    private Song songToGuess;

    @OneToOne
    private User nominator;

    @OneToOne
    private User winner;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getPlayed() {
        return played;
    }

    public void setPlayed(Boolean played) {
        this.played = played;
    }

    public Song getSongToGuess() {
        return songToGuess;
    }

    public void setSongToGuess(Song songToGuess) {
        this.songToGuess = songToGuess;
    }

    public User getNominator() {
        return nominator;
    }

    public void setNominator(User nominator) {
        this.nominator = nominator;
    }

    public User getWinner() {
        return winner;
    }

    public void setWinner(User winner) {
        this.winner = winner;
    }
}
