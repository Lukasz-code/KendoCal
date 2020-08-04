package pl.lukaszcode.calendar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.lukaszcode.calendar.domain.Callendar;

import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface CallendarRepo extends CrudRepository<Callendar, Long> {

}
