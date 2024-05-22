package com.demo.poly01.API;

import com.demo.poly01.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PostManAPI {
    @GetMapping("/getStudentInformation")
    public ResponseEntity<?> doGetStudentInformation(Student student){
        Map<String, Object> result= new HashMap<>();
        result.put("message", "Call Api success");
        result.put("status", true);
        result.put("data", student);
        return ResponseEntity.ok(result);
    }

    @PostMapping ("/postStudentInformation")
    public ResponseEntity<?> doPostStudentInformation(@RequestBody Student student){
        Map<String, Object> result= new HashMap<>();
        result.put("message", "Call Api success");
        result.put("status", true);
        result.put("data", student);
        return ResponseEntity.ok(result);
    }
}
