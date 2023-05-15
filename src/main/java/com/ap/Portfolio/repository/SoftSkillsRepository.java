
package com.ap.Portfolio.repository;

import com.ap.Portfolio.model.SoftSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftSkillsRepository extends JpaRepository <SoftSkills, Long> {
    
} 
