package com.example.users.model;

import org.json.JSONObject;

public class User {

    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
    private Object street;

    public User(JSONObject jUser) {
        try {
            this.id = jUser.getInt("id");
            this.name = jUser.getString("name");
            this.username = jUser.getString("username");
            this.email = jUser.getString("email");
            this.address = new Address(jUser.getJSONObject("address"));
            this.phone = jUser.getString("phone");
            this.website = jUser.getString("website");
            this.company = new Company(jUser.getJSONObject("company"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Object getStreet() {
        return street;
    }

    public void setStreet(Object street) {
        this.street = street;

    }

    public String getFullDescription() {
        return ("id:" + id + "|" + "name:" + name + "|" + "username:" + username + "|" + "email:" + email + "|"
                + "address:" + address.getFullDescription()) + "|" + "phone:" + phone + "|" + "website:" + website + "|"
                + "company:" + company.getFullDescription();

    }
}

