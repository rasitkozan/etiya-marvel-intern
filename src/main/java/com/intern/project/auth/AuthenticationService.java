package com.intern.project.auth;

import com.intern.project.dtos.UserDto;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class AuthenticationService implements UserDetailsService {
    //TODO: UserService sisteme enjecte edilecek.
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails userDetails = null;
        //TODO: username ile beraber gidip(userservice) database'e gidip bakılacak varsa oluşturulacak.
        //TODO: user oluşturulacak.
        UserDto userDto = new UserDto();

        if (Objects.nonNull(userDto)) {
            List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
            grantedAuthorityList.add(new SimpleGrantedAuthority("ROLE_"+userDto.getGeneralTypeDto().getShortCode().toUpperCase()));
            userDetails = new User(userDto.getUserName(),userDto.getPassword(),grantedAuthorityList);
        }
        return userDetails;
    }
}
