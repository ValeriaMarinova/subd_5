package service.serviceInterfaces;

import org.springframework.stereotype.Service;
import entity.AutoRepair;

import java.util.List;
import java.util.Optional;

@Service
public interface AutoRepairService {
    AutoRepair addAutoRepair(AutoRepair autoRepair);

    void delete(int id);

    Optional<AutoRepair> getById(int id);

    AutoRepair editAutoRepair(AutoRepair autoRepair);

    List<AutoRepair> getAll();

    List<AutoRepair> getAll(int offset, int count);
}
