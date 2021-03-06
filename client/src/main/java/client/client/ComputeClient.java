package client.client;


import client.hystrix.ComputeClientFallBack;
import client.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(name = "provider-service" , fallback = ComputeClientHystrix.class)// configuration = FeifnOauth2Interceptor.class)
@FeignClient(name = "spring-cloud-consul-provider" , fallbackFactory = ComputeClientFallBack.class)
public interface ComputeClient {
    @GetMapping("/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

    @GetMapping("/getUser")
    Object getUser();

    @PostMapping("/user")
    User user(@RequestBody User user);

}