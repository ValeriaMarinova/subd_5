package service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entity.Clients;
import models.OffsetablePageRequest;
import repository.ClientsRepository;
import service.serviceInterfaces.ClientsService;

import java.util.List;
import java.util.Optional;

@Service
public class ClientsImplementation implements ClientsService {
    @Autowired
    private ClientsRepository clientsRepository;

    @Override
    public Clients addClients(Clients clients) {
        return clientsRepository.saveAndFlush(clients);
    }

    @Override
    public void delete(int id) {
        clientsRepository.deleteById(id);
    }

    @Override
    public Optional<Clients> getById(int id) {
        return clientsRepository.findById(id);

    }

    @Override
    public Clients editClients(Clients clients) {
        return clientsRepository.saveAndFlush(clients);
    }

    @Override
    public List<Clients> getAll() {
        return clientsRepository.findAll();
    }

    @Override
    public List<Clients> getAll(int offset, int count) {
        return clientsRepository.findAll(new OffsetablePageRequest(offset, count)).toList();
    }
}
