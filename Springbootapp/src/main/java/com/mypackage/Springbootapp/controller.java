package com.mypackage.Springbootapp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mypackage.Springbootapp.category;
import com.mypackage.Springbootapp.product;
import com.mypackage.Springbootapp.prodmapper;

import org.springframework.stereotype.Controller;

@RestController  
public class controller{

	@Autowired  
    JdbcTemplate jdbc;
	ArrayList<product> list=new ArrayList<product>();  
	
	Scanner obj = new Scanner(System.in);
	
	
    @RequestMapping("/insertprod")    //-------product operations
    public String index3(){
    	System.out.println("-------Product-------");
    	product p1 = new product();
		System.out.println("Enter the product id and name for insertion");
		int id4 = obj.nextInt();
		String nm4 = obj.next();
		String sql3 = "insert into product(prod_id,prod_name)values(?,?)";
        jdbc.update(sql3,id4,nm4);
        System.out.println("data inserted");
        p1.setprod_id(id4);
        p1.setprod_name(nm4);
        list.add(p1); 
        return "data inserted successfully";
    }
    
    
    @RequestMapping("/getproducts")
    public String prod() {
    	String SQL = "select * from product";
        List <product> products = jdbc.query(SQL, new prodmapper());
        System.out.println(products);
        System.out.println("-------List of products----------");
        
        for (product record : products) {
           System.out.println("ID : " + record.getprod_id() );
           System.out.println("Name : " + record.getprod_name() );
           System.out.println();
        }
    	return "data fetched successfully";
    }
    
    
    @RequestMapping("/updateprod")  
    public String index4(){  
    	System.out.println("Enter the product id for updation");
        int id5 = obj.nextInt();
        System.out.println("Enter the new name for the product");
        String nm5 = obj.next();
        String sql4 = "update product set prod_name = ? where prod_id = ?";
        jdbc.update(sql4,nm5,id5);
        System.out.println("data updated");
        return"data updated Successfully";  
    }  
    
    
    
    @RequestMapping("/deleteprod")  
    public String index5(){  
    	System.out.println("Enter the product id for deletion");
   	 	int id6 = obj.nextInt();
   	 String sql5 = "delete from product where prod_id = ?";
        jdbc.update(sql5,id6);
        System.out.println("data deleted");
        return"data deleted Successfully";  
    }  
    
    
    
    
    @RequestMapping("/insert")   // --------category operations
    public String index(){
		System.out.println("-------Category-------");
		System.out.println("Enter the category id and name for insertion");
		category c1 = new category();
		int id1 = obj.nextInt();
		String nm1 = obj.next();
		String sql = "insert into category(cat_id,cat_name)values(?,?)";
        jdbc.update(sql,id1,nm1);
        System.out.println("data inserted");        
        c1.setcat_id(id1);
        c1.setcat_name(nm1);
        return "data inserted successfully";
    }
    
    
    @RequestMapping("/getcategories")
    public String cat() {
    	String SQL1 = "select * from category";
        List <category> cat = jdbc.query(SQL1, new categorymapper());
        System.out.println(cat);
        System.out.println("----------List of categories---------");
        
        for (category record : cat) {
           System.out.println("ID : " + record.getcat_id() );
           System.out.println("Name : " + record.getcat_name() );
           System.out.println();
        }
    	return "data fetched successfully";
    }
    
    
    @RequestMapping("/update")  
    public String index1(){  
    	System.out.println("Enter the category id for updation");
        int id2 = obj.nextInt();
        System.out.println("Enter the new name for the category");
        String nm2 = obj.next();
        String sql1 = "update category set cat_name = ? where cat_id = ?";
        jdbc.update(sql1,nm2,id2);
        System.out.println("data updated");
        return"data updated Successfully";  
    }  
    
    @RequestMapping("/delete")  
    public String index2(){  
    	 System.out.println("Enter the category id for deletion");
    	 int id3 = obj.nextInt();
    	 String sql2 = "delete from category where cat_id = ?";
        jdbc.update(sql2,id3);
        System.out.println("data deleted");
        return"data deleted Successfully";  
    }  
    
}
