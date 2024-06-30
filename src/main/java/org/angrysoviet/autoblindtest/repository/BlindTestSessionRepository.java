package org.angrysoviet.autoblindtest.repository;

import org.angrysoviet.autoblindtest.model.BlindTestSession;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlindTestSessionRepository extends CrudRepository<BlindTestSession, String> {
}
