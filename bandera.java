public class bandera {

    static final String reset = "\u001B[0m";
    static final String verde = "\u001B[42m";
    static final String blanco = "\u001B[47m";
    static final String rojo = "\u001B[41m";
    static final String azul = "\u001B[44m";
    static final String amarillo = "\u001B[43m";
    static final String negro = "\u001B[40m";
    static final String naranja = "\u001B[48;5;208m";

    public static void main(String[] args) {

        String[][] bandera = new String[12][16];

System.out.println("\n=== GRUPO A ===");
mexico(bandera);
imprimir(bandera);
System.out.println();

sudafrica(bandera);
imprimir(bandera);
System.out.println();

coreas(bandera);
imprimir(bandera);
System.out.println();

checa(bandera);
imprimir(bandera);
System.out.println();


System.out.println("\n=== GRUPO B ===");
canada(bandera);
imprimir(bandera);
System.out.println();

suiza(bandera);
imprimir(bandera);
System.out.println();

qatar(bandera);
imprimir(bandera);
System.out.println();

bosnia(bandera);
imprimir(bandera);
System.out.println();


System.out.println("\n=== GRUPO C ===");
brasil(bandera);
imprimir(bandera);
System.out.println();

marruecos(bandera);
imprimir(bandera);
System.out.println();

haiti(bandera);
imprimir(bandera);
System.out.println();

escocia(bandera);
imprimir(bandera);
System.out.println();


System.out.println("\n=== GRUPO D ===");
eeuu(bandera);
imprimir(bandera);
System.out.println();

paraguay(bandera);
imprimir(bandera);
System.out.println();

australia(bandera);
imprimir(bandera);
System.out.println();

turquia(bandera);
imprimir(bandera);
System.out.println();


System.out.println("\n=== GRUPO E ===");
Alemania(bandera);
imprimir(bandera);
System.out.println();

ecuador(bandera);
imprimir(bandera);
System.out.println();

costademarfil(bandera);
imprimir(bandera);
System.out.println();

curazao(bandera);
imprimir(bandera);
System.out.println();


System.out.println("\n=== GRUPO F ===");
holanda(bandera);
imprimir(bandera);
System.out.println();

japon(bandera);
imprimir(bandera);
System.out.println();

suecia(bandera);
imprimir(bandera);
System.out.println();

tunez(bandera);
imprimir(bandera);
System.out.println();


System.out.println("\n=== GRUPO G ===");
belgica(bandera);
imprimir(bandera);
System.out.println();

egipto(bandera);
imprimir(bandera);
System.out.println();

iran(bandera);
imprimir(bandera);
System.out.println();

nzelanda(bandera);
imprimir(bandera);
System.out.println();


System.out.println("\n=== GRUPO H ===");
espana(bandera);
imprimir(bandera);
System.out.println();

uruguay(bandera);
imprimir(bandera);
System.out.println();

arabia(bandera);
imprimir(bandera);
System.out.println();

caboverde(bandera);
imprimir(bandera);
System.out.println();


System.out.println("\n=== GRUPO I ===");
francia(bandera);
imprimir(bandera);
System.out.println();

senegal(bandera);
imprimir(bandera);
System.out.println();

irak(bandera);
imprimir(bandera);
System.out.println();

noruega(bandera);
imprimir(bandera);
System.out.println();


System.out.println("\n=== GRUPO J ===");
argentina(bandera);
imprimir(bandera);
System.out.println();

austria(bandera);
imprimir(bandera);
System.out.println();

argelia(bandera);
imprimir(bandera);
System.out.println();

jordania(bandera);
imprimir(bandera);
System.out.println();


System.out.println("\n=== GRUPO K ===");
portugal(bandera);
imprimir(bandera);
System.out.println();

congo(bandera);
imprimir(bandera);
System.out.println();

uzbequistan(bandera);
imprimir(bandera);
System.out.println();

colombia(bandera);
imprimir(bandera);
System.out.println();


System.out.println("\n=== GRUPO L ===");
inglaterra(bandera);
imprimir(bandera);
System.out.println();

croacia(bandera);
imprimir(bandera);
System.out.println();

ghana(bandera);
imprimir(bandera);
System.out.println();

panama(bandera);
imprimir(bandera);
System.out.println();
    }

    // Bandera de MEXICO
    public static void mexico(String[][] bandera) {

        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 16; j++) {

                if(j < 5) {
                    bandera[i][j] = verde;
                } else if(j < 11) {
                    bandera[i][j] = blanco;
                } else {
                    bandera[i][j] = rojo;
                }
            }
        }

        bandera[5][8] = negro;
        bandera[6][8] = negro;
        bandera[5][7] = amarillo;
        bandera[4][9] = negro;
        bandera[7][9] = negro;
        bandera[7][7] = negro;
        bandera[5][9] = negro;
    }

    // Bandera de COLOMBIA
    public static void colombia(String[][] bandera) {

        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 16; j++) {

                if(i < 6) {
                    bandera[i][j] = amarillo;
                } else if(i < 9) {
                    bandera[i][j] = azul;
                } else {
                    bandera[i][j] = rojo;
                }
            }
        }
    }

    // Bandera de SUDAFRICA
    public static void sudafrica(String[][] bandera) {

        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 16; j++) {

                if(i < 6) {
                    bandera[i][j] = rojo;
                } else {
                    bandera[i][j] = azul;
                }

                if(j < 1 && i > 2 && i < 9 ) {
                    bandera[i][j] = negro;
                }

                if(j >= 4 && i >= 4 && i <= 7) {
                    bandera[i][j] = verde;
                }

            }
        }
        bandera [4][1] = negro;
        bandera [5][1] = negro;
        bandera [6][1] = negro;
        bandera [7][1] = negro;
        bandera [5][2] = negro;
        bandera [6][2] = negro;
        bandera [2][0] = amarillo;
        bandera [3][1] = amarillo;
        bandera [4][2] = amarillo;
        bandera [5][3] = amarillo;
        bandera [6][3] = amarillo;
        bandera [7][2] = amarillo;
        bandera [8][1] = amarillo;
        bandera [9][0] = amarillo;
        bandera [0][0] = verde;
        bandera [1][0] = verde;
        bandera [0][1] = verde;
        bandera [1][1] = verde;
        bandera [2][1] = verde;
        bandera [2][2] = verde;
        bandera [1][2] = verde;
        bandera [3][3] = verde;
        bandera [3][2] = verde;
        bandera [2][3] = verde;
        bandera [4][3] = verde;
        bandera [3][4] = verde;
        bandera [11][0] = verde;
        bandera [10][0] = verde;
        bandera [10][1] = verde;
        bandera [10][2] = verde;
        bandera [11][1] = verde;
        bandera [9][1] = verde;
        bandera [9][2] = verde;
        bandera [8][2] = verde;
        bandera [8][3] = verde;
        bandera [9][3] = verde;
        bandera [7][3] = verde;
        bandera [8][4] = verde;
        bandera [0][2] = verde;
        bandera [1][3] = verde;
        bandera [2][4] = verde;
        bandera [3][5] = verde;
        bandera [11][2] = verde;
        bandera [10][3] = verde;
        bandera [9][4] = verde;
        bandera [8][5] = verde;
        bandera [0][3] = blanco;
        bandera [1][4] = blanco;
        bandera [2][5] = blanco;
        bandera [3][6] = blanco;
        bandera [3][7] = blanco;
        bandera [3][8] = blanco;
        bandera [3][9] = blanco;
        bandera [3][10] = blanco;
        bandera [3][11] = blanco;
        bandera [3][12] = blanco;
        bandera [3][13] = blanco;
        bandera [3][14] = blanco;
        bandera [3][15] = blanco;
        bandera [3][6] = blanco;
        bandera [8][6] = blanco;
        bandera [8][7] = blanco;
        bandera [8][8] = blanco;
        bandera [8][9] = blanco;
        bandera [8][10] = blanco;
        bandera [8][11] = blanco;
        bandera [8][12] = blanco;
        bandera [8][13] = blanco;
        bandera [8][14] = blanco;
        bandera [8][15] = blanco;
        bandera [9][5] = blanco;
        bandera [10][4] = blanco;
        bandera [11][3] = blanco;

    }

    // Bandera de ECUADOR
    public static void ecuador(String[][] bandera) {

        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 16; j++) {

                if(i < 6) {
                    bandera[i][j] = amarillo;
                } else if(i < 9) {
                    bandera[i][j] = azul;
                } else {
                    bandera[i][j] = rojo;
                }
            }
        }

        bandera[7][7] = verde;
        bandera[7][8] = verde;
        bandera[6][7] = verde;
        bandera[6][8] = verde;
        bandera[6][10] = amarillo;
        bandera[7][10] = amarillo;
        bandera[8][9] = amarillo;
        bandera[9][8] = amarillo;
        bandera[9][7] = amarillo;
        bandera[6][5] = amarillo;
        bandera[7][5] = amarillo;
        bandera[8][6] = amarillo;
        bandera[8][7] = rojo;
        bandera[8][8] = rojo;
        bandera[7][9] = rojo;
        bandera[6][9] = azul;
        bandera[6][6] = azul;
        bandera[7][6] = rojo;
        bandera[5][8] = negro;
        bandera[5][7] = negro;
        bandera[4][9] = negro;
        bandera[4][6] = negro;
        bandera[4][7] = negro;
        bandera[4][8] = blanco;
        
    }


    // Bandera de Alemania
    public static void Alemania(String[][] bandera) {

        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 16; j++) {

                if(i < 6) {
                    bandera[i][j] = negro;
                } else if(i < 9) {
                    bandera[i][j] = rojo;
                } else {
                    bandera[i][j] = amarillo;
                }
            }
        }
    }

    //Bandera de COSTA DE MARFIL
