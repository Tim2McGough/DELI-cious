package com.pluralsight;

public class UserInterface {






    //Methods
    // Method to display the title screen with pauses
    public void displayTitleScreen() {
        System.out.println(":+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+:#");
        wait(800);
        System.out.println("+██████╗ ███████╗██╗     ██╗               ██████╗██╗ ██████╗ ██╗   ██╗███████╗#");
        wait(300);
        System.out.println("#██╔══██╗██╔════╝██║     ██║              ██╔════╝██║██╔═══██╗██║   ██║██╔════╝+");
        wait(300);
        System.out.println("+██║  ██║█████╗  ██║     ██║    █████╗    ██║     ██║██║   ██║██║   ██║███████╗#");
        wait(350);
        System.out.println("#██║  ██║██╔══╝  ██║     ██║    ╚════╝    ██║     ██║██║   ██║██║   ██║╚════██║+");
        wait(350);
        System.out.println("+██████╔╝███████╗███████╗██║              ╚██████╗██║╚██████╔╝╚██████╔╝███████║#");
        wait(350);
        System.out.println("#╚═════╝ ╚══════╝╚══════╝╚═╝               ╚═════╝╚═╝ ╚═════╝  ╚═════╝ ╚══════╝+");
        System.out.println(":+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+:#");
    }

    // Method to handle waiting
    public static void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
