
package triangulo1;

class TrianguloA {
    private int tamaño;
    private char caracter;

    public TrianguloA(int tamaño, char caracter) {
        this.tamaño = tamaño;
        this.caracter = caracter;
    }

    public void imprimir() {
        for (int i = 1; i <= tamaño; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(caracter + " ");
            }
            System.out.println();
        }
    }
}