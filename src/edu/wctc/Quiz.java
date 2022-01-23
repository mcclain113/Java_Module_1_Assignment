package edu.wctc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    private Scanner keyboard;
    private  int points;
    private  String again;

    public String getAgain() {
        return again;
    }

    public void setAgain(String again) {
        this.again = again;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Quiz(){
        keyboard = new Scanner(System.in);
    }

public void play(){
        String[] questions = {"Do you prefer mild or spicy?", "Do you prefer tea or coffee?", "Do you prefer breakfast or brunch?", "Do you prefer summer or winter?", "Do you prefer paper or plastic?"};

        
        System.out.println("Welcome to the Preference Quiz!");
        System.out.println("...............................");

    for (int i = 0; i < questions.length; i++) {

        System.out.println(questions[i]);
        System.out.println("Enter 0 for the preference on the left");
        System.out.println("Enter 1 for the preference on the right");
        points = points + Integer.parseInt(keyboard.nextLine());
        
    }

        System.out.printf("Your score: %d %n",points);
        if (points < 3)
        {
            System.out.println("You prefer life to be calm and organized");
        }

        else if (points > 3)
        {
            System.out.println("You prefer life to be spontaneous and active");
        }

        else //could continue else if with points == 3, but no point
        {
            System.out.println("You prefer a good balance in life");
        }

        System.out.println("Again? Enter 1 to play again, or any other key to exit.");

        again = keyboard.nextLine();

        if (again.equals("1"))
        {
            points = 0;
            again = "";
            play();


        }
        else
        {

        }

}
}
