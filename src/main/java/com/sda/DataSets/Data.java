package com.sda.DataSets;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Data
{
    private String fall;
    private Geolocation geolocation;
    private String id;
    private String mass;
    private String name;
    private String nametype;
    private String recclass;
    private String reclat;
    private String reclong;
    private String year;
    private String computed_region_cbhk_fwbd;
    private String computed_region_nnqa_25f4;
    //"computed_region_cbhk_fwbd": "50",
   //         "computed_region_nnqa_25f4": "429",

}
