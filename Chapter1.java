// Written by J.D. Shaeffer

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Chapter1
{
    static Scanner osConsole = new Scanner(System.in); //String Scanner object
    static String x;
    static int iCount = 1;
    static int i = 0;
    static List<String> inv = new ArrayList<String>(); //inventory List
    static String sTime = "It's day.";
    static String roomInfo0 = "This is the tutorial for this text-based adventure game.\n"
    + "Whatever you wish to do, type it in, push enter, and await the consequence.\n"
    + "Use your imagination.\n"
    + "Half the challenge in the game is to identify the vocabulary used.\n"
    + "However, here are some critical examples:\n"
    + "'look' = gets you the general feel for the room/place you're currently in.\n"
    + "'examine' = this command followed by an object/thing/person will give you details on it.\n"
    + "'open' = followed by an object that you suppose could be opened will open it up.\n"
    + "'n', 's', 'e', 'w' = to go north, south, east, or west, respectively. Avoid typing 'north' or 'go north' to navigate.\n"
    + "'wait' = lets time pass. 'time' = checks to see what time it is (it'll only be day time or night time).\n"
    + "'take' = followed by an object will possibly put that thing in your pocket.\n"
    + "'i' or 'inventory' = will show you what you are currently holding in your pockets.\n"
    + "'talk to' = followed by a character will enter a dialogue sequence.\n"
    + "When given a multiple choice prompt, simply type in the letter you decide, and press enter.\n"
    + "For your ease, only lowercase commands will be recognized.";

    public static void printGenerics() //this function handles the generic commands (commands able to be used in any location)
    {
        if(x.equals("help"))
        {
            System.out.println(roomInfo0);
        }
        else if(x.equals("wait"))
        {
            System.out.println("Time passes.");
            iCount++;
        }
        else if(x.equals("time"))
        {
            System.out.println(sTime);
        }
        else if(x.equals("i")||x.equals("inventory"))
        {
            System.out.println("You have:");
            System.out.println(Arrays.toString(inv.toArray()));
        }
        else if(x.equals("quit"))
        {
            System.out.println("Thanks for playing! Better luck next time. Good day!");
            System.exit(0);
        }
        
        if((iCount % 2) != 0)
            sTime = "It's day.";
        else
            sTime = "It's night.";
    }

    public static void printElses() {
        if(i == 0) {
            System.out.println("I don't understand that.");
            i++;
        }
        else if(i == 1) {
            System.out.println("Sorry, I don't recognize that command.");
            i++;
        }
        else if(i == 2) {
            System.out.println("That is something that you cannot do.");
            i++;
        }
        else if(i == 3) {
            System.out.println("I don't know how to do that. Try a different command.");
            i++;
        }
        else if(i == 4) {
            System.out.println("That command cannot be executed, sorry.");
            i++;
        }
        else if(i == 5) {
            System.out.println("That is an unrecognizable command, my apologies.");
            i++;
        }
        else if(i == 6) {
            System.out.println("I wish I knew what you're talking about, but I don't.");
            i++;
        }
        else if(i == 7) {
            System.out.println("I didn't get that, try something else.");
            i++;
        }
        else if(i == 8) {
            System.out.println("I don't know what that is.");
            i++;
        }
        else if(i == 9) {
            System.out.println("Try a different command please.");
            i = 0;
        }
    }
    public static void main(String[] args)
    {
//////// home menu
        System.out.println("Chapter 1");
        System.out.println("\n");
        System.out.println("What's your name?");
        String name = osConsole.nextLine();
        System.out.println("\nType 'start' to begin the game.\n"
                + "Type 'quit' at any time to stop.");
        System.out.println("");
        x = osConsole.nextLine();
       
        //start sequence
        String roomInfo1 = "The sun is shining brightly through your window on the third floor of your San Fransico apartment off Noriega St and 11th Ave.\n"
                + "The year is 2023. Life is good, with just you and this comfortable place. Still in your bed, your phone starts ringing.\n"
                + "What do you wish to do?\n"
                + "Type 'help' for a tutorial.";
        
//////// item flags
        boolean startPhone = true; boolean socks = false; boolean phoneFound = false; boolean convo1 = false; boolean hat = false;
        boolean oreo = false; boolean wholeMilk = true; boolean hotDogs = true; boolean oranges = true; boolean bananas = true;
        boolean clifBars = true; boolean capriSun = true; boolean marshmellows = true; boolean demoEnd = false; boolean convo2 = true;
        boolean convo3 = true; boolean talk2guard = false; boolean talk2lobbygirl = false; boolean dateOver = false;
        boolean firstTimeBase = true; boolean vase = false; boolean thief = false; boolean platypus = false; boolean lockpick = false;
        boolean bag = false; boolean camera = false; boolean asian = false; boolean tix = false; boolean couple = false; boolean escape = false;
        boolean baseball = false; boolean basementLoop = false; boolean food = false; boolean leftovers = false; boolean diamondwatch = false; boolean date = false;
        
//////// room flags
        boolean homeMenu = true; boolean bedRoom = false; boolean livingRoom = false; boolean kitchen = false;
        boolean closet = false; boolean streetCorner = false; boolean academyOutside = false; boolean lombard = false;
        boolean academyLobby = false; boolean ggbOutside = false; boolean tiffanyOutside = false; boolean zooOutside = false;
        boolean academyHall = false; boolean basement = false; boolean academyBathroom = false; boolean zooGiraffe = false;
        boolean tiffanyInside = false; boolean zooBobcat = false; boolean zooLion = false; boolean zooBirds = false; boolean zooGorilla = false;
        boolean zooRhino = false; boolean zooLemurs = false; boolean zooHippo = false; boolean zooChimp = false; boolean zooPlatypus = false;
        boolean zooTurtles = false; boolean zooAlligator = false; boolean zooArmadillo = false; boolean attOutside = false; boolean ggb = false;
        boolean attSquare = false; boolean attShop = false; boolean attFood = false; boolean attField = false; boolean escapeRoom = false;
        
////////////////////////////////////////////////////////////////////////////////        
           
        while(true)
        {
            while(homeMenu)
            {
                if(x.equals("start"))
                {
                    homeMenu = false;
                    bedRoom = true;
                    System.out.println(roomInfo1);
                } 
                //TODO: determine checkpoint usage
                else if(x.equals("restore discover")) //this will be the place to enter in all checkpoint keywords
                {
                    homeMenu = false;
                    academyLobby = true;
                    System.out.println("Lobby.");
                }
                else if(x.equals("quit"))
                {
                    System.out.println("No? Okay. Thanks for playing a bit.");
                    System.exit(0);
                }
                else
                    printElses();
                
                System.out.println("");
                x = osConsole.nextLine(); 
            }
            
////////////////////////////////////////////////////////////////////////////////            
            
            while(bedRoom)
            {
                if(startPhone)
                {
                    if(x.equals("look"))
                    {
                        System.out.println("You're in your bedroom. Next to your bed is a desk with two drawers, one top and one bottom.\n"
                        + "There's a beautiful but amateur-looking painting that covers nearly your entire eastern wall.\n"
                        + "Your small walk in closet is west.\n"
                        + "The living room is out north.");
                        System.out.println("The phone is still ringing!!!");
                    }
                    else if(x.equals("examine desk"))
                    {
                        System.out.println("It's a simple, old thing with a lamp on top.\n"
                                + "You can open the bottom drawer or the top drawer to look inside.");
                        System.out.println("The phone is still ringing!!!");
                    }
                    else if(x.equals("open drawer")||x.equals("open drawers"))
                    {
                        System.out.println("You can open up either drawer, but please specify! 'open top drawer' or 'open bottom drawer'");
                    }
                    else if(x.equals("examine top drawer")||x.equals("examine bottom drawer"))
                    {
                        System.out.println("It's shut. You can open it if you wish!");
                        System.out.println("The phone is still ringing!!!");
                    }
                    else if(x.equals("examine drawers"))
                    {
                        System.out.println("Two drawers. One bottom, one top.");
                        System.out.println("The phone is still ringing!!!");
                    }
                    else if(x.equals("examine painting"))
                    {
                        System.out.println("It's a large landscape of a sunset of dull colors. Looks like it could be of some California beach.\n"
                                + "It fits nicely on your wall.");
                        System.out.println("The phone is still ringing!!!");
                    }
                    else if(x.equals("open bottom drawer"))
                    {
                        System.out.println("It's your sock drawer. You could try to examine them, just to see if there's anything.");
                        socks = true;
                        System.out.println("The phone is still ringing!!!");
                    }
                    else if(x.equals("examine socks")||x.equals("examine sock drawer"))
                    {
                        if(socks == true)
                        {
                            System.out.println("Yeah, there's nothing.");
                            System.out.println("The phone is still ringing!!!");
                        }
                        else
                            System.out.println("I don't understand that.");
                    }
                    else if(x.equals("open top drawer"))
                    {
                        System.out.println("There's your phone! You forget why it was in there in the first place. You can answer it if you wish.");
                        System.out.println("The phone is still ringing!!!");
                        phoneFound = true;
                    }
                    else if(x.equals("answer phone")||x.equals("answer the phone")||x.equals("go to phone")||x.equals("answer")||x.equals("examine phone")||x.equals("look for phone")||x.equals("take phone")||x.equals("pick up phone")||x.equals("find phone"))
                    {
                        if(phoneFound == true)
                        {
                            convo1 = true;
                            System.out.println("You answer it finally and you hear a frantic voice on the other side:\n"
                                    + "'Hey " + name + "!!! Come to the Academy, quick quick, now! I have made a brilliant discovery!'\n");
                            System.out.println("a) 'Who is this?'");
                            System.out.println("b) 'Ok! On my way!'");
                            System.out.println("c) 'I haven't eaten breakfast yet!'");
                        }
                        else
                        {
                            System.out.println("You're looking around for it but it's nowhere to be found!");
                            System.out.println("The phone is still ringing!!!");
                        }
                    }
                    else if(x.equals("a") & convo1 == true)
                    {
                        System.out.println("'Who is this?'");
                        System.out.println("'This is Dr. Framen, obviously! Just come quick!' *click*");
                        startPhone = false; convo1 = false;
                    }
                    else if(x.equals("b") & convo1 == true)
                    {
                        System.out.println("'Ok! On my way!'");
                        System.out.println("'Excellent my boy!!! See you soon!' *click*");
                        startPhone = false; convo1 = false;
                    }
                    else if(x.equals("c") & convo1 == true)
                    {
                        System.out.println("'I haven't eaten breakfast yet!'");
                        System.out.println("'No? Well, quick now. Eat something and hurry up!!!' *click*");
                        startPhone = false; convo1 = false;
                    }
                    else if(x.equals("examine lamp"))
                    {
                        System.out.println("Shiny and blue.");
                    }
                    else if(x.equals("n") || x.equals("w"))
                    {
                        System.out.println("You shouldn't go until you answer that call.");
                        System.out.println("The phone is still ringing!!!");
                    }
                    else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                        printGenerics();
                    else {
                        printElses();
                        System.out.println("The phone is still ringing!!!");
                    }

                    System.out.println("");
                    x = osConsole.nextLine();
                }
                else if(startPhone == false)
                {
                    if(x.equals("look"))
                    {
                        System.out.println("You're in your bedroom. Next to your bed is a desk with two drawers, one top and one bottom.\n"
                        + "There's a beautiful but amateur-looking painting that covers nearly your entire eastern wall.\n"
                        + "Your small walk in closet is west.\n"
                        + "The living room is out north.");
                    }
                    else if(x.equals("examine desk"))
                    {
                        System.out.println("It's a simple, old thing with a lamp on top.\n"
                                + "You can 'open bottom drawer' or 'open top drawer' to look inside.");
                    }
                    else if(x.equals("examine painting"))
                    {
                        System.out.println("It's a large landscape of a sunset of dull colors. Looks like it could be of some California beach.\n"
                                + "It fits nicely on your wall.");
                    }
                    else if(x.equals("examine lamp"))
                    {
                        System.out.println("Shiny and blue.");
                    }
                    else if(x.equals("open drawer")||x.equals("open drawers"))
                    {
                        System.out.println("You can open up either drawer, but please specify. 'open top drawer' or 'open bottom drawer'");
                    }
                    else if(x.equals("examine top drawer")||x.equals("examine bottom drawer"))
                    {
                        System.out.println("It's shut. You can open it if you wish!");
                    }
                    else if(x.equals("open bottom drawer"))
                    {
                        System.out.println("It's your sock drawer. You could try to examine them, just to see if there's anything.");
                    }
                    else if(x.equals("examine socks")||x.equals("examine sock drawer"))
                    {
                        System.out.println("Yeah, there's nothing.");
                    }
                    else if(x.equals("open top drawer"))
                    {
                        System.out.println("It's empty.");
                    }
                    else if(x.equals("n"))
                    {
                        bedRoom = false;
                        livingRoom = true;
                        System.out.println("Living Room.");
                    }
                    else if(x.equals("w"))
                    {
                        bedRoom = false;
                        closet = true;
                        System.out.println("Closet.");
                    }
                    else if(x.equals("e")|| x.equals("s"))
                        System.out.println("Can't go that way.");
                    else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                        printGenerics();
                    else
                        printElses();

                    System.out.println("");
                    x = osConsole.nextLine();
                }   
            }
            
////////////////////////////////////////////////////////////////////////////////            
            
            while(closet)
            {
                if(x.equals("look"))
                {
                    if(hat)
                    {
                        System.out.println("Your various t-shirts, old flannels, and pants.\n"
                        + "On the ground are some assorted shoes.\n"
                        + "Your bedroom is to the east.");
                    }
                    else
                    {
                        System.out.println("Your various t-shirts, old flannels, and pants.\n"
                            + "On the ground are some assorted shoes.\n"
                            + "You have your favorite hat on a shelf.\n"
                            + "Your bedroom is to the east.");
                    }
                }
                else if(x.equals("examine hat") || x.equals("examine cap"))
                {
                    if(hat)
                    {
                        System.out.println("I don't understand that.");
                    }
                    else
                    {
                        System.out.println("It's a simple cap, nothing too special.\n"
                                + "You can use 'take hat' to put it on.");
                    }
                }
                else if(x.equals("take hat")||x.equals("put on hat") || x.equals("take cap") || x.equals("put on cap"))
                {
                    if(hat)
                    {
                        System.out.println("I don't understand that.");
                    }
                    else
                    {
                        hat = true;
                        System.out.println("You put the old thing on. Good to go.");
                    }
                }
                else if(x.equals("examine shoes"))
                {
                    System.out.println("You got your dress shoes and then your PF Flyers. A good selection.");
                }
                else if(x.equals("examine shirts"))
                {
                    System.out.println("You have decent style - at least there's no death metal T shirts.");
                }
                else if(x.equals("examine pants"))
                {
                    System.out.println("They fit nice.");
                }
                else if(x.equals("e"))
                {
                    closet = false;
                    bedRoom = true;
                    System.out.println("Bedroom.");
                }
                else if(x.equals("w")|| x.equals("s") || x.equals("n"))
                        System.out.println("Can't go that way.");
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(livingRoom)
            {
                if(x.equals("look"))
                {
                    System.out.println("You're in your living room. You have a nice long couch and a big window that looks out north to other buildings.\n"
                    + "Your wooden dining table and its accompanying chairs are in some open space behind the couch.\n"
                    + "Your kitchen is further west.\n"
                    + "The exit to your apartment is out east.");
                }
                else if(x.equals("examine couch"))
                {
                    System.out.println("Lovely for sitting on - you recall the times you invited up the girls from the Academy. Good times.\n"
                            + "There may be some loose change or something in there. Try 'look under couch'");
                }
                else if(x.equals("look under couch"))
                {
                    System.out.println("There isn't much but it looks like you have a petrified oreo there - might've been there for years.");
                    oreo = true;
                }
                else if(x.equals("take oreo"))
                {
                    if(oreo)
                    {
                        System.out.println("I don't understand that.");
                    }
                    else
                    {
                        System.out.println("You put it in your pocket.");
                        inv.add("Oreo");
                    }
                }
                else if(x.equals("eat oreo"))
                {
                    if(oreo)
                    {
                        System.out.println("I wouldn't recommend that. They say you can get all manner of diseases from ancient oreos.");
                    }
                    else
                    {
                        System.out.println("I don't understand that.");
                    }
                }
                else if(x.equals("examine window")||x.equals("look out window"))
                {
                    System.out.println("You see out north, a few stories above the pedestrians below you.\n"
                            + "Close to your point of view you have the Golden Gate Park, and you can see the edge of the Gulf of the Farallones.\n"
                            + "It's really an astonishing view, granted the mediocre quality of the apartment.");
                }
                else if(x.equals("examine table"))
                {
                    System.out.println("Good thing you cleaned it last night. The bacon smell lingers though.");
                }
                else if(x.equals("w"))
                {
                    livingRoom = false;
                    kitchen = true;
                    System.out.println("Kitchen.");
                }
                else if(x.equals("e"))
                {
                    if(demoEnd & hat)
                    {
                        livingRoom = false;
                        streetCorner = true;
                        System.out.println("Street Corner.\n");
                    }
                    else if(demoEnd & !hat)
                    {
                        System.out.println("You shouldn't leave without your hat. Check out your closet.");
                    }
                    else if(hat & !demoEnd)
                    {
                        System.out.println("I wouldn't recommend leaving without eating some breakfast. Check out the kitchen.");
                    }
                    else
                    {
                        System.out.println("I wouldn't recommend leaving without eating some breakfast. Check out the kitchen. Also, don't forget your hat. Check out your closet.");
                    }
                        
                }
                else if(x.equals("s"))
                {
                    livingRoom = false;
                    bedRoom = true;
                    System.out.println("Bedroom.");
                }
                else if(x.equals("n"))
                    System.out.println("Can't go that way.");
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////            
            
            while(kitchen)
            {
                //printGenerics(); //not here
                if(x.equals("look"))
                {
                    System.out.println("The kitchen is well stocked with a fridge, stove, and pantry.\n"
                    + "The floor is a deep mahogany color.\n"
                    + "Your living room is out east.");
                }
                else if(x.equals("examine fridge"))
                {
                    System.out.println("A nice white fridge with lovely pizza magnets covering the door. Try 'look in fridge' to take a gander.");
                }
                else if(x.equals("look in fridge")||x.equals("open fridge"))
                {
                    System.out.println("In your fridge:\n");
                    if(wholeMilk)
                    {
                        System.out.println("A half-full gallon of whole milk cuz you know you like it creamy.");
                    }
                    if(hotDogs)
                    {
                        System.out.println("A few italian sausages.");
                    }
                    if(oranges)
                    {
                        System.out.println("A couple of oranges.");
                    }
                    if(bananas)
                    {
                        System.out.println("A grip of bananas.");
                    }
                    System.out.println("\nSeems like grocery shopping is in order.");
                }
                else if(x.equals("eat milk")||x.equals("drink milk")||x.equals("drink whole milk")||x.equals("take milk"))
                {
                    if(wholeMilk == false)
                    {
                        System.out.println("You're all out!");
                    }
                    else
                    {
                        wholeMilk = false; demoEnd = true;
                        System.out.println("Refreshing and delicious. By the grace of whole milk, you ponder for a few minutes why skim even exists.");
                    }
                }
                else if(x.equals("eat sausages")||x.equals("eat sausage")||x.equals("take sausage")||x.equals("take sausages")||x.equals("eat italian sausages")||x.equals("eat italian sausage")||x.equals("take italian sausages")||x.equals("take italian sausage"))
                {
                    if(hotDogs == false)
                    {
                        System.out.println("You're all out!");
                    }
                    else
                    {
                        System.out.println("You take a bite out of one but since it's raw, it's not too pleasant. You could 'cook sausages' on your stove!");
                    }
                }
                else if(x.equals("cook sausages")||x.equals("cook sausage"))
                {
                    hotDogs = false; demoEnd = true;
                    System.out.println("You give it your best shot but you forgot that you are the pits at cooking and you burn the darn thing to a crisp... without even trying.");
                }
                else if(x.equals("eat oranges")||x.equals("eat orange")||x.equals("take orange")||x.equals("take oranges"))
                {
                    if(oranges == false)
                    {
                        System.out.println("You're all out!");
                    }
                    else
                    {
                        oranges = false; demoEnd = true;
                        System.out.println("Satisfying as always. Part of a well balanced breakfast.");
                    }
                }
                else if(x.equals("eat bananas")||x.equals("eat banana")||x.equals("take banana")||x.equals("take bananas"))
                {
                    if(bananas == false)
                    {
                        System.out.println("You're all out!");
                    }
                    else
                    {
                        bananas = false; demoEnd = true;
                        System.out.println("Pretty good. Needs nutella.");
                    }
                }
                else if(x.equals("examine pantry"))
                {
                    System.out.println("It's nice - the wood on the pantry door matches the wood on your dining room table. Well done. You can 'look in pantry' if ya want.");
                }
                else if(x.equals("look in pantry")||x.equals("open pantry"))
                {
                    System.out.println("In your pantry:\n");
                    if(clifBars)
                    {
                        System.out.println("A big ol' box of clif bars. You've been getting them ever since you started dreaming your ski-bum dreams.");
                    }
                    if(capriSun)
                    {
                        System.out.println("Capri sun! Your mom raised you right - you've been addicted since the 3rd grade.");
                    }
                    if(marshmellows)
                    {
                        System.out.println("Marshmellows! You were saving them for microwave experiments, but you don't even own a microwave.");
                    }
                    System.out.println("\nLooks like it's about time to get some more munchies.");
                }
                else if(x.equals("eat clif bars")||x.equals("eat clif bar")||x.equals("take clif bars")||x.equals("take clif bar"))
                {
                    if(clifBars == false)
                    {
                        System.out.println("You're all out!");
                    }
                    else
                    {
                        clifBars = false; demoEnd = true;
                        System.out.println("Scrumptious. Don't eat too much or else you'll get the most heinous of constipation.");
                    }
                }
                else if(x.equals("drink capri sun")||x.equals("drink capri suns")||x.equals("take capri sun")||x.equals("take capri suns"))
                {
                    if(capriSun == false)
                    {
                        System.out.println("You're all out!");
                    }
                    else
                    {
                        capriSun = false; demoEnd = true;
                        System.out.println("Once you touched one, you couldn't stop. Game Over. Death from capri sun overdose.\n...\nNah just kidding you good.");
                    }
                }
                else if(x.equals("eat marshmellow")||x.equals("eat marshmellows")||x.equals("take marshmellow")||x.equals("take marshmellows"))
                {
                    if(marshmellows == false)
                    {
                        System.out.println("You're all out!");
                    }
                    else
                    {
                        marshmellows = false; demoEnd = true;
                        System.out.println("You control yourself and eat one at a time. For an hour. Until the entire bag is gone.");
                    }
                }
                else if(x.equals("examine stove"))
                {
                    System.out.println("Not the most clean thing in the kitchen, but it does its job (as long as you're never cooking).");
                }
                else if(x.equals("e"))
                {
                    kitchen = false;
                    livingRoom = true;
                    System.out.println("Living Room.");
                }
                else if(x.equals("n") || x.equals("w") || x.equals("s"))
                    System.out.println("Can't go that way.");
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();        
            }
            
////////////////////////////////////////////////////////////////////////////////            
            
            while(streetCorner)
            {
                if(x.equals("look"))
                {
                    System.out.println("You're standing outside of the front door of your building. You see a few taxis going back and forth.\n"
                    + "Use 'enter taxi' to get one.\n"
                    + "Your apartment's living room is through the door to the west.");
                }
                else if(x.equals("w"))
                {
                    streetCorner = false;
                    livingRoom = true;
                    System.out.println("Living Room.");
                }
                else if(x.equals("e") || x.equals("n") || x.equals("s"))
                    System.out.println("Can't go that way.");
                else if(x.equals("enter taxi"))
                {
                    System.out.println("You call and enter the nearest taxi cab.");
                    System.out.println("The driver says, 'Where to, chum?'\n");
                    System.out.println("a) California Academy of Sciences");
                    System.out.println("b) San Francisco Zoo");
                    System.out.println("c) The Golden Gate Bridge");
                    System.out.println("d) Home");
                }
                else if(x.equals("a"))
                {
                    streetCorner = false;
                    academyOutside = true;
                    System.out.println("California Academy of Sciences.");
                }
                else if(x.equals("b"))
                {
                    streetCorner = false;
                    zooOutside = true;
                    System.out.println("San Francisco Zoo.");
                }
                else if(x.equals("c"))
                {
                    streetCorner = false;
                    ggbOutside = true;
                    System.out.println("The Golden Gate Bridge.");  
                }
                else if(x.equals("d"))
                {
                    System.out.println("Street corner.");
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////            
            
            while(academyOutside)
            {
                if(x.equals("look"))
                {
                    System.out.println("You're just outside the Academy (California Academy of Sciences).\n"
                    + "Go north to enter in the front door.\n"
                    + "Use 'enter taxi' to travel.");
                }
                else if(x.equals("n"))
                {
                    academyOutside = false;
                    academyLobby = true;
                    System.out.println("Lobby.");
                }
                else if(x.equals("e") || x.equals("s") || x.equals("w"))
                    System.out.println("Can't go that way.");
                else if(x.equals("enter taxi"))
                {
                    System.out.println("You call the nearest taxi and it promptly stops at your feet. You get in.");
                    System.out.println("'Where ya going, bum?\n");
                    System.out.println("a) The Golden Gate Bridge");
                    System.out.println("b) Tiffany & Co.");
                    System.out.println("c) Home");
                    System.out.println("d) California Academy of Sciences");
                }
                else if(x.equals("a"))
                {
                    academyOutside = false;
                    ggbOutside = true;
                    System.out.println("Golden Gate Bridge.");
                }
                else if(x.equals("b"))
                {
                    academyOutside = false;
                    tiffanyOutside = true;
                    System.out.println("Tiffany & Co.");
                }
                else if(x.equals("c"))
                {
                    academyOutside = false;
                    streetCorner = true;
                    System.out.println("Street Corner.");
                }
                else if(x.equals("d"))
                {
                    System.out.println("California Academy of Sciences.");
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(academyLobby)
            {
                if(x.equals("look"))
                {
                    System.out.println("You've made it to the lobby of the California Academy of Sciences. There's people all over the place.\n"
                    + "Bathroom's to the east. There's a hall continuing to the north.\n"
                    + "There's a security guard standing near the entrance.\n"
                    + "The front desk is just ahead of you, a pretty girl is stationed there.\n"
                    + "You see a map sign that says there's an exhibit to the north.");
                }
                else if(x.equals("s"))
                {
                    academyLobby = false;
                    academyOutside = true;
                    System.out.println("California Academy of Sciences.");
                }
                else if(x.equals("n"))
                {
                    academyLobby = false;
                    academyHall = true;
                    System.out.println("Hallway.");
                }
                else if(x.equals("e"))
                {
                    academyLobby = false;
                    academyBathroom = true;
                    System.out.println("Bathroom.");
                }
                else if(x.equals("w"))
                    System.out.println("Can't go that way.");
                else if(x.equals("examine guard")||x.equals("examine security guard"))
                {
                    System.out.println("Standing upright and looking stiff, he's a very professional but silly looking man.");
                }
                else if(x.equals("talk to security guard")||x.equals("talk to guard"))
                {
                    talk2guard = true;
                    if(convo2 == true)
                    {
                        System.out.println("You approach him, and he says, 'Woah there mate what do you want?'\n");
                        System.out.println("a) 'Oh, nothing much. Just wanted to say hi!'");
                        System.out.println("b) 'Do you know a Dr. Framen?'");
                        System.out.println("c) 'What's your name?'");
                    }
                    else
                    {
                        System.out.println("You approach him again but he waves you along, saying, 'I'm busy, keep it going bud!'");
                    }
                }
                else if(x.equals("a") & convo2 == true & talk2guard == true)
                {
                    System.out.println("'Oh, nothing much. Just wanted to say hi!'");
                    System.out.println("'Well, thanks, that's very kind of you. I'm very busy though, so please leave me alone.'");
                    convo2 = false;
                }
                else if(x.equals("b") & convo2 == true & talk2guard == true)
                {
                    System.out.println("'Do you know a Dr. Framen?'");
                    System.out.println("'What's it to you? He doesn't answer to nobody except the pizza delivery guy. Sorry bud.'");
                    convo2 = false;
                }
                else if(x.equals("c") & convo2 == true & talk2guard == true)
                {
                    System.out.println("'What's your name?'");
                    System.out.println("'I'm Officer Steve. It's nice to meet you, but I'm awfully busy. Run along, please.'");
                    convo2 = false;
                }
                else if(x.equals("examine girl")||x.equals("examine front desk girl")||x.equals("examine front desk"))
                {
                    System.out.println("She's a very pretty brunette. Looks like she might spend a lot of time at the bay. Her name tag says, 'Kelly'.");
                }
                else if(x.equals("talk to girl")||x.equals("talk to front desk girl")||x.equals("go to girl")||x.equals("go to front desk")||x.equals("approach girl")||x.equals("go to front desk girl"))
                {
                    talk2lobbygirl = true;
                    if(convo3 == true)
                    {
                        System.out.println("She smiles big and says, 'Hi! How can I help you?'\n");
                        System.out.println("a) 'Hello, I'm looking for Dr. Framen.'");
                        System.out.println("b) 'Kelly, it's been so long! How've you been?'");
                        System.out.println("c) 'Wow, you're super pretty. Want to go out sometime?'");
                    }
                    else
                    {
                        System.out.println("She again grins and asks, 'Was there anything else you needed help with?'\n");
                        System.out.println("a) 'Where was Dr. Framen, again?'");
                        System.out.println("b) 'Nope, thanks.'\n");
                        
                        String convoZ = osConsole.nextLine();
                        if(convoZ.equals("a"))
                        {
                            System.out.println("'Where was Dr. Framen, again?'");
                            System.out.println("'Down in the basement, thanks.'");
                        }
                        else if(convoZ.equals("b"))
                        {
                            System.out.println("'Nope, thanks.'\nShe smiles and goes back to her desk work.");
                        }
                    }
                    
                }
                else if(x.equals("a") & convo3 == true & talk2lobbygirl == true)
                {
                    System.out.println("'Hello, I'm looking for Dr. Framen.'");
                    System.out.println("'Oh yes, he's down in the basement, in his usual spot.'");
                    convo3 = false;
                }
                else if(x.equals("b") & convo3 == true & talk2lobbygirl == true)
                {
                    System.out.println("'Kelly, it's been so long! How've you been?'");
                    System.out.println("'Sorry? I don't think we've met.'\n");
                    System.out.println("a) 'It's me, " + name + ". Don't you remember me?'");
                    System.out.println("b) 'Oh right. Excuse me.'\n");
                    String convoX = osConsole.nextLine();
                    
                    if(convoX.equals("a"))
                    {
                        System.out.println("'It's me, " + name + ". Don't you remember me?");
                        System.out.println("'Honestly, no. So sorry!'");
                        convo3 = false;
                    }
                    else if(convoX.equals("b"))
                    {
                        System.out.println("'Oh right. Excuse me.'\nShe grins again and looks down at her desk.");
                        convo3 = false;
                    }
                    else
                    {
                        System.out.println("I don't understand that. Try again.");
                    }
                }
                else if(x.equals("c") & convo3 == true & talk2lobbygirl == true)
                {
                    System.out.println("'Wow, you're super pretty. Want to go out sometime?'");
                    System.out.println("'Oh, me? You're too kind. Sure! What were you thinking of?'\n");
                    System.out.println("a) 'Baseball game?'");
                    System.out.println("b) 'Walk near the bridge?'\n");
                    String convoY = osConsole.nextLine();
                    
                    if(convoY.equals("a"))
                    {
                        System.out.println("'Baseball game?'");
                        System.out.println("'Sure. I'm always outside AT&T Park at night, just meet me there!");
                        convo3 = false;
                        date = true;
                    }
                    else if(convoY.equals("b"))
                    {
                        System.out.println("'Walk near the bridge?'");
                        System.out.println("'Oh... see, I can't go near there. So sorry! Thanks for the nice thought.'");
                        convo3 = false;
                    }
                    else
                        System.out.println("I don't understand that. Try again.");
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////            
            
            while(academyBathroom)
            {
                if(x.equals("look"))
                {
                    if(vase == false)
                    {
                        System.out.println("The bathroom. Classy for a public place, yet a bit outdated.\n"
                            + "Nothing of interest at all, unless you're in the plumbing business.\n"
                            + "However, there is a decorative vase sitting next to the sinks.\n"
                            + "The lobby is to the west.");
                    }
                    else
                    {
                        System.out.println("The bathroom. Classy for a public place, yet a bit outdated.\n"
                            + "Nothing of interest at all, unless you're in the plumbing business.\n"
                            + "The lobby is to the west.");
                    } 
                }
                else if(x.equals("examine vase")||x.equals("examine decorative vase"))
                {
                    if(vase)
                    {
                        System.out.println("I don't understand that.");
                    }
                    else
                        System.out.println("It's glossy and smooth. An elegant piece.");
                }
                else if(x.equals("take vase")||x.equals("take decorative vase"))
                {
                    if(vase)
                    {
                        System.out.println("I don't understand that.");
                    }
                    else
                    {
                        System.out.println("Taken.");
                        vase = true;
                        inv.add("Vase");
                    }
                }
                else if(x.equals("w"))
                {
                    academyBathroom = false;
                    academyLobby = true;
                    System.out.println("Lobby.");
                }
                else if(x.equals("n") || x.equals("e") || x.equals("s"))
                    System.out.println("Can't go that way.");
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(academyHall)
            {
                if(x.equals("look"))
                {
                    System.out.println("You're in a wide hallway, just steps north of the front lobby.\n"
                    +"To the east is a door slightly ajar.\nThe lobby is to the south.");
                }
                else if(x.equals("s"))
                {
                    academyHall = false;
                    academyLobby = true;
                    System.out.println("Lobby.");
                }
                else if(x.equals("e"))
                {
                    if(diamondwatch)
                    {
                        System.out.println("You walk down to the basement again.\n"
                                + "Dr. Framen is sitting in the chair, sleeping. He wakes up when he hears you coming in.\n"
                                + "'"+name+"! Hand over the watch!'\n"
                                        + "You do so with some reluctance.\n"
                                        + "He starts to attach the watch atop the left armrest of the chair, when you start to hear shouts and the like coming from the hall.\n"
                                        + "Dr. Framen, noticing the sound too, hurredly attaches it.\n"
                                        + "'"+name+", come sit down, quick!'\n"
                                                + "You sit in the time machine, just as the door is busted open and swarms of SWAT officers come running through. 'STOP!'\n"
                                                + "Do you have any last words?\n");
                        String end = osConsole.nextLine();
                        System.out.println("Just as one officer is grabbing Dr. Framen by the head, he pushes one of the buttons on the chair, and the machine makes a loud, anxious sound.\n"
                                + "...\n"
                                + "The next thing you know, you're lying down on thick grass, your head throbbing.\n"
                                + "To be continued...\n\n"
                                + "Well done! Thanks for playing!"); System.exit(0);
                    }
                    if(firstTimeBase)
                    {
                        academyHall = false;
                        basement = true;
                        firstTimeBase = false;
                        
                        while(basementLoop == false)
                        {
                            System.out.println("Walking down some stairs, you hear some noise in the far corner.\nYou keep walking down until Dr. Framen's back comes into view.\n"
                                    + "He's hunched over an old office chair that's thickly decorated with all sorts of lights, dials and buttons.\n"
                                    + "Startled, he turns around.\n"
                                    + "'" + name + "! Excellent! I'm so glad you're here. What do you think? It's nearly there!!'\n"
                                    + "He gestures enthusiastically at the chair.\n\n"
                                    + "a) 'Sorry, what is that?'\n"
                                    + "b) 'Great. What's next?'\n");
                            String baseConvo1 = osConsole.nextLine();
                            if(baseConvo1.equals("a"))
                            {
                                System.out.println("'Sorry, what is that?'");
                                System.out.println("'What?? Are you joking me, " + name + "?\n"
                                        + "It's the time machine that we've been working on for the past year! Good grief, I don't know why you can't remember these things.\n"
                                        + "It's nearly complete! I finally discovered the last thing it needs...\n"
                                        + "We need a diamond-studded wrist watch.'\n"
                                        + "He pauses for dramatic effect.\n"
                                        + "'Can you get it for me? I need to stay here and watch over the machine. Just bring it by soon.'\n\n"
                                        + "a) 'Sure.'\n"
                                        + "b) 'No can do.'\n");
                                String baseConvo2 = osConsole.nextLine();
                                if(baseConvo2.equals("a"))
                                {
                                    System.out.println("'Sure.'\n"
                                        + "'Excellent! Superb! Thanks " + name + ". I knew I could count on you.'\n"
                                                + "He turns around and continues to work at the machine.");
                                    basementLoop = true;
                                }
                                else if(baseConvo2.equals("b"))
                                {
                                    System.out.println("'No can do.'\n"
                                        + "'What? Oh... okay then.'\n\n");
                                    System.out.println("THE END.\nThanks for playing! Better luck next time. Good day!");
                                    basementLoop = true;
                                    System.exit(0);
                                }
                                else
                                    System.out.println("It seems like he didn't understand you. Nevertheless, he accepts your answer and counts it as an affirmative reply.");
                            }
                            else if(baseConvo1.equals("b"))
                            {
                                System.out.println("'Great. What's next?'\n");
                                System.out.println("'Yes, yes. We need a diamond-studded wrist watch to attach here.'\n"
                                    + "He gestures at the arm rest.\n"
                                    + "'Can you get it for me? I need to stay here and watch over the machine. Just bring it by soon.'\n\n"
                                    + "a) 'Sure.'\n"
                                    + "b) 'No can do.'\n");
                                String baseConvo2 = osConsole.nextLine();
                                if(baseConvo2.equals("a"))
                                {
                                    System.out.println("'Sure.'\n"
                                        + "'Excellent! Superb! Thanks " + name + ". I knew I could count on you.'\n"
                                        + "He turns around and continues to work at the machine.");
                                    basementLoop = true;
                                }
                                else if(baseConvo2.equals("b"))
                                {
                                    System.out.println("'No can do.'\n"
                                        + "'What? Oh... okay then.'\n\n");
                                    System.out.println("THE END.\nThanks for playing! Better luck next time. Good day!");
                                    basementLoop = true;
                                    System.exit(0);
                                }
                                else
                                    System.out.println("It seems like he didn't understand you. Nevertheless, he accepts your answer and counts it as an affirmative reply.");
                            }
                            else
                            {
                                System.out.println("It seems like he didn't understand you. Best try again.");
                            }
                        }
                    }
                    else
                    {
                        academyHall = false;
                        basement = true;
                        System.out.println("Basement.");
                    }  
                }
                else if(x.equals("n") || x.equals("w"))
                    System.out.println("Can't go that way.");
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine(); 
            }   
            
////////////////////////////////////////////////////////////////////////////////

            while(basement)
            {
                if(x.equals("look"))
                {
                    System.out.println("You've walked down some stairs from the hallway into the basement.\n"
                    + "There's a shallow window bordering the walls with the ceiling of the room.\n"
                    + "Dr. Framen is in the corner with the time machine.\n"
                    + "The hall is to the west.\n");
                }
                else if(x.equals("talk to dr. framen")||x.equals("talk to doctor framen")||x.equals("talk to the doctor")||x.equals("talk to framen")||x.equals("talk to dr framen")||x.equals("talk to dr"))
                {
                    System.out.println("He turns around.\n"
                            + "'What is it?'\n\n"
                            + "a) 'Oh, nothing.'\n"
                            + "b) 'Where can I find a diamond-studded watch?'\n"
                            + "c) 'Who are you?'\n");
                    String basementConvo3 = osConsole.nextLine();
                    if(basementConvo3.equals("a"))
                    {
                        System.out.println("'Oh, nothing.'\n"
                                + "He smirks and goes back to his work.");
                    }
                    else if(basementConvo3.equals("b"))
                    {
                        System.out.println("'Where can I find a diamond-studded watch?'\n"
                                + "'Look downtown. There's gotta be some fancy jewelry shop somewhere.'\n");
                    }
                    else if(basementConvo3.equals("c"))
                    {
                        System.out.println("'Who are you?'\n"
                                + "'Don't be silly " + name + ". Can't you tell your boss from the average guy? Come on now.'");
                    }
                    else
                        System.out.println("I don't understand that. Try again.");
                }
                else if(x.equals("examine dr. framen")||x.equals("examine dr")||x.equals("examine doctor framen")||x.equals("examine the doctor")||x.equals("examine framen")||x.equals("examine doctor"))
                {
                    System.out.println("An ugly fellow. Has a small hunchback. Could use a shave.");
                }
                else if(x.equals("w"))
                {
                    basement = false;
                    academyHall = true;
                    System.out.println("Hallway.");
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(tiffanyOutside)
            {
                if(x.equals("look"))
                {
                    if((iCount % 2) != 0) //DAY TIME
                    {
                        if(thief)
                        {
                            System.out.println("Downtown SF. Shops, busy streets, and bustling people. You're just outside Tiffany's, the famous jewelers.\n"
                                + "A man in a trench coat is leaned against the side of the building.\n"
                                + "Go north to enter into the shop.");
                        }
                        else
                        {
                            System.out.println("Downtown SF. Shops, busy streets, and bustling people. You're just outside Tiffany's, the famous jewelers.\n"
                                + "Go north to enter into the shop.");
                        }
                    }
                    else //NIGHT TIME
                    {
                        if(thief)
                        {
                            System.out.println("Downtown SF. Shops, busy streets, but few people outside. You're just outside Tiffany's, the famous jewelers.\n"
                                + "A man in a trench coat is leaned against the side of the building.\n"
                                + "The moon is about a quarter full.\n"
                                + "Go north to enter into the shop.");
                        }
                        else
                        {
                            System.out.println("Downtown SF. Shops, busy streets, and bustling people. You're just outside Tiffany's, the famous jewelers.\n"
                                + "The moon is about a quarter full.\n"
                                + "Go north to enter into the shop.");
                        }
                    }
                }
                else if(x.equals("talk to man"))
                {
                    if(thief)
                    {
                        System.out.println("You come up to him again.\n"
                                + "'Yeah man what's up?'\n\n"
                                + "a) 'What was it you needed?'\n"
                                + "b) 'Nothing.'\n");
                        String tiffConvo = osConsole.nextLine();
                        if(tiffConvo.equals("a"))
                        {
                            if(platypus)
                            {
                               System.out.println("'What was it you needed?'\n"
                                    + "'A platypus. You got it, yeah?'\n"
                                    + "He sticks his open hand out, waiting.\n"
                                       + "You hand it to him, bag and all. He looks inside.\n"
                                       + "'Well done. Here's your lockpick, as promised.' He hands it to you."); thief = false; lockpick = true; inv.remove("Platypus"); inv.add("Lockpick"); 
                            }
                            else
                            {
                                System.out.println("'What was it you needed?'\n"
                                        + "'A platypus. Keep looking man.'");
                            }
                        }
                        else if(tiffConvo.equals("b"))
                        {
                            System.out.println("'Nothing. Still looking.'\n"
                                    + "'That's fine. Take your time. Platypus hunting is tricky business.'");
                        }
                        else
                            System.out.println("I don't understand that. Try again.");
                    }
                    else
                        printElses();
                }
                else if(x.equals("n"))
                {
                    if((iCount % 2) != 0) //DAY TIME
                    {
                        tiffanyOutside = false;
                        tiffanyInside = true;
                        System.out.println("Inside Tiffany's.");
                    }
                    else //night time
                    {
                        if(lockpick)
                        {
                            tiffanyOutside = false;
                            tiffanyInside = true;
                            System.out.println("Busting the lock, you make it inside Tiffany's.\n"
                                    + "It's pitch dark inside. No alarm was sounded, funny.");
                        }
                        else
                            System.out.println("You try the door but it's all locked up. You need something to open it.");
                    }
                }
                else if(x.equals("e") || x.equals("s") || x.equals("w"))
                    System.out.println("Can't go that way.");
                else if(x.equals("examine man"))
                {
                    if(thief)
                    {
                        System.out.println("He's a tad short. The trenchcoat certainly makes him look suspicious.");
                    }
                    else
                        printElses();
                }
                else if(x.equals("enter taxi"))
                {
                    System.out.println("You call the nearest taxi and it promptly stops at your feet. You get in.");
                    System.out.println("'Where ya going, hombre?\n");
                    System.out.println("a) California Academy of Sciences");
                    System.out.println("b) Lombard Street");
                    System.out.println("c) AT&T Park");
                    System.out.println("d) Tiffany & Co");
                }
                else if(x.equals("a"))
                {
                    tiffanyOutside = false;
                    academyOutside = true;
                    System.out.println("California Academy of Sciences.");
                }
                else if(x.equals("b"))
                {
                    tiffanyOutside = false;
                    lombard = true;
                    System.out.println("Lombard Street.");
                }
                else if(x.equals("c"))
                {
                    tiffanyOutside = false;
                    attOutside = true;
                    System.out.println("AT&T Park, Home of the SF Giants.");  
                }
                else if(x.equals("d"))
                {
                    System.out.println("Tiffany & Co.");
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }

////////////////////////////////////////////////////////////////////////////////

            while(tiffanyInside)
            {
                if((iCount % 2) != 0) //it's day
                {
                    if(x.equals("look"))
                    {
                        System.out.println("It's a beautifully lit room. Glass cases cover the large singular room.\n"
                                + "You glance inside and see beautiful rings, jewels of every color and size, necklaces, and other accessories.\n"
                                + "There's an elderly man in a tuxedo standing in the center of the room.\n"
                                + "He greets you as you walk in.\n"
                                + "Exit is to the south.");
                    }
                    else if(x.equals("take watch")||x.equals("take diamond watch")||x.equals("steal watch")||x.equals("steal diamond watch"))
                    {
                        {
                            System.out.println("I wouldn't advise that. The man is right there.");
                        }
                    }
                    else if(x.equals("talk to man")||x.equals("talk to elder")||x.equals("talk to old man")||x.equals("talk to elderly man"))
                    {
                        System.out.println("'Greetings. May I be of any assistance?'\n\n"
                                + "a) 'Quite. I'm looking for a diamond-studded watch.'\n"
                                + "b) 'Yes, where did you get that ravishing tuxedo?'\n"
                                + "c) 'No, sorry.'\n");
                        String tiffConvo2 = osConsole.nextLine();
                        if(tiffConvo2.equals("a"))
                        {
                            System.out.println("'Quite. I'm looking for a diamond-studded watch.'\n"
                                    + "'Yes, yes.'\n"
                                    + "He takes a black velvet case from under some glass, brings it to the top and shows it to you, opening it up.\n"
                                    + "'Is this what you had in mind?'\n"
                                    + "It's a beautiful watch; its circumference covered in the only shine that diamonds can give.\n"
                                    + "He exclaims, '$100,000.'\n\n"
                                    + "a) 'I don't have that kind of money!'\n"
                                    + "b) 'Are you offering a discount?'\n"
                                    + "c) 'How about a trade?'\n");

                            String tiffConvo3 = osConsole.nextLine();
                            if(tiffConvo3.equals("a"))
                            {
                                System.out.println("'I don't have that kind of money!'");
                                System.out.println("He smiles, 'No, that cannot be. Please come back once you have the sufficient funds.'");
                            }
                            else if(tiffConvo3.equals("b"))
                            {
                                System.out.println("'Are you offering a discount?'");
                                System.out.println("He smiles, 'No, sorry. Please come back once you have the sufficient funds.'");
                            }
                            else if(tiffConvo3.equals("c"))
                            {
                                System.out.println("'How about a trade?'");
                                System.out.println("He smiles, 'No, that cannot be. Please come back once you have the sufficient funds.'");
                            }
                            else
                                System.out.println("I don't understand. Try again.");
                        }
                        else if(tiffConvo2.equals("b"))
                        {
                            System.out.println("'Yes, where did you get that ravishing tuxedo?'\n"
                                    + "'This old thing? Pomeroy's, Mesa, AZ. A fine outfitter.'");
                        }
                        else if(tiffConvo2.equals("c"))
                        {
                            System.out.println("'No, sorry.'\n"
                                    + "'Okay. Let me know.'");
                        }
                        else
                            printElses();
                    }
                    else if(x.equals("s"))
                    {
                        if(thief==false)
                        {
                            tiffanyInside = false;
                            tiffanyOutside = true;
                            thief = true;
                            System.out.println("You walk out the store dismayed.\n"
                                    + "To your surprise, there's a man in a trenchcoat leaning against the side of the building. He's gesturing for you to come to him.\n"
                                    + "You walk to him.\n"
                                    + "He straightens up, 'Hey man. You lookin to get a good deal on some jewels? "
                                    + "I don't sell nothing, I just help my fellow neighbor get what he deserves.\n"
                                    + "I'll trade ya for this lock pick I got so you can bust in there. I just need something in return.'\n\n"
                                    + "a) 'Sure, what is it?'\n"
                                    + "b) 'No way.'\n");
                            String thiefConvo = osConsole.nextLine();
                            if(thiefConvo.equals("a"))
                            {
                                System.out.println("'Sure, what is it?'\n"
                                        + "'Yeah I need a platypus. Get me that and you can have this lockpick. Only way in Tiffany's at night.'\n"
                                        + "You're puzzled by the request, but there's nothing else you can do. Looks like you'll just have to get him a platypus.");
                            }
                            else if(thiefConvo.equals("b"))
                            {
                                System.out.println("'No way.'\n"
                                        + "'No? Fine.'\n"
                                        + "THE END.");
                                System.exit(0);
                            }
                            else
                            {
                                System.out.println("'"+thiefConvo+"'");
                                System.out.println("'What'd you say? Whatever. Listen, I need a platypus. Always wanted one. Get me that and you can have this lockpick. Only way in Tiffany's at night.'\n"
                                        + "You're puzzled by the request, but there's nothing else you can do. Looks like you'll just have to get him a platypus.");
                            }
                        }
                        else
                        {
                            tiffanyInside = false;
                            tiffanyOutside = true;
                            System.out.println("Tiffany & Co.");
                        }
                    }
                    else if(x.equals("w") || x.equals("n") || x.equals("e"))
                        System.out.println("Can't go that way.");
                    else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                        printGenerics();
                    else
                        System.out.println("I don't understand that.");

                    System.out.println("");
                    x = osConsole.nextLine();
                }
                else
                {
                    if(x.equals("look"))
                    {
                        System.out.println("You're inside Tiffany's at night. Not a single light is shining.\n"
                                + "All the jewelry is behind their glass cases.");
                    }
                    else if(x.equals("s"))
                    {
                        if(thief==false)
                        {
                            tiffanyInside = false;
                            tiffanyOutside = true;
                            thief = true;
                            System.out.println("You walk out the store dismayed.\n"
                                    + "To your surprise, there's a man in a trenchcoat leaning against the side of the building. He's gesturing for you to come to him.\n"
                                    + "You walk to him.\n"
                                    + "He straightens up, 'Hey man. You lookin to get a good deal on some jewels? "
                                    + "I don't sell nothing, just help my fellow neighbor get what he deserves.\n"
                                    + "I'll trade ya for this lock pick I got so you can bust in there. I just need something in return.'\n\n"
                                    + "a) 'Sure, what is it?'\n"
                                    + "b) 'No way.'\n");
                            String thiefConvo = osConsole.nextLine();
                            if(thiefConvo.equals("a"))
                            {
                                System.out.println("'Sure, what is it?'\n"
                                        + "'Yeah I need a platypus. Get me that and you can have this lockpick. Only way in Tiffany's at night.'\n"
                                        + "You're puzzled by the request, but there's nothing else you can do. Looks like you'll just have to get him a platypus.");
                            }
                            else if(thiefConvo.equals("b"))
                            {
                                System.out.println("'No way.'\n"
                                        + "'No? Fine.'\n"
                                        + "THE END.");
                                System.exit(0);
                            }
                            else
                            {
                                System.out.println("'"+thiefConvo+"'");
                                System.out.println("'What'd you say? Whatever. Listen, I need a platypus. Always wanted one. Get me that and you can have this lockpick. Only way in Tiffany's at night.'\n"
                                        + "You're puzzled by the request, but there's nothing else you can do. Looks like you'll just have to get him a platypus.");
                            }
                        }
                        else
                        {
                            tiffanyInside = false;
                            tiffanyOutside = true;
                            System.out.println("Tiffany & Co.");
                        }
                    }
                    else if(x.equals("w") || x.equals("n") || x.equals("e"))
                        System.out.println("Can't go that way.");
                    else if(x.equals("take watch")||x.equals("steal watch")||x.equals("take diamond watch"))
                    {
                        if(diamondwatch)
                        {
                            System.out.println("You already have it.");
                        }
                        else
                        {
                            if(lockpick)
                            {
                                System.out.println("You sneak under the case and take the watch. Time to deliver."); lockpick = false; diamondwatch = true; inv.remove("Lockpick"); inv.add("Diamond Watch");
                            }
                            else
                            {
                                System.out.println("You don't have anything to get under the glass cases. Smashing them won't work either, they're too thick.");
                            }
                        }
                    }
                    else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                        printGenerics();
                    else
                        printElses();

                    System.out.println("");
                    x = osConsole.nextLine();
                }
            }

////////////////////////////////////////////////////////////////////////////////

            while(zooOutside)
            {
                if(x.equals("look"))
                {
                    System.out.println("You made it to the northern entrance of the world-famous zoo. You can feel the presence of the ocean nearby.\n"
                            + "To enter, go south.");
                }
                else if(x.equals("s"))
                {
                    zooOutside = false;
                    zooGiraffe = true;
                    System.out.println("Giraffes.");
                }
                else if(x.equals("w") || x.equals("n") || x.equals("e"))
                    System.out.println("Can't go that way.");
                else if(x.equals("enter taxi"))
                {
                    System.out.println("You call the nearest taxi and it promptly stops at your feet. You get in.");
                    System.out.println("'Where ya going, man?\n");
                    System.out.println("a) AT&T Park");
                    System.out.println("b) Home");
                    System.out.println("c) San Francisco Zoo");
                }
                else if(x.equals("a"))
                {
                    zooOutside = false;
                    attOutside = true;
                    System.out.println("AT&T Park, Home of the SF Giants.");
                }
                else if(x.equals("b"))
                {
                    zooOutside = false;
                    streetCorner = true;
                    System.out.println("Street Corner.");
                }
                else if(x.equals("c"))
                {
                    System.out.println("San Francisco Zoo.");  
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////            
            
            while(zooGiraffe)
            {
                if(x.equals("look"))
                {
                    System.out.println("The giraffes' quarters. Tall, lanky creatures.\n"
                            + "The zookeeper is nearby to ask questions, if they're present.\n"
                            + "There's a large sign that blatantly says, 'DON'T FEED THE GIRAFFES'.\n"
                            + "The exit of the zoo is to the north, but the rest of the zoo looks like a maze. It looks impossible to navigate.");
                }
                else if(x.equals("examine zookeeper"))
                {
                    System.out.println("A mustached man in the uniform he, of course, must be required to wear.");
                }
                else if(x.equals("talk to zookeeper"))
                {
                    System.out.println("You approach him.\n"
                            + "'Hello, how can I help you?'\n\n"
                            + "a) 'Yes, I was hoping you'd tell me where the platypuses are?'\n"
                            + "b) 'Anything I ought to know about the zoo here?'\n"
                            + "c) 'These giraffes interest you at all?'\n");
                    String zooConvo = osConsole.nextLine();
                    if(zooConvo.equals("a"))
                    {
                        System.out.println("'Yes, I was hoping you'd tell me where the platypuses are?'");
                        System.out.println("'Oh, right. Yeah, normally we don't have them, but tis the season, right? They're just south of the chimpanzees.'");
                    }
                    else if(zooConvo.equals("b"))
                    {
                        System.out.println("'Anything I ought to know about the zoo here?'");
                        System.out.println("'Right, well the first exhibits were built in the 30s. It was founded by Mr. Herbert Fleishhacker.'\n"
                                + "Blessed by this newfound knowledge you divert your attention elsewhere.");
                    }
                    else if(zooConvo.equals("c"))
                    {
                        System.out.println("'These giraffes interest you at all?'\n"
                                + "'Oh, quite. They astound me. I often aspire to be like them someday.'");
                    }
                    else
                        printElses();
                }
                else if(x.equals("examine giraffe")||x.equals("examine giraffes"))
                {
                    System.out.println("Beautiful animals. You see them stretching about for leaves and the like. Must take a lot of grub to take care of these creatures.");
                }
                else if(x.equals("w"))
                {
                    zooGiraffe = false;
                    zooBobcat = true;
                    System.out.println("Bobcats.");
                }
                else if(x.equals("s"))
                {
                    zooGiraffe = false;
                    zooLion = true;
                    System.out.println("Lions.");
                }
                else if(x.equals("n"))
                {
                    zooGiraffe = false;
                    zooOutside = true;
                    System.out.println("San Francisco Zoo.");
                }
                else if(x.equals("e"))
                    System.out.println("Can't go that way.");
                else if(x.equals("feed giraffe")||x.equals("feed giraffes")||x.equals("feed the giraffes")||x.equals("feed the giraffe"))
                {
                    if(escape)
                    {
                        System.out.println("That's not necessary.");
                    }
                    else
                    {
                        if(leftovers || food)
                        {
                            System.out.println("You take out your leftovers from your pocket.\n"
                                    + "The giraffe near you lifts up its nose.\n"
                                    + "It cranes its head way down and scarfs up the remains of your ballpark food.\n"
                                    + "The zookeeper catches you doing this, suddenly becoming furious.\n"
                                    + "'CAN'T YOU READ?? Ohhhhhhhhhhhhh that's it. I'm taking you to security.'\n"
                                    + "He takes you to the zoo main offices to a door labled, 'Security'.\n"
                                    + "He throws you in there and locks the door behind."); leftovers = false; inv.remove("Food");
                                    zooGiraffe = false; escapeRoom = true;
                        }
                        else
                            System.out.println("You don't have any food!");
                    }
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(zooBobcat)
            {
                if(x.equals("look"))
                {
                    System.out.println("The bobcat exhibit is pretty good looking. The animals are lazily about their habitat.");
                }
                else if(x.equals("examine bobcat")||x.equals("examine bobcats"))
                {
                    System.out.println("A beautiful animal.");
                }
                else if(x.equals("e"))
                {
                    zooBobcat = false;
                    zooGiraffe = true;
                    System.out.println("Giraffes.");
                }
                else if(x.equals("s") || x.equals("w") || x.equals("n"))
                    System.out.println("Can't go that way.");
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }

////////////////////////////////////////////////////////////////////////////////

            while(zooLion)
            {
                if(x.equals("look"))
                {
                    System.out.println("You're with the lions. Nothing much here other than the sound of the kingly animals' roar as you approach.");
                }
                else if(x.equals("examine lion")||x.equals("examine lions"))
                {
                    System.out.println("Lion King got it right.");
                }
                else if(x.equals("roar")||x.equals("roar back"))
                {
                    System.out.println("You startled him. He bows before you.");
                }
                else if(x.equals("s"))
                {
                    zooLion = false;
                    zooBirds = true;
                    System.out.println("Birds.");
                }
                else if(x.equals("w"))
                {
                    zooLion = false;
                    zooGorilla = true;
                    System.out.println("Gorillas.");
                }
                else if(x.equals("n"))
                {
                    zooLion = false;
                    zooGiraffe = true;
                    System.out.println("Giraffes.");
                }
                else if(x.equals("e"))
                    System.out.println("Can't go that way.");
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(zooBirds)
            {
                if(x.equals("look"))
                {
                    System.out.println("Welcome to the bird house. You got seagulls, cranes, and colorful parakeets. Must be hard for all of them to get along.");
                }
                else if(x.equals("n"))
                {
                    zooBirds = false;
                    zooLion = true;
                    System.out.println("Lions.");
                }
                else if(x.equals("e") || x.equals("s") || x.equals("w"))
                    System.out.println("Can't go that way.");
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(zooGorilla)
            {
                if(x.equals("look"))
                {
                    System.out.println("You're with the gorillas. Having recently finished the Planet of the Apes series, you fear its lingering stare.");
                }
                else if(x.equals("examine gorillas")||x.equals("examine gorilla"))
                {
                    System.out.println("Harambe?");
                }
                else if(x.equals("n"))
                {
                    zooGorilla = false;
                    zooLemurs = true;
                    System.out.println("Lemurs.");
                }
                else if(x.equals("w"))
                {
                    zooGorilla = false;
                    zooArmadillo = true;
                    System.out.println("Armadillos.");
                }
                else if(x.equals("s"))
                {
                    zooGorilla = false;
                    zooRhino = true;
                    System.out.println("Rhinos.");
                }
                else if(x.equals("e"))
                {
                    zooGorilla = false;
                    zooLion = true;
                    System.out.println("Lions.");
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(zooRhino)
            {
                if(x.equals("look"))
                {
                    System.out.println("The colossal room of the rhinos. Their area is a big outdoor amphitheater. The big fellows deserve it.");
                }
                else if(x.equals("n"))
                {
                    zooRhino = false;
                    zooGorilla = true;
                    System.out.println("Gorillas.");
                }
                else if(x.equals("e") || x.equals("s") || x.equals("w"))
                    System.out.println("Can't go that way.");
                else if(x.equals("examine rhino")||x.equals("examine rhinos"))
                {
                    System.out.println("One of the big enemies of Spiderman.");
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(zooLemurs)
            {
                if(x.equals("look"))
                {
                    System.out.println("The lemur cage. They're crazy. Jumping all over the place. You can't help but laugh at their weird eyes.");
                }
                else if(x.equals("w"))
                {
                    zooLemurs = false;
                    zooHippo = true;
                    System.out.println("Hippos.");
                }
                else if(x.equals("s"))
                {
                    zooLemurs = false;
                    zooGorilla = true;
                    System.out.println("Gorillas.");
                }
                else if(x.equals("n") || x.equals("e"))
                    System.out.println("Can't go that way.");
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(zooArmadillo)
            {
                if(x.equals("look"))
                {
                    System.out.println("Armadillos. Nothing here but armadillos.");
                }
                else if(x.equals("examine armadillos")||x.equals("examine armadillo"))
                {
                    System.out.println("You remember what they tasted like when you had them for Christmas dinner a few years back. Chicken flavor but slightly fishy.");
                }
                else if(x.equals("e"))
                {
                    zooArmadillo = false;
                    zooGorilla = true;
                    System.out.println("Gorillas.");
                }
                else if(x.equals("s"))
                {
                    zooArmadillo = false;
                    zooAlligator = true;
                    System.out.println("Alligators.");
                }
                else if(x.equals("n") || x.equals("w"))
                    System.out.println("Can't go that way.");
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(zooHippo)
            {
                if(x.equals("look"))
                {
                    System.out.println("In front of you is the large hippo pond. None are really outside of the water. They're all wading in.");
                }
                else if(x.equals("examine hippos")||x.equals("examine hippo"))
                {
                    System.out.println("Nothing to see here. Big fat hippo.");
                }
                else if(x.equals("e"))
                {
                    zooHippo = false;
                    zooLemurs = true;
                    System.out.println("Lemurs.");
                }
                else if(x.equals("w"))
                {
                    zooHippo = false;
                    zooChimp = true;
                    System.out.println("Chimpanzees.");
                }
                else if(x.equals("n") || x.equals("s"))
                    System.out.println("Can't go that way.");
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(zooChimp)
            {
                if(x.equals("look"))
                {
                    System.out.println("You're outside a cage that's packed full of chimpanzees. One starts waving at you from inside.");
                }
                else if(x.equals("examine chimpanzees")||x.equals("examine chimpanzee"))
                {
                    System.out.println("You and another chimp have a quick staring contest. He wins.");
                }
                else if(x.equals("wave at chimpanzees")||x.equals("wave at chimpanzee")||x.equals("wave")||x.equals("wave back"))
                {
                    System.out.println("You do so and they all clap their hands.");
                }
                else if(x.equals("e"))
                {
                    zooChimp = false;
                    zooHippo = true;
                    System.out.println("Hippos.");
                }
                else if(x.equals("s"))
                {
                    zooChimp = false;
                    zooPlatypus = true;
                    System.out.println("Platypuses.");
                }
                else if(x.equals("n") || x.equals("w"))
                    System.out.println("Can't go that way.");
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(zooAlligator)
            {
                if(x.equals("look"))
                {
                    System.out.println("You're looking in front of you at the shallow marshlands of the alligator habitat. You can see them strewn about.");
                }
                else if(x.equals("examine alligators")||x.equals("examine alligator"))
                {
                    System.out.println("One slowly opens its mouth, revealing an old-fashioned alarm clock inside.");
                }
                else if(x.equals("take clock"))
                {
                    System.out.println("Frightfully bad idea. You don't need it, anyways.");
                }
                else if(x.equals("w"))
                {
                    zooAlligator = false;
                    zooTurtles = true;
                    System.out.println("Turtles.");
                }
                else if(x.equals("n"))
                {
                    zooAlligator = false;
                    zooArmadillo = true;
                    System.out.println("Armadillos.");
                }
                else if(x.equals("e") || x.equals("s"))
                    System.out.println("Can't go that way.");
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(zooTurtles)
            {
                if(x.equals("look"))
                {
                    System.out.println("This may be the most exciting room in the entire zoo. The turtles aren't moving an inch.");
                }
                else if(x.equals("examine turtle")||x.equals("examine turtles"))
                {
                    System.out.println("Slow pokes.");
                }
                else if(x.equals("e"))
                {
                    zooTurtles = false;
                    zooAlligator = true;
                    System.out.println("Alligators.");
                }
                else if(x.equals("n"))
                {
                    zooTurtles = false;
                    zooPlatypus = true;
                    System.out.println("Platypuses.");
                }
                else if(x.equals("s") || x.equals("w"))
                    System.out.println("Can't go that way.");
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(zooPlatypus)
            {
                if(x.equals("look"))
                {
                    System.out.println("You made it to the platypus room. Some are swimming, some laying around, all duck-billed.");
                }
                else if(x.equals("n"))
                {
                    zooPlatypus = false;
                    zooChimp = true;
                    System.out.println("Chimpanzees.");
                }
                else if(x.equals("s"))
                {
                    zooPlatypus = false;
                    zooTurtles = true;
                    System.out.println("Turtles.");
                }
                else if(x.equals("w") || x.equals("e"))
                    System.out.println("Can't go that way.");
                else if(x.equals("take platypus")||x.equals("take a platypus")||x.equals("steal platypus")||x.equals("bag platypus"))
                {
                    if((iCount % 2) != 0)
                    {
                        System.out.println("I wouldn't be stealing away any platypuses in broad daylight. Wait until it's dark.");
                    }
                    else
                    {
                        if(bag)
                        {
                            System.out.println("You snag an innocent platypus by its slimy neck and place it in your duffel bag. Nothing to it.\n"
                                    + "Time to deliver.");
                            inv.add("Platypus");
                            inv.remove("Duffel Bag"); platypus = true;
                        }
                        else
                            System.out.println("You don't have anything to put it in! Find a bag of some sort. Nothing too conspicuous.");
                    }
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////            
            
            while(lombard)
            {
                if(x.equals("look"))
                {
                    System.out.println("You're standing at the bottom of the famous and extremely crowded winding street, Lombard Street.\n"
                            + "There are tourists everywhere. There is one Asian woman among them that looks particuarly interested to talk to you.\n"
                            + "Enter 'enter taxi' to leave.");
                }
                else if(x.equals("enter taxi"))
                {
                    System.out.println("You call the nearest taxi and it promptly stops at your feet. You get in.");
                    System.out.println("'Where ya going, boi?\n");
                    System.out.println("a) Tiffany & Co");
                    System.out.println("b) California Academy of Sciences");
                    System.out.println("c) Golden Gate Bridge");
                    System.out.println("d) Lombard Street");
                }
                else if(x.equals("examine tourists")||x.equals("examine the tourists"))
                {
                    System.out.println("Selfie sticks galore. Segways too. Feeling some touches of jealousy, you move your eyes away.");
                }
                else if(x.equals("examine the street")||x.equals("examine street"))
                {
                    System.out.println("Reminds you of the classic 'What's Up Doc' scene. Pure heaven.");
                }
                else if(x.equals("a"))
                {
                    lombard = false;
                    tiffanyOutside = true;
                    System.out.println("Tiffany & Co.");
                }
                else if(x.equals("b"))
                {
                    lombard = false;
                    academyOutside = true;
                    System.out.println("California Academy of Sciences.");
                }
                else if(x.equals("c"))
                {
                    lombard = false;
                    ggbOutside = true;
                    System.out.println("Golden Gate Bridge.");  
                }
                else if(x.equals("d"))
                {
                    System.out.println("Lombard Street.");
                }
                else if(x.equals("examine woman"))
                {
                    if(asian)
                        System.out.println("She's decked out in the freshest tourist style that can't be described by words. It's just perfect.");
                    else
                        System.out.println("She's decked out in the freshest tourist style that can't be described by words. It's just perfect.\nShe's staring at you, as if wanting to talk.");
                }
                else if(x.equals("talk to woman")||x.equals("talk to asian"))
                {
                    if(asian)
                    {
                        System.out.println("You approach her again, and she greets you.");
                    }
                    else
                    {
                        System.out.println("You approach her, and she greets you.\n"
                                + "'Hello hello are you American? Good. Listen, do you know where antique store is? I'm looking for famous vase to take picture of!'\n"
                                + "She holds up a nice Polaroid camera. She's evidently interested in historical artifacts. She stares at you while you stand, pondering.");
                    }
                }
                else if(x.equals("give vase")||x.equals("give her the vase")||x.equals("give her vase")||x.equals("give vase to woman")||x.equals("give vase to asian"))
                {
                    if(camera)
                    {
                        System.out.println("I don't understand that.");
                    }
                    else
                    {
                        if(vase)
                        {
                            System.out.println("You hand her the vase you got at the bathroom. Her face lights up with joy.\n"
                                    + "'Thank you! Thank you!'\n"
                                    + "She takes a picture of it. Now at peace, and with her picture in possesion, she hands you the camera.\n"
                                    + "'Here! I don't need it now. Thank you!'\n"
                                    + "Confused but grateful for a nice camera, you take the gift.");
                            inv.remove("Vase"); inv.add("Camera"); camera = true; asian = true;
                        }
                        else
                        {
                            System.out.println("I don't understand that.");
                        }
                    }
                }
                else if(x.equals("n") || x.equals("s") || x.equals("e") || x.equals("w"))
                    System.out.println("Can't go that way.");
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(ggbOutside)
            {
                if(x.equals("look"))
                {
                    if(escape)
                    {
                        System.out.println("You're on the sidewalk, with a beautiful view of the world-famous Golden Gate Bridge in front of you. It really is a breathtaking bridge.\n"
                                + "You're lucky you came on a day with little fog in the city. There's an interesting looking bush nearby amongst the other foliage.\n"
                                + "Tourists line the sidewalks and the most opportunistic photo grounds.\n"
                                + "Go north to walk on the bridge.");
                    }
                    else
                    {
                        System.out.println("You're on the sidewalk, with a beautiful view of the world-famous Golden Gate Bridge in front of you. It really is a breathtaking bridge.\n"
                                + "You're lucky you came on a day with little fog in the city. There's an interesting looking bush nearby amongst the other foliage.\n"
                                + "Tourists line the sidewalks and the most opportunistic photo grounds. There's one man in particular with a big duffel bag in hand, standing next to the bush.\n"
                                + "Go north to walk on the bridge.");
                    }
                }
                else if(x.equals("examine bush")||x.equals("examine the bush"))
                {
                    if(escape)
                    {
                        System.out.println("There's a hole under the bush with a big duffel bag at the bottom!");
                    }
                    else
                    {
                        System.out.println("There's a hole under the bush. Nothing there.");
                    }
                }
                else if(x.equals("examine hole")||x.equals("examine the hole"))
                {
                    if(escape)
                    {
                        System.out.println("It's got the duffel bag in it.");
                    }
                    else
                        System.out.println("It's empty. Nothing special about it now.");
                }
                else if(x.equals("examine man")||x.equals("examine the man"))
                {
                    if(escape)
                    {
                        printElses();
                    }
                    else
                        System.out.println("Just standing there. Looks like he doesn't want to be disturbed. He's got a big bag in his hand.\n"
                                + "The t-shirt he's wearing has the printed words on in, 'Zoo Security'.");
                }
                else if(x.equals("talk to man")||x.equals("talk to the man"))
                {
                    if(escape)
                    {
                        printElses();
                    }
                    else
                        System.out.println("You go up to him.\n"
                                + "He wags his finger, saying, 'No no, please I can't be disturbed right now. Now's not the time.'");
                }
                else if(x.equals("take bag")||x.equals("take the bag")||x.equals("take duffel bag")||x.equals("take the duffel bag"))
                {
                    if(escape)
                    {
                        System.out.println("Taken."); inv.add("Duffel Bag"); bag = true;
                    }
                    else
                        printElses();
                }
                else if(x.equals("n"))
                {
                    ggbOutside = false;
                    ggb = true;
                    System.out.println("On the bridge.");
                }
                else if(x.equals("e") || x.equals("s") || x.equals("w"))
                    System.out.println("Can't go that way.");
                else if(x.equals("examine tourists")||x.equals("examine the tourists"))
                {
                    System.out.println("There's quite a plethora of diverse interaction available. People are speaking several different languages all around you.");
                }
                else if(x.equals("enter taxi"))
                {
                    System.out.println("You call the nearest taxi and it promptly stops at your feet. You get in.");
                    System.out.println("'Where ya going, mon ami?\n");
                    System.out.println("a) California Academy of Sciences");
                    System.out.println("b) Lombard Street");
                    System.out.println("c) Home");
                    System.out.println("d) Golden Gate Bridge");
                }
                else if(x.equals("a"))
                {
                    ggbOutside = false;
                    academyOutside = true;
                    System.out.println("California Academy of Sciences.");
                }
                else if(x.equals("b"))
                {
                    ggbOutside = false;
                    lombard = true;
                    System.out.println("Lombard Street.");
                }
                else if(x.equals("c"))
                {
                    ggbOutside = false;
                    streetCorner = true;
                    System.out.println("Street Corner.");  
                }
                else if(x.equals("d"))
                {
                    System.out.println("Golden Gate Bridge.");
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(ggb)
            {
                if(x.equals("look"))
                {
                    System.out.println("You're now on the sidewalk on the middle of the bridge, where the pedestrians are all on their way.\n"
                            + "There's a couple amongst the crowd that seem to be trying to get your attention.\n"
                            + "The way to the edge of the bridge and the taxis is south.");
                }
                else if(x.equals("examine couple"))
                {
                    System.out.println("A guy and his girl. They're about as handsome a couple as there ever was. They're trying to get your attention.");
                }
                else if(x.equals("s"))
                {
                    ggb = false;
                    ggbOutside = true;
                    System.out.println("Golden Gate Bridge.");
                }
                else if(x.equals("n"))
                {
                    System.out.println("It's just the rest of the highway. What lies beyond there is for another time.");
                }
                else if(x.equals("e") || x.equals("w"))
                    System.out.println("Can't go that way.");
                else if(x.equals("talk to couple")||x.equals("go to couple")||x.equals("approach couple"))
                {
                    if(couple)
                    {
                        System.out.println("They wave, still grateful for that nice picture you gave them.");
                    }
                    else
                    {
                        System.out.println("You approach them. They smile and greet you.\n"
                                + "'Hello! Can you take our picture please?'\n"
                                + "They pose, embracing, with the city behind them.\n\n"
                                + "a) 'Yes, of course.'\n"
                                + "b) 'Sorry, I don't have a camera.'\n");
                        String coupleConvo = osConsole.nextLine();
                        if(coupleConvo.equals("a"))
                        {
                            if(camera)
                            {
                                System.out.println("'Yes, of course.'\n"
                                        + "You take their picture, turns out to be a good one.\n"
                                        + "Out comes the picture from the Polaroid and you hand it to them.\n"
                                        + "'Thank you so much! Please, take this extra baseball ticket for the game today. We had an extra.'\n"
                                        + "Grateful, you take the ticket."); tix = true; couple = true; inv.remove("Camera"); inv.add("Baseball Ticket");
                            }
                            else
                                System.out.println("You don't have a camera. Neither do they, apparently.");
                        }
                        else if(coupleConvo.equals("b"))
                        {
                            System.out.println("'Sorry, I don't have a camera.'\n"
                                    + "'Oh... alright. Thanks anyways.'");
                        }
                    } 
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(attOutside)
            {
                if((iCount % 2) != 0) //daytime
                {
                    if(x.equals("look"))
                    {
                        System.out.println("You're at the western gate of the big stadium, right off Willie Mays Plz.\n"
                                + "Throngs of orange clad fans are filling into the line to get in.\n"
                                + "Go east to enter the park.");
                    }
                    else if(x.equals("e"))
                    {
                        if(tix)
                        {
                            attOutside = false;
                            attSquare = true;
                            System.out.println("You cross through the threshold."); inv.remove("Baseball Ticket");
                        }
                        else
                        {
                            System.out.println("Hey you can't get in without a ticket. It's a sold out event, by the way.");
                        }
                    }
                    else if(x.equals("s") || x.equals("w") || x.equals("n"))
                        System.out.println("Can't go that way.");
                    else if(x.equals("enter taxi"))
                    {
                        System.out.println("You call the nearest taxi and it promptly stops at your feet. You get in.");
                        System.out.println("'Where ya going, che?\n");
                        System.out.println("a) Tiffany & Co.");
                        System.out.println("b) San Francisco Zoo");
                        System.out.println("c) AT&T Park");
                    }
                    else if(x.equals("a"))
                    {
                        attOutside = false;
                        tiffanyOutside = true;
                        System.out.println("Tiffany & Co.");
                    }
                    else if(x.equals("b"))
                    {
                        attOutside = false;
                        zooOutside = true;
                        System.out.println("San Francisco Zoo.");
                    }
                    else if(x.equals("c"))
                    {
                        System.out.println("AT&T Park, Home of the SF Giants.");  
                    }
                    else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                        printGenerics();
                    else
                        printElses();

                    System.out.println("");
                    x = osConsole.nextLine();
                }
                else //night time
                {
                    if(x.equals("look"))
                    {
                        if(dateOver)
                        {
                            System.out.println("You're at the western gate of the big stadium, right off Willie Mays Plz.\n"
                                + "Throngs of orange clad fans are everywhere, some leaving, some just standing around.\n"
                                + "Go east to enter the park.");
                        }
                        else
                        {
                            System.out.println("You're at the western gate of the big stadium, right off Willie Mays Plz.\n"
                                + "Throngs of orange clad fans are everywhere, some leaving, some just standing around.\n"
                                + "There's a girl outside the entrance sitting on a bench looking at her phone with her headphones in.\n"
                                + "Go east to enter the park."); 
                        }
                    }
                    else if(x.equals("talk to girl")||x.equals("talk to the girl")||x.equals("go to the girl")||x.equals("go to girl"))
                    {
                        if(date)
                        {
                            if(dateOver)
                            {
                                System.out.println("She's not there anymore.");
                            }
                            else
                            {
                                System.out.println("You walk up to her and say hi.\n"
                                        + "She smiles, recognizing you from the academy. She puts her phone down and takes off her headphones.\n"
                                        + "'What's up?'\n\n"
                                        + "a) 'Just chilling. You?'\n");
                                Scanner dateConvo = new Scanner(System.in); //TODO: what's happening here?
                                String s1 = dateConvo.nextLine();
                                System.out.println("'Just chilling. You?'\n"
                                        + "'I've been watching some Andy Griffith Show! That Don Knotts really was a character. Want to watch some?'\n"
                                        + "She unplugs her headphones and motions for you to sit down next to her.\n"
                                        + "You have a wonderful time watching a couple episodes together, and the time flies.\n"
                                        + "Kiss her?\n\n"
                                        + "a) Yes"
                                        + "b) No\n");
                                String s2 = dateConvo.nextLine();
                                if(s2.equals("a"))
                                {
                                    System.out.println("You bring your face to hers. She totally accepts and you kiss real quick. Booyah.\n"
                                            + "You chat a little longer, but she eventually has to go.");
                                }
                                else if(s2.equals("b"))
                                {
                                    System.out.println("You decide not to kiss her. You chat a little longer, and she has to go.\n"
                                            + "Honestly, she seemed dissapointed when she left.");
                                }
                                else
                                {
                                     System.out.println("You bring your face to hers. She totally accepts and you kiss real quick. Booyah.\n"
                                            + "You chat a little longer, but she eventually has to go.");
                                }
                                dateOver = true;
                            }        
                        }
                        else
                        {
                            System.out.println("You walk up to her and say hi.\n"
                                    + "She's too absorbed in her video unfortunately. She doesn't see you.\n"
                                    + "Walking away, you hear her laughing hysterically. It's probably at whatever she was watching.");
                        }
                    }
                    else if(x.equals("examine girl")||x.equals("examine the girl"))
                    {
                        System.out.println("Extraordinarily pretty.");
                    }
                    else if(x.equals("e"))
                    {
                        if(tix)
                        {
                            attOutside = false;
                            attSquare = true;
                            System.out.println("You cross through the threshold."); inv.remove("Baseball Ticket");
                        }
                        else
                        {
                            System.out.println("Hey you can't get in without a ticket. It's a sold out event, by the way.");
                        }
                    }
                    else if(x.equals("s") || x.equals("w") || x.equals("n"))
                        System.out.println("Can't go that way.");
                    else if(x.equals("enter taxi"))
                    {
                        System.out.println("You call the nearest taxi and it promptly stops at your feet. You get in.");
                        System.out.println("'Where ya going, che?'\n");
                        System.out.println("a) Tiffany & Co.");
                        System.out.println("b) San Francisco Zoo");
                        System.out.println("c) AT&T Park");
                    }
                    else if(x.equals("a"))
                    {
                        attOutside = false;
                        tiffanyOutside = true;
                        System.out.println("Tiffany & Co.");
                    }
                    else if(x.equals("b"))
                    {
                        attOutside = false;
                        zooOutside = true;
                        System.out.println("San Francisco Zoo.");
                    }
                    else if(x.equals("c"))
                    {
                        System.out.println("AT&T Park, Home of the SF Giants.");  
                    }
                    else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                        printGenerics();
                    else
                        printElses();

                    System.out.println("");
                    x = osConsole.nextLine();
                }
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(attSquare)
            {
                if(x.equals("look"))
                {
                    System.out.println("You're amidst one of the more giant crowds you've ever been in.\n"
                            + "To the east is the field, where you can sit and enjoy the game.\n"
                            + "To the south is the concessions booth, where they sell all the food.\n"
                            + "To the north is the souvenir shop, where you can buy any hats or jerseys, granted you're a fan.");
                }
                else if(x.equals("e"))
                {
                    attSquare = false;
                    attField = true;
                    System.out.println("Behind home plate.");
                }
                else if(x.equals("s"))
                {
                    attSquare = false;
                    attFood = true;
                    System.out.println("Concessions booth.");
                }
                else if(x.equals("n"))
                {
                    attSquare = false;
                    attShop = true;
                    System.out.println("Souvenir shop.");
                }
                else if(x.equals("w"))
                {
                    attSquare = false;
                    attOutside = true;
                    System.out.println("Outside of the stadium.");
                }
                else if(x.equals("eat food")||x.equals("eat grub")||x.equals("eat"))
                {
                    if(food)
                    {
                        System.out.println("You take out your lovely looking meal and eat it straight up. It fills you up so much you could only eat half.\n"
                                + "You put the rest in your pocket.");
                        food = false; leftovers = true;
                    }
                    else if(leftovers)
                    {
                        System.out.println("Best save the rest for later.");
                    }
                    else
                    {
                        System.out.println("You don't have any.");
                    }
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(attShop)
            {
                if(x.equals("look"))
                {
                    System.out.println("It's a roomy place. Smells like new clothes. There's lots of kids running around.\n"
                            + "Nearby there's a big bin full of plush baseballs. There's a sign that says, 'Welcome to AT&T Park! Please take one!'\n"
                            + "Exit to the center of the park is to the south.");
                }
                else if(x.equals("examine baseball")||x.equals("examine the baseballs")||x.equals("examine the baseball")||x.equals("examine baseballs"))
                {
                    System.out.println("They're smaller than a normal baseball, and way softer too. Kind of like a stress ball.");
                }
                else if(x.equals("take baseball")||x.equals("take ball"))
                {
                    if(baseball)
                    {
                        System.out.println("You already have one.");
                    }
                    else
                    {
                        System.out.println("Taken."); inv.add("Baseball"); baseball = true;
                    }
                }
                else if(x.equals("s"))
                {
                    attShop = false;
                    attSquare = true;
                    System.out.println("Park center.");
                }
                else if(x.equals("w") || x.equals("n") || x.equals("e"))
                    System.out.println("Can't go that way.");
                else if(x.equals("eat food")||x.equals("eat grub")||x.equals("eat"))
                {
                    if(food)
                    {
                        System.out.println("You take out your lovely looking meal and eat it straight up. It fills you up so much you could only eat half.\n"
                                + "You put the rest in your pocket.");
                        food = false; leftovers = true;
                    }
                    else if(leftovers)
                    {
                        System.out.println("Best save the rest for later.");
                    }
                    else
                    {
                        System.out.println("You don't any.");
                    }
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(attFood)
            {
                if(x.equals("look"))
                {
                    System.out.println("Oh baby the smell of ballpark food. The menu's ridiculously expensive, of course.\n"
                            + "A young teenager is looking at you from behind the counter.\n"
                            + "Exit is to the north.");
                }
                else if(x.equals("n"))
                {
                    attFood = false;
                    attSquare = true;
                    System.out.println("Park center.");
                }
                else if(x.equals("e") || x.equals("s") || x.equals("w"))
                    System.out.println("Can't go that way.");
                else if(x.equals("talk to teen")||x.equals("talk to the teen")||x.equals("talk to the teenager")||x.equals("talk to teenager")||x.equals("talk to cashier")||x.equals("talk to the cashier"))
                {
                    System.out.println("He puts out a weak smile as you approach.\n"
                            + "'What'll it be?'\n\n"
                            + "a) 'Hot dog, please.'\n"
                            + "b) 'Hamburger, please.'\n"
                            + "c) 'Fries, please.'\n"
                            + "d) 'Ice cream, please.\n");
                    String foodConvo = osConsole.nextLine();
                    if(foodConvo.equals("a"))
                    {
                        if(baseball)
                        {
                            System.out.println("'Hot dog, please.'\n"
                                    + "'That'll be $12'\n"
                                    + "You reach into your pockets. No cash.\n"
                                    + "The teen sees that baseball in your pocket. He lifts his gaze.\n"
                                    + "'Hey I'll trade you for that!'\n\n"
                                    + "Make the trade?\n\n"
                                    + "a) Yes\n"
                                    + "b) No\n");
                            String foodConvo2 = osConsole.nextLine();
                            if(foodConvo2.equals("a"))
                            {
                                System.out.println("You hand him the ball and he gives you your food.\n"
                                        + "Interesting trade. He greatly thanks you for the ball. Must've wanted one real bad."); inv.remove("Baseball"); inv.add("Food"); food = true; baseball = false;
                            }
                            else if(foodConvo2.equals("b"))
                            {
                                System.out.println("You tell him no and he frowns. He turns to another customer.");
                            }
                            else
                                System.out.println("He couldn't understand you. Giving you a puzzled gaze, he turns to another customer. Try again.");
                        }
                        else
                        {
                            System.out.println("'Hot dog, please.'\n"
                                    + "'That'll be $12.'\n"
                                    + "You reach into your pockets. No cash.");
                        }
                    }
                    else if(foodConvo.equals("b"))
                    {
                        if(baseball)
                        {
                            System.out.println("'Hamburger, please.'\n"
                                    + "'That'll be $16'\n"
                                    + "You reach into your pockets. No cash.\n"
                                    + "The teen sees that baseball in your pocket. He lifts his gaze.\n"
                                    + "'Hey I'll trade you for that!'\n\n"
                                    + "Make the trade?\n\n"
                                    + "a) Yes\n"
                                    + "b) No\n");
                            String foodConvo2 = osConsole.nextLine();
                            if(foodConvo2.equals("a"))
                            {
                                System.out.println("You hand him the ball and he gives you your food.\n"
                                        + "Interesting trade. He greatly thanks you for the ball. Must've wanted one real bad."); inv.remove("Baseball"); inv.add("Food"); food = true; baseball = false;
                            }
                            else if(foodConvo2.equals("b"))
                            {
                                System.out.println("You tell him no and he frowns. He turns to another customer.");
                            }
                            else
                                System.out.println("He couldn't understand you. Giving you a puzzled gaze, he turns to another customer. Try again.");
                        }
                        else
                        {
                            System.out.println("'Hamburger, please.'\n"
                                    + "'That'll be $16.'\n"
                                    + "You reach into your pockets. No cash.");
                        }
                    }
                    else if(foodConvo.equals("c"))
                    {
                        if(baseball)
                        {
                            System.out.println("'Fries, please.'\n"
                                    + "'That'll be $10'\n"
                                    + "You reach into your pockets. No cash.\n"
                                    + "The teen sees that baseball in your pocket. He lifts his gaze.\n"
                                    + "'Hey I'll trade you for that!'\n\n"
                                    + "Make the trade?\n\n"
                                    + "a) Yes\n"
                                    + "b) No\n");
                            String foodConvo2 = osConsole.nextLine();
                            if(foodConvo2.equals("a"))
                            {
                                System.out.println("You hand him the ball and he gives you your food.\n"
                                        + "Interesting trade. He greatly thanks you for the ball. Must've wanted one real bad."); inv.remove("Baseball"); inv.add("Food"); food = true; baseball = false;
                            }
                            else if(foodConvo2.equals("b"))
                            {
                                System.out.println("You tell him no and he frowns. He turns to another customer.");
                            }
                            else
                                System.out.println("He couldn't understand you. Giving you a puzzled gaze, he turns to another customer. Try again.");
                        }
                        else
                        {
                            System.out.println("'Fries, please.'\n"
                                    + "'That'll be $10.'\n"
                                    + "You reach into your pockets. No cash.");
                        }
                    }
                    else if(foodConvo.equals("d"))
                    {
                        if(baseball)
                        {
                            System.out.println("'Ice cream, please.'\n"
                                    + "'That'll be $20'\n"
                                    + "You reach into your pockets. No cash.\n"
                                    + "The teen sees that baseball in your pocket. He lifts his gaze.\n"
                                    + "'Hey I'll trade you for that!'\n\n"
                                    + "Make the trade?\n\n"
                                    + "a) Yes\n"
                                    + "b) No\n");
                            String foodConvo2 = osConsole.nextLine();
                            if(foodConvo2.equals("a"))
                            {
                                System.out.println("You hand him the ball and he gives you your food.\n"
                                        + "Interesting trade. He greatly thanks you for the ball. Must've wanted one real bad."); inv.remove("Baseball"); inv.add("Food"); food = true; baseball = false;
                            }
                            else if(foodConvo2.equals("b"))
                            {
                                System.out.println("You tell him no and he frowns. He turns to another customer.");
                            }
                            else
                                System.out.println("He couldn't understand you. Giving you a puzzled gaze, he turns to another customer. Try again.");
                        }
                        else
                        {
                            System.out.println("'Ice cream, please.'\n"
                                    + "'That'll be $20.'\n"
                                    + "You reach into your pockets. No cash.");
                        }
                    }
                    else
                        System.out.println("I don't understand that. Please try again.");
                }
                else if(x.equals("eat food")||x.equals("eat grub")||x.equals("eat"))
                {
                    if(food)
                    {
                        System.out.println("You take out your lovely looking meal and eat it straight up. It fills you up so much you could only eat half.\n"
                                + "You put the rest in your pocket.");
                        food = false; leftovers = true;
                    }
                    else if(leftovers)
                    {
                        System.out.println("Best save the rest for later.");
                    }
                    else
                    {
                        System.out.println("You don't have any.");
                    }
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////

            while(attField)
            {
                if(x.equals("look"))
                {
                    System.out.println("You're behind home plate, not too far away. You feel the bright sun on this nice day, and you smell the bay. Hooray.\n"
                            + "There's several fans, eating their grub. You can 'sit' or 'enjoy game' if you'd like.");
                }
                else if(x.equals("w"))
                {
                    attField = false;attSquare = true;
                    System.out.println("Park center.");
                }
                else if(x.equals("n") || x.equals("e") || x.equals("s"))
                    System.out.println("Can't go that way.");
                else if(x.equals("sit"))
                {
                    System.out.println("You take a seat on a comfy chair. Right next to you is a middle-aged man, clearly relishing his sunflower seeds.\n"
                            + "You see the scoreboard. Diamondbacks are in town. Bottom of the 2nd. Giants are already down by a run.");
                }
                else if(x.equals("enjoy game"))
                {
                    System.out.println("You do so. It is most enjoyable.\n"
                            + "You see the scoreboard. Diamondbacks are in town. Bottom of the 2nd. Giants are already down by a run.");
                }
                else if(x.equals("talk to man")||x.equals("talk to the man"))
                {
                    System.out.println("He grunts at you, 'Bub I'm trying to pay attention here.'");
                }
                else if(x.equals("eat food")||x.equals("eat grub")||x.equals("eat"))
                {
                    if(food)
                    {
                        System.out.println("You take out your meal and eat it straight up. It fills you up so much you could only eat half.\n"
                                + "You put the rest in your pocket.");
                        food = false; leftovers = true;
                    }
                    else if(leftovers)
                    {
                        System.out.println("Best save the rest for later.");
                    }
                    else
                    {
                        System.out.println("You don't have any.");
                    }
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
            }
            
////////////////////////////////////////////////////////////////////////////////
            int minutes = 0; boolean note = false; boolean guard = false; boolean taser = false; boolean key = false;
            while(escapeRoom)
            {
                if(minutes == 30)
                {
                    guard = true;
                    System.out.println("Suddenly, the door opens. In comes a security guard. You immediately notice the keychain hanging from his hip and the taser in his hand. He approaches.\n"
                            + "'We're very serious about the no feeding policy here. Those who break it must be disciplined.'\n"
                            + "Perplexed by the strangeness of this zoo's policies, your jaw drops as he lifts up his taser.");
                }
                if(minutes == 50)
                {
                    if(guard)
                    {
                        System.out.println("The guard tases you and you pass out.");
                        System.out.println("THE END. Better luck next time."); System.exit(0);
                    }
                }
                if(x.equals("look"))
                {
                    System.out.println("You're in a small room.\n"
                            + "To the west is the single door, your way out.\n"
                            + "There's a bookshelf in one of the corners of the room, with a bed in another.\n"
                            + "Not the most accomodating living quarters.");
                }
                else if(x.equals("take taser")||x.equals("steal taser"))
                {
                    if(guard)
                    {
                        System.out.println("You dive at his taser before he gets a shot off. The two of you wrestle for it until you manage it into your hands."); taser = true;
                    }
                }
                else if(x.equals("shoot guard")||x.equals("shoot the guard")||x.equals("tase guard")||x.equals("tase the guard"))
                {
                    if(taser)
                    {
                        System.out.println("You fire the taser. The guard collapses after being shocked to unconsciousness."); guard = false;
                    }
                }
                else if(x.equals("take keys")||x.equals("take key")||x.equals("take keychain"))
                {
                    if(taser)
                    {
                        System.out.println("Taken."); inv.add("Key"); key = true;
                    }
                }
                else if(x.equals("open door")||x.equals("w")||x.equals("exit")||x.equals("open the door")||x.equals("escape"))
                {
                    if(taser)
                    {
                        if(key)
                        {
                            escapeRoom = false; zooOutside = true; escape = true; inv.remove("Key");
                            System.out.println("Success. You escaped. You find yourself at the zoo entrance again.");
                        }
                        else
                            System.out.println("You still need to grab the keys.");
                    }
                    else
                        System.out.println("Nice try. It's locked tight.");
                }
                else if(x.equals("e") || x.equals("n") || x.equals("s"))
                    System.out.println("Can't go that way.");
                else if(x.equals("examine bookshelf")||x.equals("examine the bookshelf"))
                {
                    System.out.println("Not a big selection, yet three books really stand out to you.\n"
                            + "There's:\n\n"
                            + "a) Hamlet\n"
                            + "b) The Great Escape\n"
                            + "c) Oh The Places You'll Go");
                }
                else if(x.equals("read hamlet")||x.equals("examine hamlet")||x.equals("a"))
                {
                    System.out.println("You read the opening lines and become disinterested. This is not helping you get out of here.");
                }
                else if(x.equals("read oh the places you'll go")||x.equals("examine oh the places you'll go")||x.equals("read seuss")||x.equals("c"))
                {
                    System.out.println("You read it. The whole thing. It's stunning. Marvelous. 10/10. Not helping you leave this room, though.");
                }
                else if(x.equals("read the great escape")||x.equals("examine the great escape")||x.equals("b"))
                {
                    if(note)
                    {
                        System.out.println("You start to read it, and it fills you with motivation and determination to leave.");
                    }
                    else
                    {
                        System.out.println("You open it up and immediately a note comes floating down to the ground."); note = true;
                    }
                }
                else if(x.equals("read")||x.equals("read book")||x.equals("read books")||x.equals("examine books"))
                {
                    System.out.println("Please specify which book you wish to read.");
                }
                else if(x.equals("read note")||x.equals("examine note")||x.equals("read the note")||x.equals("examine the note")||x.equals("take note"))
                {
                    if(note)
                    {
                        System.out.println("It reads, 'Dear Convict,\n\nYou're probably in here because you fed the animals.\n"
                                + "Have no fear. I was in your same boat at one point.\n"
                                + "Oh yes, I despised the zoo for doing this to me. For that reason I've decided to help out any and all who happen to be in your unfortuanate situation.\n"
                                + "I sell duffel bags and stuff for tourists, but I'll give you one for free. It's my way of helping. Everyone needs a good duffel bag.\n"
                                + "I'm usually selling my wares at the Golden Gate Bridge, and I'll drop off your bag for you there once you've escaped. Good luck.\n\n"
                                + "Signed,\nYour secret admirer");
                    }
                    else
                        printElses();
                }
                else if(x.equals("sleep"))
                {
                    System.out.println("You take a quick power nap.");
                }
                else if(x.equals("cry"))
                {
                    System.out.println("You do so.");
                }
                else if(x.equals("examine bed"))
                {
                    System.out.println("Your run of the mill lumpy mattress.");
                }
                else if(x.equals("help") || x.equals("wait") || x.equals("time") || x.equals("i") || x.equals("inventory") || x.equals("quit"))
                    printGenerics();
                else
                    printElses();

                System.out.println("");
                x = osConsole.nextLine();
                minutes++;
            }
        } //end of game loop
    }     
} 
