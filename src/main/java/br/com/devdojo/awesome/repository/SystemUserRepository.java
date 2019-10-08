package br.com.devdojo.awesome.repository;

import br.com.devdojo.awesome.model.SystemUser;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by MarcoAntonioGoncalve on Sep, 2019
 */
public interface SystemUserRepository extends PagingAndSortingRepository<SystemUser, Long> {
    SystemUser findByUsername(String username);
}
