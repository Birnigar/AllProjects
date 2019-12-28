package task_holiday;

public class CalculateGrade {
    public static void main(String[] args) {

       calculateGrade(15);
calculateGrade(115);


    }
    public static void calculateGrade(int score){
        String grade="";
        if(score<100 && score>90){
            grade ="A";
        }if ( score<89 && score>80){
            grade="B";
        }if(score<79 && score>70){
            grade="C";
        } if ( score<69 && score>60){
            grade="D";
        }if (score> 0 && score<59){
            grade="F";
        }else {
            System.out.println("Invalid Score");
        }
        System.out.println("grade = "+grade);
    }
}
