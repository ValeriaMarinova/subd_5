package service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entity.VehicleInspection;
import models.OffsetablePageRequest;
import repository.VehicleInspectionRepository;
import service.serviceInterfaces.VehicleInspectionService;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleInspectionImplementation implements VehicleInspectionService {
    @Autowired
    private VehicleInspectionRepository vehicleInspectionRepository;

    @Override
    public VehicleInspection addVehicleInspection(VehicleInspection vehicleInspection) {
        return vehicleInspectionRepository.saveAndFlush(vehicleInspection);
    }

    @Override
    public void delete(int id) {
        vehicleInspectionRepository.deleteById(id);
    }

    @Override
    public Optional<VehicleInspection> getById(int id) {
        return vehicleInspectionRepository.findById(id);
    }

    @Override
    public VehicleInspection editVehicleInspection(VehicleInspection vehicleInspection) {
        return vehicleInspectionRepository.saveAndFlush(vehicleInspection);
    }

    @Override
    public List<VehicleInspection> getAll() {
        return vehicleInspectionRepository.findAll();
    }

    @Override
    public List<VehicleInspection> getAll(int offset, int count) {
        return vehicleInspectionRepository.findAll(new OffsetablePageRequest(offset, count)).toList();
    }
}
