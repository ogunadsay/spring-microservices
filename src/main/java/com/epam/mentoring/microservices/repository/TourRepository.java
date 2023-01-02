package com.epam.mentoring.microservices.repository;

import com.epam.mentoring.microservices.domain.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface TourRepository extends CrudRepository<Tour, Integer>, PagingAndSortingRepository<Tour, Integer> {
    Page<Tour> findByTourPackageCode(@Param("code") String code, Pageable pageable);
}
