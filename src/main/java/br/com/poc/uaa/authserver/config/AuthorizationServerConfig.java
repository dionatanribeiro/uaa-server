package br.com.poc.uaa.authserver.config;

import br.com.poc.uaa.authserver.security.UserSecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

@Configuration
@EnableAuthorizationServer
@Import(MethodSecurityConfiguration.class)
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserSecurityService userSecurityService;

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer configuration) throws Exception {
        configuration
                .authenticationManager(authenticationManager)
                .userDetailsService(userSecurityService)
        ;
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("web-app")
                .secret("{noop}password")
                .authorizedGrantTypes("password", "refresh_token")
                .scopes("read", "write")
                .accessTokenValiditySeconds(120)
        .and()
                .withClient("write")
                .secret("{noop}password")
                .authorizedGrantTypes("password", "refresh_token")
                .scopes("write")
                .accessTokenValiditySeconds(120)
                ;
    }


}
