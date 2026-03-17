import java.util.ArrayList;

public class city {

    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<String>();
        cidades.add("São Paulo");
        cidades.add("Santos");
        cidades.add("Ribeirão Preto");

        System.out.println(cidades);
        cidades.add(0,"Campinas");
        System.out.println(cidades);
        System.out.println(cidades.get(2));
        cidades.add(3,"Mirassol");
        System.out.println(cidades);
    }
}