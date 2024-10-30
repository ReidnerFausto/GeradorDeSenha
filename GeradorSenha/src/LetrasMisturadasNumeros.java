class LetrasMisturadasNumeros extends BaseSenha {
    public String GerarSenha(int length) {
        String letrasMisturadasNumeros = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        return GerarStringAleatoria("Aa0", letrasMisturadasNumeros, length);
    }
}


