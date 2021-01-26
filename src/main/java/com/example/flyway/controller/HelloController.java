package com.example.flyway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.Locale;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/1/26
 * @Version 1.0
 **/
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        System.out.println(cookies.length);
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + " - " + cookie.getValue());
        }
        HttpSession session = request.getSession();
        System.out.println(session);
        Enumeration<String> attributeNames = session.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            String s = attributeNames.nextElement();
            System.out.println(s);
        }

        Locale locale = request.getLocale();
        return "null";
    }
}
