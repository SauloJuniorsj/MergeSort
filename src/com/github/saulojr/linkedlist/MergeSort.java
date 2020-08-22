/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulojr.linkedlist;

import java.util.LinkedList;

/**
 *
 * @author Saulo Jr
 */
public class MergeSort {

    static public LinkedList merge(LinkedList<Pessoa> arr1, LinkedList<Pessoa> arr2) {
        LinkedList<Pessoa> arr3 = new LinkedList<>();

        while (!arr1.isEmpty() && !arr2.isEmpty()) {
            if (arr1.getFirst().getRG() > arr2.getFirst().getRG()) {
                arr3.addLast(arr2.pop());
            } else {
                arr3.addLast(arr1.pop());
            }
        }
        while (!arr1.isEmpty()) {
            arr3.addLast(arr1.pop());
        }
        while (!arr2.isEmpty()) {
            arr3.addLast(arr2.pop());
        }

        return arr3;
    }

    static public LinkedList sort(LinkedList<Pessoa> arr) {
        LinkedList<Pessoa> T1 = new LinkedList<>();
        LinkedList<Pessoa> T2 = new LinkedList<>();

        if (arr.size() == 1) {
            return arr;
        }
            int Esquerda = arr.size() / 2;
            T1.addAll(arr.subList(0, Esquerda));

            int Direita = arr.size();
            T2.addAll(arr.subList(Esquerda, Direita));

            T1 = sort(T1);
            T2 = sort(T2);

           return merge(T1, T2);
    }

    static public void printar(LinkedList<Pessoa> Grupo) {
        for (Pessoa i : Grupo) {
            System.out.println(i.getNome() + ", " + i.getRG() + ", " + i.getData());
        }
    }
}
