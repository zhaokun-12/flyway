package com.example.flyway.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/1/19
 * @Version 1.0
 **/
@Data
@Configuration
@ConfigurationProperties("app")
public class AppConfig {
    /**
     *
     */
    private Map<String, V1> v1 = new HashMap<>();

    /**
     *
     *
     * @author felord.cn
     * @since 1.0.0.RELEASE
     */
    @Data
    public static class V1 {
        /**
         * name
         */
        private String name;
        /**
         * description
         */
        private String description;

    }
}
