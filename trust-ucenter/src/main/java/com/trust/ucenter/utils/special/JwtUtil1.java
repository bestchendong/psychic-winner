package com.trust.ucenter.utils.special;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

public class JwtUtil1 {

    private static RedisTemplate redisTemplate;

    @Autowired
    public JwtUtil1(RedisTemplate redisTemplate){
        this.redisTemplate = redisTemplate;
    }

    private final static String secret = "trustuc";//密匙
    private final static Long TTLMillis = 604800000L;
    public static Claims parseJWT(String jsonWebToken){
        try
        {
            Claims claims = Jwts.parser()
                    .setSigningKey(DatatypeConverter.parseBase64Binary(secret))
                    .parseClaimsJws(jsonWebToken).getBody();
            return claims;
        }
        catch(Exception ex)
        {
            return null;
        }
    }

    public static String createJWT(String name, int userId, String phone)
    {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        //生成签名密钥
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(secret);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        //添加构成JWT的参数
        JwtBuilder builder = Jwts.builder().setHeaderParam("typ", "JWT")
                .claim("phone", phone)
                .claim("nickname", name)
                .claim("userId", userId)
                .claim("ver",  6)
                .signWith(signatureAlgorithm, signingKey);
        //添加Token过期时间
        if (TTLMillis >= 0) {
            long expMillis = nowMillis + TTLMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp).setNotBefore(now);
        }

        //生成JWT
        return builder.compact();
    }


    public static  void main(String[] args){
        String s = "123";
        s = "456";
        System.out.println(s);
        int m =0;
        try {
            System.out.println(m);
            int n = 1/0;
        }catch (Exception e){
            m =1;
            System.out.println(m);
        }finally {

            m=2;
            System.out.println(m);
        }
        System.out.println(createJWT("chen1",20,"18366112588"));
//        System.out.println(parseJWT("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwaG9uZSI6IjE4MzY2MTEyNTgxIiwibmlja25hbWUiOiJjaGVuMSIsInVzZXJJZCI6MjAsInZlciI6NiwiZXhwIjoxNTIwMzI4NTc1LCJuYmYiOjE1MTk3MjM3NzV9.W3jWSiPc3rA_DI3ogcYMaFED6WMtk6ujg2DObOAGrQk"));
    }

}