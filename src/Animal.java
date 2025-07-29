/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sachiru Bhanuka
 */
public class Animal {
    private String animalID;
    private String animalName;
    private String species;
    private String scientificName;
    private int age;
    private String gender;

    protected Animal(String animalID, String animalName, String species, String scientificName, int age, String gender) {
        this.animalID = animalID;
        this.animalName = animalName;
        this.species = species;
        this.scientificName = scientificName;
        this.age = age;
        this.gender = gender;
    }

    public String getID() { return animalID; }
    public String getName() { return animalName; }
    public String getSpecies() { return species; }
    public String getScientificName() { return scientificName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    
    public void setID(String animalID) { this.animalID = animalID; }
    public void setName(String animalName) { this.animalName = animalName; }
    public void setSpecies(String species) { this.species = species; }
    public void setScientificName(String scientificName) { this.scientificName = scientificName; }
    public void setAge(int age) { this.age = age; }
    public void setGender(String gender) { this.gender = gender; }

}