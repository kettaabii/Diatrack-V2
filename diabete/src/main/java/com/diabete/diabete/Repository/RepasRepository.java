package com.diabete.diabete.Repository;

import com.diabete.diabete.Models.Repas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepasRepository extends JpaRepository<Repas, Integer> {
    @Query(value="select * from repas where groupe_diabete=1",nativeQuery = true)
    public List<Repas> findRepasByGroupeDiabete1();
}
