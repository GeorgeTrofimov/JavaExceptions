class DivisionArrays {
    Integer[] arr1;
    Integer[] arr2;
    Integer[] newArray;
    Errors check1 = Errors.NOErrors;
    Errors check2 = Errors.NOErrors;

    public DivisionArrays(Integer[] array1, Integer[] array2) {
        this.arr1 = array1;
        this.arr2 = array2;
    }

    public Integer[] Division() {
        check1 = new CheckArrayForErrors().CheckArrayForErrors(arr1);
        check2 = new CheckArrayForErrors().CheckArrayForErrors(arr2);
        Errors result = Errors.NOErrors;
        if (check1.equals(Errors.NOErrors) && check2.equals(Errors.NOErrors)) {
            if (arr1.length == arr2.length) {
                newArray = new Integer[arr1.length];
                for (int i = 0; i < newArray.length; i++) {
                    if (!arr2[i].equals(0)) {
                        newArray[i] = arr1[i] / arr2[i];
                    } else {
                        result = Errors.ERR1004;
                    }
                }
            } else {
                System.out.println(Errors.ERR1003 + " - массивы разной длины (операция не возможна)");
            }
        }
        if (result.equals(Errors.ERR1004)) {
            System.out.println(Errors.ERR1004 + " - деление на ноль не возможно");
            return newArray = null;
        } else {
            return newArray;
        }
    }
}