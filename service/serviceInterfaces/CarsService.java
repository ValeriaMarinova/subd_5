package service.serviceInterfaces;

import org.springframework.stereotype.Service;
import entity.Cars;

import java.util.List;
import java.util.Optional;

@Service
public interface CarsService {
    Cars addCars(Cars cars);

    void delete(int id);

    Optional<Cars> getById(int id);

    Cars editCars(Cars cars);

    List<Cars> getAll();

    List<Cars> getAll(int offset, int count);
}