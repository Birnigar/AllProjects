package office_hour;

public class Practice_12_16 {
    public static void main(String[] args) {

        String[] names={"Jhon","Kevin","Scott"};
        System.out.println("First name: "+names[0]);


        for (String name : names) {
            System.out.println(name);
        }

//let's say we need to store some table
        //where we have rows and columns

        String[][] students={{"1","John","35","USA"},{"2","Kevin","40","Brazil"},{"3","Scott","20","Canada"}};

        System.out.println("How many arrays inside 2D array: "+students.length);

        System.out.println("How many values in second row(inner array : "+students[1].length);

        for (String[] arr : students) {
            for (String value : arr) {
                System.out.print( value+" ");
            }
            System.out.println();
        }


//find oldest student and print name

        //String oldestStudent=(int)students[0][2];
String oldestPersonName=students[0][1];
        int ageOfOldestperson=Integer.parseInt(students[0][2]);
        for (String[] row : students) {
            System.out.println(row[2]);
            int age=Integer.parseInt(row[2]);
            if(age>ageOfOldestperson){
                ageOfOldestperson=Integer.parseInt(row[2]);
                oldestPersonName=row[1];
            }
            
        }
        System.out.println("oldestPersonName = " + oldestPersonName);














    }
}
