/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class World {

    private static World singleton;

    public static synchronized World getInstance() {
        if (singleton == null) {
            singleton = new World();
        }
        return singleton;
    }

    List students = new ArrayList<Student>();
    List industries = new ArrayList<Industry>();

    void loadStudents() {

    }

    void loadIndusries() {

    }

    public ArrayList load(String name) {
        String csvFile = "";
        if (name.equals("students")) {
            csvFile = "../info/alunos.csv";
        } else if (name.equals("industries")) {
            csvFile = "../info/empresas.csv";
        } else {
            System.out.println("Arquivo não encontrado");
        }

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";// use comma as separator

        try {
            String [] data;
            br = new BufferedReader(new FileReader(csvFile));
            if (name.equals("students")) {
                while ((line = br.readLine()) != null) {
                    data = ((line.split(cvsSplitBy))); //it takes the full line each iteration
                    Student s = new Student(data[0]);
                    students.add(s);
                }
            } else if(name.equals("industries")){
                while ((line = br.readLine()) != null) {
                    data = ((line.split(cvsSplitBy))); //it takes the full line each iteration
                    Industry i = new Industry(data[0]);
                    industries.add(i);
                }
            } else{
                throw new IOException("Erro ao definir o dado requerido");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public String toString(ArrayList data) {
        for (Object s : data) {
            System.out.println(s);
        }
        return null;
    }
}
