package ripasso;

public class funzioni {

    public static void aggiunta(String nomemacchina, double prezzo, int indice, String modello, String[] macchine, String[] modelloauto, double[] arrayprezzo) {
        macchine[indice] = nomemacchina;
        modelloauto[indice] = modello;
        arrayprezzo[indice] = prezzo;
    }

    public static String visualizzazione(String[] macchine, String[] modelloauto, double[] arrayprezzo) {
        String stringaes2 = "";
        for (int i = 0; i < modelloauto.length; i++) {
            stringaes2 += ("nome macchina:" + macchine[i] + "modello:" + modelloauto[i] + "prezzo:" + arrayprezzo[i]);

        }
        return stringaes2;
    }

    public static int ricerca(String[] macchine, String[] modelloauto, String nomemacchina, String modello) {
        for (int i = 0; i < modelloauto.length; i++) {
            if (nomemacchina.equals(macchine[i]) && modello.equals(modelloauto[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void cancella(String[] macchine, String[] modelloauto, String nomemacchina, String modello, int indice, double [] arrayprezzo) {
        int i = funzioni.ricerca(macchine, modelloauto, nomemacchina, modello);
        if (i == (-1)) {
            System.out.println("non è stata trovata nessuna macchina corrispondente ai parametri messi");
        } else {
            for (int j = indice; j > i; j--) {
                macchine[i - 1] = macchine[i];
                modelloauto[i - 1] = modelloauto[i];
                arrayprezzo[i - 1] = arrayprezzo[i];
            }
            System.out.println("la macchina è stata cancellata");
        }
    }
    public static void modifica(String[] macchine, String[] modelloauto, String nuovamacchina, String nuovomodello, int indice,double nuovoprezzo, double [] arrayprezzo) {
        macchine[indice] = nuovamacchina;
        modelloauto[indice]=nuovomodello;
        arrayprezzo[indice]=nuovoprezzo;
    }
}

