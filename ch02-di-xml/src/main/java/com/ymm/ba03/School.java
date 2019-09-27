package com.ymm.ba03;

/**
 * Created by slade on 2019/9/27.
 */
public class School {
    private String name;
    private String Adress;

    public School() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", Adress='" + Adress + '\'' +
                '}';
    }
}
