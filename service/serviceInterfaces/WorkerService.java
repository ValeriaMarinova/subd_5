package service.serviceInterfaces;

import org.springframework.stereotype.Service;
import entity.Worker;

import java.util.List;
import java.util.Optional;

@Service
public interface WorkerService {
    public Worker addWorker(Worker worker);

    void delete(int id);

    Optional<Worker> getById(int id);

    Worker editWorker(Worker worker);

    List<Worker> getAll();

    List<Worker> getAll(int offset, int count);
}