package com.alliance.game.fakeWater.infra.config;


import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.List;

@Configuration
public class OpenFeignConfig {


    @Bean
    public HttpMessageConverters createHttpMessageConverter() {
        var jackson = new MappingJackson2HttpMessageConverter();
        return new HttpMessageConverters(true, List.of(jackson));
    }

}
