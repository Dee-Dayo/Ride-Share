package africa.semicolon.userService.services;

import africa.semicolon.userService.data.repositories.UserRepository;
import africa.semicolon.userService.dtos.requests.LoginRequest;
import africa.semicolon.userService.dtos.requests.RegisterDriverRequest;
import africa.semicolon.userService.dtos.responses.LoginResponse;
import africa.semicolon.userService.dtos.responses.RegisterDriverResponse;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DriverServiceImpl implements DriverService{

    private final UserRepository userRepository;
//    private final ModelMapper modelMapper;

    @Override
    public void deleteAll() {

    }

    @Override
    public RegisterDriverResponse registerDriver(RegisterDriverRequest driverRequest) {
        return null;
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        return null;
    }
}