public static void costademarfil(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(j < 5) {
                bandera[i][j] = naranja;
            } else if(j < 11) {
                bandera[i][j] = blanco;
            } else {
                bandera[i][j] = verde;
            }

        }
    }
}

//Bandera de COSTA DE MARFIL
public static void belgica(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(j < 5) {
                bandera[i][j] = negro;
            } else if(j < 11) {
                bandera[i][j] = amarillo;
            } else {
                bandera[i][j] = rojo;
            }

        }
    }
}

//Bandera de COSTA DE MARFIL
public static void francia(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(j < 5) {
                bandera[i][j] = azul;
            } else if(j < 11) {
                bandera[i][j] = blanco;
            } else {
                bandera[i][j] = rojo;
            }

        }
    }
}
//Bandera de Uzbequistan 
public static void uzbequistan(String[][] bandera) {

        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 16; j++) {

                if(i < 5) {
                    bandera[i][j] = azul;
                } else if(i < 9) {
                    bandera[i][j] = blanco;
                } else {
                    bandera[i][j] = verde;
                }
            }
        }
}

//bandera de Inglaterra 
public static void inglaterra(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = blanco;
        }
    }

    for(int j = 0; j < 16; j++) {
        bandera[5][j] = rojo;
        bandera[6][j] = rojo;
    }

    for(int i = 0; i < 12; i++) {
        bandera[i][7] = rojo;
        bandera[i][8] = rojo;
    }
}

