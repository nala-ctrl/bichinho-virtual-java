//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BichinhoVirtual meuBichinho = new BichinhoVirtual("Kawaii");

        System.out.println("--- Status Inicial ---");
        meuBichinho.status();

        System.out.println("\n--- Apos comer ---");
        meuBichinho.comer();
        meuBichinho.status();

        System.out.println("\n--- Apos Brincar ---");
        meuBichinho.brincar();
        meuBichinho.status();

        System.out.println("\n--- Brincando ate ficar com fome ---");
        for (int i = 0; i < 3; i++) {
            meuBichinho.brincar();
        }
        meuBichinho.status();
        }
    }
