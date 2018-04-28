package com.trust.ucenter.utils.special;

import java.security.Key;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    private static RedisTemplate redisTemplate;

    @Autowired
    public JwtUtil(RedisTemplate redisTemplate){
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
            System.out.println("parseJWT Claims:"+claims.toString());
            Integer userId = (Integer) claims.get("userId");
            Integer curVer = (Integer) redisTemplate.opsForValue().get("jwt_"+userId);
            System.out.println("parseJWT最新版本："+curVer);
            Integer ver = (Integer) claims.get("ver");
            System.out.println("parseJWT当前版本："+ver);
            if(ver != curVer){//版本不对
                return null;
            }
            return claims;
        }
        catch(Exception ex)
        {
            return null;
        }
    }

    public static String createJWT(String name, int userId, String phone)
    {
        ValueOperations<String, Integer> operations = redisTemplate.opsForValue();
        /**
         * 每个用户增加 jwt版本
         * 默认版本都是1  但如果发生了修改密码等需要 jwt失效的场景 则在这些业务场景中修改该用户对应的版本号
         * 版本号自增 从而使之前版本的jwt失效
         */

        String key = "jwt_"+userId;
        boolean hasKey = redisTemplate.hasKey(key);
        Integer ver = 1;
        if(hasKey){
            ver = operations.get(key);
        }
        System.out.println("createJWT最新版本："+ver);
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
                .claim("ver",  ver)
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
        System.out.println(System.currentTimeMillis());
        System.out.println(createJWT("chen",1,"18366112588"));
        try {
            Thread.sleep(3L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(parseJWT(createJWT("chen",1,"18366112588")));
    }

}