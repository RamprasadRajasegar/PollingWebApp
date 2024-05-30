package com.project.PollingWebApp.config;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtUtil {

    private String createToken(Map<String,Object> claims, String subject){
        String secret = "secret";
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setIssuedAt(new Date(System.currentTimeMillis() + 36000000))
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();
    }

    private String generateToken(String subject){
        Map<String, Object> claims=new HashMap<>();
        return createToken(claims,subject);
    }
}
