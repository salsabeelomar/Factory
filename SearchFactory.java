/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication13;

/**
 *
 * @author HP
 */
public class SearchFactory {

    public static Search CreateSearch(String typeOfSearch){
       if(typeOfSearch.equalsIgnoreCase("id")){
       return new  SearchID ();
       }
       else if(typeOfSearch.equalsIgnoreCase("job")){
       return new  SreachJobTitle ();
    }  else if(typeOfSearch.equalsIgnoreCase("First Name")){
       return new  SearchFirstName   ();
    }
    else if(typeOfSearch.equalsIgnoreCase("Last Name")){
       return new  SearchLastName   ();
    }else{
        return null;
    }}
       
            
    
}
