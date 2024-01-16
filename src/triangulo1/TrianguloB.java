
package triangulo1;

class TrianguloB {
    private int tamaño;
    private char caracter;

    public TrianguloB(int tamaño, char caracter) {
        this.tamaño = tamaño;
        this.caracter = caracter;
    }

    public void imprimir() {
        for (int i = tamaño; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(caracter + " ");
            }
            System.out.println();
        }
    }
}
