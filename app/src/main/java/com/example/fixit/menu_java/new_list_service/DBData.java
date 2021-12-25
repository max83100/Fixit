package com.example.fixit.menu_java.new_list_service;

public class DBData {
    String city_name;

    public DBData(String city_name, String company_name, String map_name, String phone, String web, String geo) {
        this.city_name = city_name;
        this.company_name = company_name;
        this.map_name = map_name;
        this.phone = phone;
        this.web = web;
        this.geo = geo;
    }

    String company_name;
    String map_name;
    String phone;
    String web;

    public String getCity_name() {
        return city_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public String getMap_name() {
        return map_name;
    }

    public String getPhone() {
        return phone;
    }

    public String getWeb() {
        return web;
    }

    public String getGeo() {
        return geo;
    }

    String geo;



}
