package admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 2019/3/27
 *
 * @author dean
 * @since 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"admin","common.config"})
@EnableAdminServer
public class SpringbootAdmin {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAdmin.class, args);
    }

}
