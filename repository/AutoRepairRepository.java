package repository;

import entity.AutoRepair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepairRepository extends JpaRepository<AutoRepair, Integer> {
}
