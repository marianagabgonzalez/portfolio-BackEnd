
package com.ap.Portfolio.service;

import com.ap.Portfolio.model.About;
import com.ap.Portfolio.model.Educacion;
import com.ap.Portfolio.model.Experiencia;
import com.ap.Portfolio.model.Footer;
import com.ap.Portfolio.model.HardSkills;
import com.ap.Portfolio.model.ItemPortfolio;
import com.ap.Portfolio.model.PortfolioModel;
import com.ap.Portfolio.model.SoftSkills;
import com.ap.Portfolio.model.Usuario;
import java.util.List;


public interface IPortfolioService {
    
   public List<PortfolioModel> verPortfolio();
   
   public void crearUsuario(Usuario us);
   public void crearAbout(About about);
   public void crearFooter(Footer f);
   public void crearExperiencia (Experiencia exp);
   public void crearEducacion (Educacion ed);
   public void crearSoftSkill (SoftSkills sk);
   public void crearItemPortfolio (ItemPortfolio it);
   public void crearHardSkill(HardSkills hsk);
   
   public void borrarExperiencia (Long id);
   public void borrarEducacion (Long id);
   public void borrarSoftSkill (Long id);
   public void borrarItemPortfolio (Long id);
   public void borrarHardSkills (Long id);
   
   public PortfolioModel buscarPortfolio (Long id);
   public Educacion buscarEducacion (Long id);
   public Experiencia buscarExperiencia (Long id);
   public ItemPortfolio buscarItemPortfolio (Long id);
   public SoftSkills buscarSoftSkill (Long id);
   public HardSkills buscarHardSkill(Long id);
   public About buscarAbout(Long id);
}
