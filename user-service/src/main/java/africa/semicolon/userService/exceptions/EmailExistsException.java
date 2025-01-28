package africa.semicolon.userService.exceptions;

public class EmailExistsException extends UserServiceBaseException {
    public EmailExistsException(String message) {
        super(message);
    }
}
