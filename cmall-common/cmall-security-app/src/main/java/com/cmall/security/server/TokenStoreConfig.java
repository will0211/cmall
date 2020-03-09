
 package com.cmall.security.server;

 import com.cmall.security.core.properties.SecurityProperties;
 import com.cmall.security.core.redis.MyRedisTokenStore;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
 import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.core.io.ClassPathResource;
 import org.springframework.data.redis.connection.RedisConnectionFactory;
 import org.springframework.security.oauth2.provider.token.TokenEnhancer;
 import org.springframework.security.oauth2.provider.token.TokenStore;
 import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
 import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
 import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
 import org.springframework.security.rsa.crypto.KeyStoreKeyFactory;

 import java.security.KeyPair;


 /**
  * The class Token store config.
  *
  */
 @Configuration
 public class TokenStoreConfig {

     /**
      * 使用redis存储token的配置，只有在cmall.security.oauth2.tokenStore配置为redis时生效
      */
     @Configuration
     @ConditionalOnProperty(prefix = "cmall.security.oauth2", name = "tokenStore", havingValue = "redis")
     public static class RedisConfig {

         @Autowired
         private RedisConnectionFactory redisConnectionFactory;

         /**
          * Redis token store token store.
          *
          * @return token store
          */
         @Bean
         public TokenStore redisTokenStore() {
             return new MyRedisTokenStore(redisConnectionFactory);
         }

     }

     /**
      * 使用jwt时的配置，默认生效
      *
      * @author paascloud.net @gmail.com
      */
     @Configuration
     @ConditionalOnProperty(prefix = "cmall.security.oauth2", name = "tokenStore", havingValue = "jwt", matchIfMissing = true)
     public static class JwtConfig {

         @Autowired
         private SecurityProperties securityProperties;
         @Autowired
         private RedisConnectionFactory redisConnectionFactory;

         /**
          * Jwt token store token store.
          *
          * @return the token store
          */


         /**
          * Jwt token enhancer token enhancer.
          *
          * @return the token enhancer
          */
         @Bean
         @ConditionalOnBean(TokenEnhancer.class)
         public TokenEnhancer jwtTokenEnhancer() {
             return new TokenJwtEnhancer();
         }


         @Bean
         public TokenStore jwtTokenStore() {
//             return new JwtTokenStore(jwtAccessTokenConverter());
             return new MyRedisTokenStore(redisConnectionFactory);
         }


         /**
          * Jwt access token converter jwt access token converter.
          *
          * @return the jwt access token converter
          */
         @Bean
         public JwtAccessTokenConverter jwtAccessTokenConverter() {
             JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
//             converter.setSigningKey(securityProperties.getOauth2().getJwtSigningKey());
             converter.setSigningKey("cmall");
//             converter.setKeyPair(keyPair());
             return converter;
         }
//         @Bean
//         public KeyPair keyPair() {
//             KeyStoreKeyFactory keyStoreKeyFactory = new KeyStoreKeyFactory(new ClassPathResource("demojwt.jks"), "keystorepass".toCharArray());
//             return keyStoreKeyFactory.getKeyPair("jwt", "keypairpass".toCharArray());
//         }


     }



 }
