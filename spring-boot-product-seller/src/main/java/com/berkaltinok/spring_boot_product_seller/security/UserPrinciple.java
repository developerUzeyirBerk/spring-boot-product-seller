package com.berkaltinok.spring_boot_product_seller.security;

import com.berkaltinok.spring_boot_product_seller.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Set;
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPrinciple implements UserDetails
{
    private Long id;
    private String username;
    transient private String password; //don't show up on serialized places.
    transient private User user; // user for only login operation, don't use in JWT.
    private Set<GrantedAuthority> authorities;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
