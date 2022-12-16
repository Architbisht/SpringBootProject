package com.mypackage.Springbootapp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;  

@Entity  
@Table(name = "product")
public class product {  
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
private int prod_id;  
private String prod_name;  
@ManyToOne 
private category category;
  
  
  
public product(int prod_id, String prod_name) {  
    super();  
    this.prod_id = prod_id;  
    this.prod_name = prod_name;  
      
}  
  
public product() {  
    super();  
     
}  
  
public int getprod_id() {  
    return prod_id;  
}  
  
public void setprod_id(int prod_id) {  
    this.prod_id = prod_id;  
}  
  
public String getprod_name() {  
    return prod_name;  
}  
  
public void setprod_name(String prod_name) {  
    this.prod_name = prod_name;  
}        
}  

