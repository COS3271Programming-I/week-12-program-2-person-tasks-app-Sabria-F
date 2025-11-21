import java.util.Scanner;

class Person{

    //Initiate a scanner called userinput.
    static Scanner userinput = new Scanner(System.in);

    //Define the person attributes.
    String firstName;
    String lastName;
    String gender;
    int age;
    Double weight;
    Double height;
    String ethnicGroup;
    String religion;

    //Create a method so a person object can say a greeting.
    public void sayGreeting(){

        //Formatting.
        System.out.println("\n");

        //Display the greeting.
        System.out.println("Hello! My name is " + firstName + ".");

        //Formatting.
        System.out.println("\n");

    }

    //Create a method to take a nap.
    public void takeNap() throws InterruptedException {

        //Ask the user how long they want the nap to be.
        System.out.print("For how many seconds do you want me to be napping --> ");
        Double duration = userinput.nextDouble();
        userinput.nextLine(); 

        //Formatting.
        System.out.println("\n");

        //Let the user know the nap is starting.
        System.out.println("See you in " + duration + " seconds...zzzz");

        //Pause the program for the number of seconds the user specified.
        Thread.sleep((long)(duration*1000));

        //Tell the user the nap ended.
        System.out.println("Ok, I'm up and awake.");

        //Formatting.
        System.out.println("\n");

    }

    //Create a method to say a prayer.
    public void sayPrayer(){

        //Prompt the user for the prayer.
        System.out.print("Enter the prayer you want me to say --> ");
        String prayer = userinput.nextLine();

        //Formatting.
        System.out.println("\n");

        //Display the prayer.
        System.out.println(prayer);

        //Formatting.
        System.out.println("\n");

    }

    //Create a method to eat something.
    public void eatSomething(){

        //Prompt the user for something to eat.
        System.out.print("What should I eat --> ");
        String food = userinput.nextLine();

        //Formatting.
        System.out.println("\n");

        //Tell the user the food was eaten.
        System.out.println("Mmm, " + food + " was delicious.");

        //Formatting.
        System.out.println("\n");

    }

    //Create a method to get the full name.
    public String getName(){

        //Create a string called name which contains both the first and last names.
        String name = firstName + " " + lastName;
        //Return the name to the function.
        return name;

    }

    //Create a method to reset the religion.
    public void setReligion(String userReligion){

        //Set the current object's religion to the string entered by the user.
        this.religion = userReligion;

    }

}

//Create the main class.
public class PersonTasksApp {
    static Scanner userinput = new Scanner(System.in);

    //Create the main method.
    public static void main(String[] args) throws InterruptedException {
        
        //Create a new person object.
        Person newPerson = new Person();

        //Formatting.
        System.out.println("\n");

        //Prompt the user for the person's first name.
        System.out.print("Enter the first name of the new person --> ");
        newPerson.firstName = userinput.nextLine();

        //Formatting.
        System.out.println("\n");

        //Prompt the user for the person's last name.
        System.out.print("Enter the last name of the new person --> ");
        newPerson.lastName = userinput.nextLine();

        //Formatting.
        System.out.println("\n");

        //Prompt the user for the person's gender.
        System.out.print("Enter the gender of the new person --> ");
        newPerson.gender = userinput.nextLine();

        //Formatting.
        System.out.println("\n");

        //Prompt the user for the person's age.
        System.out.print("Enter the age of the new person --> ");
        newPerson.age = userinput.nextInt();
        userinput.nextLine();

        //Formatting.
        System.out.println("\n");

        //Prompt the user for the person's weight.
        System.out.print("Enter the weight of the new person --> ");
        newPerson.weight = userinput.nextDouble();
        userinput.nextLine();

        //Formatting.
        System.out.println("\n");

        //Prompt the user for the person's height.
        System.out.print("Enter the height of the new person --> ");
        newPerson.height = userinput.nextDouble();
        userinput.nextLine();

        //Formatting.
        System.out.println("\n");

        //Prompt the user for the person's ethnic group.
        System.out.print("Enter the ethnic group of the new person --> ");
        newPerson.ethnicGroup = userinput.nextLine();

        //Formatting.
        System.out.println("\n");

        //Prompt the user for the person's religion.
        System.out.print("Enter the religion of the new person --> ");
        newPerson.religion = userinput.nextLine();

        //Formatting.
        System.out.println("\n");

        //Ask the user if they want the person to perform a task.
        System.out.print("Would you like the new person to do a task? (Enter y for yes anything else for no) --> ");
        String doTask = userinput.nextLine();

        //Formatting.
        System.out.println("\n");

        //This loop will run as long the user wants the person to keep performing tasks.
        while (doTask.equalsIgnoreCase("y")){

            //Display the list of tasks the person can perform.
            System.out.println("Here are all the activities the new person can perform:");
            System.out.println("1) Say a Greeting");
            System.out.println("2) Say a Prayer");
            System.out.println("3) Take a Nap");
            System.out.println("4) Eat Something");
            System.out.println("5) Say Their Name");
            System.out.println("6) Change Their Religion");

            //Formatting.
            System.out.println("\n");

            //Ask the user which task they want the person to perform.
            System.out.print("Enter the number for the task you want to do --> ");
            int task = userinput.nextInt();
            userinput.nextLine();

            //Formatting.
            System.out.println("\n");

            //Test if the user wants the first task.
            if (task == 1){

                //Call the sayGreeting method.
                newPerson.sayGreeting();

            }

            //Test if the user wants the second task.
            else if(task == 2){

                //Call the sayPrayer method.
                newPerson.sayPrayer();

            }

            //Test if the user wants the third task.
            else if(task == 3){

                //Call the takeNap method.
                newPerson.takeNap();
                
            }

            //Test if the user wants the fourth task.
            else if(task == 4){

                //Call the eatSomething method.
                newPerson.eatSomething();

            }

            //Test if the user wants the fifth task.
            else if(task == 5){

                //Get the person's full name.
                String name = newPerson.getName();

                //Display the name.
                System.out.println("My name is " + name + ".");

            }

            //Test if the user wants the sixth method.
            else if(task == 6){

                //Prompt the user for the new religion.
                System.out.print("Enter the new religion --> ");
                String newReligion = userinput.nextLine();

                //Call the setReligion method and pass in the value entered by the user.
                newPerson.setReligion(newReligion);

                //Display the new religion.
                System.out.println(newPerson.firstName + "'s religion is now " + newPerson.religion + ".");

            }

            //Test if the user entered anything else.
            else{

                //Tell the user what values they can enter.
                System.out.println("You must enter an integer between 1 and 6.");
            }

            //Formatting.
            System.out.println("\n");

            //Ask the user if they want the person to perform another task.
            System.out.print("Would you like the person to do anther task? (Enter y for yes anything else for no) --> ");
            doTask = userinput.nextLine();

            //Formatting.
            System.out.println("\n");

        }

        //Tell the user the program is ending.
        System.out.println("The program is ending...");

        //Formatting.
        System.out.println("\n");

        //Close the scanner.
        userinput.close();
    }

}
