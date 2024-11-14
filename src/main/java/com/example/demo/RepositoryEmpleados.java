/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author roberto
 */
public interface RepositoryEmpleados extends JpaRepository<Empleado, Long> {
    
}
