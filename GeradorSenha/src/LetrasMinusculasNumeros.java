class LetrasMinusculasNumeros extends BaseSenha{
    public String GerarSenha(int length){
        String letrasMinusculasNumeros = "abcdefghijklmnopqrstuvwxyz0123456789";
        return GerarStringAleatoria("a0", letrasMinusculasNumeros, length);
    }
}

