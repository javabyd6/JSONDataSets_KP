package com.sda.eartquake;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Features
{
    String type;
    String id;
    Geometry geometry;
    Properties properties;

}
