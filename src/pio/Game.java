package pio;


import java.util.Random;


public class Game {
    public static void main(String[] args) {

        Random rand = new Random();     
        Player player = new Player();
        player.setName("Automat losujacy");
        
        int number;                     
        int guess;                      

        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = player.guess();
            System.out.println("Gracz \'" + player.getName() + "\' wylosowal: " + guess);

            if (number != guess) {
                System.out.println("PUD£O!");
            }
            else {
                System.out.println("BRAWO!");
            }

        } while (number != guess);
    }

}