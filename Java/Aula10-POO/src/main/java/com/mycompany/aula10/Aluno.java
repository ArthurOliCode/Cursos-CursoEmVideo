/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula10;

/**
 *
 * @author arthu_uhkw4r8
 */
public class Aluno extends Pessoa{
    private int matr;
    private String curso;
    
    public void cancelarMatr(){
        if(!getCurso().equals("-None-")){
            System.out.println("\n\t\tSua matrícula foi cancelada");
            setMatr(0);
            setCurso("-None-");
        }else{
            System.out.println("\n\n\t\tNão é possível cancelar matrícula. ");
        }
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
     
}
