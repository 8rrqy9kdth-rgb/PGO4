import java.util.ArrayList;
    public class BiuroUbezpieczen {
        private String nazwa;
        private ArrayList<Polisa> polisy = new ArrayList<>();

        public BiuroUbezpieczen(String nazwa) {
            this.nazwa = nazwa;
        }

        public void dodajPolise(Polisa p) {
            polisy.add(p);
        }

        public void wypiszRaport() {
            System.out.println("--- RAPORT BIURA: " + nazwa + " ---");
            for (Polisa p : polisy) {
                System.out.println(p.toString());
            }
        }
    }

