package pl.lukaszcode.calendar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.lukaszcode.calendar.domain.User;

@Transactional
@Repository
public interface UserRepo extends CrudRepository <User, Long> {


}
