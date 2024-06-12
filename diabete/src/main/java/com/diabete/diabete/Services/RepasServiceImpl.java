package com.diabete.diabete.Services;

import com.diabete.diabete.Models.Repas;
import com.diabete.diabete.Repository.RepasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RepasServiceImpl {

    @Autowired
    private RepasRepository repasRepository;
    public List<Repas> getAllRepas() {
        return repasRepository.findAll();
    }
}
