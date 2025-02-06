
import java.util.Scanner;
import java.util.Random;

public class GalletaFortuna implements MensajeProvider {

    private String [] mensajes = {
            "Hola Mundo",
            "La suerte favorece a los valientes.",
            "Hoy es un buen día para empezar algo nuevo.",
            "La paciencia es la clave del éxito.",
            "Cada día es una segunda oportunidad.",
            "Lo mejor está por venir.",
            "Confía en ti mismo y lograrás grandes cosas.",
            "Las oportunidades no se pierden, alguien más las toma.",
            "Tu esfuerzo será recompensado pronto.",
            "No cuentes los días, haz que los días cuenten.",
            "El éxito es la suma de pequeños esfuerzos repetidos cada día.",
            "Si puedes soñarlo, puedes hacerlo.",
            "Las grandes cosas toman tiempo, pero cada paso cuenta.",
            "Lo único imposible es aquello que no intentas.",
            "No dejes que el miedo decida tu futuro.",
            "Todo logro comienza con la decisión de intentarlo.",
            "Eres más fuerte de lo que crees.",
            "Los límites solo existen en tu mente.",
            "La perseverancia es el secreto de todos los triunfos.",
            "La actitud lo es todo: mantén una mentalidad positiva."
    };

    @Override
    public String obtenerMensajeAleatorio() {
        Random random = new Random();
        return mensajes[random.nextInt(mensajes.length)];
    }
}