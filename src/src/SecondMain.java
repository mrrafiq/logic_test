/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author LENOVO
 */
public class SecondMain {

    public static void main(String[] args) {
        // untuk soal 2a
        String s = "Saat meng*ecat tembok, Agung dib_antu oleh Raihan.";

        // untuk soal 2b
//        String s = "Berapa u(mur minimal[ untuk !mengurus ktp?";

        // untuk soal 2c
//        String s = "Masing-masing anak mendap(atkan uang jajan ya=ng be&rbeda.";
        String[] words = s.split("\\s+");

//        Pattern alphabet = Pattern.compile("[a-zA-z]");
        Pattern special = Pattern.compile("[!?@#$%&*()_+=|<>{}\\\\[\\\\]~]");

        int counter = 0;
        for (String word : words) {
            Matcher hasSpecial = special.matcher(word);
            boolean check = hasSpecial.find();
            if (!check) {
                counter = counter + 1;
            }
        }
        System.out.println(Arrays.toString(words));

        System.out.println(counter);

    }
}
