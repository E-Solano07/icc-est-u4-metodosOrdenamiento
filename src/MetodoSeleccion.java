public class MetodoSeleccion {
    
    int[]arreglo;

    public void sort(int[] arr) {
        int n= arr.length;
        for(int i = 0; i < n - 1; i++) {
            int indiceDelMenor = i;
            for(int j = 0; j < n; j++) {
                if(arr[indiceDelMenor] > arr[j]) {
                    indiceDelMenor = j; // ACTUALIZO EL INDICE
                }
            }
            if(i != indiceDelMenor) { // INTERCAMBIO
                int aux = arr[i];
                arr[i] = arr[indiceDelMenor];
                arr[indiceDelMenor] = aux;
            }
        }
    }

    public void sortDes(int[] arr) {
        int n= arr.length;
        for(int i = 0; i < n - 1; i++) {
            int indiceDelMayor = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[indiceDelMayor] < arr[j]) {
                    indiceDelMayor = j; // ACTUALIZO EL INDICE
                }
            }
            if(i != indiceDelMayor) { // INTERCAMBIO
                int aux = arr[i];
                arr[i] = arr[indiceDelMayor];
                arr[indiceDelMayor] = aux;
            }
        }

    }
    public void printArreglo(int[]arr) {
        for(int num : arr) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
