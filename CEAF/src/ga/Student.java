/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga;

import java.io.BufferedReader;
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
    String[] newdata;

    public Student(String data) {
        //System.out.println(data);
        try {
            newdata = ((data.split(cvsSplitBy)));
            if(!newdata.equals(null)){
                this.name = newdata[0];
                
                this.want.add(newdata[1]);
                this.want.add(newdata[2]);
                this.want.add(newdata[3]);
                
                this.notWant.add(newdata[4]);
                this.notWant.add(newdata[5]);
                this.notWant.add(newdata[6]);
                
            }else {
                throw new Exception("Erro ao criar aluno");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
