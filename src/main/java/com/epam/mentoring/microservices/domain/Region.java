package com.epam.mentoring.microservices.domain;

import java.util.Arrays;

public enum Region {
    Central_Coast("Central Coast"),
    Southern_California("Southern_California"),
    Northern_California("Northern_California"),
    Varies("Varies");

    private String label;

    private Region(String label) {
        this.label = label;
    }

    public static Region findByLabel(String label) {
        return Arrays.stream(Region.values())
                .filter(region -> region.label.equalsIgnoreCase(label))
                .findFirst()
                .orElse(null);
    }
}
