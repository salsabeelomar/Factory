/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class SreachJobTitle extends Search {

    @Override
    public ArrayList sreachMethod(Employee[] emp, String item) {
        ArrayList<Employee> items = new ArrayList<>();
        int i = 0;

        for (Employee e : emp) {
            if (e.jobTitle.equalsIgnoreCase(item)) {

                items.add(i, e);
                i++;
            }
        }
        return items;
    }

}
