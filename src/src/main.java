/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author LENOVO
 */
public class main {

    public static void main(String[] args) {
        // untuk soal 1a
//        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        // untuk soal 1b
         int[] arr = {6,5,2,3,5,2,2,1,1,5,1,3,3,3,5};
        // untuk soal 1c
//        int[] arr = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};

        ArrayList<Integer> numArray = new ArrayList<>();
        int numCount = 0;

        for (int i : arr) {
            numArray.add(i);
        }
        System.out.println(numArray);
        for (int i = 0; i < numArray.size(); i++) {
            for (int j = 0; j < numArray.size(); j++) {
                if (i != j) {
                    if (Objects.equals(numArray.get(i), numArray.get(j))) {
                        numCount = numCount + 1;
                        numArray.set(i, null);
                        numArray.remove(j);
                        break;
                    }
                }
            }
        }

        System.out.println("Total of pairs: " + numCount);
    }
}
