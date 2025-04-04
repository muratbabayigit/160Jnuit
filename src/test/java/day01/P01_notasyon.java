package day01;


import org.junit.jupiter.api.*;

public class P01_notasyon {

    @Test @Order(1)
    public void P1_ramazan(){
        System.out.println("Ramazan");
    }


    @Test @Order(4) @Disabled
    public void P3_fadime(){
        System.out.println("Fadime");
    }

    @Test @Order(2)
    public void P2_nihan(){
        System.out.println("Nihan");
    }

    @Test @Order(3)
    public void P4_ahmet(){
        System.out.println("Ahmet");
    }
}
