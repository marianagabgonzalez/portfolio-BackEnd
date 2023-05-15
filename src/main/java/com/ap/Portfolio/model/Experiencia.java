
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
public class Experiencia implements Serializable {
    
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private Long id;
 private String titulo;
 private Foto foto;
 private String lugar;
 private String puesto;
 private String fecha;

    public Experiencia() {
    }

    public Experiencia(Long id, String titulo, Foto foto, String lugar, String puesto, String fecha) {
        this.id=id;
        this.titulo = titulo;
        this.foto = foto;
        this.lugar = lugar;
        this.puesto = puesto;
        this.fecha = fecha;
    }
 
 
}
