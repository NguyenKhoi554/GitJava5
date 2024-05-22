package com.demo.poly01.buoi5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java5-b4/bean")
public class API {
    @Autowired
    @Qualifier("SchoolInformationConfig")
    SchoolInformation schoolInformation;

    @GetMapping("/getBeanInformation")
    public ResponseEntity<?> doGetBeanInformation() {
        return ResponseEntity.ok(schoolInformation);
    }
}
