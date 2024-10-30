public class LetrasMisturadasNumerosSimbolos extends BaseSenha {
    public String GerarSenha(int length) {
        String LetrasMisturadasNumerosSimbolos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789$&#@_";
        return GerarStringAleatoria("Aa0$", LetrasMisturadasNumerosSimbolos, length);
    }
}
