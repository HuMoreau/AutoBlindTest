package org.angrysoviet.autoblindtest.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @OneToMany
    private List<Song> songCatalog;

    private String username;

    private String mailAddress;

    private String hashedPassword;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Song> getSongCatalog() {
        return songCatalog;
    }

    public void setSongCatalog(List<Song> songCatalog) {
        this.songCatalog = songCatalog;
    }

    public void addSongToCatalog(Song song){
        songCatalog.add(song);
    }

    public void deleteSongFromCatalog(String id){
        songCatalog.removeIf(song -> Objects.equals(song.getId(), id));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
}
