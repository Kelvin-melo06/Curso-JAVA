package treinoJava2;

public class Main {
    public static void main(String[] args) {
        Mamiferos leao = new Mamiferos("Leão", 18, 70, "selva");
        Mamiferos tigre = new Mamiferos("Tigre", 18, 70, "selva");
        leao.imprimirMamiferos();
        tigre.imprimirMamiferos();
        System.out.println("Total mamiferos: " + Mamiferos.getTotalMamiferos());
    }
}
