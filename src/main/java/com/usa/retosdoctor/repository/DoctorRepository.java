package com.usa.retosdoctor.repository;

import com.usa.retosdoctor.model.Doctor;
import com.usa.retosdoctor.repository.CrudRepository.DoctorCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

@Repository
public class DoctorRepository {

    @Autowired
    private DoctorCrudRepository doctorCrudRepository;

    public List<Doctor> getAll(){
        return (List<Doctor>) doctorCrudRepository.findAll();
    }

    public Optional<Doctor> getById(Integer idDoctor){
        return doctorCrudRepository.findById(idDoctor);
    }

    public Doctor save(Doctor doctor){
        return doctorCrudRepository.save(doctor);
    }

    public void delete (Doctor doctor){
        doctorCrudRepository.delete(doctor);
    }
}
