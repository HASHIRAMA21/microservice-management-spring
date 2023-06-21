package com.krohn.enspy.departementservice.model;

public record Employee(Long id, Long departmentId, String name, int age, String position) {
}
