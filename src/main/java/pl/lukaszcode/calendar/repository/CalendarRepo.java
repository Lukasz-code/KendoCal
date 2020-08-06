package pl.lukaszcode.calendar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.lukaszcode.calendar.domain.Calendar;

import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface CalendarRepo extends CrudRepository<Calendar, Long> {

}
