package com.demo.poly01.buoi5;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@Component
public class SchoolInformation {
    private String Fullname="khoi";
    private String lcation="daknong";

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getLcation() {
        return lcation;
    }

    public void setLcation(String lcation) {
        this.lcation = lcation;
    }
}
