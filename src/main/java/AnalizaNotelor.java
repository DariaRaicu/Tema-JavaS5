public class AnalizaNotelor {
    public static void main(String[] args) {

        int[] note = {10, 4, 8, 7, 9, 6};

        double mediaNotelor = calculeazaMedia(note);
        System.out.println("Media notelor este: " + mediaNotelor);

        int notaMaxima = gasesteNotaMaxima(note);
        System.out.println("Nota maxima este: " + notaMaxima);

        int notaMinima = gasesteNotaMinima(note);
        System.out.println("Nota minima este: " + notaMinima);
    }

    public static double calculeazaMedia(int[] note) {
        double suma = 0;

        for (int i = 0; i < note.length; i++) {
            suma += note[i];
        }

        return suma / note.length;
    }

    public static int gasesteNotaMaxima(int[] note) {
        int max = note[0];

        for (int i=1; i < note.length; i++) {
            if (note[i] > max) {
                max = note[i];
            }
        }

        return max;
    }

    public static int gasesteNotaMinima(int[] note) {
        int min = note[0];

        for (int i=1; i < note.length; i++) {
            if (note[i] < min) {
                min = note[i];
            }
        }

        return min;
    }
}
