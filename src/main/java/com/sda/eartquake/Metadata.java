package com.sda.eartquake;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Metadata
{
    long generated;
    int status;
    int count;
    String url;
    String title;
    String api;

}
