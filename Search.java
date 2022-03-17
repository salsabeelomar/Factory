/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication13;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.ObservableArrayBase;

/**
 *
 * @author HP
 */
public abstract class Search {
    public String[] items;
    
    public abstract ArrayList sreachMethod(Employee[] emp , String item);
    
}
