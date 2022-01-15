package com.company.controller;

import com.company.Main;
import com.company.model.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOnFile {


    public void writePersonChannels() {

        try {

            FileWriter personChannel = new FileWriter("PersonsChannel.txt");
            BufferedWriter personChannelBuf = new BufferedWriter(personChannel);

            for (Person per : Main.persons) {
                for (int i = 0; i < per.getChannel_list().size(); i++) {
                    personChannelBuf.write(per.getChannel_list().get(i).getName());
                    personChannelBuf.newLine();
                }
            }
        }catch(IOException e ){
            e.printStackTrace();
    }

    }

    public void writePersonGroups() {

        try {

            FileWriter personGroup = new FileWriter("PersonsGroups.txt");
            BufferedWriter personGroupBuf = new BufferedWriter(personGroup);

            for (Person per : Main.persons) {
                for (int i = 0; i < per.getChannel_list().size(); i++) {
                    personGroupBuf.write(per.getChannel_list().get(i).getName());
                    personGroupBuf.newLine();
                }
            }
        }catch(IOException e ){
            e.printStackTrace();
        }

    }

    public  void writePersonChat(){

        try {

            FileWriter personChat = new FileWriter("PersonsChats");
            BufferedWriter personChatBuf = new BufferedWriter(personChat);


            for(Person per : Main.persons){
                for(int i=0 ;i < per.getChat_list().size(); i++){
                    personChatBuf.write(per.getChat_list().get(i).getReceiver().getUserName());
                    personChatBuf.write(per.getChat_list().get(i).getSender().getUserName());
                    personChatBuf.write(per.getChat_list().get(i).getChat_list().get(i));
                }
            }
        }catch(IOException e ){
            e.printStackTrace();
        }




    }


}
