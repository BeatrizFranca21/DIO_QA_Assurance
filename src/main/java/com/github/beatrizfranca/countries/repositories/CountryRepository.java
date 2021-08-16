package com.github.beatrizfranca.countries.repositories;

import com.github.beatrizfranca.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
