public class Main {
    public static void main(String[] args) {
        // Verificando se o número correto de parâmetros foi passado
        if (args.length != 2) {
            System.out.println("Por favor, forneça dois parâmetros.");
            return;
        }

        try {
            // Convertendo os parâmetros para inteiros
            int parametro1 = Integer.parseInt(args[0]);
            int parametro2 = Integer.parseInt(args[1]);

            // Criando a instância da classe Contador
            Contador contador = new Contador();

            // Chamando o método para contar os números
            contador.contarNumeros(parametro1, parametro2);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, insira números inteiros válidos.");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}
