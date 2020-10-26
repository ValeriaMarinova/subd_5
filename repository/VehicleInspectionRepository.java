package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import entity.VehicleInspection;

@Repository
public interface VehicleInspectionRepository extends JpaRepository<VehicleInspection, Integer> {
}
