public class MySorts {
  
    public static void bubbleSort(ArrayList < Comparable > data) {
        for (int i = 0; i < data.size() - 1; i++) {
            for (int j = data.size() - 1; j > 0; j--) {
                if (data.get(j).compareTo(data.get(j - 1)) < 0) {
                    Comparable temp = data.get(j);
                    data.set(j, data.get(j - 1));
                    data.set(j - 1, temp);
                }
            }
        }
    }

    public static void selectionSort(ArrayList < Comparable > data) {
        for (int pass = 0; pass < data.size() - 1; pass++) {
            for (int j = data.size() - 1; j >= pass; j--) {
                if (data.get(j).compareTo(data.get(highestPos)) > 0) {
                    highestPos = j;
                }
            }
            Comparable temp = data.get(pass);
            data.set(pass, data.get(highestPos));
            data.set(highestPos, temp);
        }
    }

    public static ArrayList void insertionSort(ArrayList < Comparable > data) {
        for (int partition = 0; partition < data.size() - 1; partition++) {
            for (int i = partition + 1; i > 0; i--) {
                if ((data.get(i)).compareTo(data.get(i - 1)) < 0) {
                    Comparable temp = data.get(i - 1);
                    data.set(i - 1, data.get(i));
                    data.set(i, temp);
                } else
                    break;
            }
        }
    }
  
}
