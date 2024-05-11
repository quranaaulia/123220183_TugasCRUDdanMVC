/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAOImplement;

import java.util.List;
import model.*;
/**
 *
 * @author quranaaulia
 */
public interface damovimplement {
    public void insert(datamovie m);
    public void update(datamovie m);
    public void delete(String judul);
    public List<datamovie> getAll();
}
