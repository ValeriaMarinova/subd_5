package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import entity.Worker;

import java.util.List;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Integer> {
    @Query("SELECT new subd.repository.WorkerSalaryAsc(w.name, w.secondName, w.salary) from Worker w " +
            "order by w.salary asc")
    List<WorkerSalaryAsc> getworkerSalaryAsc();
}
