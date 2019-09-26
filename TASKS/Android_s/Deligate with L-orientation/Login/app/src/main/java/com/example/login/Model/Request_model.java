package com.example.login.Model;

import com.example.login.Global.Request_status;

import java.io.Serializable;

public class Request_model implements Serializable {
    String ReqNumber;
    Request_status request_status;
    String RequestDate;

    public String getReqNumber() {
        return ReqNumber;
    }

    public void setReqNumber(String reqNumber) {
        ReqNumber = reqNumber;
    }

    public Request_status getRequest_status() {
        return request_status;
    }

    public void setRequest_status(Request_status request_status) {
        this.request_status = request_status;
    }

    public String getRequestDate() {
        return RequestDate;
    }

    public void setRequestDate(String requestDate) {
        RequestDate = requestDate;
    }
}

