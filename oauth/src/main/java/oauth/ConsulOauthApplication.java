package oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created on 2019/1/21
 *
 * @author dean
 * @email loveangelo0217@gmail.com
 * @since 1.0
 */

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(scanBasePackages = {"oauth","common.config"})
public class ConsulOauthApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulOauthApplication.class, args);
    }
}
