import java.util.Scanner;

public class FixtureMundial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] grupos = {
            "A","B","C","D","E","F",
            "G","H","I","J","K","L"
        };

        String[][] equipos = {
            {"México", "Sudafrica", "Corea de sur", "Republica Checa"},
            {"Canadá", "Bosnia", "Qatar", "Suiza"},
            {"Brasil", "Marruecos", "Haití", "Escocia"},
            {"EE.UU", "Australia", "Paraguay", "Turquia"},
            {"Alemania", "Curazao", "Costa de Marfil", "Ecuador"},
            {"Holanda", "Japón", "Suecia", "Túnez"},
            {"Bélgica", "Egipto", "Irán", "N.Zelanda"},
            {"España", "Cabo Verde", "Arabia", "Uruguay"},
            {"Francia", "Senegal", "Irak", "Noruega"},
            {"Argentina", "Argelia", "Austria", "Jordania"},
            {"Portugal", "R.D.Congo", "Uzbekistán", "Colombia"},
            {"Inglaterra", "Croacia", "Ghana", "Panamá"}
        };

        String[][] fechas = new String[12][6];
        int dia = 17;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                fechas[i][j] = (dia++) + "/07 10:00";
            }
        }

        int opcion;

        do {
            System.out.println("\n╔══════════════════════════════╗");
            System.out.println("║      ⚽ FIXTURE MUNDIAL ⚽     ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║ 1. Ver partidos por grupo    ║");
            System.out.println("║ 2. Ver detalle de partido    ║");
            System.out.println("║ 3. Partido inaugural         ║");
            System.out.println("║ 0. Salir                     ║");
            System.out.println("╚══════════════════════════════╝");
            System.out.print("Seleccione: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    for (int g = 0; g < grupos.length; g++) {

                        System.out.println("\n🌍 Grupo " + grupos[g]);

                        int contador = 0;

                        for (int i = 0; i < 4; i++) {
                            for (int j = i + 1; j < 4; j++) {

                                System.out.println((contador + 1) + ". "
                                        + equipos[g][i] + " vs " + equipos[g][j]
                                        + " - " + fechas[g][contador]);

                                contador++;
                            }
                        }
                    }
                    break;

                case 2:
                    System.out.print("Ingrese grupo (0=A ... 11=L): ");
                    int g = sc.nextInt();

                    if (g < 0 || g > 11) {
                        System.out.println("❌ Grupo inválido");
                        break;
                    }

                    int contador = 0;
                    String[][] partidos = new String[6][2];

                    for (int i = 0; i < 4; i++) {
                        for (int j = i + 1; j < 4; j++) {

                            partidos[contador][0] = equipos[g][i];
                            partidos[contador][1] = equipos[g][j];

                            System.out.println((contador + 1) + ". "
                                    + equipos[g][i] + " vs " + equipos[g][j]);

                            contador++;
                        }
                    }

                    System.out.print("Seleccione partido: ");
                    int p = sc.nextInt();

                    if (p < 1 || p > 6) {
                        System.out.println("❌ Partido inválido");
                        break;
                    }

                    System.out.println("\n📌 DETALLE DEL PARTIDO");
                    System.out.println("⚔ " + partidos[p-1][0] + " vs " + partidos[p-1][1]);
                    System.out.println("🕒 Fecha: " + fechas[g][p-1]);

                    break;

                case 3:
                    System.out.println("\n🎉 PARTIDO INAUGURAL");
                    System.out.println("⚽ " + equipos[0][0] + " vs " + equipos[0][1]);
                    System.out.println("🕒 Fecha: " + fechas[0][0]);
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}
