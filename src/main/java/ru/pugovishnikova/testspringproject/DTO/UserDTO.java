package ru.pugovishnikova.testspringproject.DTO;

import jakarta.validation.constraints.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserDTO {

    @NotEmpty
    private UUID id;

    @NotEmpty
    @Size(min = 5, max = 50)
    private String name;

    @NotEmpty
    @Size(min = 7, max = 50)
    private String surname;

    @NotEmpty
    @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")
    private String phone;

    @NotEmpty
    @Min(1)
    @Max(100)
    private int age;
}
