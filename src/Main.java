import java.util.Scanner;
import java.util.Random;

void main() {

    boolean playAgian = true;

    while (playAgian) {
        startMenu();
        playAgian = gameMenu();
    }
}

//Metoder

//Start menu

static void startMenu() {
    System.out.println("======================================");
    System.out.println("   Velkommen til gæt et tal spillet   ");
    System.out.println("======================================");
    System.out.println();
    System.out.println("======================================");
    System.out.println("         Vælg en sværhedsgrad         ");
    System.out.println("======================================");
    System.out.println("1. Gæt et tal i mellem 1-10      (let)");
    System.out.println("--------------------------------------");
    System.out.println("2. Gæt et tal i mellem 1-50    (mellem");
    System.out.println("--------------------------------------");
    System.out.println("3. Gæt et tal i mellem 1-100    (svær)");
    System.out.println("--------------------------------------");
    System.out.println("4. Gæt et tal i mellem 1-250  (umulig)");
    System.out.println("======================================");
}

//Vælg menu

static boolean gameMenu() {

    Scanner input = new Scanner(System.in);
    int spil = input.nextInt();

    int usedGuesses;

    switch (spil) {
        case 1:
            System.out.println("Du har valgt gæt et tal i mellem 1-10");
            usedGuesses = guess10();
            System.out.println("Spillet er slut. Du brugte " + usedGuesses + " forsøg");
            break;
        case 2:
            System.out.println("Du har valgt gæt et tal i mellem 1-50");
            usedGuesses = guess50();
            System.out.println("Spillet er slut. Du brugte " + usedGuesses + " forsøg");
            break;
        case 3:
            System.out.println("Du har valgt gæt et tal i mellem 1-100");
            usedGuesses = guess100();
            System.out.println("Spillet er slut. Du brugte " + usedGuesses + " forsøg");
            break;
        case 4:
            System.out.println("Du har valgt gæt et til i mellem 1-250");
            usedGuesses = guess250();
            System.out.println("Spillet er slut. Du brugte " + usedGuesses + " forsøg");
            break;
        default:
            System.out.println("Ukendt værdi, vælg 1, 2, 3 eller 4");
            System.out.println();
            return true;
    }
    System.out.println("Har du lyst til at spille igen? (ja/nej)");
    String svar = input.nextLine();

    if (svar.equalsIgnoreCase("ja")) {
        return true;
    } else {
        System.out.println("Spillet lukker. Tak for i dag!");
        return false;
    }
}

//Gæt tallet 1 - 10

static int guess10 () {
    Scanner input = new Scanner(System.in);
    Random randomNum = new Random();

    int computerNum10 = randomNum.nextInt(10) + 1;
    int guess = 0;
    int guesses = 0;

    System.out.println("Jeg tænker på et tal i mellem 1-10. Gæt det!");
    System.out.println("Du har uendeligt gæt");

    while (guess != computerNum10) {
        guess = input.nextInt();
        guesses++;

        if (computerNum10 == guess) {
            System.out.println("Du har gættet rigtigt");
        } else if (guess < computerNum10) {
            System.out.println("Tallet er for lavt. Prøv med et nyt");
        } else {
            System.out.println("Tallet er for højt. Prøv med et nyt");
        }
    }
    return guesses;
}

//Gæt tallet 1 - 50

static int guess50 () {
    Scanner input = new Scanner(System.in);
    Random randomNum = new Random();

    int computerNum50 = randomNum.nextInt(50) + 1;
    int guess = 0;
    int guesses = 1;
    int maxguesses = 10;

    System.out.println("Jeg tænker på et tal i mellem 1-50. Gæt det!");
    System.out.println("Du har 10 forsøg til at gætte tallet");

    while (guess != computerNum50 && guesses <= 10) {
        guess = input.nextInt();


        if (computerNum50 == guess) {
            System.out.println("Du har gættet rigtigt");
            break;
        } else if (guess < computerNum50) {
            System.out.println("Tallet er for lavt.");
        } else {
            System.out.println("Tallet er for højt.");
        }
        if (guess != computerNum50) {
            System.out.println("Du har brugt " + guesses + " gæt, du har " + (maxguesses - guesses) + " gæt tilbage");

        }
        guesses++;
    }
    return guesses;
}

//Gæt tallet 1-100

static int guess100 () {
    Scanner input = new Scanner(System.in);
    Random randomNum = new Random();

    int computerNum100 = randomNum.nextInt(100) + 1;
    int guess = 0;
    int guesses = 1;
    int maxguesses = 7;

    System.out.println("Jeg tænker på et tal i mellem 1-100. Gæt det!");
    System.out.println("Du har 7 forsøg til at gætte tallet");

    while (guess != computerNum100 && guesses <= 7) {
        guess = input.nextInt();

        if (computerNum100 == guess) {
            System.out.println("Du har gættet rigtigt");
            break;
        } else if (guess < computerNum100) {
            System.out.println("Tallet er for lavt.");
        } else {
            System.out.println("Tallet er for højt.");
        }
        if (guess != computerNum100) {
            System.out.println("Du har brugt " + guesses + " gæt, du har " + (maxguesses - guesses) + " gæt tilbage");
        }
        guesses++;
    }
    return guesses;
}

//Gæt tallet 1-250

static int guess250 () {
    Scanner input = new Scanner(System.in);
    Random randomNum = new Random();

    int computerNum250 = randomNum.nextInt(250) + 1;
    int guess = 0;
    int guesses = 1;
    int maxguesses = 5;

    System.out.println("Jeg tænker på et tal i mellem 1-250. Gæt det!");
    System.out.println("Du har 5 forsøg til at gætte tallet");

    while (guess != computerNum250 && guesses <= 5) {
        guess = input.nextInt();


        if (computerNum250 == guess) {
            System.out.println("Du har gættet rigtigt");
            break;
        } else if (guess < computerNum250) {
            System.out.println("Tallet er for lavt.");
        } else {
            System.out.println("Tallet er for højt.");
        }
        if (guess != computerNum250) {
            System.out.println("Du har brugt " + guesses + " gæt, du har " + (maxguesses - guesses) + " gæt tilbage");
        }
        guesses++;
    }
    return guesses;
}
