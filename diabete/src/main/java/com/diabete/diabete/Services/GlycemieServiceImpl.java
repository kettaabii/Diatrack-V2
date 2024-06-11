package com.diabete.diabete.Services;

import com.diabete.diabete.Models.Glycemie;
import com.diabete.diabete.Repository.GlycemieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GlycemieServiceImpl implements GlycemieService{

    @Autowired
    GlycemieRepository glycemieRepository;

    @Override
    public void AddGlycemie(Glycemie glycemie) {
        glycemieRepository.save(glycemie);
    }
}
