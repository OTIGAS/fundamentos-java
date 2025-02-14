package j03_metodos;

public class MetodosApp {
    public static void main (String[] args) {
        int resultado = somar(5, 3);
        System.out.println("Resultado: " + resultado);
    }

    // Estrutura
    // TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

    static int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }
}
