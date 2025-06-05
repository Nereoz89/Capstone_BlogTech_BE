package com.example.springblog.payload;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;


@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class CategoryDto {

    private Long categoryId;

    @NotBlank
    @Size(min = 2, max = 50, message = "La lunghezza del nome deve essere minimo 5 caratteri e massimo 50 caratteri.")
    private String categoryTitle;

    @NotBlank
    @Size(min = 5, max = 100, message = "La dimensione della descrizione deve essere minimo 5 caratteri e il massimo è 100 caratteri.")
    private String categoryDescription;
}
