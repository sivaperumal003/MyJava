
 class Laptop {
        static int model = 10001;
        static String pre= "DELL";
        static String suf= "LAP";
        final String id;
        String modelName;
        int dimension;
        String color;
        public Laptop(String modelName, int dimension, String color) {
        this.id = pre + model++ +suf; 
        this.modelName = modelName;
        this.dimension = dimension;
        this.color = color;
    }
    void disp(){
        System.out.println("id : "+id);
        System.out.println("Model name : "+modelName);
        System.out.println("Dimension : "+dimension);
        System.out.println("Color : "+color);
        System.out.println("-----------------");
    }
}
 class MainLaptop {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Aspire", 15, "Silver");
        Laptop l2 = new Laptop("Aspire", 14, "Blue");
        l1.disp();
        l2.disp();
    }
}