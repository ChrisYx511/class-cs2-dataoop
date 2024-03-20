package dev.chrisyx511.cs2.Assignment1.Q2;

import java.util.ArrayList;

public class AddArrayExample {
    public static void main(String[] args) {
        ArrayList<Language> listOfLanguages = new ArrayList<Language>();
        listOfLanguages.add(new Language("Chinese", 0));
        listOfLanguages.get(0).proficiency = 2;
        listOfLanguages.add(new Language("English", 0));
        listOfLanguages.get(1).proficiency = 4;
        for (int i = 0; i < listOfLanguages.size(); i++) {
            System.out.println(listOfLanguages.get(i));
        }
    }
}
class Language {
    String name;
    int proficiency;

    public Language(String name, int initialProficiency) {
        this.name = name;
        this.proficiency = initialProficiency;
    }

    @Override
    public String toString() {
        return "Language{" +
                "name='" + name + '\'' +
                ", proficiency=" + proficiency +
                '}';
    }
}