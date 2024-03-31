package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.MyProductRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductSerivce {
    @Autowired
    ProductRepository productRepository;
    MyProductRepository MYproductRepository;

    public Product SaveProduct(Product product){
        return productRepository.save(product);

    }
    public List<Product> SaveAllProduct(List<Product> products){
        return productRepository.saveAll(products);

    }
    public List<Product> getProducts(){
        return productRepository.findAll();

    }
    public Product getproductbycodeIsbn(Product product){
        return productRepository.findAll().stream().filter(t->t.getCodeISBN()==product.getCodeISBN()).findFirst().orElse(null);

    }
    public List<String> getAllMatiere(){
        return productRepository.findAll().stream().map(t->t.getMatiere()).distinct().collect(Collectors.toList());

    }
    public List<String> getAllTEtabblissment(){
        return productRepository.findAll().stream().map(t->t.getEtablissement()).distinct().collect(Collectors.toList());

    }
    public List<Integer> getAllCodeISBN(){
        return productRepository.findAll().stream().map(t->t.getCodeISBN()).distinct().collect(Collectors.toList());

    }
/* 
    public List<String> gatAllNames(){
        return getProducts().stream().map(t->t.getName()).distinct().collect(Collectors.toList());

    }*/

    public List<Integer> getProductByMatiere(String matiere) {
        return productRepository.findAll()
                .stream()
                .filter(product -> product.getMatiere().equals(matiere))
                .map(Product::getCodeISBN).distinct()
                .collect(Collectors.toList());
    }
    public List<String> getMatiereFromCode(int code) {
        return productRepository.findAll()
                .stream()
                .filter(product -> product.getCodeISBN()==code)
                .map(Product::getMatiere).distinct()
                .collect(Collectors.toList());
    }/* 
    public List<String> getNomBYcodeAndSubject(int code,String matiere) {
        return productRepository.findAll()
                .stream()
                .filter(product -> product.getCodeISBN()==code&&product.getMatiere().equals(matiere))
                .map(Product::getName).distinct()
                .collect(Collectors.toList());
    }
    public List<String> getimageByCodeAndSubjetAndNom(int code,String matiere,String nom) {
        return productRepository.findAll()
                .stream()
                .filter(product -> product.getCodeISBN()==code&&product.getMatiere().equals(matiere)&&product.getName().equals(nom))
                .map(Product::getImg).distinct()
                .collect(Collectors.toList());
    }
    public List<String> getlevel(int code,String matiere,String nom) {
        return productRepository.findAll()
                .stream()
                .filter(product -> product.getCodeISBN()==code&&product.getMatiere().equals(matiere)&&product.getName().equals(nom))
                .map(Product::getNiveau).distinct()
                .collect(Collectors.toList());
    }
    public List<String> getImgBycode(int code) {
        return productRepository.findAll()
                .stream()
                .filter(product -> product.getCodeISBN()==code)
                .map(Product::getImg)
                .collect(Collectors.toList());
    }*/
    public  List<String> getAllimage(){
        return getProducts().stream().map(product -> product.getImg()).distinct().collect(Collectors.toList());
    }

    public Product getProductBYISBN(int isbn){
        return productRepository.findById(isbn).orElse(null);

    }

    public String deletProduct(int id){
        productRepository.deleteById(id);
        return  "product "+id+"removed";
    }

    public Product Update(Product product){

        Product  productExicting=productRepository.findById(product.getCodeISBN()).orElse(null);
        productExicting.setEtablissement(product.getEtablissement());
        productExicting.setNiveau(product.getNiveau());
        productExicting.setMatiere(product.getMatiere());
        productExicting.setAneeEdition(product.getAneeEdition());
        productExicting.setPrixneuf(product.getPrixneuf());
        productExicting.setPreviousYear(product.isPreviousYear());
        productExicting.setNextyear(product.isNextyear());




        productExicting.setImg(product.getImg());
        productExicting = productRepository.save(productExicting);
        return  productExicting;

    }


}