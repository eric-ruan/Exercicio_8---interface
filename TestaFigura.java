public class TestaFigura {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Retangulo retangulo = new Retangulo();

        retangulo.setAltura(8);
        retangulo.setBase(5);
        System.out.println("Nome da figura: " + retangulo.getNomeFigura());
        System.out.println("Area do retangulo: " + retangulo.getArea());
        System.out.println("Perimetro do retangulo: " + retangulo.getPerimetro());
        System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");
        triangulo.setLadoA(5);
        triangulo.setLadoB(6);
        triangulo.setLadoC(7);
        triangulo.setBase(5);
        triangulo.setAltura(8);
        System.out.println("Nome da figura: " + triangulo.getNomeFigura());
        System.out.println("Valor do perimetro: " + triangulo.getPerimetro());
        System.out.println("Area: " + triangulo.getArea());
        System.out.println("-=--=--=--=--=--=--=--=--=--=--=--=--=--=--=-");
        quadrado.setLado(5);
        System.out.println("Nome da figura: " + quadrado.getNomeFigura());
        System.out.println("Valor do perimetro: " + quadrado.getPerimetro());
        System.out.println("Area: " + quadrado.getArea());
    }
}
