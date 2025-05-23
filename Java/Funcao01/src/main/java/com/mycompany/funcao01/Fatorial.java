/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcao01;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Fatorial {
        private int num = 0;
        private int fat = 0;
        private String formula = " ";
        
        public void setValor(int n){
            num = n;
            String s = " ";
            int f = 1;
            for(int c=n; c > 1; c--){
                f *= c;
                s += c + " X ";
            }
            s += "1 = ";
            fat = f;
            formula = s;
        }
        
        public int getFatorial(){
            return fat;
        }
        
        public String getFormula(){
            return formula;
        }
}
