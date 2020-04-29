package com.company;

public class Vendor {

    private String name;
    private String address;
    private String representativeName;
    private String phone;

    public Vendor(String name, String address, String representativeName, String phone) {
        this.name = name;
        this.address = address;
        this.representativeName = representativeName;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", representativeName='" + representativeName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
