public class Main {
    public static void main(String[] args) throws Exception {
        
        // Creamos el Mundial
        Mundial mundial_2022 = new Mundial(1, 2022);

        // Creamos las Selecciones
        mundial_2022.anyadirSeleccion(1, "España");
        mundial_2022.anyadirSeleccion(2, "Argentina");

        ///////////// FUTBOLISTAS SELECCIÓN ESPAÑOLA /////////////

        Futbolista es1 = new Futbolista(1, "Unai", "Simón Mendibil", "1997-06-11", 88, 1.90, 23, "Portero");
        mundial_2022.getSeleccion(1).anadirPersona(es1);
        Futbolista es2 = new Futbolista(2, "César", "Azpilicueta Tanco", "1989-08-28", 78, 1.78, 2, "Defensa");
        mundial_2022.getSeleccion(1).anadirPersona(es2);
        Futbolista es3 = new Futbolista(3, "Eric", "García Martret", "2001-01-09", 73, 1.83, 3, "Defensa");
        mundial_2022.getSeleccion(1).anadirPersona(es3);
        Futbolista es4 = new Futbolista(4, "Pau", "Torres Ayala", "1997-01-16", 80, 1.91, 4, "Defensa");
        mundial_2022.getSeleccion(1).anadirPersona(es4);
        Futbolista es5 = new Futbolista(5, "Jordi", "Alba Ramos", "1989-03-21", 68, 1.70, 18, "Defensa");
        mundial_2022.getSeleccion(1).anadirPersona(es5);
        Futbolista es6 = new Futbolista(6, "Rodri", "Hernández Cascante", "1996-06-22", 82, 1.91, 16, "Centrocampista");
        mundial_2022.getSeleccion(1).anadirPersona(es6);
        Futbolista es7 = new Futbolista(7, "Gavi", "Paéz Gavira", "2004-08-05", 68, 1.73, 9, "Centrocampista");
        mundial_2022.getSeleccion(1).anadirPersona(es7);
        Futbolista es8 = new Futbolista(8, "Pedri", "González López", "2002-11-25", 60, 1.74, 26, "Centrocampista");
        mundial_2022.getSeleccion(1).anadirPersona(es8);
        Futbolista es9 = new Futbolista(9, "Sergio", "Busquets Burgos", "1988-07-16", 76, 1.89, 5, "Centrocampista");
        mundial_2022.getSeleccion(1).anadirPersona(es9);
        Futbolista es10 = new Futbolista(10, "Koke", "Resurrección Merodio", "1992-01-08", 77, 1.78, 8, "Centrocampista");
        mundial_2022.getSeleccion(1).anadirPersona(es10);
        Futbolista es11 = new Futbolista(11, "Dani", "Olmo Carvajal", "1998-05-07", 72, 1.79, 21, "Delantero");
        mundial_2022.getSeleccion(1).anadirPersona(es11);
        Futbolista es12 = new Futbolista(12, "Ferran", "Torres García", "2000-02-29", 77, 1.84, 11, "Delantero");
        mundial_2022.getSeleccion(1).anadirPersona(es12);
        Futbolista es13 = new Futbolista(13, "Álvaro", "Morata Martín", "1992-10-23", 84, 1.90, 7, "Delantero");
        mundial_2022.getSeleccion(1).anadirPersona(es13);
        Futbolista es14 = new Futbolista(14, "Marco", "Asensio Willemsen", "1996-01-21", 76, 1.82, 10, "Delantero");
        mundial_2022.getSeleccion(1).anadirPersona(es14);
        Futbolista es15 = new Futbolista(15, "Nico", "Williams Arthuer", "2002-07-12", 62, 1.81, 12, "Delantero");
        mundial_2022.getSeleccion(1).anadirPersona(es15);
        Futbolista es16 = new Futbolista(16, "Pablo", "Sarabia García", "1992-05-11", 70, 1.74, 22, "Delantero");
        mundial_2022.getSeleccion(1).anadirPersona(es16);
        Futbolista es17 = new Futbolista(17, "Alejandro", "Balde Martínez", "2003-10-18", 69, 1.75, 14, "Defensa");
        mundial_2022.getSeleccion(1).anadirPersona(es17);
        Futbolista es18 = new Futbolista(18, "Hugo", "Guillamón Sanmartín", "2000-01-31", 81, 1.84, 6, "Defensa");
        mundial_2022.getSeleccion(1).anadirPersona(es18);
        Futbolista es19 = new Futbolista(19, "Marcos", "Llorente Moreno", "1995-01-30", 74, 1.84, 9, "Centrocampista");
        mundial_2022.getSeleccion(1).anadirPersona(es19);
        Futbolista es20 = new Futbolista(20, "Aymeric", "Laporte Muñoz", "1994-05-27", 86, 1.91, 24, "Defensa");
        mundial_2022.getSeleccion(1).anadirPersona(es20);
        Futbolista es21 = new Futbolista(21, "Ansu", "Fati Vieira", "2002-10-31", 66, 1.78, 25, "Delantero");
        mundial_2022.getSeleccion(1).anadirPersona(es21);
        Futbolista es22 = new Futbolista(22, "Robert", "Sánchez Martínez", "1997-11-18", 90, 1.97, 13, "Portero");
        mundial_2022.getSeleccion(1).anadirPersona(es22);
        Futbolista es23 = new Futbolista(23, "David", "Raya Martín", "1995-09-15", 80, 1.83, 1, "Portero");
        mundial_2022.getSeleccion(1).anadirPersona(es23);
        Futbolista es24 = new Futbolista(24, "Carlos", "Solér Barragán", "1997-01-02", 76, 1.80, 19, "Centrocampista");
        mundial_2022.getSeleccion(1).anadirPersona(es24);
        Futbolista es25 = new Futbolista(25, "Yeremy", "Pino Santos", "2002-10-20", 65, 1.72, 15, "Delantero");
        mundial_2022.getSeleccion(1).anadirPersona(es25);
        Futbolista es26 = new Futbolista(26, "César", "Azpilicueta Tanco", "1989-08-28", 78, 1.78, 2, "Defensa");
        mundial_2022.getSeleccion(1).anadirPersona(es26);
        Entrenador entrenadorES = new Entrenador(27, "Luis", "Enrique Martínez", "1970-05-08", 80, 1.80, 1);
        mundial_2022.getSeleccion(1).anadirPersona(entrenadorES);

        ///////////// FUTBOLISTAS SELECCIÓN ARGENTINA /////////////

        Futbolista ar1 = new Futbolista(1, "Emiliano", "Martínez", "1992-09-02", 95, 1.97, 23, "Portero");
        mundial_2022.getSeleccion(2).anadirPersona(ar1);
        Futbolista ar2 = new Futbolista(2, "Nahuel", "Molina Lucero", "1997-04-06", 73, 1.78, 2, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar2);
        Futbolista ar3 = new Futbolista(3, "Germán", "Pezzella", "1991-06-27", 81, 1.86, 6, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar3);
        Futbolista ar4 = new Futbolista(4, "Nicolás", "Otamendi", "1988-02-12", 79, 1.83, 19, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar4);
        Futbolista ar5 = new Futbolista(5, "Lisandro", "Martínez", "1998-01-18", 70, 1.75, 25, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar5);
        Futbolista ar6 = new Futbolista(6, "Marcos", "Acuña", "1991-10-28", 70, 1.74, 8, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar6);
        Futbolista ar7 = new Futbolista(7, "Julián", "Álvarez", "2000-01-31", 70, 1.73, 9, "Delantero");
        mundial_2022.getSeleccion(2).anadirPersona(ar7);
        Futbolista ar8 = new Futbolista(8, "Enzo", "Fernández", "2001-01-17", 73, 1.80, 24, "Centrocampista");
        mundial_2022.getSeleccion(2).anadirPersona(ar8);
        Futbolista ar9 = new Futbolista(9, "Rodrigo", "De Paul", "1994-05-24", 76, 1.82, 7, "Centrocampista");
        mundial_2022.getSeleccion(2).anadirPersona(ar9);
        Futbolista ar10 = new Futbolista(10, "Leandro", "Paredes", "1994-06-29", 75, 1.80, 5, "Centrocampista");
        mundial_2022.getSeleccion(2).anadirPersona(ar10);
        Futbolista ar11 = new Futbolista(11, "Ángel", "Di María", "1988-02-14", 75, 1.79, 11, "Delantero");
        mundial_2022.getSeleccion(2).anadirPersona(ar11);
        Futbolista ar12 = new Futbolista(12, "Lionel", "Messi", "1987-06-24", 72, 1.70, 10, "Delantero");
        mundial_2022.getSeleccion(2).anadirPersona(ar12);
        Futbolista ar13 = new Futbolista(13, "Paulo", "Dybala", "1993-11-15", 75, 1.77, 21, "Delantero");
        mundial_2022.getSeleccion(2).anadirPersona(ar13);
        Futbolista ar14 = new Futbolista(14, "Gonzalo", "Montiel", "1997-03-01", 70, 1.72, 26, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar14);
        Futbolista ar15 = new Futbolista(15, "Exequiel", "Palacios", "1999-10-05", 71, 1.75, 16, "Centrocampista");
        mundial_2022.getSeleccion(2).anadirPersona(ar15);
        Futbolista ar16 = new Futbolista(16, "Thiago", "Almada", "2001-04-22", 67, 1.68, 20, "Delantero");
        mundial_2022.getSeleccion(2).anadirPersona(ar16);
        Futbolista ar17 = new Futbolista(17, "Juan", "Foyth", "1998-01-12", 72, 1.78, 2, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar17);
        Futbolista ar18 = new Futbolista(18, "Ángel", "Correa", "1996-03-09", 73, 1.74, 15, "Delantero");
        mundial_2022.getSeleccion(2).anadirPersona(ar18);
        Futbolista ar19 = new Futbolista(19, "Marcos", "Júnior", "2001-12-18", 74, 1.84, 14, "Centrocampista");
        mundial_2022.getSeleccion(2).anadirPersona(ar19);
        Futbolista ar20 = new Futbolista(20, "Gerónimo", "Rulli", "1992-05-20", 86, 1.88, 13, "Portero");
        mundial_2022.getSeleccion(2).anadirPersona(ar20);
        Futbolista ar21 = new Futbolista(21, "Juan", "Musso", "1994-05-06", 85, 1.91, 22, "Portero");
        mundial_2022.getSeleccion(2).anadirPersona(ar21);
        Futbolista ar22 = new Futbolista(22, "Martín", "Demichelis", "1980-12-20", 81, 1.85, 18, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar22);
        Futbolista ar23 = new Futbolista(23, "Alejo", "Vega", "1999-11-10", 74, 1.82, 27, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar23);
        Futbolista ar24 = new Futbolista(24, "Federico", "Fazio", "1987-03-17", 86, 1.90, 9, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar24);
        Futbolista ar25 = new Futbolista(25, "Nicolás", "Tagliafico", "1992-08-31", 74, 1.73, 4, "Defensa");
        mundial_2022.getSeleccion(2).anadirPersona(ar25);
        Futbolista ar26 = new Futbolista(26, "Emiliano", "Buendía", "1996-12-25", 68, 1.75, 23, "Centrocampista");
        mundial_2022.getSeleccion(2).anadirPersona(ar26);
        Entrenador entrenadorAR = new Entrenador(27, "Lionel", "Scaloni", "1978-05-16", 80, 1.80, 2);
        mundial_2022.getSeleccion(2).anadirPersona(entrenadorAR);


        Arbitro arbitro1 = new Arbitro(1, "Martín", "Fernandex Fernandez", "05/12/1999", 71.2, 1.82, "Primera");

        Partido partido1 = new Partido(mundial_2022.getSeleccion(1), mundial_2022.getSeleccion(2), arbitro1);


        System.out.println(mundial_2022);
        System.out.println("--------------------------------------------------------------------");

        // Listamos Integrantes de las Selecciones
        System.out.println(mundial_2022.getSeleccion(1));
        System.out.println("----------------------------");
        mundial_2022.getSeleccion(1).listarIntegrantes();

        System.out.println("--------------------------------------------------------------------");

        System.out.println(mundial_2022.getSeleccion(2));
        System.out.println("----------------------------");
        mundial_2022.getSeleccion(2).listarIntegrantes();

        System.out.println("--------------------------------------------------------------------");

        // Listamos los Futbolistas con Sobrepeso de la Selección Argentina
        System.out.println("Jugadores Argentinos con Sobrepeso");
        System.out.println("----------------------------");
        mundial_2022.getSeleccion(2).listarFutbolistasSobrepeso();

        System.out.println("--------------------------------------------------------------------");

        Fisioterapeuta fisioterapeutaES = new Fisioterapeuta(28, "Manolo", "García Blanco", "01/02/2000", 70.5, 1.78, 3);
        mundial_2022.getSeleccion(1).anadirPersona(fisioterapeutaES);

        fisioterapeutaES.realizarMasaje(es2);
        fisioterapeutaES.ayudarRecuperacion(es24);

        System.out.println("--------------------------------------------------------------------");

        mundial_2022.getSeleccion(1).listarIntegrantes();

        System.out.println("--------------------------------------------------------------------");

        arbitro1.arbitrarPartido();

        System.out.println("--------------------------------------------------------------------");

        partido1.iniciarPartido();
        partido1.finalizarPartido();
    }
}
