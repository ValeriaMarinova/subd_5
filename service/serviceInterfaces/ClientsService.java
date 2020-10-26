package service.serviceInterfaces;

import org.springframework.stereotype.Service;
import entity.Clients;

import java.util.List;
import java.util.Optional;

@Service
public interface ClientsService {
    Clients addClients(Clients clients);

    void delete(int id);

    Optional<Clients> getById(int id);

    Clients editClients(Clients clients);

    List<Clients> getAll();

    List<Clients> getAll(int offset, int count);
}