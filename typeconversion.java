class typeconversion {
    
    public static void main(String[] args) {
        int a = 25;
        long b = a; // implicit type conversion
        System.out.println(b);

        long x = 100L;
        int y = (int)x; // explicit type conversion
        System.out.println(y);
    }
}
