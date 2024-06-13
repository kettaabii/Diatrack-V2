package com.diabete.diabete.Repository;

import com.diabete.diabete.Models.Repas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepasRepository extends JpaRepository<Repas, Integer> {
    @Query(value="SELECT * " +
            "FROM repas r  " +
            "WHERE r.max_gl > :valeurGlycemie",nativeQuery = true)
    public List<Repas> findRepasByGroupeDiabete(Double valeurGlycemie);
}
