package africa.semicolon.userService.services;

import africa.semicolon.userService.data.models.User;
import africa.semicolon.userService.dtos.requests.RegisterRequest;

public interface UserService {
    User register(RegisterRequest request);
}
