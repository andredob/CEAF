/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga;

/**
 *
 * @author andre
 */
public class Industry {

    String name;
    int vacancy;

    String cvsSplitBy = ";";// use semicolon as separator
    String[] newData;

    public Industry(String data) {
        try {
            newData = ((data.split(cvsSplitBy))); //Spliting

            if (!newData.equals(null)) {
                this.name = newData[0];
                this.vacancy = Integer.parseInt(newData[1]);
            } else {
                throw new Exception("Erro ao criar empresa");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String toString() {
        return "Nome: " + name + "\n"
                + "Vagas: " + vacancy + "\n";
    }
}
