package service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entity.AutoRepair;
import models.OffsetablePageRequest;
import repository.AutoRepairRepository;
import service.serviceInterfaces.AutoRepairService;

import java.util.List;
import java.util.Optional;

@Service
public class AutoRepairImplementation implements AutoRepairService {
    @Autowired
    private final AutoRepairRepository autoRepairRepository;

    public AutoRepairImplementation(AutoRepairRepository autoRepairRepository) {
        this.autoRepairRepository = autoRepairRepository;
    }

    @Override
    public AutoRepair addAutoRepair(AutoRepair autoRepair) {
        return autoRepairRepository.saveAndFlush(autoRepair);
    }

    @Override
    public void delete(int id) {
        autoRepairRepository.deleteById(id);
    }

    @Override
    public Optional<AutoRepair> getById(int id) {
        return autoRepairRepository.findById(id);
    }

    @Override
    public AutoRepair editAutoRepair(AutoRepair autoRepair) {

        return autoRepairRepository.saveAndFlush(autoRepair);
    }

    @Override
    public List<AutoRepair> getAll() {

        return autoRepairRepository.findAll();
    }

    @Override
    public List<AutoRepair> getAll(int offset, int count) {

        return autoRepairRepository.findAll(new OffsetablePageRequest(offset, count)).toList();
    }
}
