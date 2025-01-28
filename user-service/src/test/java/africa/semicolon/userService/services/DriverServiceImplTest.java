package africa.semicolon.userService.services;

import africa.semicolon.userService.dtos.requests.LoginRequest;
import africa.semicolon.userService.dtos.requests.RegisterDriverRequest;
import africa.semicolon.userService.dtos.responses.LoginResponse;
import africa.semicolon.userService.dtos.responses.RegisterDriverResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DriverServiceImplTest {

    @Autowired
    private DriverService driverService;

    private RegisterDriverResponse driverResponse;
    private RegisterDriverRequest driverRequest;
    private LoginResponse loginResponse;

    @BeforeEach
    public void setUp(){
        driverService.deleteAll();

        driverRequest = new RegisterDriverRequest();
        driverRequest.setEmail("test@email.com");
        driverRequest.setPassword("password");
        driverRequest.setFirstName("Rose");
        driverRequest.setPhoneNumber("09012345678");
        driverRequest.setLastName("Mary");
        driverResponse = driverService.registerDriver(driverRequest);

        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setEmail("rose@fortunae.com");
        loginRequest.setPassword("Password@1234");
        loginResponse = driverService.login(loginRequest);
    }

    @Test
    public void registerDriverTest(){
        assertNotNull(driverResponse);
        assertThat(driverResponse.getMessage()).isEqualTo("Driver registered successfully");
        System.out.println(driverResponse);
    }
}