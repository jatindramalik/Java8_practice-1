import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Employee, Integer> map = new HashMap<>();
        map.put(new Employee(101, "jua", "it", 120000), 12);
        map.put(new Employee(102, "hua", "ml", 70000), 7);
        map.put(new Employee(103, "sua", "ac", 80000), 8);
        map.put(new Employee(104, "aua", "ds", 60000), 6);
        map.put(new Employee(105, "bua", "sb", 50000), 5);

        // List<Entry<Employee,Integer>> entries = new ArrayList<>(map.entrySet());

        // for (Entry<Employee,Integer> entry : entries) {
        // if(entry.getKey().getId()%2 == 0){
        // System.out.println(entry);
        // }
        // }

        // Iterator<Entry<Employee,Integer>> iterator = map.entrySet().iterator();

        // while(iterator.hasNext()){
        // Object emp = iterator.next();
        // System.out.println(emp);

        // }

        // map.entrySet().stream().filter(e -> e.getKey().getSalary() > 70000).forEach(System.out::println);
        // map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName)))
                // .forEach(System.out::println);

        map.entrySet().stream().map(c->c.getKey().getSalary()).mapToInt(c->c+500000).forEach(System.out::println);   
       int k = map.entrySet().stream().map(c->c.getKey().getSalary()).mapToInt(c->c).sum();   
       System.out.println(k);

    }
}
