package com.diabete.diabete.Services;

import com.diabete.diabete.Models.Repas;
import com.diabete.diabete.Repository.RepasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RepasServiceImpl implements RepasService {

    @Autowired
    private RepasRepository repasRepository;

    @Override
    public List<Repas> getAllRepas() {
        return repasRepository.findAll();
    }
    @Override
    public List<Repas> findRepasByGroupeDiabete1(){
        List<Repas> repasbygroupe1 =repasRepository.findRepasByGroupeDiabete1();
        return  repasbygroupe1;
    }
}
