public class CuatroHilos {
    
    public static void main(String[] args) {
        
        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hugo");
            }
        });
        
        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Esteban");
            }
        });
        
        Thread hilo3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Zapata");
            }
        });
        
        Thread hilo4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Tuberquia");
            }
        });
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
    }
}
