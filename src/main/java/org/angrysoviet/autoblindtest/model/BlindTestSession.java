package org.angrysoviet.autoblindtest.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class BlindTestSession {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String accessCode;

    private Boolean inProgress;

    @OneToMany
    private List<Lap> laps;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public Boolean getInProgress() {
        return inProgress;
    }

    public void setInProgress(Boolean inProgress) {
        this.inProgress = inProgress;
    }

    public List<Lap> getLaps() {
        return laps;
    }

    public void setLaps(List<Lap> laps) {
        this.laps = laps;
    }
}
