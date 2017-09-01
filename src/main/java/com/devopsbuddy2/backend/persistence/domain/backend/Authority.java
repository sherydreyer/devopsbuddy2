package com.devopsbuddy2.backend.persistence.domain.backend;

/**
 * Created by Sheryl Dreyer on 2017/09/01.
 */
import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority {

    private final String authority;

    public Authority(String authority) {

        this.authority = authority;
    }


    @Override
    public String getAuthority() {
        return authority;
    }
}