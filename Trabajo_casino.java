import java.util.*; // Esto sirve para las librerias que se estan usando, el Scanner y Random
public class Trabajo_casino {
    public static final String RESET = "\033[0m";     // Resetear color
    public static final String ROJO    = "\033[0;31m";
    public static final String VERDE   = "\033[0;32m";
    public static final String AMARILLO= "\033[0;33m";
    public static final String AZUL    = "\033[0;34m";
    public static final String MORADO  = "\033[0;35m";
    public static final String CYAN    = "\033[0;36m";
    public static final String MARRON     = "\033[38;5;94m";
    public static final String CAFE      = "\033[0;33m";
    public static final String CELESTE    = "\033[0;36m";
    public static final String ROSA       = "\033[38;5;206m";
    public static final String VERDE_LIMA = "\033[38;5;46m";
    public static final String TURQUESA   = "\033[38;5;51m";
    public static final String DORADO      = "\033[38;5;220m";
    public static final String DORADO_B    = "\033[1;38;5;220m";
    public static final String CELESTE_B  = "\033[1;36m";
    public static final String ROJO_B    = "\033[1;31m";
    public static final String VERDE_B   = "\033[1;32m";
    public static final String AMARILLO_B= "\033[1;33m";
    public static final String AZUL_B    = "\033[1;34m";
    static Scanner s = new Scanner(System.in);
    static Random random = new Random();
    static int monedas = 100;
    static int precio = 10;
    static int partidas = 0;
    static int victorias = 0;
    static int derrotas = 0;
    // ==================== MÉTODOS ====================
    public static void mostrarMenu() {
        System.out.println(ROJO+"=============================="+RESET);
        System.out.println(VERDE_B+"   CASINO FORTUNA BRILLANTE   "+RESET);
        System.out.println(ROJO+"=============================="+RESET);
        System.out.println(DORADO_B+"Monedas: " + monedas);
        System.out.println(AZUL_B+"1. Lanzar dado");
        System.out.println(CELESTE_B+"2. Lanzar moneda");
        System.out.println(VERDE_B+"3. Tragamonedas");
        System.out.println(AMARILLO_B+"4. Ruleta");
        System.out.println(ROSA+"5. Piedra, Papel o Tijera");
        System.out.println(MARRON+"6. Carrera de Caballos");
        System.out.println(TURQUESA+"7. Ver estadisticas");
        System.out.println(ROJO_B+"8. Salir"+RESET);
    }
    public static void lanzarDado() {
        if (monedas < 10) {
            System.out.println(ROJO_B+"No tienes suficientes monedas para jugar."+RESET);
        }else{
            System.out.println(AMARILLO_B+"Desea multiplicar sus ganancias? El precio del juego depende del multiplicador:"+RESET);
            System.out.println(MORADO+"1. SI");
            System.out.println("2. NO");
            System.out.print(VERDE_LIMA+"Elija: "+RESET);
            int multi =s.nextInt();
            switch (multi) {
                case 1:
                    partidas++;
                    System.out.print(CELESTE_B+"Por cuanto quiere multiplicar sus ganancias?: X"+RESET);
                    int multiplicador =s.nextInt();
                    int costoPartida = precio * multiplicador;
                    System.out.println(DORADO+"Costo del juego: " + costoPartida + " monedas"+RESET);
                    monedas = monedas - costoPartida;
                    int dadom = random.nextInt(6) + 1;
                    System.out.println(ROSA+"Lanzando dado..."+RESET);
                    System.out.println(VERDE_B+"Resultado: " + dadom+RESET);
                    int premiom = 0;
                    switch (dadom) {
                    case 4:
                        premiom = 10 * multiplicador;
                        break;
                    case 5:
                        premiom = 20 * multiplicador;
                        break;
                    case 6:
                        premiom = 30 * multiplicador;
                        break;
                    }
                    if (premiom > 0) {
                        monedas = monedas + premiom;
                        System.out.println(AMARILLO_B+"¡Ganaste " + premiom + " monedas!"+RESET);
                        victorias++;
                    } else {
                        System.out.println(ROJO+"No ganaste ninguna moneda."+RESET);
                        derrotas++;
                    }
                    break;
                case 2:
                    partidas++;
                    System.out.println(DORADO+"Costo del juego: 10 monedas"+RESET);
                    monedas = monedas - 10;
                    int dado = random.nextInt(6) + 1;
                    System.out.println(ROSA+"Lanzando dado..."+RESET);
                    System.out.println(VERDE_B+"Resultado: " + dado+RESET);
                    int premio = 0;
                    switch (dado) {
                        case 4:
                            premio = 10;
                            break;
                        case 5:
                            premio = 20;
                            break;
                        case 6:
                            premio = 30;
                            break;
                    }
                    if (premio > 0) {
                        monedas = monedas + premio;
                        System.out.println(AMARILLO_B+"¡Ganaste " + premio + " monedas!"+RESET);
                        victorias++;
                    } else {
                        System.out.println(ROJO+"No ganaste ninguna moneda."+RESET);
                        derrotas++;
                        }
                    break;
            }
        }
    }
    public static void lanzarMoneda() {
        if (monedas < 10) {
            System.out.println(ROJO_B+"No tienes suficientes monedas para jugar."+RESET);
        } else {
            System.out.println(AMARILLO_B+"Desea multiplicar sus ganancias? El precio del juego depende del multiplicador:"+RESET);
            System.out.println(MORADO+"1. SI");
            System.out.println("2. NO");
            System.out.print(VERDE_LIMA+"Elija: "+RESET);
            int multi =s.nextInt();
            switch (multi) {
                case 1:
                    partidas++;
                    System.out.print(CELESTE_B+"Por cuanto quiere multiplicar sus ganancias?: X"+RESET);
                    int multiplicador =s.nextInt();
                    int costoPartida = precio * multiplicador;
                    System.out.println(DORADO+"Costo del juego: " + costoPartida + " monedas"+RESET);
                    monedas = monedas - costoPartida;
                    System.out.println(VERDE_LIMA+"1. Cara");
                    System.out.println("2. Sello"+RESET);
                    System.out.print(TURQUESA+"Elija: "+RESET);
                    int eleccionm = s.nextInt();
                    int resultadom = random.nextInt(2) + 1;
                    System.out.println(ROSA+"Lanzando moneda..."+RESET);
                    System.out.println(resultadom == 1 ? CELESTE+"Salio Cara" : "Salio Sello"+RESET);//Es una forma abreviada para if-else en una sola línea de código.//
                    if (eleccionm == resultadom) {
                        int premio = 20 * multiplicador;
                        System.out.println(VERDE_B+"Acertaste:");
                        System.out.println(AMARILLO_B+"Ganaste: " + premio + " monedas"+RESET);
                        monedas = monedas + premio;
                        victorias++;
                    } else {
                        System.out.println(ROJO+"Fallaste");
                        System.out.println("No ganaste monedas"+RESET);
                        derrotas++;
                    }
                    break;
                case 2:
                    partidas++;
                    System.out.println(DORADO+"Costo del juego: 10 monedas");
                    monedas = monedas - 10;
                    System.out.println(VERDE_LIMA+"1. Cara");
                    System.out.println("2. Sello");
                    System.out.print(TURQUESA+"Elija: ");
                    int eleccion = s.nextInt();
                    int resultado = random.nextInt(2) + 1;
                    System.out.println(ROSA+"Lanzando moneda..."+RESET);
                    System.out.println(resultado == 1 ? CELESTE+"Salio Cara" : "Salio Sello"+RESET);//Es una forma abreviada para if-else en una sola línea de código.//
                    if (eleccion == resultado) {
                        int premio = 20;
                        System.out.println(VERDE_B+"Acertaste:");
                        System.out.println(AMARILLO_B+"Ganaste: " + premio + " monedas"+RESET);
                        monedas = monedas + premio;
                        victorias++;
                    } else {
                        System.out.println(ROJO+"Fallaste");
                        System.out.println("No ganaste monedas"+RESET);
                        derrotas++;
                    }
                    break;
            } 
        }
    }
    public static void tragamonedas() {
        if (monedas < 10) {
            System.out.println(ROJO_B+"No tienes suficientes monedas para jugar."+RESET);
        } else {
            System.out.println(AMARILLO_B+"Desea multiplicar sus ganancias? El precio del juego depende del multiplicador:"+RESET);
            System.out.println(MORADO+"1. SI");
            System.out.println("2. NO");
            System.out.print(VERDE_LIMA+"Elija: "+RESET);
            int multi =s.nextInt();
            switch (multi) {
                case 1:
                    partidas++;
                    System.out.print(CELESTE_B+"Por cuanto quiere multiplicar sus ganancias?: X"+RESET);
                    int multiplicador =s.nextInt();
                    int costoPartida = precio * multiplicador;
                    System.out.println(DORADO+"Costo del juego: " + costoPartida + " monedas"+RESET);
                    monedas = monedas - costoPartida;
                    int simbolo1m = random.nextInt(5) + 1;
                    int simbolo2m = random.nextInt(5) + 1;
                    int simbolo3m = random.nextInt(5) + 1;
                    System.out.println(ROSA+"Girando tragamonedas..."+RESET);
                    switch (simbolo1m) {
                        case 1:
                            System.out.print(CELESTE_B+"[C]"+RESET);
                            break;
                        case 2:
                            System.out.print(ROJO_B+"[L]"+RESET);
                            break;
                        case 3:
                            System.out.print(VERDE_B+"[U]"+RESET);
                            break;
                        case 4:
                            System.out.print(AZUL_B+"[E]"+RESET);
                            break;
                        case 5:
                            System.out.print(DORADO_B+"[7]"+RESET);
                            break;
                    }
                    switch (simbolo2m) {
                        case 1:
                            System.out.print(CELESTE_B+"[C]"+RESET);
                            break;
                        case 2:
                            System.out.print(ROJO_B+"[L]"+RESET);
                            break;
                        case 3:
                            System.out.print(VERDE_B+"[U]"+RESET);
                            break;
                        case 4:
                            System.out.print(AZUL_B+"[E]"+RESET);
                            break;
                        case 5:
                            System.out.print(DORADO_B+"[7]"+RESET);
                            break;
                    }
                    switch (simbolo3m) {
                        case 1:
                            System.out.print(CELESTE_B+"[C]"+RESET);
                            break;
                        case 2:
                            System.out.print(ROJO_B+"[L]"+RESET);
                            break;
                        case 3:
                            System.out.print(VERDE_B+"[U]"+RESET);
                            break;
                        case 4:
                            System.out.print(AZUL_B+"[E]"+RESET);
                            break;
                        case 5:
                            System.out.print(DORADO_B+"[7]"+RESET);
                            break;
                    }
                    System.out.println();
                    if (simbolo1m == simbolo2m && simbolo2m == simbolo3m) {
                        int premio = 100 * multiplicador;
                        System.out.println(DORADO_B+"¡¡JACKPOT!!"+RESET);
                        System.out.println(AMARILLO_B+"Ganaste " + premio + " monedas."+RESET);
                        monedas = monedas + premio;
                        victorias++;
                    } else if (simbolo1m == simbolo2m || simbolo1m == simbolo3m || simbolo2m == simbolo3m) {
                        int premio = 30 * multiplicador;
                        System.out.println(DORADO+"¡¡DOS IGUALES!!"+RESET);
                        System.out.println(AMARILLO+"Ganaste " + premio + " monedas."+RESET);
                        monedas = monedas + premio;
                        victorias++;
                    } else {
                        System.out.println(ROJO+"Oh que mal");
                        System.out.println("No ganaste monedas"+RESET);
                        derrotas++;
                    }
                    break;
                case 2:
                    partidas++;
                    System.out.println("Costo del juego: 10 monedas");
                    monedas = monedas - 10;
                    int simbolo1 = random.nextInt(5) + 1;
                    int simbolo2 = random.nextInt(5) + 1;
                    int simbolo3 = random.nextInt(5) + 1;
                    System.out.println(ROSA+"Girando tragamonedas..."+RESET);
                    switch (simbolo1) {
                        case 1:
                            System.out.print(CELESTE_B+"[C]"+RESET);
                            break;
                        case 2:
                            System.out.print(ROJO_B+"[L]"+RESET);
                            break;
                        case 3:
                            System.out.print(VERDE_B+"[U]"+RESET);
                            break;
                        case 4:
                            System.out.print(AZUL_B+"[E]"+RESET);
                            break;
                        case 5:
                            System.out.print(DORADO_B+"[7]"+RESET);
                            break;
                    }
                    switch (simbolo2) {
                        case 1:
                            System.out.print(CELESTE_B+"[C]"+RESET);
                            break;
                        case 2:
                            System.out.print(ROJO_B+"[L]"+RESET);
                            break;
                        case 3:
                            System.out.print(VERDE_B+"[U]"+RESET);
                            break;
                        case 4:
                            System.out.print(AZUL_B+"[E]"+RESET);
                            break;
                        case 5:
                            System.out.print(DORADO_B+"[7]"+RESET);
                            break;
                    }
                    switch (simbolo3) {
                        case 1:
                            System.out.print(CELESTE_B+"[C]"+RESET);
                            break;
                        case 2:
                            System.out.print(ROJO_B+"[L]"+RESET);
                            break;
                        case 3:
                            System.out.print(VERDE_B+"[U]"+RESET);
                            break;
                        case 4:
                            System.out.print(AZUL_B+"[E]"+RESET);
                            break;
                        case 5:
                            System.out.print(DORADO_B+"[7]"+RESET);
                            break;
                    }
                    System.out.println();
                    if (simbolo1 == simbolo2 && simbolo2 == simbolo3) {
                        int premio = 100;
                        System.out.println(DORADO_B+"¡¡JACKPOT!!"+RESET);
                        System.out.println(AMARILLO_B+"Ganaste " + premio + " monedas."+RESET);
                        monedas = monedas + premio;
                        victorias++;
                    } else if (simbolo1 == simbolo2 || simbolo1 == simbolo3 || simbolo2 == simbolo3) {
                        int premio = 30;
                        System.out.println(DORADO+"¡¡DOS IGUALES!!"+RESET);
                        System.out.println(AMARILLO+"Ganaste " + premio + " monedas."+RESET);
                        monedas = monedas + premio;
                        victorias++;
                    } else {
                        System.out.println(ROJO+"Oh que mal");
                        System.out.println("No ganaste monedas"+RESET);
                        derrotas++;
                    }
                    break;
            }
        }
    }
    public static void ruleta() {
        if (monedas < 10) {
            System.out.println(ROJO_B+"No tienes suficientes monedas para jugar."+RESET);
        } else {
            System.out.println(AMARILLO_B+"Desea multiplicar sus ganancias? El precio del juego depende del multiplicador:"+RESET);
            System.out.println(MORADO+"1. SI");
            System.out.println("2. NO");
            System.out.print(VERDE_LIMA+"Elija: "+RESET);
            int multi =s.nextInt();
            switch (multi) {
                case 1:
                    partidas++;
                    System.out.print(CELESTE_B+"Por cuanto quiere multiplicar sus ganancias?: X"+RESET);
                    int multiplicador =s.nextInt();
                    int costoPartida = precio * multiplicador;
                    System.out.println(DORADO+"Costo del juego: " + costoPartida + " monedas"+RESET);
                    monedas = monedas - costoPartida;
                    System.out.print(CELESTE_B+"Elija un numero del 0 al 36: "+RESET);
                    int eleccionm = s.nextInt();
                    int resultadom = random.nextInt(36)+1;
                    System.out.println(MORADO+"Salio: " + resultadom+RESET);
                    if (eleccionm == resultadom) {
                        int premio = 100 * multiplicador;
                        System.out.println(AMARILLO+"Acertaste:");
                        System.out.println(AMARILLO_B+"Ganaste: " + premio + " monedas"+RESET);
                        monedas = monedas + premio;
                        victorias++;
                    } else {
                        System.out.println(ROJO+"Fallaste");
                        System.out.println("No ganaste monedas"+RESET);
                        derrotas++;
                    }
                    break;
                case 2:
                    partidas++;
                    System.out.println(DORADO+"Costo del juego: 10 monedas"+RESET);
                    monedas = monedas - 10;
                    System.out.print(CELESTE_B+"Elija un numero del 0 al 36: "+RESET);
                    int eleccion = s.nextInt();
                    int resultado = random.nextInt(36)+1;
                    System.out.println(MORADO+"Salio: " + resultado+RESET);
                    if (eleccion == resultado) {
                        int premio = 100;
                        System.out.println(AMARILLO+"Acertaste:");
                        System.out.println(AMARILLO_B+"Ganaste: " + premio + " monedas"+RESET);
                        monedas = monedas + premio;
                        victorias++;
                    } else {
                        System.out.println(ROJO+"Fallaste");
                        System.out.println("No ganaste monedas"+RESET);
                        derrotas++;
                    }
                    break;
            }
        }
    }
    public static void piedraPapelTijera() {
        if (monedas < 10) {
            System.out.println(ROJO_B+"No tienes suficientes monedas para jugar."+RESET);
        } else {
            System.out.println(AMARILLO_B+"Desea multiplicar sus ganancias? El precio del juego depende del multiplicador:"+RESET);
            System.out.println(MORADO+"1. SI");
            System.out.println("2. NO");
            System.out.print(VERDE_LIMA+"Elija: "+RESET);
            int multi =s.nextInt();
            switch (multi) {
                case 1:
                    partidas++;
                    System.out.print(CELESTE_B+"Por cuanto quiere multiplicar sus ganancias?: X"+RESET);
                    int multiplicador =s.nextInt();
                    int costoPartida = precio * multiplicador;
                    System.out.println(DORADO+"Costo del juego: " + costoPartida + " monedas"+RESET);
                    monedas = monedas - costoPartida;
                    System.out.println(VERDE+"1. Piedra");
                    System.out.println("2. Papel");
                    System.out.println("3. Tijera"+RESET);
                    System.out.print(VERDE_LIMA+"Elija: "+RESET);
                    int eleccionm = s.nextInt();
                    int computadoram = random.nextInt(3) + 1;
                    System.out.print(VERDE_B+"Jugaste: "+RESET);
                    switch (eleccionm) {
                        case 1: 
                            System.out.println(VERDE+"Piedra");
                            break;
                        case 2: 
                            System.out.println("Papel");
                            break;
                        case 3:
                            System.out.println("Tijera"+RESET);
                            break;
                    }
                    System.out.print(AZUL_B+"La Computadora jugo: "+RESET);
                    switch (computadoram) {
                        case 1: 
                            System.out.println(AZUL+"Piedra");
                            break;
                        case 2: 
                            System.out.println("Papel");
                            break;
                        case 3:
                            System.out.println("Tijera"+RESET);
                            break;
                    }
                    if (eleccionm == computadoram) {
                        int premio = 10 * multiplicador;
                        System.out.println(AMARILLO+"¡Empate! Se te devuelven tus "+costoPartida+" monedas."+RESET);
                        monedas = monedas + premio;
                    } else if (eleccionm == 1 && computadoram == 3||eleccionm == 2 && computadoram == 1||eleccionm == 3 && computadoram == 2) {
                        int premio = 20 * multiplicador;
                        System.out.println(AMARILLO_B+"¡Ganaste! Recibes "+premio+" monedas."+RESET);
                        monedas = monedas + premio;
                        victorias++;
                    } else {
                        System.out.println(ROJO+"Perdiste. No recibes premio."+RESET);
                        derrotas++;
                    }
                    break;
                case 2:
                    partidas++;
                    System.out.println(DORADO+"Costo del juego: 10 monedas"+RESET);
                    monedas = monedas - 10;
                    System.out.println(VERDE+"1. Piedra");
                    System.out.println("2. Papel");
                    System.out.println("3. Tijera"+RESET);
                    System.out.print(VERDE_LIMA+"Elija: "+RESET);
                    int eleccion = s.nextInt();
                    int computadora = random.nextInt(3) + 1;
                    System.out.print(VERDE_B+"Jugaste: "+RESET);
                    switch (eleccion) {
                        case 1: 
                            System.out.println(VERDE+"Piedra");
                            break;
                        case 2: 
                            System.out.println("Papel");
                            break;
                        case 3:
                            System.out.println("Tijera"+RESET);
                            break;
                    }
                    System.out.print(AZUL_B+"La Computadora jugo: "+RESET);
                    switch (computadora) {
                        case 1: 
                            System.out.println(AZUL+"Piedra");
                            break;
                        case 2: 
                            System.out.println("Papel");
                            break;
                        case 3:
                            System.out.println("Tijera"+RESET);
                            break;
                    }
                    if (eleccion == computadora) {
                        System.out.println(AMARILLO+"¡Empate! Se te devuelven tus 10 monedas."+RESET);
                        monedas = monedas + 10;
                    } else if (eleccion == 1 && computadora == 3||eleccion == 2 && computadora == 1||eleccion == 3 && computadora == 2) {
                        System.out.println(AMARILLO_B+"¡Ganaste! Recibes 20 monedas."+RESET);
                        monedas = monedas + 20;
                        victorias++;
                    } else {
                        System.out.println(ROJO+"Perdiste. No recibes premio."+RESET);
                        derrotas++;
                    }
                    break;
            }
        }
    }
    public static void carredaCaballos(){
        if (monedas < 10) {
            System.out.println(ROJO_B+"No tienes suficientes monedas para jugar."+RESET);
        }else{
            System.out.println(AMARILLO_B+"Desea multiplicar sus ganancias? El precio del juego depende del multiplicador:"+RESET);
            System.out.println(MORADO+"1. SI");
            System.out.println("2. NO");
            System.out.print(VERDE_LIMA+"Elija: "+RESET);
            int multi =s.nextInt();
            switch (multi) {
                case 1:
                    partidas++;
                    System.out.print(CELESTE_B+"Por cuanto quiere multiplicar sus ganancias?: X"+RESET);
                    int multiplicador =s.nextInt();
                    int costoPartida = precio * multiplicador;
                    System.out.println(DORADO+"Costo del juego: " + costoPartida + " monedas"+RESET);
                    monedas = monedas - costoPartida;
                    int premiom = 50 * multiplicador;
                    System.out.print(CELESTE+"Elija 1 de los 5 caballos: "+RESET);
                    int caballosm =s.nextInt();
                    int c1m = 0;
                    int c2m = 0;
                    int c3m = 0;
                    int c4m = 0;
                    int c5m = 0;
                    int caballoGm = 0;
                    int rondam = 1;
                    switch (caballosm) {
                        case 1:
                                System.out.println(CAFE+"Apostaste por el Caballo 1"+RESET);
                            break;
                        case 2:
                            System.out.println(CAFE+"Apostaste por el Caballo 2"+RESET);
                            break;
                        case 3:
                            System.out.println(CAFE+"Apostaste por el Caballo 3"+RESET);
                            break;
                        case 4:
                            System.out.println(CAFE+"Apostaste por el Caballo 4"+RESET);
                            break;
                        case 5:
                            System.out.println(CAFE+"Apostaste por el Caballo 5"+RESET);
                            break;
                    }
                    System.out.println(VERDE+"---¡COMIENZA LA CARRERA!---"+RESET);
                    while (rondam<=6) {
                        System.out.println(AZUL_B+"Ronda Numero: "+ rondam+RESET);
                        for (int i = 1; i <= 5; i++) {
                            int avance = random.nextInt(3)+1;
                            int contador = 0;
                            System.out.print(MARRON+"Caballo "+ i +" "+RESET);
                            switch (i) {
                                case 1:
                                    c1m = c1m + avance;
                                    contador = c1m;
                                    break;
                                case 2:
                                    c2m = c2m + avance;
                                    contador = c2m;
                                    break;
                                case 3:
                                    c3m = c3m + avance;
                                    contador = c3m;
                                    break;
                                case 4:
                                    c4m = c4m + avance;
                                    contador = c4m;
                                    break;
                                case 5:
                                    c5m = c5m + avance;
                                    contador = c5m;
                                    break;
                            }
                            for (int j = 1; j <=contador; j++) {
                                System.out.print(CYAN+"*"+RESET);
                            }
                            System.out.println();
                            if (contador>=6){
                                caballoGm = i;
                                break;
                            }
                        }
                        if (caballoGm>0){
                            break;
                        }
                        rondam++;
                    }
                    System.out.println(VERDE+"¡Carrera finalizada!"+RESET);
                    System.out.println(MORADO+"¡El Caballo " + caballoGm + " gano la carrera!"+RESET);
                    System.out.println(AZUL+"Gano en la Ronda Numero: " + rondam+RESET);
                    if (caballosm == caballoGm) {
                        System.out.println(AMARILLO+"¡Acertaste! Ganaste "+ premiom +" monedas."+RESET);
                        monedas = monedas + premiom;
                        victorias++;
                    }else{
                        System.out.println(ROJO_B+"Fallaste. Tu caballo no ganó."+RESET);
                        derrotas++;
                    }
                    break;
                case 2:
                    partidas++;
                    int premio = 50;
                    System.out.print(CELESTE+"Elija 1 de los 5 caballos: "+RESET);
                    int caballos =s.nextInt();
                    int c1 = 0;
                    int c2 = 0;
                    int c3 = 0;
                    int c4 = 0;
                    int c5 = 0;
                    int caballoG = 0;
                    int ronda = 1;
                    switch (caballos) {
                        case 1:
                            System.out.println(CAFE+"Apostaste por el Caballo 1"+RESET);
                            break;
                        case 2:
                            System.out.println(CAFE+"Apostaste por el Caballo 2"+RESET);
                            break;
                        case 3:
                            System.out.println(CAFE+"Apostaste por el Caballo 3"+RESET);
                            break;
                        case 4:
                            System.out.println(CAFE+"Apostaste por el Caballo 4"+RESET);
                            break;
                        case 5:
                            System.out.println(CAFE+"Apostaste por el Caballo 5"+RESET);
                            break;
                    }
                    System.out.println(VERDE+"---¡COMIENZA LA CARRERA!---"+RESET);
                    while (ronda<=6) {
                        System.out.println(AZUL_B+"Ronda Numero: "+ ronda+RESET);
                        for (int i = 1; i <= 5; i++) {
                            int avance = random.nextInt(3)+1;
                            int contador = 0;
                            System.out.print(MARRON+"Caballo "+ i +" "+RESET);
                            switch (i) {
                                case 1:
                                    c1 = c1 + avance;
                                    contador = c1;
                                    break;
                                case 2:
                                    c2 = c2 + avance;
                                    contador = c2;
                                    break;
                                case 3:
                                    c3 = c3 + avance;
                                    contador = c3;
                                    break;
                                case 4:
                                    c4 = c4 + avance;
                                    contador = c4;
                                    break;
                                case 5:
                                    c5 = c5 + avance;
                                    contador = c5;
                                    break;
                            }
                            for (int j = 1; j <=contador; j++) {
                                System.out.print(CYAN+"*"+RESET);
                            }
                            System.out.println();
                            if (contador>=6){
                                caballoG = i;
                                break;
                            }
                        }
                        if (caballoG>0){
                            break;
                        }
                        ronda++;
                    }
                    System.out.println(VERDE+"¡Carrera finalizada!"+RESET);
                    System.out.println(MORADO+"¡El Caballo " + caballoG + " gano la carrera!"+RESET);
                    System.out.println(AZUL+"Gano en la Ronda Numero: " + ronda+RESET);
                    if (caballos == caballoG) {
                        System.out.println(AMARILLO_B+"¡Acertaste! Ganaste "+ premio +" monedas."+RESET);
                        monedas = monedas + premio;
                        victorias++;
                    }else{
                        System.out.println(ROJO_B+"Fallaste. Tu caballo no ganó."+RESET);
                        derrotas++;
                    }
                    break;
            }
        }
    }
    public static void verEstadisticas() {
        System.out.println(MORADO+"Partidas Jugadas: " + partidas+RESET);
        System.out.println(VERDE+"Partidas Ganadas: " + victorias+RESET);
        System.out.println(ROJO+"Partidas Perdidas: " + derrotas+RESET);
    }
    public static void finDelCasino() {
        System.out.println(ROJO+"=============================="+RESET);
        System.out.println(ROJO+"======= "+VERDE_B+"FIN DEL CASINO"+ROJO+" ======="+RESET);
        System.out.println(ROJO+"=============================="+RESET);
        System.out.println(AMARILLO_B+"Monedas Finales: " + monedas+RESET);
        System.out.println(MORADO+"Partidas Jugadas: " + partidas+RESET);
        System.out.println(VERDE_B+"Victorias: " + victorias+RESET);
        System.out.println(ROJO_B+"Derrotas: " + derrotas+RESET);
        if (partidas > 0) {
            System.out.println(VERDE+"Porcentaje de Victorias: " + (victorias * 100 / partidas) + "%"+RESET);
        }
        System.out.println(CYAN+"Gracias por Jugar"+RESET);
        System.out.println(ROJO+"=============================="+RESET);
    }
    //==================== CASINO ====================//
    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 8) {
            mostrarMenu();
            System.out.print(MORADO+"Elija una opcion: "+RESET);
            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    lanzarDado();
                    break;
                case 2:
                    lanzarMoneda();
                    break;
                case 3:
                    tragamonedas();
                    break;
                case 4:
                    ruleta();
                    break;
                case 5:
                    piedraPapelTijera();
                    break;
                case 6:
                    carredaCaballos();
                    break;
                case 7:
                    verEstadisticas();
                    break;
                case 8:
                    finDelCasino();
                    break;
            }
        }
    }
}