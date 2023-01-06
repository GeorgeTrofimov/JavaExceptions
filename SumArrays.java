class SumArrays {
    Integer[] arr1;
    Integer[] arr2;
    Integer[] newArray;
    Errors check1 = Errors.NOErrors;
    Errors check2 = Errors.NOErrors;

    public SumArrays(Integer[] array1, Integer[] array2) {
        this.arr1 = array1;
        this.arr2 = array2;
    }

    public Integer[] Sum() {
        check1 = new CheckArrayForErrors().CheckArrayForErrors(arr1);
        check2 = new CheckArrayForErrors().CheckArrayForErrors(arr2);
        if (check1.equals(Errors.NOErrors) && check2.equals(Errors.NOErrors)) {
            if (arr1.length == arr2.length) {
                newArray = new Integer[arr1.length];
                for (int i = 0; i < newArray.length; i++) {
                    newArray[i] = arr1[i] + arr2[i];
                }
            } else {
                System.out.println(Errors.ERR1003 + " - массивы разной длины (операция не возможна)");
            }
        }
        return newArray;
    }
}