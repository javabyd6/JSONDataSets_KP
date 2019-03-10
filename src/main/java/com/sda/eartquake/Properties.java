package com.sda.eartquake;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Properties
{
    double mag;
    String place;
    long time;
    long updated;
    int tz;
    String url;
    String detail;
    String felt;
    String cdi;
    String mmi;
    String alert;
    String net;
    String status;
    int tsunami;
    int sig;
    String code;
    String ids;
    String sources;
    String magType;
    String type;
    String types;
    double dmin;
    String title;
    int nst;
    int gap;
    int rms;

}
