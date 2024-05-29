public class Pokedex {
    public static void main(String[] args) {
        Eevee e = new Eevee();
        Jolteon j = new Jolteon();
        Vaporeon v = new Vaporeon();
        Flareon f = new Flareon();
        Espeon es = new Espeon();
        Sylveon s = new Sylveon();
        Leafeon l = new Leafeon();
        Glaceon g = new Glaceon();
        Umbreon u = new Umbreon();

        // Definindo e imprimindo os atributos do Eevee
        e.setTipo("Normal");
        e.setPeso(6.0);
        e.setAltura(30);
        e.setHp(55);
        System.out.println("Eevee");
        System.out.println("Tipo: " + e.getTipo());
        System.out.println("Peso: " + e.getPeso() + " kg");
        System.out.println("Altura: " + e.getAltura() + " cm");
        System.out.println("HP: " + e.getHp());
        System.out.println("Ataque: " + e.Ataque());
        System.out.println("Especial: " + e.Especial());
        System.out.println("Defesa: " + e.Defesa());
        System.out.println("---------------------------");

        // Definindo e imprimindo os atributos do Jolteon
        j.setTipo("Elétrico");
        j.setPeso(16.0);
        j.setAltura(40);
        j.setHp(65);
        System.out.println("Jolteon");
        System.out.println("Tipo: " + j.getTipo());
        System.out.println("Peso: " + j.getPeso() + " kg");
        System.out.println("Altura: " + j.getAltura() + " cm");
        System.out.println("HP: " + j.getHp());
        System.out.println("Ataque: " + j.Ataque());
        System.out.println("Especial: " + j.Especial());
        System.out.println("Defesa: " + j.Defesa());
        System.out.println("---------------------------");

        // Definindo e imprimindo os atributos do Vaporeon
        v.setTipo("Água");
        v.setPeso(26.0);
        v.setAltura(50);
        v.setHp(75);
        System.out.println("Vaporeon");
        System.out.println("Tipo: " + v.getTipo());
        System.out.println("Peso: " + v.getPeso() + " kg");
        System.out.println("Altura: " + v.getAltura() + " cm");
        System.out.println("HP: " + v.getHp());
        System.out.println("Ataque: " + v.Ataque());
        System.out.println("Especial: " + v.Especial());
        System.out.println("Defesa: " + v.Defesa());
        System.out.println("---------------------------");

        // Definindo e imprimindo os atributos do Flareon
        f.setTipo("Fogo");
        f.setPeso(36.0);
        f.setAltura(60);
        f.setHp(85);
        System.out.println("Flareon");
        System.out.println("Tipo: " + f.getTipo());
        System.out.println("Peso: " + f.getPeso() + " kg");
        System.out.println("Altura: " + f.getAltura() + " cm");
        System.out.println("HP: " + f.getHp());
        System.out.println("Ataque: " + f.Ataque());
        System.out.println("Especial: " + f.Especial());
        System.out.println("Defesa: " + f.Defesa());
        System.out.println("---------------------------");

        // Definindo e imprimindo os atributos do Espeon
        es.setTipo("Psycho");
        es.setPeso(46.0);
        es.setAltura(70);
        es.setHp(95);
        System.out.println("Espeon");
        System.out.println("Tipo: " + es.getTipo());
        System.out.println("Peso: " + es.getPeso() + " kg");
        System.out.println("Altura: " + es.getAltura() + " cm");
        System.out.println("HP: " + es.getHp());
        System.out.println("Ataque: " + es.Ataque());
        System.out.println("Especial: " + es.Especial());
        System.out.println("Defesa: " + es.Defesa());
        System.out.println("---------------------------");

        // Definindo e imprimindo os atributos do Sylveon
        s.setTipo("Fairy");
        s.setPeso(56.0);
        s.setAltura(80);
        s.setHp(105);
        System.out.println("Sylveon");
        System.out.println("Tipo: " + s.getTipo());
        System.out.println("Peso: " + s.getPeso() + " kg");
        System.out.println("Altura: " + s.getAltura() + " cm");
        System.out.println("HP: " + s.getHp());
        System.out.println("Ataque: " + s.Ataque());
        System.out.println("Especial: " + s.Especial());
        System.out.println("Defesa: " + s.Defesa());
        System.out.println("---------------------------");

        // Definindo e imprimindo os atributos do Leafeon
        l.setTipo("planta");
        l.setPeso(66.0);
        l.setAltura(90);
        l.setHp(115);
        System.out.println("Leafeon");
        System.out.println("Tipo: " + l.getTipo());
        System.out.println("Peso: " + l.getPeso() + " kg");
        System.out.println("Altura: " + l.getAltura() + " cm");
        System.out.println("HP: " + l.getHp());
        System.out.println("Ataque: " + l.Ataque());
        System.out.println("Especial: " + l.Especial());
        System.out.println("Defesa: " + l.Defesa());
        System.out.println("---------------------------");

        // Definindo e imprimindo os atributos do Glaceon
        g.setTipo("Gelo");
        g.setPeso(76.0);
        g.setAltura(100);
        g.setHp(125);
        System.out.println("Glaceon");
        System.out.println("Tipo: " + g.getTipo());
        System.out.println("Peso: " + g.getPeso() + " kg");
        System.out.println("Altura: " + g.getAltura() + " cm");
        System.out.println("HP: " + g.getHp());
        System.out.println("Ataque: " + g.Ataque());
        System.out.println("Especial: " + g.Especial());
        System.out.println("Defesa: " + g.Defesa());
        System.out.println("---------------------------");

        // Definindo e imprimindo os atributos do Umbreon
        u.setTipo("Dark");
        u.setPeso(86.0);
        u.setAltura(110);
        u.setHp(135);
        System.out.println("Umbreon");
        System.out.println("Tipo: " + u.getTipo());
        System.out.println("Peso: " + u.getPeso() + " kg");
        System.out.println("Altura: " + u.getAltura() + " cm");
        System.out.println("HP: " + u.getHp());
        System.out.println("Ataque: " + u.Ataque());
        System.out.println("Especial: " + u.Especial());
        System.out.println("Defesa: " + u.Defesa());
        System.out.println("---------------------------");
    }
}
