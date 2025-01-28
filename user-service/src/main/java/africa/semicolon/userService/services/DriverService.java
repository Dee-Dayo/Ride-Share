package africa.semicolon.userService.services;

import africa.semicolon.userService.dtos.requests.LoginRequest;
import africa.semicolon.userService.dtos.requests.RegisterDriverRequest;
import africa.semicolon.userService.dtos.responses.LoginResponse;
import africa.semicolon.userService.dtos.responses.RegisterDriverResponse;

public interface DriverService {
    void deleteAll();

    RegisterDriverResponse registerDriver(RegisterDriverRequest driverRequest);

    LoginResponse login(LoginRequest loginRequest);
}
