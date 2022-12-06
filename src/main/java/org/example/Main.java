package org.example;

import org.example.drawer.BarChartDrawer;
import org.example.model.EmployeeModel;
import org.example.model.Gender;
import org.example.model.Grade;
import org.example.model.Role;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Задания:
        1. Подключить библиотеку JFreeChart.
        2. Построить графики:
        - Распределение женщин и мужчин на предприятии (круг)
        - Распределение сотрудников по командам (круг).
        - Средняя зарплата по специальности (столбцы).
        - Средняя зарплата по специальности с разбивкой по грейду (столбцы).
        - Зависимость заработной платы от возраста (график)
        - Зависимость заработной платы от стажа (график)
         */
        new BarChartDrawer("З/п по специальности", getEmployeesList()).setVisible(true);
    }

    private static List<EmployeeModel> getEmployeesList() {
        return Arrays.asList(
                new EmployeeModel("Примеровчук Алексей", Gender.MALE, new Date(1959, 10, 23), new Date(1999, 6, 3), "team_music", 115000, Grade.JUNIOR, Role.DESIGNER),
                new EmployeeModel("Примеровчук Мария", Gender.FEMALE, new Date(1978, 6, 12), new Date(2018, 6, 3), "team_news", 240000, Grade.SENIOR, Role.DEVELOPER),
                new EmployeeModel("ивановский иван", Gender.MALE, new Date(1960, 10, 12), new Date(2010, 6, 3), "team_lk", 215000, Grade.SENIOR, Role.QA),
                new EmployeeModel("ивановская Анна", Gender.FEMALE, new Date(1989, 6, 12), new Date(2021, 6, 3), "team_chat", 80000, Grade.JUNIOR, Role.ANALYST),
                new EmployeeModel("Примерович Тор", Gender.MALE, new Date(1999, 10, 23), new Date(2020, 6, 3), "team_music", 15000, Grade.JUNIOR, Role.DESIGNER),
                new EmployeeModel("Примеровая Галина", Gender.FEMALE, new Date(1967, 10, 12), new Date(2006, 6, 3), "team_news", 400000, Grade.SENIOR, Role.DEVELOPER),
                new EmployeeModel("ивановсон иван", Gender.MALE, new Date(1947, 6, 12), new Date(2000, 6, 3), "team_chat", 115000, Grade.JUNIOR, Role.QA),
                new EmployeeModel("ивановсон Татьяна", Gender.FEMALE, new Date(1990, 10, 12), new Date(2016, 6, 3), "team_lk", 240000, Grade.MIDDLE, Role.ANALYST),
                new EmployeeModel("Примеровко иван", Gender.FEMALE, new Date(1967, 10, 23), new Date(2015, 6, 3), "team_news", 167000, Grade.MIDDLE, Role.DESIGNER),
                new EmployeeModel("Примеровко Сергей", Gender.MALE, new Date(1990, 6, 12), new Date(1997, 6, 3), "team_music", 164000, Grade.MIDDLE, Role.DEVELOPER),
                new EmployeeModel("Петрова Анна", Gender.FEMALE, new Date(1940, 10, 12), new Date(1980, 6, 3), "team_chat", 40000, Grade.MIDDLE, Role.ANALYST),
                new EmployeeModel("Одинов Тор", Gender.MALE, new Date(1959, 6, 23), new Date(1999, 6, 3), "team_music", 15000, Grade.JUNIOR, Role.DEVELOPER),
                new EmployeeModel("Одинова Анна", Gender.FEMALE, new Date(1978, 10, 12), new Date(1989, 6, 3), "team_news", 140000, Grade.MIDDLE, Role.DESIGNER),
                new EmployeeModel("Петровец иван", Gender.MALE, new Date(1930, 10, 12), new Date(1980, 6, 3), "team_lk", 115000, Grade.JUNIOR, Role.QA),
                new EmployeeModel("Петровичка Мария", Gender.FEMALE, new Date(1940, 6, 12), new Date(1980, 6, 3), "team_chat", 140000, Grade.MIDDLE, Role.ANALYST),
                new EmployeeModel("Одиновчук иван", Gender.MALE, new Date(1959, 10, 23), new Date(1999, 6, 3), "team_music", 115000, Grade.JUNIOR, Role.DEVELOPER),
                new EmployeeModel("Одиновчук", Gender.FEMALE, new Date(1978, 10, 12), new Date(2018, 6, 3), "team_news", 240000, Grade.SENIOR, Role.DESIGNER),
                new EmployeeModel("Петровский Айзек", Gender.MALE, new Date(1960, 6, 12), new Date(2010, 6, 3), "team_lk", 215000, Grade.SENIOR, Role.QA),
                new EmployeeModel("Петровская Анна", Gender.FEMALE, new Date(1989, 10, 12), new Date(2021, 6, 3), "team_chat", 80000, Grade.JUNIOR, Role.ANALYST),
                new EmployeeModel("Сидорович иван", Gender.MALE, new Date(1999, 6, 23), new Date(2020, 6, 3), "team_music", 15000, Grade.JUNIOR, Role.DEVELOPER),
                new EmployeeModel("Сидоровая Анна", Gender.FEMALE, new Date(1967, 10, 12), new Date(2006, 6, 3), "team_news", 400000, Grade.SENIOR, Role.DESIGNER),
                new EmployeeModel("Петровсон Айзек", Gender.MALE, new Date(1947, 10, 12), new Date(2000, 6, 3), "team_chat", 115000, Grade.JUNIOR, Role.QA),
                new EmployeeModel("Петровсон Мария", Gender.FEMALE, new Date(1990, 10, 23), new Date(2016, 6, 3), "team_lk", 240000, Grade.MIDDLE, Role.ANALYST),
                new EmployeeModel("Сидоровко Мария", Gender.FEMALE, new Date(1967, 10, 12), new Date(2015, 6, 3), "team_news", 167000, Grade.MIDDLE, Role.DEVELOPER),
                new EmployeeModel("Сидоровко Тор", Gender.MALE, new Date(1990, 6, 23), new Date(1997, 6, 3), "team_music", 164000, Grade.MIDDLE, Role.DESIGNER),
                new EmployeeModel("Карповсон Карп", Gender.MALE, new Date(1977, 6, 12), new Date(2000, 6, 3), "team_chat", 115400, Grade.JUNIOR, Role.QA),
                new EmployeeModel("Карповсон Татьяна", Gender.FEMALE, new Date(1970, 10, 12), new Date(2016, 6, 3), "team_lk", 244000, Grade.MIDDLE, Role.ANALYST),
                new EmployeeModel("Примеровко Карп", Gender.FEMALE, new Date(1977, 10, 23), new Date(2015, 6, 3), "team_news", 147000, Grade.MIDDLE, Role.DESIGNER),
                new EmployeeModel("Примеровко Сергей", Gender.MALE, new Date(1970, 6, 12), new Date(1997, 6, 3), "team_music", 144000, Grade.MIDDLE, Role.DEVELOPER),
                new EmployeeModel("Лещова Анна", Gender.FEMALE, new Date(1970, 10, 12), new Date(1982, 6, 3), "team_chat", 40400, Grade.MIDDLE, Role.ANALYST),
                new EmployeeModel("Сидоров Тор", Gender.MALE, new Date(1979, 6, 23), new Date(1998, 6, 3), "team_music", 15400, Grade.JUNIOR, Role.DEVELOPER),
                new EmployeeModel("Сидорова Анна", Gender.FEMALE, new Date(1978, 10, 12), new Date(1999, 6, 3), "team_news", 144000, Grade.MIDDLE, Role.DESIGNER),
                new EmployeeModel("Лещовец Карп", Gender.MALE, new Date(1970, 10, 12), new Date(1990, 6, 3), "team_lk", 145000, Grade.JUNIOR, Role.QA),
                new EmployeeModel("Лещовичка Мария", Gender.FEMALE, new Date(1970, 6, 12), new Date(1990, 6, 3), "team_chat", 144000, Grade.MIDDLE, Role.ANALYST),
                new EmployeeModel("Сидоровчук Карп", Gender.MALE, new Date(1979, 10, 23), new Date(1990, 6, 3), "team_music", 145000, Grade.JUNIOR, Role.DEVELOPER),
                new EmployeeModel("Сидоровчук Елена", Gender.FEMALE, new Date(1978, 10, 12), new Date(2010, 6, 3), "team_news", 244000, Grade.SENIOR, Role.DESIGNER),
                new EmployeeModel("Лещовский Айзек", Gender.MALE, new Date(1970, 6, 12), new Date(2000, 6, 3), "team_lk", 214000, Grade.SENIOR, Role.QA),
                new EmployeeModel("Лещовская Анна", Gender.FEMALE, new Date(1979, 10, 12), new Date(2001, 6, 3), "team_chat", 40000, Grade.JUNIOR, Role.ANALYST),
                new EmployeeModel("Сидорович Карп", Gender.MALE, new Date(1979, 6, 23), new Date(2000, 6, 3), "team_music", 14000, Grade.JUNIOR, Role.DEVELOPER),
                new EmployeeModel("Сидоровая Анна", Gender.FEMALE, new Date(1977, 10, 12), new Date(2006, 6, 3), "team_news", 440000, Grade.SENIOR, Role.DESIGNER),
                new EmployeeModel("Лещовсон Айзек", Gender.MALE, new Date(1977, 10, 12), new Date(2000, 6, 3), "team_chat", 114000, Grade.JUNIOR, Role.QA),
                new EmployeeModel("Лещовсон Мария", Gender.FEMALE, new Date(1970, 10, 23), new Date(2006, 6, 3), "team_lk", 244000, Grade.MIDDLE, Role.ANALYST),
                new EmployeeModel("Сидоровко Мария", Gender.FEMALE, new Date(1977, 10, 12), new Date(2015, 6, 3), "team_news", 147000, Grade.MIDDLE, Role.DEVELOPER),
                new EmployeeModel("Сидоровко Тор", Gender.MALE, new Date(1970, 6, 23), new Date(1997, 6, 3), "team_music", 144000, Grade.MIDDLE, Role.DESIGNER),
                new EmployeeModel("иванов иван", Gender.MALE, new Date(1930, 10, 12), new Date(1980, 6, 3), "team_lk", 15000, Grade.JUNIOR, Role.QA),
                new EmployeeModel("иванова Мария", Gender.FEMALE, new Date(1940, 6, 12), new Date(1980, 6, 3), "team_chat", 40000, Grade.MIDDLE, Role.ANALYST),
                new EmployeeModel("Примеров Айзек", Gender.MALE, new Date(1959, 10, 23), new Date(1999, 6, 3), "team_music", 15000, Grade.JUNIOR, Role.DESIGNER),
                new EmployeeModel("Примерова Анна", Gender.FEMALE, new Date(1978, 10, 12), new Date(1989, 6, 3), "team_news", 140000, Grade.MIDDLE, Role.DEVELOPER),
                new EmployeeModel("ивановец Петр", Gender.MALE, new Date(1930, 6, 12), new Date(1980, 6, 3), "team_lk", 115000, Grade.JUNIOR, Role.QA),
                new EmployeeModel("ивановичка Мария", Gender.FEMALE, new Date(1940, 10, 12), new Date(1980, 6, 3), "team_chat", 140000, Grade.MIDDLE, Role.ANALYST)
        );
    }
}