public class App {
    public static void main(String[] args) throws Exception { 
        runMetodoBurbujaAvanzado();
    }

    public static void runMetodoBurbujaAvanzado() {
        int[] arreglo = new int[]{50, 5, 20, 30, 0, -10, 15};
        // 1ro instanciar la clase
        MetodoBurbujaAvanzado mBurbujaAvanzado = new MetodoBurbujaAvanzado(arreglo);
        mBurbujaAvanzado.printArreglo();
        mBurbujaAvanzado.sort(true);
        mBurbujaAvanzado.printArreglo();
        mBurbujaAvanzado.sort(false);
        mBurbujaAvanzado.printArreglo();
    }
}
