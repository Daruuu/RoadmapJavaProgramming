package adventofcode22;

import java.io.BufferedReader;
import java.io.FileReader;

public class Day1CaloriesCounting {
    public static void main(String[] args) throws Exception {

        String caloriesList = "1000\n2000\n3000\n\n4000\n\n5000\n6000\n\n7000\n8000\n9000\n\n10000";
        countCaloriesCase0(caloriesList);
        countCaloriesPart1();

    }

    public static void countCaloriesPart1() throws Exception{

        BufferedReader br = new BufferedReader(new FileReader("inputs/day1.txt"));
        int calories = 0;
        int mostCalories = 0;
        String line;
        //for (String line: caloriesList.split("\n")) {
        while ((line = br.readLine()) != null) {
            String strCalories = line.trim();
            if (strCalories.isBlank()) {
                if (mostCalories < calories) {
                    mostCalories = calories;
                }
                calories = 0;
                continue;
            }
            calories += Integer.parseInt(strCalories);
        }
    }

    public static void countCaloriesCase0(String caloriesList) {
        int calories = 0;
        int mostCal = 0;
        for (String str : caloriesList.split("\n")) {
            String strCal = str.trim();
            if (strCal.isBlank()) {
                if (mostCal < calories) {
                    mostCal = calories;
                }
                calories = 0;
                continue;
            }
            calories += Integer.parseInt(strCal);
        }
        System.out.println(mostCal);
    }
}
