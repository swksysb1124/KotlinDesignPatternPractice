package org.example.structural.adapter.object_adapter

import org.example.structural.adapter.Customer
import org.example.structural.adapter.Employee

class EmployeeObjectAdapter(private val employee: Employee): Customer {
    override fun getName(): String {
        return employee.fullName.orEmpty()
    }

    override fun getDescription(): String {
        return employee.jobTitle.orEmpty()
    }

    override fun getAddress(): String {
        return employee.officeLocation.orEmpty()
    }
}