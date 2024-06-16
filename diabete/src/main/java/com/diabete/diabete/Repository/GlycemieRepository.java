package com.diabete.diabete.Repository;

import com.diabete.diabete.Models.Glycemie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface GlycemieRepository extends JpaRepository<Glycemie,Integer> {

    @Query(value = "SELECT * FROM glycemie g WHERE MONTH(g.date) = :month", nativeQuery = true)
    ArrayList<Glycemie> findByMonth(Integer month);
}

