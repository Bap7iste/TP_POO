package com.TP3.TP3.model;

import java.util.ArrayList;
import java.util.List;

public class Root {
    private String type;
    private String version;
    List< Feature > features = new ArrayList< Feature >();
    private String attribution;
    private String licence;
    private String query;
    private float limit;

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public String getAttribution() {
        return attribution;
    }

    public String getLicence() {
        return licence;
    }

    public String getQuery() {
        return query;
    }

    public float getLimit() {
        return limit;
    }
}
