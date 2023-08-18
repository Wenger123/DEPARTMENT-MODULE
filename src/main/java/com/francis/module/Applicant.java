package com.francis.module;

public class Applicant{
    public String name;
    public String sex;
    public String address;
    public String speak;
    public ApplicantType role;

    public Applicant(String name, String sex, String address, String speak, ApplicantType role) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.speak = speak;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public String getSpeak() {
        return speak;
    }

    public ApplicantType getType() {
        return role;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", speak='" + speak + '\'' +
                ", type=" + role +
                '}';
    }
}


