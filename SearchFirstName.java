
package javafxapplication13;

import java.util.ArrayList;
import java.util.List;


public class SearchFirstName  extends Search {

    @Override
    public ArrayList sreachMethod(Employee[] emp, String item) {
      ArrayList<Employee> items = new ArrayList<>();
      int i=0;
      
       for(Employee e: emp){
          if (e.firstN.equalsIgnoreCase(item)) {
          items.add(i,e);
          i++;
          }
       }
       return items;    }
    
}
