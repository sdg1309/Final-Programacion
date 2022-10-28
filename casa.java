public class casa {
    private String nomcasa;
    private int ID;
    private String color;
    private juga[] x = new juga[10];
    private partido[] y = new partido[10];


    public casa(String nomcasa, int ID, String color){
        this.nomcasa = nomcasa;
        this.ID = ID;
        this.color = color;
    }

    public casa(juga xs[]) {
        this.x = xs;
    }

    public casa(partido y[]) {
        this.y = y;
    }

    public String infoCas(){
        return "La casa " + nomcasa + " con el ID " + ID + " con el color " + color;
    }
}
