package service.serviceInterfaces;

import org.springframework.stereotype.Service;
import entity.Route;

import java.util.List;
import java.util.Optional;

@Service
public interface RouteService {
    Route addRoute(Route route);

    void delete(int id);

    Optional<Route> getById(int id);

    Route editRoute(Route route);

    List<Route> getAll();

    List<Route> getAll(int offset, int count);
}