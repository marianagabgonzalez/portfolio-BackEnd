
package com.ap.Portfolio.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class PortfolioModel implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @OneToOne
    private FotoLogo fotoLogo;
   
    private List itemsNavbar[];
    
    @OneToOne
    private Foto foto;

    private About about;
    
    private Educacion educacion;
    
    private Experiencia experiencia;
    

    private SoftSkills softSkills;

    private HardSkills hardSkills;
    
    private ItemPortfolio itemPortfolio;
    
    private Footer footer;
    
    public PortfolioModel() {
}
    
       public PortfolioModel(Long id, FotoLogo fotoLogo, List[] itemsNavbar, About about, Educacion educacion, Experiencia experiencia, SoftSkills softSkills, HardSkills hardSkills, ItemPortfolio itemPortfolio, Footer footer) {
        this.id = id;
        this.fotoLogo = fotoLogo;
        this.itemsNavbar = itemsNavbar;
        this.about = about;
        this.educacion = educacion;
        this.experiencia = experiencia;
        this.softSkills = softSkills;
        this.hardSkills = hardSkills;
        this.itemPortfolio = itemPortfolio;
        this.footer = footer;
    }
}