//Bandera de Portugal 
public static void portugal(String[][] bandera) {

    // 1. Fondo (verde + rojo)
    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(j < 6) {
                bandera[i][j] = verde;
            } else {
                bandera[i][j] = rojo;
            }
        }
    }

    bandera[7][5] = amarillo;
    bandera[5][6] = amarillo;
    bandera[6][5] = amarillo;
    bandera[7][6] = amarillo;
    bandera[6][4] = amarillo;
    bandera[5][4] = amarillo;
    bandera[6][7] = amarillo;
    bandera[5][7] = amarillo;
    bandera[4][6] = amarillo;
    bandera[4][5] = amarillo;

    bandera[5][5] = negro;
    bandera[6][6] = negro;
}

//Bandera de Austria
public static void austria(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i < 4) {
                bandera[i][j] = rojo;
            } else if(i < 8) {
                bandera[i][j] = blanco;
            } else {
                bandera[i][j] = rojo;
            }

        }
    }
}
//Bandera Senegal
public static void senegal(String[][] bandera) {

    // 1. Franjas
    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(j < 5) {
                bandera[i][j] = verde;
            } else if(j < 11) {
                bandera[i][j] = amarillo;
            } else {
                bandera[i][j] = rojo;
            }
        }
    }

    bandera[5][8] = verde;
    bandera[6][8] = verde;
    bandera[5][7] = verde;
    bandera[5][9] = verde;
    bandera[6][7] = verde;
    bandera[6][9] = verde;
    bandera[4][8] = verde;
    bandera[7][7] = verde;
    bandera[7][9] = verde;
}

