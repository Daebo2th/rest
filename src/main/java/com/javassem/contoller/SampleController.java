package com.javassem.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping(value = "/getText",produces = "text/plain;charset=UTF-8")
    public String getTest(){
        return "컨트롤러에서 보냈어요";
    }
}
