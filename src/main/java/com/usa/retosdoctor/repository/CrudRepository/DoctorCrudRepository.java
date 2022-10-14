package com.usa.retosdoctor.repository.CrudRepository;

import com.usa.retosdoctor.model.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorCrudRepository extends CrudRepository <Doctor, Integer> {
}
