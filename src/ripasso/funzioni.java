package ripasso;

public class funzioni {

    public static void aggiunta (String nomemacchina,double prezzo,int indice, String modello,String[] macchine, String[]modelloauto,double []arrayprezzo){
        macchine[indice]=nomemacchina;
        modelloauto[indice]=modello;
        arrayprezzo[indice]=prezzo;
    }
    public static String visualizzazione (String[] macchine, String[]modelloauto,double []arrayprezzo){
        String stringaes2 = "";
        for (int i = 0;i< modelloauto.length;i++){
          stringaes2 +=  ("nome macchina:"+macchine[i]+"modello:"+modelloauto[i]+"prezzo:"+arrayprezzo[i]);

        }
        return stringaes2;
    }
    public static void ricerca (String[] macchine, String[]modelloauto,String nomemacchina, String modello){
        for (int i = 0; i < modelloauto.length;i++){
            if(nomemacchina.equals(macchine[i]) && modello.equals(modelloauto[i])){
                System.out.println( "è stata trovata la macchina"+macchine[i] +"."+modelloauto[i] );
            }
        }
    }

}

