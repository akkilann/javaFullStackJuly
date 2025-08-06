package com.inher.quest1;

import java.util.Arrays;

public class CompanyMain {
    public static void main(String[] args) {
        Project project =  new TeamOne();
        //calling doTask from TeamOne
        project.doTask();
        //Call own method of teamONe
        TeamOne teamOne = (TeamOne) project;
        teamOne.softwaresUsed("Intellij","GIT","PostMan");

        Project project1 = new TeamTwo();
        project1.doTask(); //calling doTask of teamTwo
        //call own method of teamTwo
        TeamTwo teamTwo = (TeamTwo) project1;
        Arrays.stream(teamTwo.getTechStack()).forEach(System.out::println);
    }
}
