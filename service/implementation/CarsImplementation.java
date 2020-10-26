package service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entity.Cars;
import models.OffsetablePageRequest;
import repository.CarsRepository;
import service.serviceInterfaces.CarsService;

import java.util.List;
import java.util.Optional;

@Service
public class CarsImplementation implements CarsService {
    @Autowired
    private CarsRepository carsRepository;

    @Override
    public Cars addCars(Cars cars) {
        return carsRepository.saveAndFlush(cars);
    }

    @Override
    public void delete(int id) {
        carsRepository.deleteById(id);
    }

    @Override
    public Optional<Cars> getById(int id) {
        return carsRepository.findById(id);
    }

    @Override
    public Cars editCars(Cars cars) {
        return carsRepository.saveAndFlush(cars);
    }

    @Override
    public List<Cars> getAll() {
        return carsRepository.findAll();
    }

    @Override
    public List<Cars> getAll(int offset, int count) {

        return carsRepository.findAll(new OffsetablePageRequest(offset, count)).toList();
    }
}
