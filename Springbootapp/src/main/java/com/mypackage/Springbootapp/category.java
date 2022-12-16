package com.mypackage.Springbootapp;
import java.util.List;  

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;  
  
@Entity  
@Table(name = "category")
public class category {  
  
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    private int cat_id;  
    private String cat_name;  
      
    @OneToMany(targetEntity=product.class)  
    private List <product> products;  
      
    public int getcat_id() {  
        return cat_id;  
    }  
    public void setcat_id(int cat_id) {  
        this.cat_id = cat_id;  
    }  
    public String getcat_name() {  
        return cat_name;  
    }  
    public void setcat_name(String cat_name) {  
        this.cat_name = cat_name;  
    }  
        
}  




