package com.lambton;

public class CollegeExample {
    public static void main(String[] args) {
        {
     Airthmetic a1= new Airthmetic();
     System.out.println("sum is " + a1.add(5,6));
            System.out.println("sum is " + a1.sub(5,6));
            System.out.println("sum is " + a1.mul(5,6));
            System.out.println("sum is " + a1.div(20,3));
            System.out.println("sum is " + a1.mod(20,3));

            Student s1 = new Student();
            s1.setStudentID(1);
            s1.setFirstName("Rizul");
            s1.setLastName("Goyal");
            s1.setMarks1(30);
            s1.setMarks2(40);
            s1.setMarks3(40);
            s1.setMarks4(75);
            s1.setMarks5(85);

            System.out.println(s1.getStudentID());
            System.out.println(s1.getFirstName());
            System.out.println(s1.getLastName());
            System.out.println(s1.getFullname());
              System.out.println(s1.getMarks1());
            System.out.println(s1.getMarks2());
            System.out.println(s1.getMarks3());
            System.out.println(s1.getMarks4());
            System.out.println(s1.getMarks5());
            s1.calculateTotal();
                s1.calculatepercentage();

            s1.generateResult();
                System.out.println("Total marks are " + s1.total);
                System.out.println("Total Percentage is " + s1.percentage);
                System.out.println(s1.result);




        }
    }
}
