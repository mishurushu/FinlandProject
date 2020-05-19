package week4;

import java.util.ArrayList;

public class Menu {


    private ArrayList<String> meals;


    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal(String meal){
        if (meals.contains(meal)){
            System.out.println("This meal is already in list");
        }else meals.add(meal);
    }

    public void printMeals(){
        System.out.println(meals);
    }

    public void clearMenu(){
        meals.clear();
    }

}
