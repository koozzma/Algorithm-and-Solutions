package com.example.main;

public class Testing {
    public static void main(String[] args) {
        int[] array = {0, 200, 375, 550, 750, 950};
        System.out.println(minStop(array, 400));
    }

    public static int minStop(int[] array, int capacity) {
        int result = 0;
        int currentStop = 0;

        while (currentStop < array.length - 1) {
            int nextStop = currentStop;
            while (nextStop < array.length - 1 && array[nextStop + 1] - array[currentStop] <= capacity)
                nextStop++;

            if (currentStop == nextStop)
                return -1;

            if (nextStop < array.length - 1)
                result++;
                currentStop = nextStop;
        }
        return result;
    }
}
