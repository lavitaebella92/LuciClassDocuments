package day36_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IteratingAMap {
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<>();
        
        map.put("Carlos", "cohort13");
        map.put("Juret", "cohort13");
        map.put("Risa", "cohort9");
        map.put("petro", "cohort8");
        map.put("Nadia", "cohort7");
        
        for(Map.Entry<String, String> variable : map.entrySet()) {
            System.out.println("Key:"+variable.getKey());
            System.out.println("Value:"+variable.getValue());
        }
        
        
        
        Map<String, String> row1 = new HashMap<>();
        row1.put("DEPARTMENT_ID", "10");
        row1.put("DEPARTMENT_NAME", "Administration");
        row1.put("MANAGER_ID", "200");
        row1.put("LOCATION_ID", "1700");
        
        System.out.println(row1.get("DEPARTMENT_NAME"));
        
        System.out.println(row1.get("LOCATION_ID"));
        
        
        //20    Marketing    201    1800
        
        Map<String, String> row2 = new HashMap<>();
        row2.put("DEPARTMENT_ID", "20");
        row2.put("DEPARTMENT_NAME", "Marketing");
        row2.put("MANAGER_ID", "201");
        row2.put("LOCATION_ID", "1800");
        
        
        //90    Executive    100    1700
        
        Map<String, String> row3 = new HashMap<>();
        row3.put("DEPARTMENT_ID", "90");
        row3.put("DEPARTMENT_NAME", "Executive");
        row3.put("MANAGER_ID", "100");
        row3.put("LOCATION_ID", "1700");
        
        System.out.println("------------------------------------");
        for (Map.Entry<String, String> row : row3.entrySet()) {
            System.out.println(row.getKey());
            System.out.println(row.getValue());
        }
        
        
        // list of map
        
        List<String > names = new ArrayList<>();
        
        List<Map<String, String> > departmentList = new ArrayList<>();
        
        departmentList.add(row1);
        departmentList.add(row2);
        departmentList.add(row3);
        
//        System.out.println("------------------------------------");
//        for (int i = 0 ; i < departmentList.size() ; i++) {
//            System.out.println(departmentList.get(i));
//        }
        
        
//        System.out.println("------------------------------------");
//        for (int i = 0 ; i < departmentList.size() ; i++) {
//            System.out.println(departmentList.get(i));
//            
//            for (Map.Entry<String, String> r : departmentList.get(i).entrySet()) {
//                System.out.println("Key:"+r.getKey() +", value:"+ r.getValue());
//                
//            }
//            System.out.println("*********************");
//        }
//        
        System.out.println("------------------------------------");
        for (int i = 0 ; i < departmentList.size() ; i++) {
            System.out.println(departmentList.get(i));
            
            for (Map.Entry<String, String> r : departmentList.get(i).entrySet()) {
                // print if the location_id = 1700
                
//                if (r.getKey().equals("LOCATION_ID")  && r.getValue().equals("1700")) {
//                    System.out.println("Key:"+r.getKey() +", value:"+ r.getValue());
//                    
//                }
                
                if ( r.getValue().equals("1700")) {
                    System.out.println("Key:"+r.getKey() +", value:"+ r.getValue());
                    
                }
                
            }
            System.out.println("*********************");
        }
        
        
    }
}