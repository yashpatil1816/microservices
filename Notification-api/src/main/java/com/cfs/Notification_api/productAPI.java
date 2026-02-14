package com.cfs.Notification_api;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-service")
public interface productAPI {

    @GetMapping("/place")
    public String getproductplace();
}
