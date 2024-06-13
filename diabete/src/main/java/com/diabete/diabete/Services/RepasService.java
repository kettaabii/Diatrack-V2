package com.diabete.diabete.Services;

import com.diabete.diabete.Models.Repas;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RepasService {

    public List<Repas> getAllRepas();

    public List<Repas> findRepasByGroupeDiabete(Double valeurGlicemie);
}
