public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoLancamento = 1970;
        meuFilme.duracaoEmMinuto = 180;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoLancamento);
    }
}