
package com.ap.Portfolio.repository;

import com.ap.Portfolio.model.HardSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardSkillsRepository extends JpaRepository <HardSkills, Long>{
    
}
