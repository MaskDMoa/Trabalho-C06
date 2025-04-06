public class Computador {

    String[] Marca = {"Apple", "Samsung", "Dell"};
    float[] preco = {2026, 3260, 7704};



    void mostrarPCConfigs(int ent) {

        int ent2 = ent - 1;
        SistemaOp op = new SistemaOp();
        HardwareBa hb = new HardwareBa();

        System.out.println("Marca: " + Marca[ent2]);
        System.out.println("Preço: R$ " + preco[ent2]);
        System.out.println("------------------------------");
        System.out.println(hb.Nome[ent2]);
        System.out.println(hb.Capacidade[ent2] + " Gb de Memória RAM");
        System.out.println("------------------------------");
        System.out.println(op.Nome[ent2] + "(" + op.Tipo[ent2] + " bits)");

    }
}