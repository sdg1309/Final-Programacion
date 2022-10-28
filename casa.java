package finalSa; 

public class casa {
    private String nomcasa;
    private int ID;
    private String color;
    private int numGol;
    private juga[] x = new juga();


    public casa(String nomcasa, int ID, String color, int numGol){
        this.nomcasa = nomcasa;
        this.ID = ID;
        this.color = color;
    }

    public void setNumGol(int numGol) {
        this.numGol = numGol;
    }

    public String infoCas(){
        return "La casa " + nomcasa + " con el ID " + ID + " con el color " + color + " tiene " + numGol + " numero de goles";
    }
}
