package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
 private int codeISBN;
 private String Etablissement;
 private  String Niveau;
 private  String matiere;
 private int aneeEdition;
 private float prixneuf;
 private  boolean PreviousYear;
 private  boolean nextyear;
 private  String img;
 private String commantaire;


 public int getCodeISBN() {
  return codeISBN;
 }

 public void setCodeISBN(int codeISBN) {
  this.codeISBN = codeISBN;
 }

 public String getEtablissement() {
  return Etablissement;
 }

 public void setEtablissement(String etablissement) {
  Etablissement = etablissement;
 }

 public String getNiveau() {
  return Niveau;
 }

 public void setNiveau(String niveau) {
  Niveau = niveau;
 }

 public String getMatiere() {
  return matiere;
 }

 public void setMatiere(String matiere) {
  this.matiere = matiere;
 }

 public int getAneeEdition() {
  return aneeEdition;
 }

 public void setAneeEdition(int aneeEdition) {
  this.aneeEdition = aneeEdition;
 }

 public float getPrixneuf() {
  return prixneuf;
 }

 public void setPrixneuf(float prixneuf) {
  this.prixneuf = prixneuf;
 }

 public boolean isPreviousYear() {
  return PreviousYear;
 }

 public void setPreviousYear(boolean previousYear) {
  PreviousYear = previousYear;
 }

 public boolean isNextyear() {
  return nextyear;
 }

 public void setNextyear(boolean nextyear) {
  this.nextyear = nextyear;
 }

 public String getImg() {
  return img;
 }

 public void setImg(String img) {
  this.img = img;
 }

 public String getCommantaire() {
  return commantaire;
 }

 public void setCommantaire(String commantaire) {
  this.commantaire = commantaire;
 }
}
