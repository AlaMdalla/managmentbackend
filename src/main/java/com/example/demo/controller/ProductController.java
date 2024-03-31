package com.example.demo.controller;

import com.example.demo.entity.MyProduct;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductSerivce productSerivce;
    @CrossOrigin("http://localhost:4200")
    @PostMapping("/addProduct")
    public Product addProdcut(@RequestBody Product product){

        return productSerivce.SaveProduct(product);
    }
    @PostMapping("/addProducts")
    public  List<Product> addProdcuts(@RequestBody List<Product> products){
        return productSerivce.SaveAllProduct(products);

    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/showAllProduct")
    public List<Product> ShowAll(){
        return productSerivce.getProducts();
    }
    @CrossOrigin("http://localhost:4200")

   @GetMapping("/getProductById/{codeISBN}")
    public Product getProductBYISBN(@PathVariable int codeISBN){
        return productSerivce.getProductBYISBN(codeISBN);
    }

    @CrossOrigin("http://localhost:4200")
    @PutMapping("/update")
    public Product update(@RequestBody Product product){
        return productSerivce.Update(product);
    }

    @CrossOrigin("http://localhost:4200")
    @DeleteMapping("/delete/{id}")
 public String delete(@PathVariable int id){
        return productSerivce.deletProduct(id);
    }
    @GetMapping("/getCodeByMatiere/{matiere}")
    @CrossOrigin("http://localhost:4200")
    public List<Integer> getProductByMatiere(@PathVariable String matiere){
        return productSerivce.getProductByMatiere(matiere);
    }
    @GetMapping("/getmatierusingcode/{codeISBN}")
    @CrossOrigin("http://localhost:4200")
    public List<String> getMatiereFromCodeISBN(@PathVariable int codeISBN){
        return productSerivce.getMatiereFromCode(codeISBN);
    }/*
    @GetMapping("/getNomusingCodeAndSubject/{codeISBN},{matiere}")
    @CrossOrigin("http://localhost:4200")

    public List<String> getMatiereFromCodeISBN(@PathVariable int codeISBN,@PathVariable String matiere){
        return productSerivce.getNomBYcodeAndSubject(codeISBN,matiere);
    }
    @GetMapping("/getImgUsingCodeAndSubjectAndNom/{codeISBN},{matiere},{name}")
    @CrossOrigin("http://localhost:4200")
    public List<String> getMatiereFromCodeISBN(@PathVariable int codeISBN,@PathVariable String matiere,@PathVariable String name){
        return productSerivce.getimageByCodeAndSubjetAndNom(codeISBN,matiere,name);
    }
    @GetMapping("/getlvlUsingCodeAndSubjectAndNom/{codeISBN},{matiere},{name}")
    @CrossOrigin("http://localhost:4200")
    public List<String> getNiveau(@PathVariable int codeISBN,@PathVariable String matiere,@PathVariable String name){
        return productSerivce.getlevel( codeISBN,matiere,name);
    }
        @GetMapping("/getAllMatiers")
    @CrossOrigin("http://localhost:4200")
    public List<String> getProductByMatiere(){
        return productSerivce.getAllMatiere();
    }
    @GetMapping("/getAllNames")
    @CrossOrigin("http://localhost:4200")
    public List<String> getPrductNames(){
        return productSerivce.gatAllNames();
    }
    @GetMapping("/getAllImg")
    @CrossOrigin("http://localhost:4200")
    public List<String> getProductImages(){
        return productSerivce.getAllimage();
    }*/
    @GetMapping("/getAllCodeISBN")
    @CrossOrigin("http://localhost:4200")
    public List<Integer> getAllCodeISBN(){
        return productSerivce.getAllCodeISBN();
    }

}
