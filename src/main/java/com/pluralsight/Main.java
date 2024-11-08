package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        System.out.println(":+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+:#");
        wait(600);
        System.out.println("+██████╗ ███████╗██╗     ██╗               ██████╗██╗ ██████╗ ██╗   ██╗███████╗#");
        wait(500); // 0.5-second delay
        System.out.println("#██╔══██╗██╔════╝██║     ██║              ██╔════╝██║██╔═══██╗██║   ██║██╔════╝+");
        wait(400);
        System.out.println("+██║  ██║█████╗  ██║     ██║    █████╗    ██║     ██║██║   ██║██║   ██║███████╗#");
        wait(400);
        System.out.println("#██║  ██║██╔══╝  ██║     ██║    ╚════╝    ██║     ██║██║   ██║██║   ██║╚════██║+");
        wait(400);
        System.out.println("+██████╔╝███████╗███████╗██║              ╚██████╗██║╚██████╔╝╚██████╔╝███████║#");
        wait(400);
        System.out.println("#╚═════╝ ╚══════╝╚══════╝╚═╝               ╚═════╝╚═╝ ╚═════╝  ╚═════╝ ╚══════╝+");
        System.out.println(":+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+::+:#:x:#:+:#");
    }






    // Method to handle waiting
    public static void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace(); // Handle the interruption
        }
    }
}
