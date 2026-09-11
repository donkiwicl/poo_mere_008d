package dev.rampmaster;

public class Main {
        public static void usarJunaeb(Colaborable colaborable){
            colaborable.usarJunaebColaborador();
        }

    public static void main(String[] args) {

        Usuario[] usuario={
                new Estudiante("27076316-2", "Jon", "David", "Perera", "Lara", "30-06-2006", "hola@duocuc.cl"),
                new Docente("22076316-2", "Pablo", "Daniel", "Perez", "Alguien", "10-01-1980", "algo@duocuc.cl"),
                new Administrativo("30076316-2", "Juan", "Carlos", "Gonzalez", "Perez", "15-03-1990", "adsal@duocuc.cl"),
        };

        for(Usuario usuarios:usuario){
            usuarios.mostrarDatos();
            if(usuarios instanceof Colaborable){
                usarJunaeb((Colaborable) usuarios);
            }
        }
        Sede s = new Sede(2323, "San Joaquin", "123456789");
        s.mostrarSede();

        Asignatura a = new Asignatura("12324", "POO", "4", "Don kiwi", "Diurna");
        a.mostrarAsignatura();

        Sala sa=new Sala(304, 30, 31232);
        sa.mostrarSala();


        Seccion se=new Seccion("009-L" ,"POO", true);
        se.mostrarSeccion();

        Piso p = new Piso(3, 4);
        p.mostrarPiso();

    }
}