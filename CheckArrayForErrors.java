class CheckArrayForErrors {
    public Errors CheckArrayForErrors(Integer[] array) {
        if (new CheckArrayForNull().CheckArrayForNull(array).equals(Errors.ERR1001)) {
            System.out.println(Errors.ERR1001 + " - массив(ы) равен(ы) NULL");
            return Errors.ERR1001;
        }
        if (new CheckArrayForElementNull().CheckArrayForElementNull(array).equals(Errors.ERR1002)) {
            System.out.println(Errors.ERR1002 + " - элемент(ы) массива содержат значение NULL");
            return Errors.ERR1002;
        }
        return Errors.NOErrors;
    }
}