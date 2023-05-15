
package com.ap.Portfolio.controller;

import com.ap.Portfolio.model.About;
import com.ap.Portfolio.model.Educacion;
import com.ap.Portfolio.model.Experiencia;
import com.ap.Portfolio.model.Footer;
import com.ap.Portfolio.model.Foto;
import com.ap.Portfolio.model.HardSkills;
import com.ap.Portfolio.model.ItemPortfolio;
import com.ap.Portfolio.model.PortfolioModel;
import com.ap.Portfolio.model.SoftSkills;
import com.ap.Portfolio.model.Usuario;
import com.ap.Portfolio.service.IPortfolioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    IPortfolioService sv;
    
    @PostMapping ("/new/about")
    public void crearAbout(@RequestBody About about) {
        sv.crearAbout(about);
    }
    
    @PostMapping ("/new/usuario")
    public void crearUsuario(@RequestBody Usuario us) {
        sv.crearUsuario(us);
    }
        
        @PostMapping ("/new/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia exp) {
        sv.crearExperiencia(exp);
    }
    
           @PostMapping ("/new/educacion")
    public void agregarEducacion(@RequestBody Educacion ed) {
        sv.crearEducacion(ed);
    }
    
            @PostMapping ("/new/softskill")
    public void agregarSoftSkill(@RequestBody SoftSkills sk) {
        sv.crearSoftSkill(sk);
    }
    
     @PostMapping ("/new/hardskill")
    public void agregarHardSkill(@RequestBody HardSkills hsk) {
        sv.crearHardSkill(hsk);
    }
    
    @PostMapping ("/new/footer")
    public void agregarFooter(@RequestBody Footer f) {
        sv.crearFooter(f);
    }
    
           @PostMapping ("/new/itemPortf")
    public void agregarItemPortfolio(@RequestBody ItemPortfolio it) {
        sv.crearItemPortfolio(it);
    }
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<PortfolioModel> verPortfolio() {
        return sv.verPortfolio();
    }
    
    @DeleteMapping("/deleteExp/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        sv.borrarExperiencia(id);
    }
    
      @DeleteMapping("/deleteEd/{id}")
    public void borrarEducacion(@PathVariable Long id) {
        sv.borrarEducacion(id);
    }
    
     @DeleteMapping("/deleteSoft/{id}")
    public void borrarSoftSkill(@PathVariable Long id) {
        sv.borrarSoftSkill(id);
    }
        
    @DeleteMapping("/deleteHard/{id}")
    public void borrarHardSkill(@PathVariable Long id) {
        sv.borrarHardSkills(id);
    }
    
      @DeleteMapping("/deleteItem/{id}")
    public void borrarItemPortfolio(@PathVariable Long id) {
        sv.borrarItemPortfolio(id);
    }
    
    
        @PutMapping ("/personas/editarEd/{id}")
    public Educacion editEducacion (@PathVariable Long id,
                            @RequestParam ("titulo") String nuevoTitulo,
                            @RequestParam ("foto") Foto nuevaFoto,
                            @RequestParam ("instituto") String nuevoInst,
                            @RequestParam ("tituloObt") String nuevoTitObt,
                            @RequestParam ("fecha") String nuevaFecha
                           ) {
        Educacion ed = sv.buscarEducacion(id);
        ed.setTitulo(nuevoTitulo);
        ed.setFoto(nuevaFoto);
        ed.setInstituto(nuevoInst);
        ed.setTituloObt(nuevoTitObt);
        ed.setFecha(nuevaFecha);
        sv.crearEducacion(ed);
        return ed;
    }
    
    @PutMapping ("/personas/editarExp/{id}")
    public Experiencia editExperiencia (@PathVariable Long id,
                            @RequestParam ("tituloExp") String nuevoTituloExp,
                            @RequestParam ("fotoExp") Foto nuevaFotoExp,
                            @RequestParam ("lugarExp") String nuevoLugarExp,
                            @RequestParam ("puestoExp") String nuevoPuestoExp,
                            @RequestParam ("fechaExp") String nuevaFechaExp
                           ) {
        Experiencia exp = sv.buscarExperiencia(id);
        exp.setTitulo(nuevoTituloExp);
        exp.setFoto(nuevaFotoExp);
        exp.setLugar(nuevoLugarExp);
        exp.setPuesto(nuevoPuestoExp);
        exp.setFecha(nuevaFechaExp);
        sv.crearExperiencia(exp);
        return exp;
    }
    
     @PutMapping ("/personas/editarItem/{id}")
    public ItemPortfolio editItemPortfolio (@PathVariable Long id,
                            @RequestParam ("tituloItem") String nuevoTituloItem,
                            @RequestParam ("fotoItem") Foto nuevaFotoItem,
                            @RequestParam ("descripcionItem") String nuevaDescripcionItem,
                            @RequestParam ("fechaItem") String nuevaFechaItem,
                            @RequestParam ("repoItem") String nuevoRepoItem,
                            @RequestParam ("linkItem") String nuevoLinkItem
                           ) {
        ItemPortfolio it = sv.buscarItemPortfolio(id);
        it.setTitulo(nuevoTituloItem);
        it.setFoto(nuevaFotoItem);
        it.setDescripcion(nuevaDescripcionItem);
        it.setFecha(nuevaFechaItem);
        it.setRepo(nuevoRepoItem);
        it.setLink(nuevoLinkItem);
        sv.crearItemPortfolio(it);
        return it;
    }
    
     @PutMapping ("/personas/editarSoft/{id}")
    public SoftSkills editSoftSkill (@PathVariable Long id,
                            @RequestParam ("name") String nuevoName,
                            @RequestParam ("value") int nuevoValue
                           ) {
        SoftSkills sk = sv.buscarSoftSkill(id);
        sk.setName(nuevoName);
        sk.setValue(nuevoValue);
        return sk;
    }
    
    @PutMapping ("/personas/editarHard/{id}")
    public HardSkills editHardSkill (@PathVariable Long id,
                            @RequestParam ("name") String nuevoName,
                            @RequestParam ("value") int nuevoValue
                           ) {
        HardSkills hsk = sv.buscarHardSkill(id);
        hsk.setName(nuevoName);
        hsk.setValue(nuevoValue);
        return hsk;
    }
    
     @PutMapping ("/personas/editarAbout/{id}")
    public About editAbout (@PathVariable Long id,
                            @RequestParam ("fotoAbout") Foto nuevaFotoAbout,
                            @RequestParam ("nameTitulo") String nuevoNameTitulo,
                            @RequestParam ("descripTit") String nuevaDescripTit,
                            @RequestParam ("aboutTit") String nuevoAboutTit,
                            @RequestParam ("parrafo1") String nuevoParrafo1,
                            @RequestParam ("parrafo2") String nuevoParrafo2
                           ) {
        About ab = sv.buscarAbout(id);
        ab.setNameTitulo(nuevoNameTitulo);
        ab.setFoto(nuevaFotoAbout);
        ab.setDescriptTitulo(nuevaDescripTit);
        ab.setAboutTitle(nuevoAboutTit);
        ab.setParrafo1(nuevoParrafo1);
        ab.setParrafo2(nuevoParrafo2);
        
        sv.crearAbout(ab);
        return ab;
    }
}
