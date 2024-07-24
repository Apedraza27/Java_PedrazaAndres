package trainer;

class Trainer{
    private int identificacion;
    private String nombre;
    private String direccion;
    private String telefonocelular;
    private String telefonofijo;
    
    

    public Trainer(int identificacion, String nombre, String direccion, String telefonocelular, String telefonofijo){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonocelular = telefonocelular;
        this.telefonofijo = telefonofijo;
    }


    public int getIdentificacion(){
        return identificacion;
    }

    public void setIdentificacion(int identificacion){
        this.identificacion = identificacion;
    }

    public String getNombre(){
        return nombre;
    }

    public void getNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public void getDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getTelefonocelular() {
        return telefonocelular;
    }

    public void setTelefonocelular(String telefonocelular) {
        this.telefonocelular = telefonocelular;
    }

    public String getTelefonofijo() {
        return telefonofijo;
    }

    public void setTelefonofijo(String telefonofijo) {
        this.telefonofijo = telefonofijo;
    }

    @Override
    public String toString(){
        return "\n Trainer{" +
        "\n identificacion='" + identificacion + '\'' +
        ",\n nombre='" + nombre + '\'' +
        ",\n direccion='" + direccion + '\'' +
        ",\n telefonoCelular='" + telefonocelular + '\'' +
        ",\n telefonoFijo='" + telefonofijo + '\'' +
        '\n }'; 
    }
}