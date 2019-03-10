package com.sda.eartquake;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.DataSets.Data;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class main
{
    public static void main(String[] args)
    {
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            EartQuake data = mapper.readValue(new File("eartquake.json"), EartQuake.class);
            System.out.println(data.toString());
        } catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
