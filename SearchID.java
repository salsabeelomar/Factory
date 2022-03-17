package javafxapplication13;

import java.util.ArrayList;

public class SearchID extends Search {

    @Override
    public ArrayList sreachMethod(Employee[] emp, String sid) {
        int id_item = Integer.parseInt(sid);
        ArrayList<Employee> ite = new ArrayList<>();
        int i = 0;
        for (Employee e : emp) {
            if (e.id == id_item) {
                ite.add(i, e);
                i++;
            }
        }
        return ite;
    }

}
