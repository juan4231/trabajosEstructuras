package Identificador;
public class NormalizadorID {

    public static void main(String[] args) {

        String idSucio = " User_123 ";

        String idLimpio = idSucio
                .trim()
                .toUpperCase()
                .substring(0, 8);

        System.out.println("ID sucio: " + idSucio);
        System.out.println("ID limpio: " + idLimpio);

        System.out.println("Hash ID sucio: " + System.identityHashCode(idSucio));
        System.out.println("Hash ID limpio: " + System.identityHashCode(idLimpio));

        StringBuilder sb = new StringBuilder(idLimpio);
        sb.reverse();

        String idInvertido = sb.toString();
        System.out.println("ID invertido: " + idInvertido);
    }
}
