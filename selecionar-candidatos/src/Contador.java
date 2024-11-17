public class Contador {

    // Método para realizar a contagem e impressão
    public void contarNumeros(int inicio, int fim) throws ParametrosInvalidosException {
        // Verificando se o primeiro parâmetro é maior que o segundo
        if (inicio > fim) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calculando a quantidade de interações
        int quantidadeDeInteracoes = fim - inicio;

        // Realizando as interações e imprimindo os números
        for (int i = 1; i <= quantidadeDeInteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
