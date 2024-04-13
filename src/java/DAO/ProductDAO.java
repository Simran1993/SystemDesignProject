/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
<<<<<<< HEAD
package DAO;
=======
package src.java.DAO;
>>>>>>> 6d2f4f8b8f6b17736d9a433cedfe2389a651b742

/**
 *
 * @author OWNER
 */
import Bean.Productbean;
import java.util.List;

public interface ProductDAO {
    
    Productbean getProductById(int productId);
    List<Productbean> getAllProducts();
    List<Productbean> getProductsByUserId(int userId);
    void addProduct(Productbean product);
    void updateProduct(Productbean product);
    void deleteProduct(int productId);
     List<Productbean> getAllsurplusProducts();
}
