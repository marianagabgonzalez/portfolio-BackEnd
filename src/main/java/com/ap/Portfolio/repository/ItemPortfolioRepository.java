
package com.ap.Portfolio.repository;

import com.ap.Portfolio.model.ItemPortfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPortfolioRepository extends JpaRepository <ItemPortfolio, Long> {
    
   
}
