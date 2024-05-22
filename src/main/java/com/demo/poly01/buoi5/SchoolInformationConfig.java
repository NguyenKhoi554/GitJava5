package com.demo.poly01.buoi5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.RequestEntity;

@Configuration
public class SchoolInformationConfig {
    @Bean("SchoolInformationConfig")
    public SchoolInformation schoolInformation(){
        SchoolInformation schoolInformation=new SchoolInformation();
        schoolInformation.setFullname("nguyen");
        schoolInformation.setLcation("angiang");
        return (schoolInformation);
    }
}
