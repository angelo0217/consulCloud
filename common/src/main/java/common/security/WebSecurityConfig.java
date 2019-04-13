package common.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created on 2019/4/3
 *
 * @author dean
 * @since 1.0
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .anyRequest().permitAll();

//                // 首頁
//                .antMatchers("/home").permitAll()
//                .antMatchers("/actuator/**").permitAll()
//                .anyRequest().authenticated()   // 除了以上的 URL 外, 都需要認證才可以訪問
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                //.failureHandler(authFailureHandler) // 使用 Spring 預設
//                .successForwardUrl("/auth/home")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
    }
}
