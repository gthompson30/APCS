public class IndexOfMax {

  public static int indexOfMax(int[] intList) {
    int maxVal = intList[0];
    int valIndex = 0;

    // you can not use an enhanced for loop as those do not keep track of index
    for (int i = 0; i < intList.length; i++) {
      if (intList[i] > maxVal) {
        maxVal = intList[i];
        valIndex = i;
      }
    }

    return valIndex;
  }

  public static void main(String[] args) {
    int[] ints = {1, 6, 3, 11, 2, 4, -1, -2, 0};
    System.out.println(indexOfMax(ints));
  }
}
