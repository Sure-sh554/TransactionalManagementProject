package com.TrasanactionalManagement.TransactionalManagementProject.Repository;

import com.TrasanactionalManagement.TransactionalManagementProject.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
