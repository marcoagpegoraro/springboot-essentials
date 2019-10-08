package br.com.devdojo.awesome.model;

import lombok.*;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

@Entity
public class Student extends AbstractEntity{
    @Getter
    @Setter
    @NotNull(message = "O campo nome do estudante deve ser obrigatório.")
    private String name;
    @Getter
    @Setter
    @Email
    private String email;
}