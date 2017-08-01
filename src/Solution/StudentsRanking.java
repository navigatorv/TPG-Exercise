package Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentsRanking {
	public static void main(String args[]) {

		ArrayList<Student> a = new ArrayList<Student>(); 
		a.add(new Student(33,"Tina",3.68));
		a.add(new Student(85,"Loius",3.85)); 
		a.add(new Student(56,"Samil",3.75));  
		a.add(new Student(996,"Aemml",3.75)); 
		a.add(new Student(55,"Samil",3.75));  
		a.add(new Student(996,"WEml",3.75)); 
		
		System.out.println("Sorting by GPA > Name > ID...");  
		Collections.sort(a,new GPAComparator());  
		for(Student s: a){  
		System.out.println(s.ID+" "+s.name+" "+s.GPA);  
		}  
	}
	
}

/**
 * This method compares the the fields of student according to a priority queue of GPA > Name > ID.
 */
class GPAComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
	    int flag = s1.GPA < s2.GPA ? 1 : s1.GPA == s2.GPA ? 0 : -1;
	    if (flag != 0) return flag;
	    flag = s1.name.compareTo(s2.name); 
	    if (flag != 0) return flag;
	    return s1.ID < s2.ID ? -1 : s1.ID == s2.ID ? 0 : 1;
	}
	
}

class Student {

	double GPA;
    String name;
    int ID; 

    Student(int id, String nm, double gpa) {
        ID = id;
        name = nm;
        GPA = gpa;
    }

    public String getName (){
    	return name;
    }
}