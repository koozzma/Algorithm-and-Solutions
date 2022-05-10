package com.example.main;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.*;

public class FactorialKnapsack {
    public static void main(String[] args) {
        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3,18);
        final Item item3 = new Item(2,14);

        final Item[] items = {item1,item2,item3};

        sort(items, Comparator.comparingDouble(Item::valuePerUnitOfWeight).reversed());
        System.out.println(Arrays.toString(items));

        final int w = 7;
        int weightSoFar = 0;
        double valueSoFar = 0;
        int currentItem = 0;

        while(currentItem < items.length && weightSoFar != w){
            if(weightSoFar + items[currentItem].getWeight() < w){
                // берем обьект целиком
                valueSoFar += items[currentItem].getValue();
                weightSoFar += items[currentItem].getWeight();
            } else {
                // берем часть обьекта
                valueSoFar += ((w - weightSoFar) / (double) items[currentItem].getWeight()) * items[currentItem].getValue();

               weightSoFar = w; // полный рюкзак
            }
            currentItem++;
        }
        System.out.println("Ценность наилучшего набора = " + valueSoFar);
    }
}


     class Item{
        private int weight;
        private int value;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
        public double valuePerUnitOfWeight(){
            return value / (double) weight;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "weight=" + weight +
                    ", value=" + value +
                    '}';
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

