class SenhasNumericas extends BaseSenha{
    public String GerarSenha(int lenght){
        String numeros= "0123456789";
        return GerarStringAleatoria("0", numeros, lenght);
    }

}
