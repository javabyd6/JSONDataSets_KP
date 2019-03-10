package com.sda.eartquake;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class EartQuake
{
    String type;
    List<Features> features;
    Metadata metadata;
    double[] bbox;

    public String getType()
    {
        return type;
    }

    public List<Features> getFeatures()
    {
        return features;
    }

    public Metadata getMetadata()
    {
        return metadata;
    }

    public double[] getBbox()
    {
        return bbox;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setFeatures(List<Features> features)
    {
        this.features = features;
    }

    public void setMetadata(Metadata metadata)
    {
        this.metadata = metadata;
    }

    public void setBbox(double[] bbox)
    {
        this.bbox = bbox;
    }
}
