package com.steuraa.inittrackerjava.adapters.repositories;

import com.steuraa.inittrackerjava.core.gateways.Gateway;
import com.steuraa.inittrackerjava.core.entities.Encounter;
import org.springframework.data.repository.CrudRepository;

public interface EncounterSchemaRepository extends CrudRepository<Encounter, Gateway> {
}