//Bandera Noruega

public static void noruega(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = rojo;
        }
    }

    for(int j = 0; j < 16; j++) {
        bandera[4][j] = blanco;
        bandera[7][j] = blanco;
    }

    for(int i = 0; i < 12; i++) {
        bandera[i][4] = blanco;
        bandera[i][7] = blanco;
    }

    for(int j = 0; j < 16; j++) {
        bandera[5][j] = azul;
        bandera[6][j] = azul;
    }

    for(int i = 0; i < 12; i++) {
        bandera[i][5] = azul;
        bandera[i][6] = azul;
    }
}

//
public static void irak(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i < 4) {
                bandera[i][j] = rojo;
            } else if(i < 8) {
                bandera[i][j] = blanco;
            } else {
                bandera[i][j] = negro;
            }
        }
    }

    bandera[5][6] = verde;
    bandera[5][7] = verde;
    bandera[5][8] = verde;
    bandera[5][9] = verde;

    bandera[6][6] = verde;
    bandera[6][9] = verde;
}

//Bandera Suiza
public static void suiza(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = rojo;
        }
    }

    for(int j = 4; j <= 11; j++) {
        for(int i = 4; i <= 7; i++) {
            bandera[i][j] = blanco;
        }
    }

    for(int i = 2; i <= 9; i++) {
        for(int j = 6; j <= 9; j++) {
            bandera[i][j] = blanco;
        }
    }
}

public static void paraguay(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i < 4) {
                bandera[i][j] = rojo;
            } else if(i < 8) {
                bandera[i][j] = blanco;
            } else {
                bandera[i][j] = azul;
            }
        }
    }

    bandera[5][7] = rojo;
    bandera[5][8] = rojo;
    bandera[6][7] = rojo;
    bandera[6][8] = rojo;

    bandera[5][7] = amarillo;
    bandera[6][8] = amarillo;
}

//Bandera Marruecos
public static void marruecos(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = rojo;
        }
    }

    bandera[4][8] = verde;
    bandera[5][7] = verde;
    bandera[5][9] = verde;
    bandera[6][8] = verde;
    bandera[7][7] = verde;
    bandera[7][9] = verde;
}

//Bandera de Holanda
public static void holanda(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i < 4) {
                bandera[i][j] = rojo;
            } else if(i < 8) {
                bandera[i][j] = blanco;
            } else {
                bandera[i][j] = azul;
            }

        }
    }
}

//Bandera Japón
public static void japon(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = blanco;
        }
    }

    bandera[3][7] = rojo;
    bandera[3][8] = rojo;
    bandera[4][6] = rojo;
    bandera[4][7] = rojo;
    bandera[4][8] = rojo;
    bandera[4][9] = rojo;
    bandera[5][6] = rojo;
    bandera[5][7] = rojo;
    bandera[5][8] = rojo;
    bandera[5][9] = rojo;
    bandera[6][6] = rojo;
    bandera[6][7] = rojo;
    bandera[6][8] = rojo;
    bandera[6][9] = rojo;
    bandera[7][7] = rojo;
    bandera[7][8] = rojo;
    bandera[3][6] = rojo;
    bandera[3][9] = rojo;
    bandera[7][6] = rojo;
    bandera[7][9] = rojo;
}

//Bandera Suecia
public static void suecia(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = azul;
        }
    }

    for(int j = 0; j < 16; j++) {
        bandera[5][j] = amarillo;
        bandera[6][j] = amarillo;
    }

    for(int i = 0; i < 12; i++) {
        bandera[i][5] = amarillo;
        bandera[i][6] = amarillo;
    }
}

//Bandera Egipto 
public static void egipto(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i < 4) {
                bandera[i][j] = rojo;
            } else if(i < 8) {
                bandera[i][j] = blanco;
            } else {
                bandera[i][j] = negro;
            }
        }
    }

    bandera[5][8] = amarillo;
    bandera[6][8] = amarillo;
    bandera[5][7] = amarillo;
    bandera[5][9] = amarillo;
    bandera[6][7] = amarillo;
    bandera[6][9] = amarillo;
}

