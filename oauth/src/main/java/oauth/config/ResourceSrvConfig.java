//package oauth.config;//package com.chk.config;
//
//import oauth.Const;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//
///**
// * Created on 2018-12-19
// *
// * @author dean
// * @email loveangelo0217@gmail.com
// * @since 1.0
// */
//@Configuration
//@EnableResourceServer
//public class ResourceSrvConfig extends ResourceServerConfigurerAdapter {
//
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) {
//        resources.resourceId(Const.DEMO_RESOURCE_ID).stateless(true);
//    }
//
//    /**
//     * 設定需要認證的PATH
//     * 如果設定 .antMatcher("/**").authorizeRequests()
//     * 會導致下面設定全失效，故改成這樣設定
//     *
//     * @param http
//     * @throws Exception
//     */
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests().anyRequest().authenticated();
//        http
//                .anonymous().disable()
//                .authorizeRequests()
//                .antMatchers("/actuator/**").permitAll()
//                .antMatchers("/oauth/**").permitAll()
//                .anyRequest().authenticated();
//
//    }
//}
