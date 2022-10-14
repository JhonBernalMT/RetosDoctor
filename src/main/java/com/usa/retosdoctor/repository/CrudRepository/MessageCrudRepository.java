package com.usa.retosdoctor.repository.CrudRepository;

import com.usa.retosdoctor.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message,Integer> {
}
