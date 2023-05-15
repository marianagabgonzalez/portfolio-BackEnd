
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
import com.ap.Portfolio.repository.AboutRepository;
import com.ap.Portfolio.repository.EducacionRepository;
import com.ap.Portfolio.repository.ExperienciaRepository;
import com.ap.Portfolio.repository.FooterRepository;
import com.ap.Portfolio.repository.HardSkillsRepository;
import com.ap.Portfolio.repository.ItemPortfolioRepository;
import com.ap.Portfolio.repository.PortfolioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ap.Portfolio.repository.SoftSkillsRepository;
import com.ap.Portfolio.repository.UsuarioRepository;

@Service
public class PortfolioService implements IPortfolioService {
    
    @Autowired
     public PortfolioRepository portfolioRepo;

    @Autowired 
    public EducacionRepository edRepo;
    
    @Autowired 
    public ExperienciaRepository expRepo;
    
    @Autowired 
    public SoftSkillsRepository skRepo;
    
    @Autowired 
    public HardSkillsRepository hskRepo;
    
    @Autowired 
    public ItemPortfolioRepository itRepo;
    
    @Autowired 
    public UsuarioRepository usRepo;
    
    @Autowired
    public AboutRepository aboutRepo;
    
    @Autowired
    public FooterRepository footerRepo;
    
    @Autowired
    public AboutRepository abRepo;
    
    @Override 
    public void crearUsuario(Usuario us) {
    usRepo.save(us);
    }
    
    @Override
    public void crearFooter(Footer f) {
        footerRepo.save(f);
    }
    
    @Override
    public void crearAbout(About about) {
        aboutRepo.save(about);
    }
    
    @Override
    public List<PortfolioModel> verPortfolio() {
        return portfolioRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void crearEducacion(Educacion ed) {
        edRepo.save(ed);
    }
    
     @Override
    public void crearSoftSkill(SoftSkills sk) {
        skRepo.save(sk);
    }

    @Override 
    public void crearHardSkill(HardSkills hsk) {
        hskRepo.save(hsk);
        
    }
    @Override
    public void crearItemPortfolio(ItemPortfolio it) {
        itRepo.save(it);
    }
    
    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public void borrarEducacion(Long id) {
        edRepo.deleteById(id);
    }
    
    @Override
    public void borrarSoftSkill(Long id) {
        skRepo.deleteById(id);
    }
    
     @Override
    public void borrarHardSkills(Long id) {
        hskRepo.deleteById(id);
    }

    @Override
    public void borrarItemPortfolio(Long id) {
        itRepo.deleteById(id);
    }
    
    @Override
    public PortfolioModel buscarPortfolio(Long id) {
        return portfolioRepo.findById(id).orElse(null);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return edRepo.findById(id).orElse(null);
    }
   
     @Override
    public Experiencia buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }
    
     @Override
    public ItemPortfolio buscarItemPortfolio(Long id) {
        return itRepo.findById(id).orElse(null);
    }
    
     @Override
    public SoftSkills buscarSoftSkill(Long id) {
        return skRepo.findById(id).orElse(null);
    }
    
     @Override
    public HardSkills buscarHardSkill(Long id) {
        return hskRepo.findById(id).orElse(null);
    }
    
    @Override
    public About buscarAbout(Long id) {
        return abRepo.findById(id).orElse(null);
    }
}
