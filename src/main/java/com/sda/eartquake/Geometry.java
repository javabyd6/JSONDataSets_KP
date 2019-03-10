package com.sda.eartquake;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Geometry
{
    String type;
    double[] coordinates;
    /*  "geometry": {
        "type": "Point",
        "coordinates": [
          -118.2881699,
          35.4884987,
          2.68
        ]*/
}
