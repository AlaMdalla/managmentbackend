package com.example.demo.service;

import com.example.demo.entity.MyProduct;
import com.example.demo.entity.Product;
import com.example.demo.repository.MyProductRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.entity.Product;
import com.example.demo.repository.MyProductRepository;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class MyProductSerivce {
    @Autowired
    MyProductRepository myProductRepository;

    ProductRepository productRepository;

    public MyProduct SavemyProduct(MyProduct product){
        return myProductRepository.save(product);

    }

    public List<MyProduct> SaveAllmyProduct(List<MyProduct> products){
        return myProductRepository.saveAll(products);

    }
    public List<MyProduct> getProducts(){
        return myProductRepository.findAll();

    }/*
    public List<String> getAllMatiere(){
        return productRepository.findAll().stream().map(t->t.getMatiere()).distinct().collect(Collectors.toList());

    }
    public List<Integer> getAllCodeISBN(){
        return productRepository.findAll().stream().map(t->t.getCodeISBN()).distinct().collect(Collectors.toList());

    }

    public List<String> gatAllNames(){
        return getProducts().stream().map(t->t.getName()).distinct().collect(Collectors.toList());

    }
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
    }
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
    }
    public  List<String> getAllimage(){
        return getProducts().stream().map(product -> product.getImg()).distinct().collect(Collectors.toList());
    }

    public Product getProductBYISBN(int isbn){
        return productRepository.findById(isbn).orElse(null);

    }
    public List<Product> getProductBYName(String name){
        return productRepository.findByName(name);

    }*/
   /* public String deletProduct(int id){
        myProductRepository.deleteById(id);
        return  "product "+id+"removed";
    }*/
/*
    public Product Update(Product product){

        Product  productExicting=productRepository.findById(product.getCodeISBN()).orElse(null);
        productExicting.setName(product.getName());
        productExicting.setDateEntree(product.getDateEntree());
        productExicting.setAneeEdition(product.getAneeEdition());
        productExicting.setMatiere(product.getMatiere());
        productExicting.setInstitution(product.getInstitution());
        productExicting.setNiveau(product.getNiveau());
      productExicting.setPrixAchat(product.getPrixAchat());
        productExicting.setPrixVente(product.getPrixVente());
        productExicting.setNombre(product.getNombre());

        productExicting.setImg(product.getImg());
        productExicting = productRepository.save(productExicting);
        return  productExicting;
*/
    }



