import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Game();
    }


    public static void Game()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("The game is about to start... \n Booting Up....");
        try{
            Wait(500);
            System.out.println("...");
            Wait(500);
            System.out.println("...");
            Wait(500);
            System.out.println("...");
            Wait(500);
            System.out.println("Ready");

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Hello there! What is your name?");

        String name = scan.nextLine();

        System.out.println("Hi, " + name + "--- Welcome to The Mars Adventure Game.\n" +
                "Yesterday, you received a call from your good friend at NASA.\n" +
                "They need someone to go to Mars this weekend, and you've been chosen.");

        System.out.println("Are you excited? Type Y or N");
        String response = scan.nextLine().toUpperCase();

        if(response.equals("Y"))
            print("I knew you'd say that. It's so cool that you're going to Mars!");
        else
            print("I know you must be nervous! You're going to do great!");

        print("It's time to pack for your trip to Mars. \n" +
                "How many suitcases do you plan to bring?");
        int responseInt = scan.nextInt();

        if(responseInt > 2)
            print("That's way too many. You'll have to pack more lightly.\n" +
                    "Please try to fit your stuff into 2 suitcases.");
        else
            print("That's great! You'll need to travel light.");

        print("You're allowed to bring one companion animal with you.\n" +
                "What kind of companion animal would you like to bring?");

        String animalType = scan.nextLine();

        print("What is your companion's name?");

        String animalName = scan.nextLine();

        print("Cool, So you're bringing" + animalName + "the " + animalType);
        print("""
                NASA has a interior design team offering to outfit your space ship.
                You have a couple of options for the interior decor of your ship.
                
                
                Your options are:
                 A  Sleek, modern minimalism
                 B  Retro/vintage space age
                 C  SF Hippie chic
                Which decor would you like? Choose A, B, or C.""");
        response = scan.nextLine().toUpperCase();

        String ship;

        if(response.equals("A"))
            ship = "Sleek, ship";
        else if(response.equals("B"))
            ship = "Retro ship";
        else if(response.equals("C"))
            ship = "Hippie ship";

        print("I can see it now:\n" +
                name + " and " + animalName + " surfing the celestial abyss ...\n" +
                "in a " + response +".\n" +
                "Rubber duck -- the day is here!\n" +
                "You crawl into the spaceship with Buster\n" +
                "Brace for take off!");
        int countdown = 5;
        while(countdown > 0)
        {
            print(countdown + " ...");
            wait(1000);
            countdown--;
        }

        print("* LIFTOFF *");
    }

    public static void Wait(int mils)
    {
        try
        {
            Thread.sleep(mils);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
    public static void print(String sent)
    {
        System.out.println(sent);
    }
}
