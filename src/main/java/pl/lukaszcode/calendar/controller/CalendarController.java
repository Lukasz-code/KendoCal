package pl.lukaszcode.calendar.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.lukaszcode.calendar.dao.entity.User;
import pl.lukaszcode.calendar.manager.UserManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/calendar")
public class CalendarApi {

    private UserManager users;

    @Autowired
    public CalendarApi(UserManager users) {
        this.users = users;
    }

    @GetMapping("/all")
    public Iterable<User> getUsers() {
        return users.findAll();

    }
    @GetMapping
    public Optional<User> getById (@RequestParam Long id) {
            return users.findById(id);
    }
    
    @DeleteMapping
    public void deleteUser(@RequestParam Long id) {
        users.deleteById(id);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return users.save(user);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return users.save(user);
    }

}

