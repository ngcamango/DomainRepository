/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ngcamango.rehabcetreweb.repository;

import com.ngcamango.rehabcetreweb.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ngcamango
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
    
}
