package com.online.practice;

public class Project {

    String[] toolsUsed(){
        String[] tools = new String[]{"Maven", "GIT", "Junits"};
        if(tools.length==0){
            return new String[]{};
        }
        return tools;
    }

    void printTopics(final String[] topicNames){
        for(String topic : topicNames){
            System.out.println(topic+" ");
        }
    }
}
