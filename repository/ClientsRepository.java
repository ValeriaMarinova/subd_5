package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import entity.Clients;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Integer> {
}
