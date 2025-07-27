package com.online.practice;

public class ProjectMain {
    public static void main(String[] args) {
        Project project = new Project();
        String[] toolsUsed = project.toolsUsed();

        for(String tool : toolsUsed){
            System.out.println(tool);
        }
        String[] topics = new String[]{"Spring", "Java", "React"};
        project.printTopics(topics);
    }
}
