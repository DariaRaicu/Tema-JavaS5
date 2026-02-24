public class InversorDeCuvinte {
    public static void main(String[] args) {

        String cuvant = "Automatizare";
        String cuvantInversat = inverseazaCuvant(cuvant);
        System.out.println("Cuvantul inversat este: " + cuvantInversat);
        System.out.println("Primul caracter este: " + cuvant.charAt(cuvant.length ()-1) );

    }
    public static String inverseazaCuvant(String cuvant) {
        String rezultat = "";

        for (int i = cuvant.length()-1; i>=0; i--){
            rezultat = rezultat + cuvant.charAt(i);
        }

        return rezultat;

    }

}
