package com.mozat.jsonTojava;

import java.util.List;

public class EventDetail {

    private String first_time;
    private String create_time;
    private String model;
    private String event_tpye;
    private List<Detail> detail;

    public EventDetail(String first_time, String create_time, String model, String event_tpye, List<Detail> detail) {
        this.first_time = first_time;
        this.create_time = create_time;
        this.model = model;
        this.event_tpye = event_tpye;
        this.detail = detail;
    }

    public List<Detail> getDetail() {
        return detail;
    }

    public void setDetail(List<Detail> detail) {
        this.detail = detail;
    }

    public String getFirst_time() {
        return first_time;
    }

    public void setFirst_time(String first_time) {
        this.first_time = first_time;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEvent_tpye() {
        return event_tpye;
    }

    public void setEvent_tpye(String event_tpye) {
        this.event_tpye = event_tpye;
    }

    @Override
    public String toString() {
        return
                "first_time='" + first_time + '\'' +
                ", create_time='" + create_time + '\'' +
                ", model='" + model + '\'' +
                ", event_tpye='" + event_tpye + '\'' +
                ", detail=" + detail +
                '}';
    }
}
