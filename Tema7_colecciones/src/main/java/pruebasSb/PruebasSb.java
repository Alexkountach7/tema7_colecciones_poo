package pruebasSb;

public class PruebasSb {
    static void main() {
        StringBuilder sb = new StringBuilder();

        sb.append("es el vecino  ");
        sb.append("el que elige ").append(" al alcalde");
        System.out.println(sb);
        sb.insert(13,"alcalde");
        sb.replace(20,25,"vecinos");
        sb.delete(13,17);
        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);
    }
}
