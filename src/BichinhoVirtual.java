public class BichinhoVirtual {
     private String nome;
     private int fome;
     private int saude;
     private int idade;

    public BichinhoVirtual(String nome) {
    this.nome = nome;
    this.fome = 50;
    this.saude = 50;
    this.idade = 0;
    }

    public void comer() {
        this.fome = Math.max(this.fome - 20, 0);
        }

    public void brincar() {
        if (this.fome >= 100) {
            System.out.println(this.nome +" está com fome demais para brincar!" );
            return;
        }
        this.saude = Math.min(this.saude + 10, 100);
        this.fome += 15;

        System.out.println(this.nome + " brincou e ganhou +10 de saúde!");
    }

    public void status(){
        System.out.println(
                "Nome: " + this.nome + "\n" +
                "Fome: " + this.fome + "\n" +
                "Saude: " + this.saude + "\n" +
                "Idade: " + this.idade + "\n"
        );
    }

}




