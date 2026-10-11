class Student{
    int m1,m2,m3;
    Student(int m1,int m2,int m3){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    int average(){
        int avg=(m1+m2+m3)/3;
        return avg;
    }
    String grade(){
        int avg=(m1+m2+m3)/3;
        if(avg>90){
            return "O";
        }
        if(avg>70&&avg<=90){
            return "A";
        }
        if(avg>40 &&avg<=70){
            return "B";
        }else{
             return "F";
        }
    }
    String result(){
        int avg=(m1+m2+m3)/3;
        if(avg>70){
            return "Pass";
        }
        else{
            return "Fail";
        }
    }
}



public class grade {
    public static void main(String[] args) {
        Student s1=new Student(80,65,70);
        System.out.println(s1.average());
        System.out.println(s1.grade());
        System.out.println(s1.result());
    }
}
