import java.util.Scanner;

class Mark{
    public static void main(String[] args) {
        int marks;
        System.out.print("Enter the marks out of 100:");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        if(marks==100){
            System.out.println("You get Distinction");
        }
        else{
            switch(marks/10){
                case 0:
                case 1:
                case 2:
                case 3:System.out.println("You are Fail");
                break;
                case 4:System.out.println("You get Pass class");
                break;
                case 5:System.out.println("You get Second class");
                break;
                case 6:System.out.println("You get First class");
                break;
                case 7:
                case 8:
                case 9:System.out.println("You get Distinction");
                break;
                default:System.out.println("Invalid marks");

            }
        }
        
    }
}