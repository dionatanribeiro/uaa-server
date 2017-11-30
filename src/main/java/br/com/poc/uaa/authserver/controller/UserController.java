package br.com.poc.uaa.authserver.controller;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

//    @GetMapping("/user")
//    public Principal user(Principal user){
//        return user;
//    }

    /**
     * Para testar a info de usuário deve-se primeiro obter a token do mesmo utilizando o request
     * POST - /oauth/token com as credenciais do app e do usuário com grant_type para password
     * Após isso deve-se enviar a token como arg: '?access_token=<token_exemplo>'
     */
    @GetMapping(value = "/user")
    public Map<String, Object> user(OAuth2Authentication user) {
        Map<String, Object> userInfo = new HashMap<>();
        userInfo.put("user", user.getUserAuthentication().getPrincipal());
        userInfo.put("authorities", AuthorityUtils.authorityListToSet(user.getUserAuthentication().getAuthorities()));

        return userInfo;
    }

}