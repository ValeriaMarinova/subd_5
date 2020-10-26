package service.serviceInterfaces;

import org.springframework.stereotype.Service;
import entity.VehicleInspection;

import java.util.List;
import java.util.Optional;

@Service
public interface VehicleInspectionService {
    VehicleInspection addVehicleInspection(VehicleInspection vehicleInspection);

    void delete(int id);

    Optional<VehicleInspection> getById(int id);

    VehicleInspection editVehicleInspection(VehicleInspection vehicleInspection);

    List<VehicleInspection> getAll();

    List<VehicleInspection> getAll(int offset, int count);
}