public static void panama(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i < 6 && j < 8) {
                bandera[i][j] = blanco;
            }
            else if(i < 6 && j >= 8) {
                bandera[i][j] = rojo;
            }
            else if(i >= 6 && j < 8) {
                bandera[i][j] = azul;
            }
            else {
                bandera[i][j] = blanco;
            }
        }
    }

    bandera[2][3] = azul;
    bandera[3][2] = azul;
    bandera[3][3] = azul;
    bandera[3][4] = azul;
    bandera[4][3] = azul;
    bandera[8][11] = rojo;
    bandera[9][10] = rojo;
    bandera[9][11] = rojo;
    bandera[9][12] = rojo;
    bandera[10][11] = rojo;
}

//bandera Argentina
public static void argentina(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i < 4) {
                bandera[i][j] = azul;
            } else if(i < 8) {
                bandera[i][j] = blanco;
            } else {
                bandera[i][j] = azul;
            }
        }
    }

    bandera[5][8] = amarillo;
    bandera[6][8] = amarillo;
    bandera[5][7] = amarillo;
    bandera[5][9] = amarillo;
    bandera[6][8] = amarillo;
    bandera[7][8] = amarillo;
    bandera[6][7] = amarillo;
    bandera[6][9] = amarillo;
    bandera[7][7] = amarillo;
    bandera[7][9] = amarillo;
}

//Bandera Ghana
public static void ghana(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i < 4) {
                bandera[i][j] = rojo;
            } else if(i < 8) {
                bandera[i][j] = amarillo;
            } else {
                bandera[i][j] = verde;
            }
        }
    }

    bandera[5][8] = negro;
    bandera[6][7] = negro;
    bandera[6][8] = negro;
    bandera[6][9] = negro;
    bandera[7][8] = negro;
}

    //Bandera ESTADOS UNIDOS
public static void eeuu(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i % 2 == 0) {
                bandera[i][j] = rojo;
            } else {
                bandera[i][j] = blanco;
            }
        }
    }

    for(int i = 0; i < 6; i++) {
        for(int j = 0; j < 8; j++) {
            bandera[i][j] = azul;
        }
    }

    for(int i = 1; i < 6; i += 2) {
        for(int j = 1; j < 8; j += 2) {
            bandera[i][j] = blanco;
        }
    }
}

//Bandera CANADA
public static void canada(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(j < 4) {
                bandera[i][j] = rojo;
            } else if(j < 12) {
                bandera[i][j] = blanco;
            } else {
                bandera[i][j] = rojo;
            }
        }
    }

    bandera[3][8] = rojo;
    bandera[4][7] = rojo;
    bandera[4][8] = rojo;
    bandera[4][9] = rojo;
    bandera[5][6] = rojo;
    bandera[5][7] = rojo;
    bandera[5][8] = rojo;
    bandera[5][9] = rojo;
    bandera[5][10] = rojo;
    bandera[6][7] = rojo;
    bandera[6][8] = rojo;
    bandera[6][9] = rojo;
    bandera[7][7] = rojo;
    bandera[7][9] = rojo;
    bandera[8][8] = rojo;
    bandera[7][8] = rojo;
}

//Bandera CURAZAO
public static void curazao(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = azul;
        }
    }

    for(int j = 0; j < 16; j++) {
        bandera[8][j] = amarillo;
    }

    bandera[2][3] = blanco;
    bandera[3][2] = blanco;
    bandera[3][3] = blanco;
    bandera[3][4] = blanco;
    bandera[4][3] = blanco;
    bandera[1][6] = blanco;
    bandera[2][5] = blanco;
    bandera[2][6] = blanco;
    bandera[2][7] = blanco;
    bandera[3][6] = blanco;
}

//Bandera Haiti
public static void haiti(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i < 6) {
                bandera[i][j] = azul;
            } else {
                bandera[i][j] = rojo;
            }
        }
    }

    for(int i = 4; i <= 7; i++) {
        for(int j = 6; j <= 9; j++) {
            bandera[i][j] = blanco;
        }
    }

    bandera[5][7] = verde;
    bandera[5][8] = verde;
    bandera[6][7] = verde;
    bandera[6][8] = verde;
}

