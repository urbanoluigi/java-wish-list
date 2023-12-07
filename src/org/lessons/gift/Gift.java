package org.lessons.gift;

import java.util.*;

public class Gift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listaRegali = new ArrayList<>();
        Set<String> regaliUnici = new HashSet<>();

        boolean continua = true;

        while (continua) {
            System.out.print("Inserisci il nome del regalo: ");
            String regalo = scanner.nextLine();

            if (!regaliUnici.contains(regalo)) {
                listaRegali.add(regalo);
                regaliUnici.add(regalo);
                System.out.println("Regalo aggiunto alla lista.");

                System.out.println("Lunghezza della lista: " + listaRegali.size());

                System.out.print("Vuoi aggiungere un altro regalo? (sì/no): ");
                String risposta = scanner.nextLine().toLowerCase();

                continua = risposta.equals("sì") || risposta.equals("si");
            } else {
                System.out.println("Hai già inserito questo regalo. Inserisci un regalo diverso.");
            }
        }

        System.out.println("Ecco la tua lista di regali di Natale:");
        for (String regalo : listaRegali) {
            System.out.println(regalo);
        }

        scanner.close();
    }
}