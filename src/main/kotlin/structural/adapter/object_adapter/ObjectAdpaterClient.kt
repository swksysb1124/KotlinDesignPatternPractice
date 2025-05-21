package org.example.structural.adapter.object_adapter

import org.example.structural.adapter.BusinessCardDesigner
import org.example.structural.adapter.Employee

fun main() {
    val adapter = EmployeeObjectAdapter(
        Employee().apply {
            fullName = "Jason Su"
            jobTitle = "Senior Engineer"
            officeLocation = "Taipei"
        }
    )

    val businessCardDesigner = BusinessCardDesigner()
    val card = businessCardDesigner.designCard(adapter)
    println(card)
}

fun populateEmployeeData(employee: Employee) {
    employee.fullName = "Jason Su"
    employee.jobTitle = "Senior Engineer"
    employee.officeLocation = "Taipei"
}