public class ProgramFlows {
    //during execution the Java Virtual Machine (JVM)
    //will always look for a main method to executes
    //from top to bottom

        //print statement to get things started


        //if code reaches a statement, which causes
        //it to leave the main method
        //  (another method or class called)
        //java will go execute ALL code in the method
        //once finished it will return to the point
        //in the main method where it left


        //print statement showing return
        //print statement showing results


        //sometimes a method call may have
        //the program travel to other methods
        //but it will eventually return to
        //the main to finish execution
        //there are special cases
        //   errors occur
        //   specifically having the program quit


        //print statement from final return
        //print statement for results


        //final print statement


    public static String songLyric (String songTitle) {
        System.out.printf("%37s", "Entered the song lyric method");

        //we can go to another method from within a method
        //we will go an execute ALL the code in that method
        //then return to this method at this location
        //   WE ALWAYS WILL RETURN TO WHERE WE WERE CALLED
        //and move on


        System.out.printf("%55s", "TYPE SOME STUFF HERE");

        return artists + " sings " + songTitle + "\n" +
                "I've got a little bit longer, I got a ways to go";
    }//end of songLyric method

    public static int add (int numOne, int numTwo) {
        System.out.printf("%55s", "Outside the main method... inside the add method\n");
        return numOne + numTwo;
    }//end of add method

    //when we call a method it does not matter
    //where that method is located
    //if we call it correctly (we will learn this later)
    //java will find it and execute it
    private static String whoSings (String songTitle) {
        System.out.printf("%75s", "Entered the whoSings method\n");
        if ("Ways to Go".equals(songTitle)) {
            return "Grouplove";
        }
        return "wrong group no love";
    }//end of whoSings method

}//end of class
