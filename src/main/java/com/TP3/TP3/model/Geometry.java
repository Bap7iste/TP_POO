package com.TP3.TP3.model;

import java.util.ArrayList;
import java.util.List;

public class Geometry {
    private String type;
    List< Coordinates > coordinates = new ArrayList< Coordinates >();

    public String getType() {
        return type;
    }

    public List<Coordinates> getCoordinates() {
        return coordinates;
    }
}
