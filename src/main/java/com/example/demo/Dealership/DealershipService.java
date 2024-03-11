package com.example.demo.Dealership;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DealershipService {

    private final DealershipRepository dealershipRepository;

    @Autowired
    public DealershipService(DealershipRepository dealershipRepository) {
        this.dealershipRepository = dealershipRepository;
    }

    public List<Dealership> getAllDealerships() {
        return dealershipRepository.findAll();
    }

    public Optional<Dealership> getDealershipById(Long id) {
        return dealershipRepository.findById(id);
    }

    public void addDealership(Dealership dealership) {
        dealershipRepository.save(dealership);
    }

    public void updateDealership(Long id, Dealership updatedDealership) {
        if (dealershipRepository.existsById(id)) {
            updatedDealership.setId(id);
            dealershipRepository.save(updatedDealership);
        } else {

        }
    }

    public void deleteDealership(Long id) {
        dealershipRepository.deleteById(id);
    }
}