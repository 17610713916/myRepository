package com.mozat.jsonTojava;

public class Detail {
    private String name_zh;
    private String name_en;
    private String name_value;

    public Detail(String name_zh, String name_en, String name_value) {
        this.name_zh = name_zh;
        this.name_en = name_en;
        this.name_value = name_value;
    }

    public String getName_zh() {
        return name_zh;
    }

    public void setName_zh(String name_zh) {
        this.name_zh = name_zh;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getName_value() {
        return name_value;
    }

    public void setName_value(String name_value) {
        this.name_value = name_value;
    }

    @Override
    public String toString() {
        return " name_zh='" + name_zh + '\'' +
                ", name_en='" + name_en + '\'' +
                ", name_value='" + name_value + '\'' +
                '}';
    }
}
