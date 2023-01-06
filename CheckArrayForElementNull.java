class CheckArrayForElementNull {
    public Errors CheckArrayForElementNull(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return Errors.ERR1002;
            }
        }
        return Errors.NOErrors;
    }
}