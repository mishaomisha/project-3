package com.company.model;
import java.util.ArrayList;
public class Person {


        private String userName;
        private String Password ;
        private String name ;
        private String description;

        private Block block = new Block();

        private ArrayList<Person> bloch_list = new ArrayList<Person>();
        //private ArrayList<Person> chat_list = new ArrayList<Person>();
        private ArrayList<Chat> chat_list = new ArrayList<>();

        private ArrayList<Channel> channel_list = new ArrayList<Channel>();
        private ArrayList<Grop> grop_list = new ArrayList<Grop>();


    public Person(String userName , String Password ,String name , String description) {
        this.userName = userName;
        this.Password = Password;
        this.name=name;
        this.description = description;
    }


    public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return Password;
        }

        public void setPassword(String password) {
            Password = password;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Person> getBloch_list() {
            return bloch_list;
        }

    public Block getBlock() {
        return block;
    }

    public void setBloch_list(ArrayList<Person> bloch_list) {
            this.bloch_list = bloch_list;
        }

        /*public ArrayList<Person> getChat_list() {

        return chat_list;
        }

        public void setChat_list(ArrayList<Person> chat_list) {
            this.chat_list = chat_list;
        }*/

        public ArrayList<Channel> getChannel_list() {
            return channel_list;
        }

        public void setChannel_list(ArrayList<Channel> channel_list) {
            this.channel_list = channel_list;
        }

        public ArrayList<Grop> getGrop_list() {
            return grop_list;
        }

        public void setGrop_list(ArrayList<Grop> grop_list) {
            this.grop_list = grop_list;
        }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Chat> getChat_list() {
        return chat_list;
    }
}


