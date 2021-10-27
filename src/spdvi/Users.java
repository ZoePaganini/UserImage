/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spdvi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Alumne
 */
public class Users {
    private String id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;
    private boolean isAlive;
    private String rutaImage;

    public String getRutaImage() {
        return rutaImage;
    }

    public void setRutaImage(String rutaImage) {
        this.rutaImage = rutaImage;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public boolean isIsAlive() {
        return isAlive;
    }
    
    
    @Override
    public String toString() {
        StringBuilder strUser = new StringBuilder();
        int age = LocalDate.now().getYear() - birthDate.getYear();
        String estado;
        if (isAlive == true) estado = "Alive";
        else estado = "Dead";
        strUser.append(this.id + ": " + this.lastName + ", " + this.firstName + " - " + age + " years old - " + this.gender + " - " + estado + " - " + rutaImage + System.lineSeparator());
        return strUser.toString();
    }
    
    public String toCSV() {
        StringBuilder strUser= new StringBuilder();
        String estado;
        String formattedDate = getBirthDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        if (isAlive == true) estado = "Alive";
        else estado = "Dead";
        strUser.append(this.id + "," + this.lastName + "," + this.firstName + "," + formattedDate + "," + this.gender + "," + estado + "," + rutaImage + System.lineSeparator());
        return strUser.toString();
    }

    public Users(String id, String firstName, String lastName, LocalDate birthDate, String gender, boolean isAlive, String rutaImage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.isAlive = isAlive;
        this.rutaImage = rutaImage;
    }
}
