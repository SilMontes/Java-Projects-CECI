
package proyecto;

import java.time.LocalDate;


public class Principal {
    public static void main(String[] args) {
        
    Jugador j1 = new Jugador(1,"Courtois",LocalDate.of(1990,1,1));
    Jugador j2 = new Jugador(4,"Alaba",LocalDate.of(1990,1,1));
    Jugador j3 = new Jugador(23,"F.Mendy",LocalDate.of(1990,1,1));
    Jugador j4 = new Jugador(17,"Lucas V",LocalDate.of(1990,1,1));
    Jugador j5 = new Jugador(7,"hAZARD",LocalDate.of(1990,1,1));
    Jugador j6 = new Jugador(9,"bENZEMA",LocalDate.of(1990,1,1));
    Jugador j7 = new Jugador(20,"Vini",LocalDate.of(1990,1,1));
    Jugador j8 = new Jugador(21,"Nuevo",LocalDate.of(1990,1,1));
    Jugador j9 = new Jugador(29,"Ultimo",LocalDate.of(1990,1,1));
    
    Jugador jb1 = new Jugador(1,"Marc",LocalDate.of(1990,1,1));
    Jugador jb2 = new Jugador(13,"Neto",LocalDate.of(1990,1,1));
    Jugador jb3 = new Jugador(4,"Ronald",LocalDate.of(1990,1,1));
    Jugador jb4 = new Jugador(15,"Clement ",LocalDate.of(1990,1,1));
    Jugador jb5 = new Jugador(24,"Eric",LocalDate.of(1990,1,1));
    Jugador jb6 = new Jugador(23,"Samuel",LocalDate.of(1990,1,1));
    Jugador jb7 = new Jugador(2,"Sergiño",LocalDate.of(1990,1,1));
    
    Jugador jc1 = new Jugador(1,"Jules",LocalDate.of(1990,1,1));
    Jugador jc2 = new Jugador(4,"Ivan",LocalDate.of(1990,1,1));
    Jugador jc3 = new Jugador(3,"Alejandro",LocalDate.of(1990,1,1));
    Jugador jc4 = new Jugador(07,"Erik",LocalDate.of(1990,1,1));
    Jugador jc5 = new Jugador(7,"Ciro",LocalDate.of(1990,1,1));
    Jugador jc6 = new Jugador(9,"Yassine",LocalDate.of(1990,1,1));
    Jugador jc7 = new Jugador(8,"Luuk",LocalDate.of(1990,1,1));
    
    Jugador jd1 = new Jugador(1,"Gerard",LocalDate.of(1990,1,1));
    Jugador jd2 = new Jugador(4,"Pau",LocalDate.of(1990,1,1));
    Jugador jd3 = new Jugador(25,"Juan",LocalDate.of(1990,1,1));
    Jugador jd4 = new Jugador(17,"Raul",LocalDate.of(1990,1,1));
    Jugador jd5 = new Jugador(7,"Samuel",LocalDate.of(1990,1,1));
    Jugador jd6 = new Jugador(9,"Alberto",LocalDate.of(1990,1,1));
    Jugador jd7 = new Jugador(20,"Paco",LocalDate.of(1990,1,1));
    
    Jugador je1 = new Jugador(1,"Romelu",LocalDate.of(1990,1,1));
    Jugador je2 = new Jugador(13,"Kai",LocalDate.of(1990,1,1));
    Jugador je3 = new Jugador(4,"Hakim",LocalDate.of(1990,1,1));
    Jugador je4 = new Jugador(15,"Mason ",LocalDate.of(1990,1,1));
    
    Jugador jf1 = new Jugador(1,"Vrgil",LocalDate.of(1990,1,1));
    Jugador jf2 = new Jugador(4,"Sadio",LocalDate.of(1990,1,1));
    Jugador jf3 = new Jugador(3,"Alisson",LocalDate.of(1990,1,1));
    Jugador jf4 = new Jugador(07,"Jordan",LocalDate.of(1990,1,1));
    Jugador jf5 = new Jugador(7,"Roberto",LocalDate.of(1990,1,1));
    
    Jugador jg1 = new Jugador(1,"Jadon",LocalDate.of(1990,1,1));
    Jugador jg2 = new Jugador(4,"Raphael",LocalDate.of(1990,1,1));
    Jugador jg3 = new Jugador(25,"Marcus",LocalDate.of(1990,1,1));
    Jugador jg4 = new Jugador(17,"Mason",LocalDate.of(1990,1,1));
    Jugador jg5 = new Jugador(7,"Jesse",LocalDate.of(1990,1,1));
    
   
    Entrenador en1 = new Entrenador(1243,"Carlo",LocalDate.of(1990,1,1));
    Entrenador en2 = new Entrenador(4679,"Ronald",LocalDate.of(1990,1,1));
    Entrenador en3 = new Entrenador(8740,"Julen",LocalDate.of(1990,1,1));
    Entrenador en4 = new Entrenador(7508,"Unai",LocalDate.of(1990,1,1));
    Entrenador en5 = new Entrenador(12547,"Thomas",LocalDate.of(1989,1,1));
    Entrenador en6 = new Entrenador(343434,"Jurgen",LocalDate.of(1990,2,1));
    Entrenador en7 = new Entrenador(232354,"Ole",LocalDate.of(1990,1,1));
    
    Equipo e1 = new Equipo("Real Madrid","Madrid","Santiago Bernabeu");
    Equipo e2 = new Equipo("Barcelona","Barcelona","Camp Nou ");
    Equipo e3 = new Equipo("Sevillla","Sevillla","Ramón Snachez-Pizjuan");
    Equipo e4 = new Equipo("Villarreal","Villarreal","Estadio de la Cerámica ");
    Equipo e5 = new Equipo("Chelsea","Londres","Stamford Bridge");
    Equipo e6 = new Equipo("Liverpool","Liverpool","Anfield");
    Equipo e7 = new Equipo("Manchester City","Mánchester","Etihad Stadium");
    
     
     
    e1.agregarJugador(j1);
    e1.agregarJugador(j2);
    e1.agregarJugador(j3);
    e1.agregarJugador(j4);
    e1.agregarJugador(j5);
    e1.agregarJugador(j6);
    e1.agregarJugador(j7);
    
    e2.agregarJugador(jb1);
    e2.agregarJugador(jb2);
    e2.agregarJugador(jb3);
    e2.agregarJugador(jb4);
    e2.agregarJugador(jb5);
    e2.agregarJugador(jb6);
    e2.agregarJugador(jb7);
    
    e3.agregarJugador(jc1);
    e3.agregarJugador(jc2);
    e3.agregarJugador(jc3);
    e3.agregarJugador(jc4);
    e3.agregarJugador(jc5);
    e3.agregarJugador(jc6);
    e3.agregarJugador(jc7);
    
    e4 .agregarJugador(jd1);
    e4 .agregarJugador(jd2);
    e4 .agregarJugador(jd3);
    e4 .agregarJugador(jd4);
    e4 .agregarJugador(jd5);
    e4 .agregarJugador(jd6);
    e4 .agregarJugador(jd7);
    
    e5.agregarJugador(je1);
    e5.agregarJugador(je2);
    e5.agregarJugador(je3);
    e5.agregarJugador(je4);
    
    e6.agregarJugador(jf1);
    e6.agregarJugador(jf2);
    e6.agregarJugador(jf3);
    e6.agregarJugador(jf4);
    e6.agregarJugador(jf5);
    
    e7.agregarJugador(jg1);
    e7.agregarJugador(jg2);
    e7.agregarJugador(jg3);
    e7.agregarJugador(jg4);
    e7.agregarJugador(jg5);
    
    e1.setEntrenador(en1);
    e2.setEntrenador(en2);
    e3.setEntrenador(en3);
    e4.setEntrenador(en4);
    e5.setEntrenador(en5);
    e6.setEntrenador(en6);
    e7.setEntrenador(en7);
    
    Liga L1 = new Liga("LaLiga española","Banco Santander");
    Liga L2 = new Liga("Premier League","EA Sports"); 
    
    L1.agregaEquipo(e1);
    L1.agregaEquipo(e2);
    L1.agregaEquipo(e3);
    L1.agregaEquipo(e4);
    
    L2.agregaEquipo(e5);
    L2.agregaEquipo(e6);
    L2.agregaEquipo(e7);
 
    Arbitro a1 = new Arbitro("James",LocalDate.of(1990,6,1));
    Arbitro a2 = new Arbitro("Karl",LocalDate.of(1995,12,1));
    Arbitro a3 = new Arbitro("Luka",LocalDate.of(1990,7,1));
    
    Partido p1 = new Partido(1,LocalDate.of(2021,8,13));
    Partido p2 = new Partido(1,LocalDate.of(2021,8,14));
    Partido p3 = new Partido(2,LocalDate.of(2021,9,13));
    Partido p4 = new Partido(2,LocalDate.of(2021,9,13));
    Partido p5 = new Partido(3,LocalDate.of(2021,10,15));
    Partido p6 = new Partido(4,LocalDate.of(2021,10,12));
    Partido p7 = new Partido(5,LocalDate.of(2021,11,12));
    
    
    p1.setArbitro(a1);
    a1.eliminarPartido(p1);
    p1.setArbitro(a2);
    p2.setArbitro(a2);
    p3.setArbitro(a3);
    p4.setArbitro(a2);
    p5.setArbitro(a3);
    p6.setArbitro(a3);
    p7.setArbitro(a2);
    
    
    p1.setEquipoLocal(e1);//Real Madrid
    p1.setEquipoVisitante(e2); //Barcelona
    
    p1.sumaAGolesFavor();
    p1.sumaAGolesContra();
    p1.sumaAGolesContra();
    
    p2.setEquipoLocal(e1); //Real Madrid
    p2.setEquipoVisitante(e3); //Sevillla
    
    p2.sumaAGolesFavor();
    p2.sumaAGolesFavor();
    p2.sumaAGolesContra();
    
    p3.setEquipoLocal(e2); //Barcelona
    p3.setEquipoVisitante(e4); //Villarreal
    
    p3.sumaAGolesFavor();
    p3.sumaAGolesContra();
    p3.sumaAGolesContra();
    
    p4.setEquipoLocal(e2); //Barcelona
    p4.setEquipoVisitante(e4); //Villarreal
    
    p4.sumaAGolesContra();
    p4.sumaAGolesContra();
    p4.sumaAGolesContra();
    
    p5.setEquipoLocal(e5); //Chelsea
    p5.setEquipoVisitante(e6); //Liverpool
    
    p5.sumaAGolesContra();
    p5.sumaAGolesContra();
    p5.sumaAGolesContra();
    
    p6.setEquipoLocal(e5);//Chelsea
    p6.setEquipoVisitante(e7); //Manchester
    
    p6.sumaAGolesContra();
      
    p7.setEquipoLocal(e1); //Real Madrid
    p7.setEquipoVisitante(e2); //Barcelona
    
    p7.sumaAGolesContra();
    p7.sumaAGolesFavor();
   
    p1.finalizarPartido();
    p2.finalizarPartido();
    p3.finalizarPartido();
    p4.finalizarPartido();
    p5.finalizarPartido();
    p6.finalizarPartido();
    p7.finalizarPartido();
    
    L1.mostrarTabla();
   // L2.mostrarTabla();
       
    }
 
}
