package br.com.devdojo.awesome.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by MarcoAntonioGoncalve on Sep, 2019
 */
@Getter
@Setter
@Entity
public class SystemUser extends AbstractEntity{
    @NotEmpty
    @Column(unique = true)
    private String username;
    @NotEmpty
    @JsonIgnore
    private String password;
    @NotEmpty
    private String name;
    @NotEmpty
    private Boolean admin;
}
