package com.sda.DataSets;

import java.util.List;

public class Geolocation
{
    String type;
    //double[] coordinates;
    List<Double> coordinates;

    public String getType()
    {
        return type;
    }

    public List<Double> getCoordinates()
    {
        return coordinates;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setCordinates(List<Double> cordinates)
    {
        this.coordinates = cordinates;
    }
}
