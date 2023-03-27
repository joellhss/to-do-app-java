/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Project;

/**
 *
 * @author joel
 */
public class ProjectController {
    
   public void save(Project project) {
       String sql = "INSERT INTO (name, description, createdAt, updatedAt) VALUES (?, ?, ?, ?)";
   }
   
   public void update(Project project) {
       
   }
   
   public void removeById(int id) {
       
   }
   
   public List<Project> getAll(int id) {
       return null;
   }
}
