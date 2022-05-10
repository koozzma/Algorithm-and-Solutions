package com.example.main;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class BinarySearch {
    public static void main(String[] args) {
int [] array = {0,3,5,4,22,3,7,88,-13};

        System.out.println(binarySearch(array,4));
    }
    public static int binarySearch(int [] array, int key){
      int low = 0;
      int high = array.length-1;
      while(low <= high){
          int mid = low + (high - low) / 2;

          if(key < array[mid]) {
              high = mid - 1;
          } else if(key > array[mid]){
              low = mid +1;
          } else {
              return mid;
          }
      }
      return -1;
    }
}
