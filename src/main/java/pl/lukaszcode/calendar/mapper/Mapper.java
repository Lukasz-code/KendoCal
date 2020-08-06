package pl.lukaszcode.calendar.mapper;


import org.springframework.stereotype.Component;
import pl.lukaszcode.calendar.domain.User;
import pl.lukaszcode.calendar.domain.UserDto;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Mapper {
    public User mapToUser (final UserDto userDto) {
        return new User (
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getDegree());
    }

    public UserDto mapToUserDto( final User user) {
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getDegree());
    }
    public List<UserDto> mapToUserList (final List<User> userList) {
        return userList.stream()
                .map((t -> new UserDto(t.getId(), t.getFirstName(), t.getLastName(), t.getDegree())))
                .collect(Collectors.toList());
    }
}
