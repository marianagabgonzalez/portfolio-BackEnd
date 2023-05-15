
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
public class Educacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String titulo;
    private Foto foto;
    private String instituto;
    private String tituloObt;
    private String fecha;

    public Educacion() {
    }

    public Educacion(Long id, String titulo, Foto foto, String instituto, String tituloObt, String fecha) {
        this.id=id;
        this.titulo = titulo;
        this.foto = foto;
        this.instituto = instituto;
        this.tituloObt = tituloObt;
        this.fecha = fecha;
    }
      
    
}
