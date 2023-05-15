
package com.ap.Portfolio.repository;

import com.ap.Portfolio.model.PortfolioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortfolioRepository extends JpaRepository <PortfolioModel, Long> {
    
}
