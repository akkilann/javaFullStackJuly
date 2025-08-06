package com.inher.quest1;

public class TeamOne extends Project{

    void doTask() {
        System.out.println("Doing tasks from TeamOne");
    }

    void softwaresUsed(String... tools){
        for (String tool : tools) {
            System.out.print(tool + " | ");
        }
        System.out.println("");
    }

}