//Bandera Brasil
public static void brasil(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = verde;
        }
    }

    int centroFila = 5;
    int centroCol = 8;

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(Math.abs(i - centroFila) + Math.abs(j - centroCol) <= 5) {
                bandera[i][j] = amarillo;
            }
        }
    }

    for(int i = 4; i <= 7; i++) {
        for(int j = 6; j <= 9; j++) {
            bandera[i][j] = azul;
        }
    }

    bandera[3][7] = azul;
    bandera[3][8] = azul;
    bandera[8][7] = azul;
    bandera[8][8] = azul;
    bandera[5][6] = blanco;
    bandera[5][7] = blanco;
    bandera[6][7] = blanco;
    bandera[6][8] = blanco;
}

// Bandera URUGUAY
public static void uruguay(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i % 2 == 0) {
                bandera[i][j] = blanco;
            } else {
                bandera[i][j] = azul;
            }
        }
    }

    for(int i = 0; i < 6; i++) {
        for(int j = 0; j < 6; j++) {
            bandera[i][j] = blanco;
        }
    }

    bandera[2][3] = amarillo;
    bandera[1][3] = amarillo;
    bandera[3][3] = amarillo;
    bandera[2][2] = amarillo;
    bandera[2][4] = amarillo;
    bandera[1][2] = amarillo;
    bandera[1][4] = amarillo;
    bandera[3][2] = amarillo;
    bandera[3][4] = amarillo;
}

// Bandera ESPAÑA
public static void espana(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i < 3) {
                bandera[i][j] = rojo;
            } else if(i < 9) {
                bandera[i][j] = amarillo;
            } else {
                bandera[i][j] = rojo;
            }
        }
    }

    bandera[5][2] = rojo;
    bandera[6][2] = rojo;
    bandera[5][3] = amarillo;
    bandera[6][3] = amarillo;
    bandera[5][4] = rojo;
    bandera[6][4] = rojo;
}

// Bandera ESCOCIA
public static void escocia(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = azul;
        }
    }

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i == j || i + j == 15) {
                bandera[i][j] = blanco;
            }
        }
    }
}

// Bandera TURQUIA
public static void turquia(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = rojo;
        }
    }

    for(int i = 4; i <= 7; i++) {
        for(int j = 4; j <= 8; j++) {
            bandera[i][j] = blanco;
        }
    }

    for(int i = 4; i <= 7; i++) {
        for(int j = 6; j <= 9; j++) {
            bandera[i][j] = rojo;
        }
    }

    bandera[5][10] = blanco;
    bandera[6][9] = blanco;
    bandera[6][10] = blanco;
    bandera[6][11] = blanco;
    bandera[7][10] = blanco;
}

// Bandera BOSNIA
public static void bosnia(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = azul;
        }
    }

    for(int i = 0; i < 12; i++) {
        for(int j = 8; j < 16; j++) {

            if(j >= 8 + i/2) {
                bandera[i][j] = amarillo;
            }
        }
    }

    for(int i = 1; i < 12; i += 2) {
        int j = 5 + i/2;
        if(j < 16) {
            bandera[i][j] = blanco;
        }
    }
}

// Bandera REPUBLICA CHECA
public static void checa(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i < 6) {
                bandera[i][j] = blanco;
            } else {
                bandera[i][j] = rojo;
            }
        }
    }

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 8; j++) {

            if(j <= i/2 && j <= (11 - i)/2) {
                bandera[i][j] = azul;
            }
        }
    }
}

// Bandera ESLOVAQUIA
public static void eslovaquia(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i < 4) {
                bandera[i][j] = blanco;
            } else if(i < 8) {
                bandera[i][j] = azul;
            } else {
                bandera[i][j] = rojo;
            }
        }
    }

    bandera[5][3] = rojo;
    bandera[6][3] = rojo;
    bandera[5][4] = blanco;
    bandera[6][4] = blanco;
    bandera[6][2] = azul;
    bandera[6][5] = azul;
}

