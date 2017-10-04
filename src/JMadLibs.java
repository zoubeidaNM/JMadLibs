
    import java.util.Scanner;


    public class JMadLibs {
        public static void main(String args[]) {

            Scanner keyboard = new Scanner(System.in);

            //Variable with default values

            String name1 = "Amy";
            String adjective1 = "great";
            String location = "Montgomery County";
            int time1 = 9;
            int time2 = 5;
            int duration = 8;
            String adjective2 = "exited";
            int numHwk = 10;
            int numWeeks = 2;
            String adjective3 = "funny";
            String adjective4 = "energetic";
            String adjective5 = "energetic";
            String verb = "code";
            String feeling = "empowred";


            // get the variable from the user
            System.out.println("Enter a name: ");
            name1 = keyboard.next();
            keyboard.nextLine();
            System.out.println("Enter an adjective: ");
            adjective1 = keyboard.next();
            keyboard.nextLine();
            System.out.println("Enter a location: ");
            location = keyboard.next();
            keyboard.nextLine();
            System.out.println("Enter a number1 between 0 and 12: ");
            time1 = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter a number2 between 0 and 24 larger then number1: ");
            time2 = keyboard.nextInt();
            keyboard.nextLine();
            duration = time2-time1;
            System.out.println("Enter an adjective: ");
            adjective2 = keyboard.next();
            keyboard.nextLine();
            System.out.println("Enter a number: ");
            numHwk = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter a number: ");
            numWeeks = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Enter an adjective: ");
            adjective3 = keyboard.next();
            keyboard.nextLine();
            System.out.println("Enter an adjective: ");
            adjective4 = keyboard.next();
            keyboard.nextLine();
            System.out.println("Enter an adjective: ");
            adjective5 = keyboard.next();
            keyboard.nextLine();
            System.out.println("Enter a verb: ");
            verb = keyboard.next();
            keyboard.nextLine();
            System.out.println("Enter a feeling: ");
            feeling = keyboard.next();
            keyboard.nextLine();



            System.out.println("\n\nMy bootcamp experience: \n");
            System.out.print("My friend, "+ name1 + ", told me about this " +
                    adjective1 + " bootcamp at " + location + ". ");
            System.out.println("It begins at "+ time1 + " oclock and ends at " + time2 + " oclock. ");
            System.out.println("I can’t believe I will be coding for " + duration +
                    " hours every week!!! I am super " + adjective2+ "! So far I have finished " + numHwk + " programming assignments. ");
            System.out.println("But I still have a long way to go because the bootcamp is " + numWeeks + " weeks long. My teacher is very " +
                    adjective3 + ". ");
            System.out.println("My " + adjective4+ " classmates love the " + adjective5 + " class atmosphere. They "+ verb+
                    " all day long! I, on the other hand, feel "+ feeling + ".");
            System.out.println("I hope to become a java web app developer very shortly!");

        }
    }

