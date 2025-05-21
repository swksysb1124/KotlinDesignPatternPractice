package org.example.structural.adapter

import org.example.structural.adapter.class_adapter.EmployeeClassAdapter

// Client
class BusinessCardDesigner {
    fun designCard(customer: Customer): String {
        return "${customer.getName()}\n${customer.getDescription()}\n${customer.getAddress()}"
    }
}