package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ServiceTest {

    @Test
    public void getServiceNameNewServiceTest()
    {
        Service service = new Service();
        String actualResult = service.getServiceName(1);
        String expectedResult = "New Service";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getServiceNameOldServiceTest()
    {
        Service service = new Service();
        String actualResult = service.getServiceName(-1);
        String expectedResult = "Old Service";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getMaxInArrayNotNullTest()
    {
        int arr[] = new int[]{10, 3, 19, 50, 1, 0};
        int expectedResult = 50;
        Service service = new Service();
        int actualResult = service.getMaxInArray(arr);
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void sortingTest()
    {
        int arr[] = new int[]{99, 19, 0, 1, 908, 7, 4};
        Service service = new Service();

        int expectedResult[] = new int[]{0, 1, 4, 7, 19, 99, 908};
        int actualResult[] = service.sorting(arr);

        Assertions.assertArrayEquals(expectedResult, actualResult);


    }



}