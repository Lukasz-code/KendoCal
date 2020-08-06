package pl.lukaszcode.calendar.repository;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.lukaszcode.calendar.domain.User;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserRepositoryTestSuite {
    @Autowired
    private UserRepo userRepo;

    @Test
    public void testUserRepoSave() {
        //Given
        User user = new User(1L,"Lukasz", "Schweda","2 DAN");
        //When
        userRepo.save(user);
        //Then
        Long id = user.getId();
        Optional<User> readUser = userRepo.findById(id);
        Assert.assertTrue(readUser.isPresent());

    }
}
