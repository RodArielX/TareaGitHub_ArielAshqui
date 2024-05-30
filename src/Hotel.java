//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Correccion Prueba B1
//Ariel Ashqui
public class Hotel {
    private String nombre;
    private int telefono;
    private int numeroHabitaciones;
    private double precio;
    private String ciudad;

    // Metodo constructor con parametros
    public Hotel(String nombre, int telefono, int numeroHabitaciones, double precio, String ciudad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.numeroHabitaciones = numeroHabitaciones;
        this.precio = precio;
        this.ciudad = ciudad;
    }

    //Metodo constructor sin parametros
    public Hotel() {
    }

    // Metodos getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }
    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Metodo para imprimir los datos del hotel
    public void imprimirHotel() {
        System.out.println("Hotel: " + nombre);
        System.out.println("Telefono: " + telefono);
        System.out.println("Numero de Habitaciones: " + numeroHabitaciones);
        System.out.println("Precio: " + precio);
        System.out.println("Ciudad: " + ciudad);
    }

    // Metodo main para la creacion de las instancias
    public static void main(String[] args) {
        //5 instancias de la clase Hotel con valores predeterminados
        Hotel hotel1 = new Hotel("Las Palmas", 3201993, 21,12.50, "Esmeraldas");
        Hotel hotel2 = new Hotel("Marriot", 3212004, 50,100.75, "Quito");
        Hotel hotel3 = new Hotel("Hilton Colon", 3212234, 65,90.0, "Quito");
        Hotel hotel4 = new Hotel("Decameron", 3234567, 40,80.65, "Mompiche");
        Hotel hotel5 = new Hotel("Bellavista", 3253264, 50,20.99, "Ambato");

        //2 objetos con valores nulos y setear sus valores posteriormente
        Hotel hotel6 = new Hotel();
        Hotel hotel7 = new Hotel();

        hotel6.setNombre("Delfin");
        hotel6.setTelefono(3219891);
        hotel6.setNumeroHabitaciones(100);
        hotel6.setPrecio(250.0);
        hotel6.setCiudad("Manta");

        hotel7.setNombre("Oro Verde");
        hotel7.setTelefono(3291084);
        hotel7.setNumeroHabitaciones(40);
        hotel7.setPrecio(21.99);
        hotel7.setCiudad("Guayaquil");

        // Modificar los objetos previamente creados
        modificarHotel(hotel1, "La Aldea", 3242422, 110, 160.0, "Ibarra");
        modificarHotel(hotel2, "Sheraton", 324242223, 210, 260.0, "Cuenca");

        // Imprimir todos los objetos
        hotel1.imprimirHotel();
        hotel2.imprimirHotel();
        hotel3.imprimirHotel();
        hotel4.imprimirHotel();
        hotel5.imprimirHotel();
        hotel6.imprimirHotel();
        hotel7.imprimirHotel();

        // Modificar todos los atributos de al menos tres objetos con el valor de NULL
//Desde aqui borre lls null
        hotel3.setTelefono(0);
        hotel3.setNumeroHabitaciones(0);
        hotel3.setPrecio(0.0);

        hotel4.setTelefono(0);
        hotel4.setNumeroHabitaciones(0);
        hotel4.setPrecio(0.0);

        hotel5.setTelefono(0);
        hotel5.setNumeroHabitaciones(0);
        hotel5.setPrecio(0.0);

        // Imprimir los objetos modificados
        hotel3.imprimirHotel();
        hotel4.imprimirHotel();
        hotel5.imprimirHotel();
    }

    // Mtodo para modificar los valores de un objeto Hotel
    public static void modificarHotel(Hotel hotel, String nombre, int telefono, int numeroHabitaciones,
                                      double precio, String ciudad) {
        hotel.setNombre(nombre);
        hotel.setTelefono(telefono);
        hotel.setNumeroHabitaciones(numeroHabitaciones);
        hotel.setPrecio(precio);
        hotel.setCiudad(ciudad);
    }
}