package com.epam.mentoring.microservices.repository;

import com.epam.mentoring.microservices.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
    Optional<TourPackage> findByNameIgnoreCase(@Param("name") String name);
}