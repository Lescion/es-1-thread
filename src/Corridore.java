public class Corridore{
    private String nome;

    public Corridore(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override

    public String toString() {
        return "Corridore [nome=" + nome +"]";
    }

    public void run()
    {
        for(int i=0; i<=100;i++)
        {
            System.out.println(nome +" -> " + i +" metri");
            if (i == 100)
            {
                System.out.println("il Corridore "+ nome + " è arrivato");
            }
        }
    }
    
}