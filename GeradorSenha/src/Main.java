import java.util.Scanner;

interface GeradorSenha {
    String GerarSenha(int length);
}


 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione os caracteres desejados (1-5)");
        System.out.println("1 Apenas números");
        System.out.println("2 Apenas letras minúsculas");
        System.out.println("3 Letras minúsculas e números");
        System.out.println("4 Letras maiúsculas, minúsculas e números");
        System.out.println("5 Letras maiúsculas, minúsculas, números e símbolos");
        int option = scanner.nextInt();

        System.out.println("Informe o tamanha desejado de sua senha:");
        int length = scanner.nextInt();

        if (length < 1) {
            System.out.println("Valor invalido!! O tamanho deve ser maior que zero.");
            return;
        }

        BaseSenha gerador;

        switch (option) {
            case 1:
                gerador = new SenhasNumericas();
                break;
            case 2:
                gerador = new LetrasMinusculas();
                break;
            case 3:
                gerador = new LetrasMinusculasNumeros();
                break;
            case 4:
                gerador = new LetrasMisturadasNumeros();
                break;
            case 5:
                gerador = new LetrasMisturadasNumerosSimbolos();
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        String senha = gerador.GerarSenha(length);
        System.out.println("Senha gerada: " + senha);

        scanner.close();
    }
}