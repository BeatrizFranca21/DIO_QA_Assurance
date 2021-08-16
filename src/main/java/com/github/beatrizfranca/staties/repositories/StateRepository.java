package com.github.beatrizfranca.staties.repositories;

import com.github.beatrizfranca.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
