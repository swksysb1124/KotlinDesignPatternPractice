package org.example.structural.adapter.class_adapter

import org.example.structural.adapter.Customer
import org.example.structural.adapter.Employee

class EmployeeClassAdapter: Employee(), Customer {
    override fun getName(): String {
        return fullName.orEmpty()
    }

    override fun getDescription(): String {
        return jobTitle.orEmpty()
    }

    override fun getAddress(): String {
        return officeLocation.orEmpty()
    }
}