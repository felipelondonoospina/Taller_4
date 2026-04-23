# Taller_4

---

## 📌 Descripción del Proyecto

Este proyecto corresponde al desarrollo de un taller práctico en Java enfocado en el uso de arreglos y matrices y buenas prácticas de trabajo colaborativo con todo el grupo. El objetivo principal es comprender cómo imprimir banderas de mundial en la consola y como ir actualizando tablas de posiciones y información de los distintos países utilizando lo aprendido en clase.

El trabajo se desarrolla en equipo, integrando control de versiones mediante commits organizados, documentación en README y evidencias del proceso. Además, se busca fortalecer habilidades fundamentales de programación como el manejo de matrices, así como la correcta estructura de un proyecto Java dentro de un repositorio colaborativo.

---

## 👥 Integrantes del Equipo

John Steven Pinzon Lenis

Samuel David Campo Rocha

Felipe Londoño Ospina

---

## 🏳️ Matrix Console

---

## 📊 Tabla de Posiciones

import java.util.Scanner;

public class TablaPosiciones3 {

    static final int PJ=0,PG=1,PE=2,PP=3,GF=4,GC=5,DG=6,TA=7,TR=8,PTS=9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Equipos por grupos
        String[][] grupos = {
            {"Mexico","Sudafrica","Corea del Sur","Republica Checa"},
            {"Canada","Bosnia y Herzegovina","Catar","Suiza"},
            {"Brasil","Marruecos","Haiti","Escocia"},
            {"EEUU","Paraguay","Australia","Turquia"},
            {"Alemania","Curaçao","Costa de Marfil","Ecuador"},
            {"Holanda","Japon","Suecia","Tunez"},
            {"Belgica","Egipto","Iran","Nueva Zelanda"},
            {"España","Cabo Verde","Arabia Saudita","Uruguay"},
            {"Francia","Senegal","Irak","Noruega"},
            {"Argentina","Argelia","Austria","Jordania"},
            {"Portugal","Congo democrática","Uzbekistan","Colombia"},
            {"Inglaterra","Croacia","Ghana","Panama"}
        };

        int[][] tabla = new int[48][10];

        int op;
        do {
            System.out.println("\n1. Editar equipo");
            System.out.println("2. Ver tabla");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            op = sc.nextInt();

            if(op==1){
                int cont=0;
                for(int g=0; g<12; g++){
                    System.out.println("\nGrupo " + (char)('A'+g));
                    for(int e=0; e<4; e++){
                        System.out.println((cont+1)+". "+grupos[g][e]);
                        cont++;
                    }
                }

                System.out.print("Seleccione equipo: ");
                int i = sc.nextInt()-1;

                System.out.print("PJ: "); tabla[i][PJ]=sc.nextInt();
                System.out.print("PG: "); tabla[i][PG]=sc.nextInt();
                System.out.print("PE: "); tabla[i][PE]=sc.nextInt();
                System.out.print("PP: "); tabla[i][PP]=sc.nextInt();
                System.out.print("GF: "); tabla[i][GF]=sc.nextInt();
                System.out.print("GC: "); tabla[i][GC]=sc.nextInt();
                System.out.print("TA: "); tabla[i][TA]=sc.nextInt();
                System.out.print("TR: "); tabla[i][TR]=sc.nextInt();

                tabla[i][DG]=tabla[i][GF]-tabla[i][GC];
                tabla[i][PTS]=(tabla[i][PG]*3)+tabla[i][PE];
            }

            if(op==2){
                // pasar a vector plano para ordenar
                String[] nombres = new String[48];
                int[][] t = new int[48][10];

                int k=0;
                for(int g=0; g<12; g++){
                    for(int e=0; e<4; e++){
                        nombres[k]=grupos[g][e]+"("+ (char)('A'+g)+")";
                        t[k]=tabla[k];
                        k++;
                    }
                }

                // ordenar por puntos
                for(int i=0;i<47;i++){
                    for(int j=0;j<47-i;j++){
                        if(t[j][PTS]<t[j+1][PTS]){
                            int[] aux=t[j]; t[j]=t[j+1]; t[j+1]=aux;
                            String s=nombres[j]; nombres[j]=nombres[j+1]; nombres[j+1]=s;
                        }
                    }
                }

                // mostrar paginado
                for(int p=0;p<6;p++){
                    System.out.println("\n--- PAGINA "+(p+1)+" ---");
                    System.out.printf("%-3s %-20s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s%n",
                            "Pos","Equipo","PJ","PG","PE","PP","GF","GC","DG","TA","Pts");

                    for(int i=p*8;i<p*8+8;i++){
                        System.out.printf("%-3d %-20s %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d%n",
                                i+1,nombres[i],
                                t[i][PJ],t[i][PG],t[i][PE],t[i][PP],
                                t[i][GF],t[i][GC],t[i][DG],
                                t[i][TA],t[i][PTS]);
                    }

                    System.out.println("ENTER...");
                    try{System.in.read();}catch(Exception e){}
                }
            }

        }while(op!=3);

        sc.close();
    }
}

---

## 📆 Fixture de Partidos

---

## ✨Información paises
