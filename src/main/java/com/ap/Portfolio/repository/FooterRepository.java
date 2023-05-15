
package com.ap.Portfolio.repository;

import com.ap.Portfolio.model.Footer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FooterRepository extends JpaRepository <Footer, Long>{
    
}
