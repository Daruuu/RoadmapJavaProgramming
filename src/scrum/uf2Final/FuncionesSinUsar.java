package scrum.uf2Final;

public class FuncionesSinUsar {
/*
    public static void mostrarReclusasPatioProhibido() {
        System.out.println("\033[31mRECLUSAS DE TERCER GRADO QUE NO PUEDEN SALIR AL PATIO:\033[0m");
        for (int i = 0; i < fichasTecnicasReclusas.length; i++) {
            if (fichasTecnicasReclusas[i][6].equals("0") && fichasTecnicasReclusas[i][5].equals(TIPO_GRADO_CONDENA) && Integer.parseInt(fichasTecnicasReclusas[i][4]) >= 9) {
                System.out.println(fichasTecnicasReclusas[i][0] + " " + fichasTecnicasReclusas[i][1]);
            }
        }
    }*/
    /*public static boolean reclusasPermisoBoolean() {
        permiso = false;
        for (int i = 0; i < ControlReclusas.controlReclusas.length; i++) {
            int indiceFichaPresas = mostrarReclusasPatioDisponible();
            if (ControlReclusas.controlReclusas[i].equals(indiceFichaPresas)) {
                permiso = true;
                return permiso;
            }
        }
//        permiso = false;
        return false;
    }*/
    /*public static int reclusasPatioDisponible() {
        for (int i = 0; i < fichasTecnicasReclusas.length; i++) {
            if (fichasTecnicasReclusas[i][fichasTecnicasReclusas[0].length-1].equals("1")) {
                presasSalirPatio = i;
            }
        }
        return presasSalirPatio;
    }*/
    /*public static void presasConPermiso() {
        int reclusasPatioDisponible = mostrarReclusasPatioDisponible();
        for (int i = 0; i < reclusasPatioDisponible; i++) {
            if (Integer.parseInt(ControlReclusas.controlReclusas[i][0]) == reclusasPatioDisponible) {
                System.out.println(ControlReclusas.controlReclusas[i][0]);
            }
        }
    }*/
    /*public static void mostrarReclusasPatioDisponible() {
        System.out.println("\033[34mRECLUSAS DE TERCER GRADO QUE PUEDEN SALIR AL PATIO:\033[0m");
        for (int i = 0; i < fichasTecnicasReclusas.length; i++) {
            if (fichasTecnicasReclusas[i][6].equals("1")) {
                System.out.println(fichasTecnicasReclusas[i][0] + " " + fichasTecnicasReclusas[i][1]);
            }
        }
    }*/

    /*public static void main(String[] args) {
        presasConPermiso();
    }*/

    /*public static boolean reclusasPermisoBoolean() {
        permiso = false;
        for (int i = 0; i < ControlReclusas.controlReclusas.length; i++) {
            int indiceFichaPresas = mostrarReclusasPatioDisponible();
            if (ControlReclusas.controlReclusas[i].equals(indiceFichaPresas)) {
                permiso = true;
                return permiso;
            }
        }
//        permiso = false;
        return false;
    }*/
    /*public static int reclusasPatioDisponible() {
        for (int i = 0; i < fichasTecnicasReclusas.length; i++) {
            if (fichasTecnicasReclusas[i][fichasTecnicasReclusas[0].length-1].equals("1")) {
                presasSalirPatio = i;
            }
        }
        return presasSalirPatio;
    }*/
/*
    public static int mostrarReclusasPatioDisponibleKarol() {
        for (int i = 0; i < fichasTecnicasReclusas.length; i++) {
            if (fichasTecnicasReclusas[i][6].equals("1")) {
                reclusasSalirPatio = i;
            }
        }
        return reclusasSalirPatio;
    }
*/
}
