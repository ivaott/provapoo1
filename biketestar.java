package prova.poo;


public class biketestar {
    public static void main(String [] args) {
    
        bike c1 =  new bike();
        
        c1.nome = "rockhopper";
        c1.marca = "specialized";
        c1.cor = "green";
        c1.ano = 2014;
        c1.vel = 15;
       
        c1.acelerar(10);
        
        System.out.println("Velocidade:" + c1.vel + "Km/h" );
        
        c1.freiar(12);
        
        System.out.println("Velocidade:" + c1.vel + "Km/h" );
        
        c1.buzinar();
        
        System.out.println();
        
        bike c1 =  new bike();
        
        c1.nome = "rockhopper2020";
        c1.marca = "specialized";
        c1.cor = "red";
        c1.ano = 2020;
        c1.vel = 25;
       
        c1.acelerar(15);
        
        System.out.println("Velocidade:" + c1.vel + "Km/h" );
        
        c1.freiar(20);
        
        System.out.println("Velocidade:" + c1.vel + "Km/h" );
        
        c1.buzinar();
        
        System.out.println();
        
        bike c1 =  new bike();
        
        c1.nome = "Hacker";
        c1.marca = "Oggi";
        c1.cor = "black";
        c1.ano = 2018;
        c1.vel = 10;
       
        c1.acelerar(20);
        
        System.out.println("Velocidade:" + c1.vel + "Km/h" );
        
        c1.freiar(5);
        
        System.out.println("Velocidade:" + c1.vel + "Km/h" );
        
        c1.buzinar();
        
        System.out.println();
    }
}
