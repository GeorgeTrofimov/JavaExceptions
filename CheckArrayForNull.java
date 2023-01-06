class CheckArrayForNull {
    public Errors CheckArrayForNull(Integer[] array) {
        if (array == null) {
            return Errors.ERR1001;
        } else {
            return Errors.NOErrors;
        }
    }
}