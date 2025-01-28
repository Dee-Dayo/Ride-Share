package africa.semicolon.userService.services;

import africa.semicolon.userService.data.models.User;
import africa.semicolon.userService.data.repositories.UserRepository;
import africa.semicolon.userService.dtos.requests.RegisterRequest;
import africa.semicolon.userService.exceptions.EmailExistsException;
import africa.semicolon.userService.exceptions.UserServiceBaseException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User register(RegisterRequest request) {
        validateEmail(request);
        User user = modelMapper.map(request, User.class);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>());
        user.getRoles().add(request.getRole());
        return userRepository.save(user);
    }

    private void validateEmail(RegisterRequest request) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (!request.getEmail().matches(emailRegex))
            throw new UserServiceBaseException("Invalid email format");
        validateExistingEmail(request);
    }

    private void validateExistingEmail(RegisterRequest request) {
        boolean emailExists = userRepository.existsByEmail(request.getEmail());
        if (emailExists) throw new EmailExistsException(request.getEmail() + " already exists");
    }

}
