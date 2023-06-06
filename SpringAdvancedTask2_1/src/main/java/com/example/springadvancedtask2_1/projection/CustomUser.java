package com.example.springadvancedtask2_1.projection;

import com.example.springadvancedtask2_1.entity.User;
import com.example.springadvancedtask2_1.entity.Warehouse;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();

    String getFirstName();

    String GetLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    Boolean getActive();

    Set<Warehouse> getWarehouses();
}
