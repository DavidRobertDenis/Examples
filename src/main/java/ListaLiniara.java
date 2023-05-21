
public class ListaLiniara {
    private int[] lista;
    private int dimensiune;

    public ListaLiniara(int capacitate) {
        lista = new int[capacitate];
        dimensiune = 0;
}

    public void afisareLista() {
        System.out.print("Lista: ");
        for (int i = 0; i < dimensiune; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }

    public void inserareInainte(int element) {
        if (dimensiune == lista.length) {
            System.out.println("Lista este plina. Imposibil de inserat.");
            return;
        }

        for (int i = dimensiune - 1; i >= 0; i--) {
            lista[i + 1] = lista[i];
        }

        lista[0] = element;
        dimensiune++;
    }

    public int numarElemente() {
        return dimensiune;
    }

    public static void main(String[] args) {
        ListaLiniara lista = new ListaLiniara(10);

        lista.afisareLista(); // Lista: (lista este goala)

        lista.inserareInainte(5);
        lista.inserareInainte(3);
        lista.inserareInainte(7);

        lista.afisareLista(); // Lista: 7 3 5

        int numarElemente = lista.numarElemente();
        System.out.println("Numarul de elemente: " + numarElemente); // Numarul de elemente: 3
    }
}