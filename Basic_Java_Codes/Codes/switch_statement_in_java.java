public class switch_statement_in_java {

    public static void main(String[] args) {
        // Example of a switch statement in Java

        // Declare and initialize a variable
        int dayOfWeek = 3; // Assume 1 is Monday, 2 is Tuesday, ..., 7 is Sunday

        // Switch statement to check the day of the week
        switch (dayOfWeek) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7,8://can give multiple values
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Invalid day of the week");
                break;
        }
        
    }
}
