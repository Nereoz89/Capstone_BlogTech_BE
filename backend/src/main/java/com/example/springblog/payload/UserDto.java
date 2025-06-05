package com.example.springblog.payload;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100, message = "L'username deve contenere almeno 4 caratteri")
    private String name;

    @NotBlank
    @Size(min = 4, max = 500, message = "Inserisci almeno 4 caratteri!")
    private String about;

    @NotNull
    @Email(message = "È richiesta un email valida!")
    private String email;


    @NotBlank
    @Size(min = 4, max = 15, message = "la password deve contenere dai 4 ai 15 caratteri")
    private String password;

    private Set<RoleDto> roles = new HashSet<>();

//    @JsonIgnore
//    public String getPassword() {
//        return password;
//    }
}
