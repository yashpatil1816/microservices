package com.cfs.Notification_api.Controller;

import com.cfs.Notification_api.productAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class notificationController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private productAPI productAPI;
    @GetMapping("/notification")
    public String sendNotification(){
        return "notification send to usser ";
    }

    @GetMapping("/notification/product")
    public String getproduct(){
           String s1 = " Hello from notification api ,in same network  ";
//           String s2 = restTemplate.getForObject("http://localhost:9091/place",String.class);
        String s2 = productAPI.getproductplace();
           return  s1+ " "+s2;
    }

}
