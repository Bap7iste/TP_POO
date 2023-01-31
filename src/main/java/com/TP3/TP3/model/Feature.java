package com.TP3.TP3.model;

import java.util.ArrayList;
import java.util.List;

public class Feature {
    private String type;
    List< Geometry > geometry = new ArrayList< Geometry >();

    List< Properties > properties = new ArrayList< Properties >();

    public String getType() {
        return type;
    }

    public List<Geometry> getGeometry() {
        return geometry;
    }
}
