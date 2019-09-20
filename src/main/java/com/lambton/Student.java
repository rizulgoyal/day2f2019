package com.lambton;

public class Student {

    private int studentID;
    private String firstName;
    private String lastName;
    int marks1;
    int marks2;
    int marks3;
    int marks4;
    int marks5;
    int total;
    float percentage;
    String result;

    private boolean determimeResult() {


        int count = 0;
        if (marks1 < 50) {
            count++;
        }


        if (marks2 < 50) {
            count++;
        }


        if (marks3 < 50) {
            count++;
        }


        if (marks4 < 50) {
            count++;
        }


        if (marks5 < 50) {
            count++;
        }

        if (count >= 2) {
            return false;
        }
        return true;
    }


    public void calculateTotal() {
        total = marks1 + marks2 + marks3 + marks4 + marks5;

    }

    public void calculatepercentage() {
        percentage = (float)total / 5 ;

    }

    public void generateResult() {
        if (determimeResult()) {
            System.out.println("PASS");
          if(percentage<=49) {
              result="The Grade is F";

          }
          else if(percentage<=59)
              {
                  result="The Grade is D";
              }

          else if (percentage<=62)
          {
              result="The Grade is C-" ;
          }
                else
          {
              result = "The grade is A";

          }
          }



        else {
            System.out.println("FAIL");
        }
    }



    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
     public String getFullname()
     {
         return (firstName + " " + lastName);
     }
    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public int getMarks4() {
        return marks4;
    }

    public void setMarks4(int marks4) {
        this.marks4 = marks4;
    }

    public int getMarks5() {
        return marks5;
    }

    public void setMarks5(int marks5) {
        this.marks5 = marks5;
    }

    public int getTotal() {
        return total;
    }



    public float getPercentage() {
        return percentage;
    }



    public String getResult() {
        return result;
    }


}
