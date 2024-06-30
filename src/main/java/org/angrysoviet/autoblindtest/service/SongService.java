package org.angrysoviet.autoblindtest.service;

import org.angrysoviet.autoblindtest.model.Song;
import org.springframework.stereotype.Service;

@Service
public interface SongService {

    void addSong(Song songToAdd);
}
