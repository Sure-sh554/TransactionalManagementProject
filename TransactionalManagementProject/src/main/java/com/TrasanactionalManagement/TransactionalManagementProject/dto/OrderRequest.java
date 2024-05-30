package com.TrasanactionalManagement.TransactionalManagementProject.dto;

import com.TrasanactionalManagement.TransactionalManagementProject.Entity.Order;
import com.TrasanactionalManagement.TransactionalManagementProject.Entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;

}
