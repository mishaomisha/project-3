package original.model;

import java.util.ArrayList;

public class Grop {
    private String name;
    private ArrayList<Person> member_list = new ArrayList<Person>();

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
}
