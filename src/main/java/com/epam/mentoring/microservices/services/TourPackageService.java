package com.epam.mentoring.microservices.services;

import com.epam.mentoring.microservices.domain.TourPackage;
import com.epam.mentoring.microservices.repository.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourPackageService {

    @Autowired
    TourPackageRepository tourPackageRepository;

    public TourPackage createTourPackage(String code, String name) {
        return tourPackageRepository.findById(code)
                .orElse(tourPackageRepository.save(new TourPackage(code, name)));
    }

    public Long total() {
        return tourPackageRepository.count();
    }
}
