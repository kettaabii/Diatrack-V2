package com.diabete.diabete.Services;

import com.diabete.diabete.Models.Conseils;
import com.diabete.diabete.Repository.ConseilsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ConseilsServiceImpl {
    @Autowired
    private ConseilsRepository conseilsRepository;

    public List<Conseils> getConseils() {
        return conseilsRepository.findAll();
    }
//    public Conseils getConseilsById(int id) {
//        Optional<Conseils> conseils = conseilsRepository.findById(id);
//        if (conseils.isPresent()) {
//            return conseils.get();
//        } else {
//            throw new RuntimeException("Did not find conseils id - " + id);
//        }
//    }

}
