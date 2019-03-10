package com.sda.DataSets;

import com.fasterxml.jackson.databind.ObjectMapper;

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
            Data[] data = mapper.readValue(new File("meteory.json"), Data[].class);
            System.out.println(Arrays.toString(data));
        } catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
