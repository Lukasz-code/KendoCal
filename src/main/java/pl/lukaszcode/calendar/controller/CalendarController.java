package pl.lukaszcode.calendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.lukaszcode.calendar.domain.User;
import pl.lukaszcode.calendar.mapper.Mapper;
import pl.lukaszcode.calendar.service.UserManager;

import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(name="/api/calendar", consumes = APPLICATION_JSON_VALUE)
public class CalendarController {


    @Autowired
    private Mapper mapper;
    @Autowired
    private UserManager userManager;

    @RequestMapping(method=RequestMethod.GET, value="getAll")
    public Iterable<User> getUsers() {
        return userManager.findAll();

    }
    @GetMapping
    public Optional<User> getById (@RequestParam Long id) {
            return userManager.findById(id);
    }

    @DeleteMapping
    public void deleteUser(@RequestParam Long id) {
        userManager.deleteById(id);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        return userManager.save(user);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userManager.save(user);
    }

}

