package com.epam.mentoring.microservices.repository;

import com.epam.mentoring.microservices.domain.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<Tour, Integer> {
}
