package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import entity.Route;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {
    @Query("SELECT new subd.repository.OrdersToComplete(r.id, r.target, r.dateToComplete, w.name, w.secondName) " +
            "from Route r join Worker w on r.worker = w where r.dateToComplete >= '2020-03-10' " +
            "and r.dateToComplete < '2020-03-20'")
    List<OrdersToComplete> getOrders();
}
