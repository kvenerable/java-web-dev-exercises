package org.launchcode.java.studios.areaofacircle;

import java.util.ArrayList;
import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args){
        String paragraph ="If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<String, Double> characterCount = new HashMap<String, Double>();
        String[] brokenParagraph = paragraph.split("");
        for(String character : brokenParagraph){
            if(characterCount.get(character) != null) {
                characterCount.put(character, characterCount.get(character) + 1.0);

            } else{
                characterCount.put(character, 1.0);
            }
        }
        for (String character : characterCount.keySet()){
            System.out.println(character + ":" + characterCount.get(character));
        }


    }

}
