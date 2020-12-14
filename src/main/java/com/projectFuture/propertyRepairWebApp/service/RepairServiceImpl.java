package com.projectFuture.propertyRepairWebApp.service;

import com.projectFuture.propertyRepairWebApp.domain.Repair;
import com.projectFuture.propertyRepairWebApp.enums.RepairType;
import com.projectFuture.propertyRepairWebApp.enums.Status;
import com.projectFuture.propertyRepairWebApp.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RepairServiceImpl implements RepairService{
    @Autowired
    private RepairRepository repairRepository;

    @Override
    public Optional<Repair> findRepair(Long id) {
        return repairRepository.findById(id);
    }

    @Override
    public List<Repair> getAllRepairs() {
        return repairRepository.findAll();
    }

    @Override
    public List<Repair> getRepairsByUserId(Long id) {
        return repairRepository.findAllByUserId(id);
    }

    @Override
    public List<Repair> getRepairsByStatus(Status status) {
        return repairRepository.findAllByStatus(status);
    }

    @Override
    public List<Repair> getRepairsByRepairType(RepairType repairType) {
        return repairRepository.findAllByRepairType(repairType);
    }
}