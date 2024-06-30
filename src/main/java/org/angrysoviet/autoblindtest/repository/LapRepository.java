package org.angrysoviet.autoblindtest.repository;

import org.angrysoviet.autoblindtest.model.Lap;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LapRepository extends CrudRepository<Lap, String> {
}
