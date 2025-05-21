package org.example.structural.adapter.class_adapter

import org.example.structural.adapter.BusinessCardDesigner
import org.example.structural.adapter.Employee

fun main() {
    val adapter = EmployeeClassAdapter()
    populateEmployeeData(adapter)

    val businessCardDesigner = BusinessCardDesigner()
    val card = businessCardDesigner.designCard(adapter)
    println(card)
}

fun populateEmployeeData(employee: Employee) {
    employee.fullName = "Jason Su"
    employee.jobTitle = "Senior Engineer"
    employee.officeLocation = "Taipei"
}