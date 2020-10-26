package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import entity.Cars;

import java.util.List;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Integer> {
    @Query("SELECT new subd.repository.CarsCount(c.brand, c.model, c.engine, c.power, count(c)) from Cars c group by c.brand, c.model, c.engine, c.power")
    List<CarsCount> getCarsCount();
}
