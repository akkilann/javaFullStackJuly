package com.inher.quest1;

public class TeamTwo extends Project{

    void doTask() {
        System.out.println("Doing tasks from TeamTwo");
    }

    String[] getTechStack(){
        return new String[]{"Java","Spring","React"};
    }
}
