dpublic class UninitializedObjectExample {
    public static void main(String[] args) {
        Object obj;
        initialize(obj);
    }

    private static void initialize(Object obj) {
        System.out.println(obj.toString());
    }
}
i
