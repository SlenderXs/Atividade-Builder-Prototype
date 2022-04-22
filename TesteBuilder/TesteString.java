package TesteBuilder;

public class TesteString {
    public static void main(String[] args) {
        int i = 0;
        long inicio = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < 100000; i++) {
            sb.append(i);
        }
        String x = sb.toString();
        long fim = System.currentTimeMillis();
        System.out.println("StringBiulder - Tempo em ms: " + (fim - inicio));

        String nome = "Zé";
        inicio = System.currentTimeMillis();
        for (i = 0; i < 100000; i++) {
            nome += i;
        }
        fim = System.currentTimeMillis();
        System.out.println("String - Tempo em ms: " + (fim - inicio));

    }
}
