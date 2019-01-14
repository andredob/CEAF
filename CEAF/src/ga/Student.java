/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class Student {

    List want = new ArrayList<>();
    List notWant = new ArrayList<>();
    String name;
    String course;
    
    String cvsSplitBy = ";";// use semicolon as separator
    String[] newData;

    public Student(String data) {
        //System.out.println(data);
        try {
            newData = ((data.split(cvsSplitBy)));
            if(!newData.equals(null)){
                this.name = newData[0];
                
                this.want.add(newData[1]);
                this.want.add(newData[2]);
                this.want.add(newData[3]);
                
                this.notWant.add(newData[4]);
                this.notWant.add(newData[5]);
                this.notWant.add(newData[6]);
                
            }else {
                throw new Exception("Erro ao criar aluno");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public String toString(){
        return "Nome: " + this.name + "\n" +
               "Quer 1: " + this.want.get(0) + "\n" +
               "Quer 2: " + this.want.get(1) + "\n" +
               "Quer 3: " + this.want.get(2) + "\n" +
               "Não quer 1: " + this.notWant.get(0) + "\n" +
               "Não quer 2: " + this.notWant.get(1) + "\n" +
               "Não quer 3: " + this.notWant.get(2) + "\n" ;
    }

}
