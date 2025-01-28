package africa.semicolon.userService.dtos.requests;

import africa.semicolon.userService.data.constants.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String email;
    @NotNull
    @NotBlank
    private String password;
    private String phoneNumber;
    private Role role;
}
