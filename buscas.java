public class buscas {
    public static void main(String[] args) {

        //Buscas Sequencial
        double[] VetorDesordenado = {4.3, 6.1, 0.1, 1.9, 2.4, 7.2, 5.5};
        int pos = buscaSequencial(VetorDesordenado, 2.4);
        System.out.println("Localizado no Vetor Desordenado na posição (indice): " + pos);

        //Busca Binaria
        double[] VetorOrdenado = {1, 1, 4, 8, 10, 11, 12};
        pos = buscaBinaria(VetorOrdenado, 1);
        System.out.println("Localizado no Vetor Ordenado na posição: " + pos);
    }

    public static int buscaSequencial(double[] vetor, double Valorpesquisado) {
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == Valorpesquisado) {
                return i;
            }
        }
        return -1;
    }
    public static int buscaBinaria(double[] vetor, double Valorpesquisado){
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim)/2;

            if (vetor[meio] == Valorpesquisado) {
                return meio;
            }
            //[] significa que o vetor está sendo localizado na posição que estiver nos conchetes
            if (Valorpesquisado < vetor[meio]) {
                fim = meio -1;
            }else{
                inicio = meio +1;
            }
        }
        return -1;
    }
}
