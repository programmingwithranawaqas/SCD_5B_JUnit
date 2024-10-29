package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Service {

    public String getServiceName(int value)
    {
        if(value<0)
            return "New Service";
        else
            return "Old Service";
    }


    public int getMaxInArray(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++)
            if(max<arr[i])
                max = arr[i];
        return max;
    }

    public int[] sorting(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
