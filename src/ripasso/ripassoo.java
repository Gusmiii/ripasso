package ripasso;
import java.util.Scanner;
public class ripassoo {
    public static void main(String[] args) {
        int scelta;
        String nomemacchina;
        String modello;
        int prezzo = 0;
        String [] macchine = new String[100];
        String [] modelloauto = new String[100];
        int [] arrayprezzo = new int [100];
        int indice =0;


        Scanner in = new Scanner(System.in);
        System.out.println("\nMenu:");
        System.out.println("1. Aggiunta di una nuova auto");
        System.out.println("2. Visualizzazione di tutte le auto");
        System.out.println("3. Ricerca di un'auto tramite marca e modello");
        System.out.println("4. Cancellazione di un'auto");
        System.out.println("5. Modifica dei dati di un'auto");
        System.out.println("6. Visualizzazione delle auto in ordine crescente");
        System.out.println("7. Visualizzazione di tutti i modelli che diesel");
        System.out.println("0. Esci");
        System.out.print("Scegli un'opzione: ");
        scelta = in.nextInt();
        switch (scelta) {
            case 1:
                System.out.println("Opzione 1: inserisci nel seguente ordine questi dati :  nome,modello,prezzo");
                nomemacchina = in.nextLine();
                modello =in.nextLine();
                prezzo = in.nextInt();

                break;
            case 2:
                System.out.println("Opzione 2: Visualizzazione di tutte le auto");

                break;
            case 3:
                System.out.println("Opzione 3: Ricerca di un'auto tramite marca e modello");

                break;
            case 4:
                System.out.println("Opzione 4: Cancellazione di un'auto");

                break;
            case 5:
                System.out.println("Opzione 5: Modifica dei dati di un'auto");

                break;
            case 6:
                System.out.println("Opzione 6: Visualizzazione delle auto in ordine crescente");
                break;
            case 7:
                System.out.println("Opzione 7: Visualizzazione di tutti i modelli che diesel");

                break;
            case 0:
                System.out.println("Uscita...");
                return;
            default:
                System.out.println("Opzione non valida.");
        }
    }
}


