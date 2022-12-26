package com.epam.mentoring.microservices.services;

import com.epam.mentoring.microservices.domain.Difficulty;
import com.epam.mentoring.microservices.domain.Region;
import com.epam.mentoring.microservices.domain.Tour;
import com.epam.mentoring.microservices.domain.TourPackage;
import com.epam.mentoring.microservices.repository.TourPackageRepository;
import com.epam.mentoring.microservices.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourService {

    @Autowired
    TourRepository tourRepository;

    @Autowired
    TourPackageRepository tourPackageRepository;

    public Tour createTour(String title, String description, String blurb, Integer price, String duration, String bullets, String keywords, String tourPackageName, Difficulty difficulty, Region region) {
        TourPackage tourPackage = tourPackageRepository.findByNameIgnoreCase(tourPackageName).orElseThrow(() -> new RuntimeException("Tour package is not exists"));
        return tourRepository.save(new Tour(title, description, blurb, price, duration, bullets, keywords, tourPackage, difficulty, region));
    }

    public Long total() {
        return tourRepository.count();
    }
}
