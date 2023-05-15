package com.ap.Portfolio.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class About implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @OneToOne
    private Foto foto;
    private String nameTitulo;
    private String descriptTitulo;
    private String aboutTitle;
    private String parrafo1;
    private String parrafo2;

    public About() {
    }

    public About(Long id, Foto foto, String nameTitulo, String descriptTitulo, String aboutTitle, String parrafo1, String parrafo2) {
        this.id=id;
        this.foto = foto;
        this.nameTitulo = nameTitulo;
        this.descriptTitulo = descriptTitulo;
        this.aboutTitle = aboutTitle;
        this.parrafo1 = parrafo1;
        this.parrafo2 = parrafo2;
    }
    
    
}
