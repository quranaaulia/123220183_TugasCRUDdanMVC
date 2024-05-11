/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import java.util.ArrayList;
import DAOdatamovie.damovDAO;
import model.*;
import view.mainview;
import DAOImplement.damovimplement;

/**
 *--
 * @author quranaaulia
 */
public class damovcontroller {
    mainview frame;
    damovimplement impldatamovie;
    List<datamovie> damov;
    
    public damovcontroller(mainview frame){
        this.frame = frame;
        impldatamovie = new damovDAO();
        damov = impldatamovie.getAll();
    }
    
     public void isitabel(){
        damov = impldatamovie.getAll();
        modeltabeldamov mp = new modeltabeldamov(damov);
        frame.getTabelDatamovie().setModel(mp);
    }
     
     public void insert(){
        datamovie damov = new datamovie();
        damov.setJudul(frame.getFJudul().getText());
        damov.setAlur(Double.parseDouble(frame.getFAlur().getText()));
        damov.setPenokohan(Double.parseDouble(frame.getFPenokohan().getText()));
        damov.setAkting(Double.parseDouble(frame.getFAkting().getText()));
        damov.setNilai(damov.calculateNilai());
        impldatamovie.insert(damov);  
    }
     
     public void update(){
        datamovie damov = new datamovie();
        damov.setJudul(frame.getFJudul().getText());
        damov.setAlur(Double.parseDouble(frame.getFAlur().getText()));
        damov.setPenokohan(Double.parseDouble(frame.getFPenokohan().getText()));
        damov.setAkting(Double.parseDouble(frame.getFAkting().getText()));
        damov.setNilai(damov.calculateNilai());
        impldatamovie.update(damov);
    }
     
    public void delete(){
        String judul = frame.getFJudul().getText();
        impldatamovie.delete(judul);
    } 
}
