package finalSa; 

public class escuela {
    private String nombre;
    private String ubicacion;
    private casa[] lol = new casa[4];


    public escuela(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void setCasa(casa lol[]){
        this.lol = lol;
    }

}
