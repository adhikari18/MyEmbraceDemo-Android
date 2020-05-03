package com.embracepetinsurance.myembracedemo;

import java.io.Serializable;

/**
 * Created by DoubleA on 3/22/2017.
 */

public class Pet implements Serializable {
    String name;
    String age;
    int photoId;
    String sex;
    String breed;
    String species;


    Pet(String name, String age, int photoId, String sex, String species, String breed) {
        this.name = name;
        this.age = age;
        this.photoId = photoId;
        this.sex = sex;
        this.breed = breed;
        this.species = species;
    }
}