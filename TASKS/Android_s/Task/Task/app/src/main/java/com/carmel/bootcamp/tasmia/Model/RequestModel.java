package com.carmel.bootcamp.tasmia.Model;

import java.io.Serializable;

public class RequestModel implements Serializable {
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    String data;
}
