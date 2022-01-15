package com.company.model;

import java.util.ArrayList;

public class Grop {
    private String name;
    private Person admin;
    private ArrayList<Person> member_list = new ArrayList<Person>();
    private ArrayList<String> chat_list = new ArrayList<>();

    public Grop(String name, Person admin, ArrayList<Person> member_list) {
        this.name = name;
        this.admin = admin;
        this.member_list = member_list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Person> getMember_list() {
        return member_list;
    }

    public void setMember_list(ArrayList<Person> member_list) {
        this.member_list = member_list;
    }

    public Person getAdmin() {
        return admin;
    }

    public ArrayList<String> getChat_list() {
        return chat_list;
    }
}
