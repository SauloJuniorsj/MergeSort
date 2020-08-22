/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulojr.linkedlist;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author Saulo Jr
 */
public class Pessoa {
   private String nome;
   private long RG;
   private Date data;
    
   Pessoa(){
       
   }
    Pessoa(String nome, long RG, Date data){
        this.nome = nome;
        this.RG = RG;
        this.data = data;
    }
   
    public static String random_name(){
       int leftLimit = 97; 
       int rightLimit = 122; 
       int targetStringLength = 10;
       Random random = new Random();
        String generatedString = "";
       for(int x=1; x<=1; x++) {
           StringBuilder buffer = new StringBuilder(targetStringLength);
       for (int i = 0; i < targetStringLength; i++) {
           int randomLimitedInt = leftLimit + random.nextInt(rightLimit - leftLimit + 1);
           buffer.append((char) randomLimitedInt);
       }
       generatedString = buffer.toString();
       
       }
            return generatedString;
    }
    

  public static LocalDate random_data(){
        
          Random random = new Random();
            int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
            int maxDay = (int) LocalDate.of(2015, 1, 1).toEpochDay();
            long randomDay = minDay + random.nextInt(maxDay - minDay);

            LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);

            return randomBirthDate;

        }
  
    public static String random_RG() {
   
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        return String.format("%06d", number);
    }

    public String getNome() {
        return nome;
    }

    public long getRG() {
        return RG;
    }

    public Date getData() {
        return data;
    }

}
