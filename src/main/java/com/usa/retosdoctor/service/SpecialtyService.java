package com.usa.retosdoctor.service;

import com.usa.retosdoctor.model.Specialty;
import com.usa.retosdoctor.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialtyService {

    @Autowired
    private SpecialtyRepository specialtyRepository;
    public List<Specialty> getAll (){
        return specialtyRepository.getAll();
    }

    public Optional<Specialty> getById(Integer idSpecialty){
        return specialtyRepository.getById(idSpecialty);
    }

    public Specialty save(Specialty specialty){
        if (specialty.getId() == null){
            return specialtyRepository.save(specialty);
        } else {
            Optional<Specialty> optionalSpecialty = specialtyRepository.getById(specialty.getId());
            if ( optionalSpecialty.isEmpty()){
                return specialtyRepository.save(specialty);
            } else {
                return specialty;
            }
        }
    }
    public Specialty update(Specialty specialty){
        if (specialty.getId() != null){
            Optional<Specialty> optionalSpecialty=specialtyRepository.getById(specialty.getId());
            if (!optionalSpecialty.isEmpty()){
                if (specialty.getName() != null){
                    optionalSpecialty.get().setName(specialty.getName());
                }
                if (specialty.getDescription() != null){
                    optionalSpecialty.get().setDescription(specialty.getDescription());
                }
                specialtyRepository.save(optionalSpecialty.get());
                return optionalSpecialty.get();
            }else {
                return specialty;
            }
        } else {
            return specialty;
        }
    }

    public boolean delete (Integer idSpecialty){
        Boolean aBoolean = getById(idSpecialty).map(specialty -> {
            specialtyRepository.delete(specialty);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}

