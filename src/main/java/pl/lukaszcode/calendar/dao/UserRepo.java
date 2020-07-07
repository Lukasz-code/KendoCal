package pl.lukaszcode.calendar.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.lukaszcode.calendar.dao.entity.User;

@Repository
public interface UserRepo extends CrudRepository <User, Long> {

}
