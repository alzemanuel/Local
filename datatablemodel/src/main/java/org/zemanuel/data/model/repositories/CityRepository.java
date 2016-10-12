package org.zemanuel.data.model.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;
import org.zemanuel.data.model.entites.City;

public interface CityRepository extends Repository<City, Long> {

	Page<City> findAll(Pageable pageable);
	Page<City> findByNameContainingAndCountryContainingAllIgnoringCase(String name,
			String country, Pageable pageable);

	City findByNameAndCountryAllIgnoringCase(String name, String country);

}
