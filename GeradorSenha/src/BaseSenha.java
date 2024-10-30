import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

abstract class BaseSenha implements GeradorSenha{
    protected Random gerador = new Random();
    protected String GerarStringAleatoria(String charsNecessarios, String charsAdicionais, int lenght){
        List<Character> senha = new ArrayList<>();

        for (char c : charsNecessarios.toCharArray()){
            senha.add(c);
        }

        for (int i = charsNecessarios.length(); i < lenght; i++){
            senha.add(charsAdicionais.charAt(gerador.nextInt(charsAdicionais.length())));
        }

        Collections.shuffle(senha);

        StringBuilder senhaString = new StringBuilder();
        for(char c : senha){
            senhaString.append(c);
        }
        return senhaString.toString();
    }

}
