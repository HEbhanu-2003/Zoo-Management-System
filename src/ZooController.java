/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sachiru Banuka
 */
public class ZooController {
    private ZooData data = new ZooData();

        public void addAnimal(String animalID, String animalName, String species, String scientificName, int age, String gender)
        {
            data.addAnimal(new Animal(animalID, animalName, species, scientificName, age, gender));
        }

        public void addStaff(String memberID, String memberName, String role, int age, String contactNumber, String gender)
        {
            data.addStaff(new Staff(memberID, memberName, role, age, contactNumber, gender));
        }

        public Animal searchAnimal(String animalID)
        {
            Animal sap = null;
            
            for(Animal a : data.getAnimal())
            {
                if(a.getID().equals(animalID))
            {
                sap = a;
            }
            }
           return sap;
        }

        public Staff searchStaff(String memberID)
        {
            Staff ssp = null;
            for(Staff s : data.getStaff())
            {
                if(s.getID().equals(memberID))
            {
                ssp = s;
            }
            }
           return ssp;
            }
   
        public void removeAnimalByID(String animalID)
        {
            data.getAnimal().removeIf(a -> a.getID().equalsIgnoreCase(animalID));
        }

        public void removeStaffByID(String memberID)
        {
            data.getStaff().removeIf(s -> s.getID().equalsIgnoreCase(memberID));
    }

    
}