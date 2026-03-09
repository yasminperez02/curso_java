package Exercicios;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        //  Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
        //  sabendo que o mesmo pode começar em um dia e terminar em outro,
        //  tendo uma duração mínima de 1 hora e máxima de 24 horas

        Scanner sc = new Scanner(System.in);
        int duracao;

        IO.println("Hora inicial: ");
        int horaInicio = sc.nextInt();
        IO.println("Hora fim: ");
        int horaFim = sc.nextInt();

        if(horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
            duracao = Math.abs(duracao);
        }
        else {
            duracao = 24 - horaInicio + horaFim;
            duracao = Math.abs(duracao);
        }

        System.out.printf("Horas jogadas %d%n", duracao);
        sc.close();
    }
}