// Bandera ALBANIA
public static void albania(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = rojo;
        }
    }

    bandera[3][6] = negro;
    bandera[3][9] = negro;
    bandera[4][5] = negro;
    bandera[4][6] = negro;
    bandera[4][7] = negro;
    bandera[4][8] = negro;
    bandera[4][9] = negro;
    bandera[4][10] = negro;
    bandera[5][7] = negro;
    bandera[5][8] = negro;
    bandera[6][7] = negro;
    bandera[6][8] = negro;
    bandera[7][5] = negro;
    bandera[7][6] = negro;
    bandera[7][7] = negro;
    bandera[7][8] = negro;
    bandera[7][9] = negro;
    bandera[7][10] = negro;
    bandera[8][6] = negro;
    bandera[8][9] = negro;
}

// Bandera TUNEZ
public static void tunez(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = rojo;
        }
    }

    bandera[3][7] = blanco;
    bandera[3][8] = blanco;
    bandera[4][6] = blanco;
    bandera[4][7] = blanco;
    bandera[4][8] = blanco;
    bandera[4][9] = blanco;
    bandera[5][6] = blanco;
    bandera[5][7] = blanco;
    bandera[5][8] = blanco;
    bandera[5][9] = blanco;
    bandera[6][6] = blanco;
    bandera[6][7] = blanco;
    bandera[6][8] = blanco;
    bandera[6][9] = blanco;
    bandera[7][7] = blanco;
    bandera[7][8] = blanco;
    bandera[5][7] = rojo;
    bandera[6][7] = rojo;
    bandera[5][8] = rojo;
    bandera[5][9] = rojo;
    bandera[6][9] = rojo;
    bandera[6][8] = rojo;
}

// Ahora ARGELIA
public static void argelia(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(j < 8) {
                bandera[i][j] = verde;
            } else {
                bandera[i][j] = blanco;
            }
        }
    }

    bandera[5][6] = blanco;
    bandera[6][6] = blanco;
    bandera[4][7] = blanco;
    bandera[5][7] = blanco;
    bandera[6][7] = blanco;
    bandera[7][7] = blanco;
    bandera[5][7] = rojo;
    bandera[6][7] = rojo;
    bandera[5][9] = rojo;
    bandera[6][8] = rojo;
    bandera[6][9] = rojo;
    bandera[6][10] = rojo;
    bandera[7][9] = rojo;
}

// Bandera CABO VERDE
public static void caboverde(String[][] bandera) {

    // 1. Fondo azul
    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = azul;
        }
    }

    for(int j = 0; j < 16; j++) {
        bandera[6][j] = blanco;
        bandera[7][j] = rojo;
        bandera[8][j] = blanco;
    }

    bandera[3][4] = amarillo;
    bandera[3][5] = amarillo;
    bandera[4][3] = amarillo;
    bandera[4][6] = amarillo;
    bandera[5][2] = amarillo;
    bandera[5][7] = amarillo;
    bandera[6][3] = amarillo;
    bandera[6][6] = amarillo;
    bandera[7][4] = amarillo;
    bandera[7][5] = amarillo;
}

// Bandera CONGO
public static void congo(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(Math.abs(j - (i + 2)) <= 1) {
                bandera[i][j] = rojo;
            }
            else if(j < i + 2) {
                bandera[i][j] = verde;
            }
            else {
                bandera[i][j] = amarillo;
            }
        }
    }
}

// Bandera COREA DEL SUR
public static void coreas(String[][] bandera) {

    // 1. Fondo blanco
    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = blanco;
        }
    }

    bandera[4][7] = rojo;
    bandera[4][8] = rojo;
    bandera[5][6] = rojo;
    bandera[5][7] = rojo;
    bandera[5][8] = rojo;
    bandera[5][9] = rojo;
    bandera[6][6] = azul;
    bandera[6][7] = azul;
    bandera[6][8] = azul;
    bandera[6][9] = azul;
    bandera[7][7] = azul;
    bandera[7][8] = azul;
    bandera[5][7] = azul;
    bandera[6][8] = rojo;
    bandera[1][1] = negro;
    bandera[1][2] = negro;
    bandera[2][1] = negro;
    bandera[2][2] = negro;
    bandera[1][13] = negro;
    bandera[1][14] = negro;
    bandera[2][13] = negro;
    bandera[2][14] = negro;
    bandera[9][1] = negro;
    bandera[9][2] = negro;
    bandera[10][1] = negro;
    bandera[10][2] = negro;
    bandera[9][13] = negro;
    bandera[9][14] = negro;
    bandera[10][13] = negro;
    bandera[10][14] = negro;
}

