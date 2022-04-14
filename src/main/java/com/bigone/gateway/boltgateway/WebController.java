package com.bigone.gateway.boltgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/brand")
public class WebController {
    @GetMapping(value = "/gateway")
    public String redSocialChart() {
        System.out.println("qqqwertyuiopoiuytrdfghj");
        return "assaassas";
    }

}
