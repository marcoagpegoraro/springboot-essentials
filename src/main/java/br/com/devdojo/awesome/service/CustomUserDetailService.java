package br.com.devdojo.awesome.service;

import br.com.devdojo.awesome.model.SystemUser;
import br.com.devdojo.awesome.repository.SystemUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Created by MarcoAntonioGoncalve on Sep, 2019
 */
@Component
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    SystemUserRepository systemUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SystemUser user = Optional.ofNullable(systemUserRepository.findByUsername(username))
                .orElseThrow(()->new UsernameNotFoundException("User not found")) ;
        List<GrantedAuthority> authorityListAdmin = AuthorityUtils.createAuthorityList("ROLE_USER","ROLE_ADMIN");
        List<GrantedAuthority> authorityListUser = AuthorityUtils.createAuthorityList("ROLE_USER");
        return new User(user.getUsername(), user.getPassword(), user.getAdmin() ? authorityListAdmin:authorityListUser);
    }
}
