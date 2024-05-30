package com.TrasanactionalManagement.TransactionalManagementProject.Repository;

import com.TrasanactionalManagement.TransactionalManagementProject.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
