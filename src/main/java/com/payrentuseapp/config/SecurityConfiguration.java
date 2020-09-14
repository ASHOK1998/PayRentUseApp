/*
 * package com.payrentuseapp.config;
 * 
 * import javax.sql.DataSource;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder;
 * 
 * import com.payrentuseapp.repository.VendorRepository;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class SecurityConfiguration extends
 * WebSecurityConfigurerAdapter {
 * 
 * // Roles for users private static final String ROLE_1 = "ADMIN"; private
 * static final String ROLE_2 = "USER"; private static final String ROLE_3 =
 * "VENDOR";
 * 
 * @Autowired private VendorRepository vendorRepository;
 * 
 * @Autowired private DataSource dataSource;
 * 
 * // In-memory users with roles
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception { auth.inMemoryAuthentication() .withUser("admin")
 * .password(passwordEncoder().encode("admin@123")) .roles(ROLE_1) .and()
 * .withUser("vendor") .password(passwordEncoder().encode("vendor@123"))
 * .roles(ROLE_3);
 * 
 * auth.jdbcAuthentication() .dataSource(dataSource)
 * .usersByUsernameQuery("select email, password,'true' from user where email=?"
 * ) .authoritiesByUsernameQuery("select email, role from user where email=?").
 * passwordEncoder(new BCryptPasswordEncoder());
 * 
 * }
 * 
 * 
 * // Password encoding
 * 
 * @Bean public PasswordEncoder passwordEncoder() { return new
 * BCryptPasswordEncoder(); }
 * 
 * // Authorized the request based on role
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.httpBasic().and().authorizeRequests()
 * .antMatchers(HttpMethod.GET,"/vendors").hasRole(ROLE_1)
 * .antMatchers(HttpMethod.POST,"/vendors").hasRole(ROLE_1)
 * .antMatchers(HttpMethod.DELETE,"/vendors").hasRole(ROLE_1)
 * .antMatchers(HttpMethod.PUT,"/vendors/**").hasRole(ROLE_1)
 * //.antMatchers("/users").hasAnyRole(ROLE_2, ROLE_1)
 * .antMatchers("/vehicles").hasAnyRole(ROLE_3, ROLE_1)
 * .antMatchers("/bookings").hasAnyRole(ROLE_3, ROLE_1,ROLE_2)
 * .and().formLogin(); } }
 */