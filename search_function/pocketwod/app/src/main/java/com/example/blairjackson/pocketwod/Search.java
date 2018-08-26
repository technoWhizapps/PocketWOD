package com.example.blairjackson.pocketwod;

import android.util.Log;

import java.util.Arrays;
import java.util.List;

public class Search {

    List<String> workout_list = Arrays.asList("Biceps", "Chest", "Legs");

    String get_text(String search_string){
        Log.i("get_text_class", "getting to the search class");
        int i;
        int len = workout_list.size();

        for(i = 0; i < len; ++i){

            if(search_string.equals(workout_list.get(i))){
                return search_string;
            }
            else if ((workout_list.get(i)).toLowerCase().contains(search_string.toLowerCase())){
                return workout_list.get(i);
            }
        }

        return "No Match";
    }
}
