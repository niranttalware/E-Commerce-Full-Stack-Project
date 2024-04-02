package com.ecom_project.ecom.service;

import com.ecom_project.ecom.modal.User;
import com.ecom_project.ecom.repository.UserRepository;
import com.ecom_project.ecom.user.domain.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

// DataInitializationComponent.java
@Component
public class DataInitializationComponent implements CommandLineRunner {

    private final UserRepository userRepository;

private CartService cartService;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public DataInitializationComponent(UserRepository userRepository,
                                       PasswordEncoder passwordEncoder,
                                       CartService cartService) {
        this.userRepository = userRepository;
        this.passwordEncoder=passwordEncoder;
        this.cartService=cartService;
    }

    @Override
    public void run(String... args) {
        initializeAdminUser();
    }

    private void initializeAdminUser() {
        String adminUsername = "codewithzosh@gmail.com";

        if (userRepository.findByEmail(adminUsername)==null) {
            User adminUser = new User();

            adminUser.setPassword(passwordEncoder.encode("12345678"));
            adminUser.setFirstName("Code");
            adminUser.setLastName("Zosh");
            adminUser.setEmail(adminUsername);
            adminUser.setRole(String.valueOf(UserRole.ROLE_ADMIN));

            User admin=userRepository.save(adminUser);

            cartService.createCart(admin);
        }
    }



}
