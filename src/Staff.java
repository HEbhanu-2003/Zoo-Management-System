/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sachiru Banuka
 */
public class Staff {
    private String memberID;
    private String memberName;
    private String role;
    private int age;
    private String contactNumber;
    private String gender;

    protected Staff(String memberID, String memberName, String role, int age, String contactNumber, String gender) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.role = role;
        this.age = age;
        this.contactNumber = contactNumber;
        this.gender = gender;
    }

    public String getName() { return memberName; }
    public String getID() { return memberID; }
    public String getRole() { return role; }
    public String getContactNumber() { return contactNumber; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    
    public void setName(String memberName) { this.memberName = memberName; }
    public void setID(String memberID) { this.memberID = memberID; }
    public void setRole(String role) { this.role = role; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    public void setAge(int age) { this.age = age; }
    public void setGender(String gender) { this.gender = gender; }

}
