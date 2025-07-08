public class TratamentoExceções {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int resultado = a/b; // Aqui irá acontecer o erro
            System.out.println("Resultado:" + resultado);
        } catch (Exception e) {
            System.out.println("Erro: Divisão por zero não é permitida jovem!");
        } finally {
            System.out.println("Bloco finally sempre executa!");
        }
    }
}
