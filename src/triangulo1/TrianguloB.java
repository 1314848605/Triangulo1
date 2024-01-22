
package triangulo1;

class TrianguloB {
    private int tamaño;
    private char caracter;

    public TrianguloB(int tamaño, char caracter) {
        this.tamaño = tamaño;
        this.caracter = caracter;
    }

    public void imprimir() {
        for (int i = tamaño; i >= 1; i--) { //         /*1*/  ta + tamaño*tc + tc + tamaño*(ta+to)
            for (int j = 1; j <= i; j++) { //          /*2*/  tamaño*ta + tamaño*tc + tc + 
                System.out.print(caracter + " ");//    /*3*/
            }
            System.out.println();//                     /*4*/
        }
    }
}
//DESCRIPCIÓN DE COSTES DE ESTIMACIÓN DE COSTES:
//T = ta + tamaño*tc + tc + tamaño*(ta+to) + tamaño*ta + tamaño*tc + tc + tamaño*(ta+to)
//T = ta + tamaño*(2tc) + tamaño*(2ta+2to) + tamaño*ta + 2tc
//T = ta + tamaño*(2tc+3ta+2to) + 2tc
