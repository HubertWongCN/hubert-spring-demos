package org.hubert.springboot.api.sign.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hubertwong
 */
@Configuration
public class FilterConfig {
    @Bean
    public RequestCachingFilter requestCachingFilter() {
        return new RequestCachingFilter();
    }

    @Bean
    public FilterRegistrationBean<RequestCachingFilter> requestCachingFilterRegistration(RequestCachingFilter requestCachingFilter) {
        FilterRegistrationBean<RequestCachingFilter> bean = new FilterRegistrationBean<>(requestCachingFilter);
        bean.setOrder(1);
        return bean;
    }
}
