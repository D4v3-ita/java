import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        String pin;
        int i=0;
        int l=0;


        // crea per la prima volta il tuo PIN
        System.out.println("Crea il tuo PIN");
        pin = tastiera.nextLine();

        // controlla se il PIN inserito è < o > 5, in quel caso lo fa reinserire
        while(pin.length() < 5 || pin.length() > 5){
            System.out.println("Reinserisci il PIN:");
            pin = tastiera.nextLine();
        }

        // array di char (per ogni cifra del PIN appena creato)
        char[] arrpincreato = new char[5];

        // ogni cifra va in una cella di array
        for(i=0;i<5;i++){
            arrpincreato[i] = pin.charAt(i);
        }


        // ---------------------------------------------------------------------------------------------------------

        // conterrà i valori da 0 a 9 random
        int[] numrand = new int[10];

        System.out.println("PIN: 0 1 2 3 4 5 6 7 8 9");
        // stampa array math.random
        System.out.print("NUM: ");
        for(i=0;i< numrand.length;i++){
            numrand[i] = (int)(Math.random() * 3);
            System.out.print(numrand[i] + " ");
        }

        // separatore
        System.out.println();
        System.out.println();

        // ---------------------------------------------------------------------------------------------------------



        // reinserimento PIN per "accedere"
        System.out.println("Inserisci il tuo PIN per accedere");
        String pinxaccedere = tastiera.nextLine();

        // controlla se il PIN inserito è < o > 5, in quel caso lo fa reinserire
        while(pinxaccedere.length() < 5 || pinxaccedere.length() > 5){
            System.out.println("Reinserisci il PIN:");
            pinxaccedere = tastiera.nextLine();
        }

        // array di char (per ogni cifra del PIN)
        char[] arrpinxaccedere = new char[5];

        // ogni cifra va in una cella di array
        for(i=0;i<5;i++){
            arrpinxaccedere[i] = pinxaccedere.charAt(i);
        }



        // ---------------------------------------------------------------------------------------------------------

        // contatore inverso per le cifre sbagliate
        int sbagliato = 5;

        for(i=0;i<arrpinxaccedere.length;i++){
            for(i=0;i<arrpincreato.length;i++){
                for(l=0;l<10;l++){
                    if(arrpinxaccedere[i]=='0'+numrand[l] && arrpincreato[i]=='0'+l){
                        // il contatore diminuisce se la cifra inserita è giusta
                        sbagliato--;
                    }

                }

            }

        }

        // se anche solo una cifra è stata digitata male, stampa messaggio di errore ...
        // ... altrimenti, se tutto è giusto, stampa il PIN originale
        if(sbagliato!=0){
            System.out.println("PIN NON VALIDO");
        } else {
            for(i=0;i< arrpincreato.length;i++){
                System.out.print(arrpincreato[i] + " ");
            }
        }

    }

    // ho provato a riscrivere l'esercizio usando i metodi ma guasta il risultato ...
    // ... più precisamente la variabile "sbagliato". Perciò ho lasciato solamente il main
}
