package africa.semicolon.userService.services;

import africa.semicolon.userService.data.models.User;
import africa.semicolon.userService.dtos.requests.RegisterRequest;
import africa.semicolon.userService.exceptions.UserServiceBaseException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Sql(scripts = {"/db/data.sql"})
class UserServiceImplTest {

    @Autowired
    private UserService userService;


    @Test
    public void testRegisterBioData() {
        RegisterRequest request = new RegisterRequest();
        request.setFirstName("first name");
        request.setLastName("last name");
        request.setEmail("test@email.com");
        request.setPassword("password");
        request.setPhoneNumber("00000000000");
        User response = userService.register(request);
        assertThat(response).isNotNull();
        assertThat(response.getId()).isNotNull();
    }

    @Test
    public void testRegisterBioDataExistingEmail_throwsException() {
        RegisterRequest request = new RegisterRequest();
        request.setFirstName("first name");
        request.setLastName("last name");
        request.setEmail("darhyor2050@gmail.com");
        request.setPassword("password");
        assertThrows(UserServiceBaseException.class,()-> userService.register(request));
    }

    @Test
    public void testRegisterBioDataWithInvalidEmailFormat_throwsException(){
        RegisterRequest request = new RegisterRequest();
        request.setFirstName("first name");
        request.setLastName("last name");
        request.setEmail("testemail.com");
        request.setPassword("password");
        assertThrows(UserServiceBaseException.class,()-> userService.register(request));
    }

}