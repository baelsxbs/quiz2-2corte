import java.util.Date;

public class Estudiante {
    private String nombre;
    private Date fechaNacimiento;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;

    public Estudiante(String nombre, Date fechaNacimiento, double notaMateria1, double notaMateria2, double notaMateria3) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.notaMateria1 = notaMateria1;
        this.notaMateria2 = notaMateria2;
        this.notaMateria3 = notaMateria3;
    }

    public int getEdad() {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaActual.getMonth() < fechaNacimiento.getMonth()) {
            edad--;
        } else if (fechaActual.getMonth() == fechaNacimiento.getMonth()
                && fechaActual.getDate() < fechaNacimiento.getDate()) {
            edad--;
        }
        return edad;
    }

    public double getPromedio() {
        return (notaMateria1 + notaMateria2 + notaMateria3) / 3.0;
    }
}
