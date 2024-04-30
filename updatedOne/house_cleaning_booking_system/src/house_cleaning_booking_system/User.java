/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house_cleaning_booking_system;

/**
 *
 * @author ITLAB2-PC02-STUDENT
 */
public class User {

    static String getUsername() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Object getPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String username;
    private String hashedPassword; // Store password securely using hashing
    private String fullName;
    private String address;
    private String email;
    private int age;
    private String phoneNumber;
    private String birthdate;
    private String gender;

    // Constructor (consider using a builder pattern for better readability)
    public User(String username, String hashedPassword, String fullName, String address, String email, int age, String phoneNumber, String birthdate, String gender) {
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.birthdate = birthdate;
        this.gender = gender;
    }
}
