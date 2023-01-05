package Day30_encapsulation;


import java.util.*; /// importing everything from java.util package.

public class Apple {
    public static void main(String[] args) {
        
        Employee rimer = new Employee(); // No argument constructor
        rimer.setName( "Rimer");
        rimer.setAge(25);
        rimer.setJobTitle("SDET");
        rimer.setGender( 'M');
        rimer.setEmployeeId(123456);
        rimer.setSalary(200000);
        
        System.out.println(rimer.toString());
        
        // parameterized constructor
        Employee carlito = new Employee("Carlito",25,'M',"Java Test automation engineer",123457,1850000);

        Employee kimberly = new Employee("Kimberley",25,'F',"QA Automation Engineer",123458,1650000);
        
        Employee zolboo = new Employee("Zolboo",25,'M',"QA Automation Engineer",123459,1750000);
        
        
        // Create list of employee
        ArrayList<Employee> qaTeam = new ArrayList<>();
        
        
        qaTeam.add(kimberly);
        qaTeam.add(rimer);
        qaTeam.addAll(Arrays.asList(carlito, zolboo));
        
        
        for (int i = 0 ;  i < qaTeam.size() ; i++) {
            System.out.println(qaTeam.get(i).getName());
            qaTeam.get(i).work();
            System.out.println(qaTeam.get(i).toString());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}