
package com.ap.Portfolio.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter    
@Entity
public class Footer implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String copyright;
    private String nameCopy;

    public Footer() {
    }

    public Footer(Long id, String copyright, String nameCopy) {
        this.id = id;
        this.copyright = copyright;
        this.nameCopy = nameCopy;
    }
    
    
}
