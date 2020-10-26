package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import entity.ComponentsInStock;

@Repository
public interface ComponentsInStockRepository extends JpaRepository<ComponentsInStock, Integer> {
}
