package com.diegomoreno.devjava.example.model;

public class Tablero {

    // Constante
    private static final String COLUMNAS = "abcdefgh";
    // Relaciones entre clases
    // Relación con Jugador
    private Jugador jugador1;
    private Jugador jugador2;
    // Relación con Casilla
    private Casilla[][] casillas;

    // Constructor 1
    // inicializar las características de cada jugador si se recibe Jugadores
    public Tablero(Jugador j1, Jugador j2) {
        // de esta manera hace referencia al objeto, el objeto tablero en su atributo jugador
        this.jugador1 = j1;
        this.jugador2 = j2;

        // inicializa las casillas del tablero
        // Cargar las casillas con su color
        inicializarCasillas();
        
        ubicarFichas();
    }

    // Este método solo va a ser llamado o inicializado por las funciones de esta
    // clase nadie aparte de esta clase va a a poder usar este método.
    private void inicializarCasillas() {
        casillas = new Casilla[8][8];
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                var color = (fila + columna) % 2 == 0 ? Color.NEGRO : Color.BLANCO;
                casillas[fila][columna] = new Casilla(fila, letraDeColumna(columna), color);

            }
        }
    }

    private Character letraDeColumna(Integer columna){
        var letras = COLUMNAS;
        return letras.charAt(columna);
    }
    // una manera de realizar la función anterior
    /* private Character letraDeColumna(Integer columna){
        switch (columna) {
            case 0:
                return 'a';
            case 1:
                return 'b';
            case 2:
                return 'c';
            case 3:
                return 'd';
            case 4:
                return 'e';
            case 5:
                return 'f';
            case 6:
                return 'g';
            case 7:
            default:
                return 'h';
        }
    } */
    private void ubicarFichas(){
        // como ficha es un atributo privado hay que usar métodos
        casillas[0][0].setFicha(new Torre(Color.BLANCO));
        casillas[0][1].setFicha(new Caballo(Color.BLANCO));
        // una manera de hacerlo, si el constructor de cada ficha solicita color y casilla origen
        // casillas[0][2].setFicha(new Alfil(Color.BLANCO, casillas[0][2]));
        casillas[0][2].setFicha(new Alfil(Color.BLANCO));
        casillas[0][3].setFicha(new Reina(Color.BLANCO));
        casillas[0][4].setFicha(new Rey(Color.BLANCO));
        casillas[0][5].setFicha(new Alfil(Color.BLANCO));
        casillas[0][6].setFicha(new Caballo(Color.BLANCO));
        casillas[0][7].setFicha(new Torre(Color.BLANCO));

        for (int i = 0; i < 8; i++) {
            casillas[1][i].setFicha(new Peon(Color.BLANCO));
            casillas[6][i].setFicha(new Peon(Color.NEGRO));
        }

        casillas[7][0].setFicha(new Torre(Color.NEGRO));
        casillas[7][1].setFicha(new Caballo(Color.NEGRO));
        casillas[7][2].setFicha(new Alfil(Color.NEGRO));
        casillas[7][3].setFicha(new Reina(Color.NEGRO));
        casillas[7][4].setFicha(new Rey(Color.NEGRO));
        casillas[7][5].setFicha(new Alfil(Color.NEGRO));
        casillas[7][6].setFicha(new Caballo(Color.NEGRO));
        casillas[7][7].setFicha(new Torre(Color.NEGRO));
        
    }
    // Otro constructor 2
    // inicializar las características de cada jugador si se recibe una cadena de texto
    public Tablero(String nombre1, String nombre2){
        // una vez halla creado los jugadores genera la función del constructor 1
        // en este caso This se llama como función, this quiere llamar al constructor Tablero
        this(new Jugador(nombre1, Color.BLANCO), new Jugador(nombre2, Color.NEGRO));

        // Un método para la inicialización de jugadores
        // jugador1 = new Jugador(nombre1, Color.BLANCO);
        // jugador2 = new Jugador(nombre2, Color.NEGRO);
    }


    // Métodos
    public void enroque() {
        // TODO: Falta implementar este metodo
    }

    public void jaque() {
        // TODO: Falta implementar este metodo
    }

    public void jaqueMate() {
        // TODO: Falta implementar este metodo
    }


    // evidenciar como se ve el tablero, forma de imprimirlo en pantalla o retorno de string
    // @Override
    //public String toString() {
    public void imprimirTablero() {
        // forma de imprimir el tablero
        for (var i = 7; i >= 0; i--) {
            for (int j = 0; j < 8; j++) {
                System.out.print(casillas[i][j] + "\t");
            }
            System.out.println();
        }
        // super significa que buscara dentro del paquete
        // return super.toString();
    }

    

}
