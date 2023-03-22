package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//allows to interact with event objects in db -- storing event objects with primary key of type integer

@Repository // make available to other parts, check EventController with @Autowired
public interface EventRepository extends CrudRepository<Event, Integer> {
}

