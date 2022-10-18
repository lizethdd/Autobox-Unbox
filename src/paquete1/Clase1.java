
package paquete1;


 class Clase1 {
     String atributoPrivate= "Atributo protegido";
    
     public Clase1(String arg){
         this(); //Aquí se llama al constructor privado
        System.out.println("Desde el constructor privado."+arg);
        
    }
     private Clase1(){
        System.out.println("En el constructor vacío privado");
        
    }
            
     private void MetodoPrivate(){
        System.out.println("En el método privado desde la Clase1");
    }
}
