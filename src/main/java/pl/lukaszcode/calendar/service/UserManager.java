package pl.lukaszcode.calendar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lukaszcode.calendar.repository.UserRepo;
import pl.lukaszcode.calendar.domain.User;

import java.util.Optional;

@Service
public class UserManager {

    private UserRepo userRepo;

    @Autowired
    public UserManager(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Optional<User> findById(Long id) {
        return userRepo.findById(id);
    }

    public Iterable<User> findAll() {
        return userRepo.findAll();
    }

    public User save(User user) {
        return userRepo.save(user);
    }
    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }
}
