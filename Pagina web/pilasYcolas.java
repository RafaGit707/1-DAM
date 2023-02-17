package Pagina web;

public class pilasYcolas {
   

   public static void main(String[] args) {
      
      Caja caja = new Caja();
      Cliente[] colaClientes = new Cliente[0];
      Cliente cliente1 = new Cliente("Andres", AccionesBanco.RETIRAR, 100);
      colaClientes = enqueue(colaClientes,cliente1);
      Cliente cliente2 = new Cliente("Javier", AccionesBanco.RETIRAR, 540.5);
      colaClientes= enqueue(colaClientes, cliente2);
      Cliente cliente3 = new Cliente("Sara", AccionesBanco.RETIRAR, 1500);
      colaClientes = enqueue(colaClientes,cliente3);


      estadoCola(colaClientes);
      colaClientes = atender(caja, colaClientes);
      System.out.println(cajas.saldo());
      Cliente cliente4 = new Cliente("Miguel", AccionesBanco.INGRESAR, 2000);
      colaClientes = enqueue(colaClientes,cliente4);
      colaClientes = atender(caja, colaClientes);
      System.out.println(caja.saldo());
      estadoCola(colaClientes);


  }



}
