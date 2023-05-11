public class Jugador { 
//Variables    
    private String Nombre;  
// Constructores
    public Jugador (){
    } 
// Metodos
    public void setPersona (String Nombre){
        this.Nombre = Nombre;
    }
    public String getNombre (){
        return this.Nombre;
    }
    public static void main(String[]arg){
        System.out.println("Nombre jugador");
    }
}
