
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
public class ItemPortfolio implements Serializable {
    
     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
     
    private String titulo;
    private Foto foto;
    private String descripcion;
    private String fecha;
    private String repo;
    private String link;

    public ItemPortfolio() {
    }

    public ItemPortfolio(Long id, String titulo, Foto foto, String descripcion, String fecha, String repo, String link) {
        this.id=id;
        this.titulo = titulo;
        this.foto = foto;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.repo = repo;
        this.link = link;
    }
   
    
}
