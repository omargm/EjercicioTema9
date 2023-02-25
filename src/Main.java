public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setEdad(29);
        cliente1.setTelefono("668 115 39 64");
        cliente1.setNombre("Azucena Moreno");
        cliente1.setCredito(1452.45);

        System.out.println(cliente1.getNombre() + " " + cliente1.getEdad() + " años, tel: " + cliente1.getTelefono() + ", credito: " + cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(33);
        trabajador1.setTelefono("645 122 45 45");
        trabajador1.setNombre("JC");
        trabajador1.setSalario(17500);

        System.out.println(trabajador1.getNombre() + " " + trabajador1.getEdad() + " años, tel: " + trabajador1.getTelefono() + ", salario: " + trabajador1.getSalario());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
 class Cliente extends Persona{
    private double credito;

     public double getCredito() {
         return credito;
     }

     public void setCredito(double credito) {
         this.credito = credito;
     }
 }

 class Trabajador extends Persona{
    private int salario;

     public int getSalario() {
         return salario;
     }

     public void setSalario(int salario) {
         this.salario = salario;
     }
 }