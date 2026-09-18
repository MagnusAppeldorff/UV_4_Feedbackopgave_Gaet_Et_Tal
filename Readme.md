    Runtime Renegades:
-Ahmad -Ayman -Steffan -Magnus
 
    Hvad programmet gør og hvordan det køres:
Spillet går ud på at brugeren skal gætte et vilkårligt tal som computeren genererer inden for et bestemt interval.

Spillet har 4 sværheds niveau (let, mellem, svær og umulig) og brugeren har x antal forsøg afhængigt valg niveau.

Efter hvert forsøg får brugeren af vide, om tallet er for højt eller for lavt og hvor mange forsøg der er brugt, samt hvor man har tilbage.


    Hvordan vi har opdelt programmet i metoder:
void main () Startpunktet, her styres spillet og dens genstartsløkke.

startMenu () Her udskriver spilmenuen med de forskellige spil og sværhedsgrader.

gameMenu () Her håndteres brugerens input og sender brugeren videre til den valgt sværhedsgrad. Her styres også om brugeren vil spille igen.

guess (10), guess (50), guess (100) og guess (250)

Fire separate metoder til de 4 forskellige sværhedsgrader som håndterer selve gætteløkken for det specifikke talinterval  

    Hvorfor denne opdeling:
Vi har valgt at opdele vores metoder, på den måde, så hver metode har et ansvarsområde, det gør koden nemmere at læse og rette fejl.



    Eksempel på en metode med parameter:
I vores metoder har vi ikke brugt parametre, da dataen indtastes direkte i metoderne via brugeren.
De eneste bestemte parameter er i væres randomNum.nextInt() i de forskellige spil


    Ekesmpel på en metode med returværdi:
static boolean gameMenu() {

//kode

System.out.println("Har du lyst til at spille igen? (ja/nej)");

String svar = input.nextLine();

if (svar.equalsIgnoreCase("ja")) {

return true;

} else {

System.out.println("Spillet lukker. Tak for i dag!");

return false;


Her bruger vi en returværdi til at genstarte spillet eller stoppe det, afhængigt om brugeren skirver "ja" eller "nej"


    Løkker i spillet og hvorfor:
I main har vi en while-løkke. while(playAgain) den sørger for at spillet køre for evigt indtil at brugeren skriver "nej".
Vi bruger den da vi ikke ved hvor spil brugeren vil spille.

I gætte metoden har vi også brugt while-løkker til at styre selve gætteprocessen. while(guess != computerNum10).
Her bliver spillet ved med at køre når guess ikke er = computerNum10 og vi ikke ved hvor mange forsøg brugeren skal bruge.

    Test af programmet:
Vi har testet inputtet fra brugeren hvor man vælger sværhedsgrad.
Hvis bruger skriver en ugyldig værdi ind, kommer menuen op igen og man kan skrive en nyt tal ind

På sværhedsgrad 2, 3 og 4 testede vi at spillede stoppede når brugeren nåde det maksimale antal gæt.

Vi testede at egualsIgnoreCase virkede da svarene både, "ja", "JA","nej" og "Nej" alle virkede og genstarter spillet.

    Fejl og udfordring:
playAgain, kunne vi ikke få til at stå i en metode for sig, vi var derfor nødt til at skrive den oppe i main.

Vi havde et problem med at vores guesses blev talt forkert op. 
Hvis brugeren gættede tallet på sit sidste gæt, talte den totale gæt op til 11 i stedet for 10.
Vi løste det ved at have en break efter brugeren gættede rigtigt på sidst forsøg. Derfor gik den ikke ned og tog den sidste guesses++ med. (linje 130-143).

    Hvad vi har lært:
Vi har lært at strukturer opgaven, så det nemmere at gennemskue og finde fejl i de forskellige metoder

Vi har lært hvordan metoder kan anvendes i et program.



    

    



