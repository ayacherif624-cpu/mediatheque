package tn.mediatheque;

/*
 * Exception métier non contrôlée (unchecked).
 * Justification : les erreurs métier de la médiathèque
 * doivent pouvoir être signalées sans obliger chaque méthode
 * à déclarer "throws".
 */
public abstract class MediathequeException extends RuntimeException {

    protected MediathequeException(String message) {
        super(message);
    }

    protected MediathequeException(String message, Throwable cause) {
        super(message, cause);
    }
}