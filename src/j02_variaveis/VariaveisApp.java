package j02_variaveis;

public class VariaveisApp {
    public static void main (String[] args) {
        // Variavel Global (Não sofrera alterações)
        String BR = "Brasil";
        // camelCase
        String estadoBrasileiro = "São Paulo";

        // Declaração inválida de variáveis
        // int numero&um = 1; // Os únicos símbolos permitidos são _ e $
        // int 1numero = 1;    // Uma variável não pode começar com numérico
        // int numero um = 1; // Não pode ter espaço no nome da variável
        // int long = 1; // long faz parte das palavras reservadas da linguagem

        // Declaração válida de variáveis
        int numero$um = 1;
        int numero1 = 1;
        int numeroum = 1; // ou numeroUm
        int longo = 1;
    }
}