// Bandera IRAN
public static void iran(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i < 4) {
                bandera[i][j] = verde;
            } else if(i < 8) {
                bandera[i][j] = blanco;
            } else {
                bandera[i][j] = rojo;
            }
        }
    }

    bandera[5][8] = rojo;
    bandera[6][7] = rojo;
    bandera[6][8] = rojo;
    bandera[6][9] = rojo;
    bandera[7][8] = rojo;
}

// Bandera ARABIA SAUDITA
public static void arabia(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = verde;
        }
    }

    for(int j = 3; j < 13; j++) {
        bandera[3][j] = blanco;
        bandera[4][j] = blanco;
    }

    for(int j = 4; j < 12; j++) {
        bandera[8][j] = blanco;
    }

    bandera[8][12] = blanco;
    bandera[9][4] = blanco;
}

// Bandera AUSTRALIA
public static void australia(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = azul;
        }
    }

    for(int j = 0; j < 8; j++) {
        bandera[2][j] = rojo;
        bandera[3][j] = rojo;
    }

    for(int i = 0; i < 6; i++) {
        bandera[i][3] = rojo;
        bandera[i][4] = rojo;
    }

    bandera[6][12] = blanco;
    bandera[7][11] = blanco;
    bandera[7][12] = blanco;
    bandera[7][13] = blanco;
    bandera[8][12] = blanco;
    bandera[2][11] = blanco;
    bandera[3][13] = blanco;
    bandera[5][10] = blanco;
    bandera[9][14] = blanco;
}

// Bandera QATAR
public static void qatar(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(j < 6) {
                bandera[i][j] = blanco;
            } else {
                bandera[i][j] = rojo;
            }
        }
    }

    for(int i = 0; i < 12; i++) {

        if(i % 2 == 0) {
            bandera[i][5] = rojo;
        } else {
            bandera[i][6] = blanco;
        }
    }
}

// 🇯🇴 JORDANIA
public static void jordania(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i < 4) {
                bandera[i][j] = negro;
            } else if(i < 8) {
                bandera[i][j] = blanco;
            } else {
                bandera[i][j] = verde;
            }
        }
    }

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 6; j++) {

            if(j <= i/2 && j <= (11 - i)/2) {
                bandera[i][j] = rojo;
            }
        }
    }

    bandera[5][2] = blanco;
    bandera[6][1] = blanco;
    bandera[6][2] = blanco;
    bandera[6][3] = blanco;
    bandera[7][2] = blanco;
}

// Bandera NUEVA ZELANDA
public static void nzelanda(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {
            bandera[i][j] = azul;
        }
    }

    bandera[3][11] = rojo;
    bandera[2][11] = blanco;
    bandera[4][11] = blanco;
    bandera[3][10] = blanco;
    bandera[3][12] = blanco;
    bandera[5][13] = rojo;
    bandera[4][13] = blanco;
    bandera[6][13] = blanco;
    bandera[5][12] = blanco;
    bandera[5][14] = blanco;
    bandera[7][10] = rojo;
    bandera[6][10] = blanco;
    bandera[8][10] = blanco;
    bandera[7][9] = blanco;
    bandera[7][11] = blanco;
    bandera[9][13] = rojo;
    bandera[8][13] = blanco;
    bandera[10][13] = blanco;
    bandera[9][12] = blanco;
    bandera[9][14] = blanco;
}

// Bandera CROACIA
public static void croacia(String[][] bandera) {

    for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 16; j++) {

            if(i < 4) {
                bandera[i][j] = rojo;
            } else if(i < 8) {
                bandera[i][j] = blanco;
            } else {
                bandera[i][j] = azul;
            }
        }
    }

    for(int i = 4; i < 8; i++) {
        for(int j = 6; j < 10; j++) {           
            if((i + j) % 2 == 0) {
                bandera[i][j] = rojo;
            } else {
                bandera[i][j] = blanco;
            }
        }
    }
}

    public static void imprimir(String[][] bandera) {

        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 16; j++) {
                System.out.print(bandera[i][j] + "  " + reset);
            }
            System.out.println();
        }
    }
}