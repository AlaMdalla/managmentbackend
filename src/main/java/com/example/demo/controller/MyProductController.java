package com.example.demo.controller;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductSerivce;
import com.example.demo.entity.MyProduct;
import com.example.demo.service.MyProductSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyProductController {
    @Autowired

    private MyProductSerivce myproductSerivce;

    @CrossOrigin("http://localhost:4200")
    @PostMapping("/addMyProduct")
    public MyProduct addProdcut(@RequestBody MyProduct product){
        return myproductSerivce.SavemyProduct(product);
    }
    @CrossOrigin("http://localhost:4200")



    @GetMapping("/showAllmyProduct")
    public List<MyProduct> ShowAll(){
            return myproductSerivce.getProducts();
    }
  /*  @CrossOrigin("http://localhost:4200")
    @DeleteMapping("/deleteMyProduct/{id}")
    public String delete(@PathVariable int id){
        return myproductSerivce.deletProduct(id);
    }*/
}
