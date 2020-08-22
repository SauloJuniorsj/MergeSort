/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulojr.linkedlist;

import java.time.ZoneId;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Saulo Jr
 */
public class ComGithubSauloJrLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<Pessoa> Grupo = new LinkedList<>();
        for(int i = 0; i < 100; i++){
        Grupo.add(new Pessoa(Pessoa.random_name(), Long.parseLong(Pessoa.random_RG()), Date.from(Pessoa.random_data().atStartOfDay(ZoneId.systemDefault()).toInstant())));
        }
        
        for(Pessoa i : Grupo){
            System.out.println(i.getNome() + ", " + i.getRG() + ", " + i.getData());
        }
    }
    
}
