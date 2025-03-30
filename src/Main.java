import models.Jogo;

public class Main {
    public static void main(String[] args) {
        Jogo m1 = new Jogo("Fifa","EA","Futebol","25/05/2025",18,14,300);
        m1.setEstrelas(0);
        System.out.println(m1.getEstrelas());
        System.out.println(m1.getMedia());
        m1.setEstrelas(4);
        System.out.println(m1.getEstrelas());
        System.out.println(m1.getMedia());
    }
}
