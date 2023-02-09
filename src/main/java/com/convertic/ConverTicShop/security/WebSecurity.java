package com.convertic.ConverTicShop.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


//@Configuration permite utilizar archivos XML para configurar beans.


@Configuration
@EnableWebSecurity
public class WebSecurity {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity httpSecurity, AuthenticationManager authenticationManager) throws Exception {
        return httpSecurity
                .csrf().disable()
                .authorizeHttpRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .build();
    }


    // Esto es un método para la creación del usuario y contraseña
    @Bean
    UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withUsername("admin")
                .password(passwordEncoder().encode("admin"))
                .roles()
                .build());
        return manager;
    }

    // Esto es un método para auntenticar el usuario
    @Bean
    AuthenticationManager authenticationManager(HttpSecurity httpSecurity) throws Exception {
       return httpSecurity.getSharedObject(AuthenticationManagerBuilder.class)
               .userDetailsService(userDetailsService())
               .passwordEncoder(passwordEncoder())
               .and()
               .build();
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new  BCryptPasswordEncoder();
    }
}
