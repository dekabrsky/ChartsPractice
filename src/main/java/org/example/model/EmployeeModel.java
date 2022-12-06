package org.example.model;

import java.util.Date;

public class EmployeeModel {
    private final String name;
    private final Gender gender;
    private final Date birthDate;
    private final Date employmentDate;
    private final String team;
    private final int salary;
    private final Grade grade;
    private final Role role;

    public EmployeeModel(String name, Gender gender, Date birthDate, Date employmentDate,
                         String team, int salary, Grade grade, Role role) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.employmentDate = employmentDate;
        this.team = team;
        this.salary = salary;
        this.grade = grade;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public String getTeam() {
        return team;
    }

    public int getSalary() {
        return salary;
    }

    public Grade getGrade() {
        return grade;
    }

    public Role getRole() {
        return role;
    }
}
