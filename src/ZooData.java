/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author Sachiru Banuka
 */
public class ZooData {
    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<Staff> staff = new ArrayList<>();

    public ArrayList<Animal> getAnimal()
    {
        return animals;
    }

    public ArrayList<Staff> getStaff()
    {
        return staff;
    }

    public void addAnimal(Animal a)
    {
        animals.add(a);
    }

    public void removeAnimal(Animal a)
    {
        animals.remove(a);
    }

    public void addStaff(Staff s)
    {
        staff.add(s);
    }

    public void removeStaff(Staff s)
    {
        staff.remove(s);
    }
}
