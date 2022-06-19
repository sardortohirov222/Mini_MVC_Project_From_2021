package com.spring.mvc;

import com.spring.mvc.validation.CheckEamil;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Name Must be minimum 2 simbols !")
    private String name;

    private String surname;
    private int salary;
    private String depaertmet;

    private List<String> depaertmets;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern xxx-xx-xx")
    private String phoneNuber;
    @CheckEamil
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNuber() {
        return phoneNuber;
    }

    public void setPhoneNuber(String phoneNuber) {
        this.phoneNuber = phoneNuber;
    }

    public List<String> getDepaertmets() {
        return depaertmets;
    }

    public void setDepaertmets(List<String> depaertmets) {
        this.depaertmets = depaertmets;
    }

    public Employee() {
        depaertmets = new ArrayList<>();
        depaertmets.add("Hr");
        depaertmets.add("It");
        depaertmets.add("Sales");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepaertmet() {
        return depaertmet;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", depaertmet='" + depaertmet + '\'' +
                '}';
    }

    public void setDepaertmet(String depaertmet) {
        this.depaertmet = depaertmet;
    }
}
