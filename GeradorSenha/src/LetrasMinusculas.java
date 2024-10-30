class LetrasMinusculas  extends BaseSenha{
    public String GerarSenha(int length) {
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        return GerarStringAleatoria("a", letrasMinusculas, length);
    }
}
