package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Startup {

    public static void main(String[] args) {
        Employee e1 = new Employee("Jones", "Bob", "333-33-3333");
        Employee e2 = new Employee("Smith", "Dan", "444-44-4444");
        Employee e3 = new Employee("Field", "Sally", "333-33-3333");
        
        Set<Employee> set = new HashSet<Employee>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        
//        for (Employee e : set) {
//            System.out.println(e.getFirstName());
//        }
//        
//        List<Employee> list = new ArrayList<Employee>(set);
//        
//        for(Employee e : list) {
//            System.out.println(e.getFirstName());
//        }
        
        
        Address a1 = new Address("1234 Street", "Milwaukee", "Wisconsin", 55555);
        Address a2 = new Address("0234 Street", "Milwaukee", "Wisconsin", 55555);
        Address a3 = new Address("9234 Street", "Milwaukee", "Wisconsin", 55555);
        Address a4 = new Address("1234 Street", "Milwaukee", "Wisconsin", 55555);
        
        Set set2 = new HashSet();
        set2.add(a1);
        set2.add(a2);
        set2.add(a3);
        set2.add(a4);
        
        for(Object address : set2) {
            System.out.println(address);
        }
        
//        System.out.println(a1);
//        System.out.println(a2);
        
        System.out.println("");
        
        if (a1.equals(a4)) {
            System.out.println("The addresses are equal");
        } else {
            System.out.println("The addresses are NOT equal");
        }
    }
}
