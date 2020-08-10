package com.mozat.jsonTojava;

import java.util.List;

public class Student {

    private Integer userid;
    private String app_code;
    private String app_version;
    private String network_type;
    private String carrier;
    private String device_id;
    private String manufacture;
    private String device_model;
    private String create_time;
    private String user_ip;
    private String lat;
    private String lng;
    private String country;
    private String province;
    private String city;
    private String area;
    private String screen_height;
    private String screen_width;
    private String os;
    private String  os_version;
    private String  browser;
    private String  browser_version;
    private List<EventDetail> event_detail;

    public List<EventDetail> getEvent_detail() {
        return event_detail;
    }

    public void setEvent_detail(List<EventDetail> event_detail) {
        this.event_detail = event_detail;
    }

    public Student(Integer userid, String app_code, String app_version, String network_type, String carrier, String device_id, String manufacture, String device_model, String create_time, String user_ip, String lat, String lng, String country, String province, String city, String area, String screen_height, String screen_width, String os, String os_version, String browser, String browser_version, List<EventDetail> event_detail) {
        this.userid = userid;
        this.app_code = app_code;
        this.app_version = app_version;
        this.network_type = network_type;
        this.carrier = carrier;
        this.device_id = device_id;
        this.manufacture = manufacture;
        this.device_model = device_model;  
        this.create_time = create_time;
        this.user_ip = user_ip;
        this.lat = lat;
        this.lng = lng;
        this.country = country;
        this.province = province;
        this.city = city;
        this.area = area;
        this.screen_height = screen_height;
        this.screen_width = screen_width;
        this.os = os;
        this.os_version = os_version;
        this.browser = browser;
        this.browser_version = browser_version;
        this.event_detail = event_detail;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getApp_code() {
        return app_code;
    }

    public void setApp_code(String app_code) {
        this.app_code = app_code;
    }

    public String getApp_version() {
        return app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }

    public String getNetwork_type() {
        return network_type;
    }

    public void setNetwork_type(String network_type) {
        this.network_type = network_type;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getDevice_model() {
        return device_model;
    }

    public void setDevice_model(String device_model) {
        this.device_model = device_model;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUser_ip() {
        return user_ip;
    }

    public void setUser_ip(String user_ip) {
        this.user_ip = user_ip;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getScreen_height() {
        return screen_height;
    }

    public void setScreen_height(String screen_height) {
        this.screen_height = screen_height;
    }

    public String getScreen_width() {
        return screen_width;
    }

    public void setScreen_width(String screen_width) {
        this.screen_width = screen_width;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOs_version() {
        return os_version;
    }

    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getBrowser_version() {
        return browser_version;
    }

    public void setBrowser_version(String browser_version) {
        this.browser_version = browser_version;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userid=" + userid +
                ", app_code='" + app_code + '\'' +
                ", app_version='" + app_version + '\'' +
                ", network_type='" + network_type + '\'' +
                ", carrier='" + carrier + '\'' +
                ", device_id='" + device_id + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", device_model='" + device_model + '\'' +
                ", create_time='" + create_time + '\'' +
                ", user_ip='" + user_ip + '\'' +
                ", lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", screen_height='" + screen_height + '\'' +
                ", screen_width='" + screen_width + '\'' +
                ", os='" + os + '\'' +
                ", os_version='" + os_version + '\'' +
                ", browser='" + browser + '\'' +
                ", browser_version='" + browser_version + '\'' +
                ", event_detail=" + event_detail +
                '}';
    }
}
