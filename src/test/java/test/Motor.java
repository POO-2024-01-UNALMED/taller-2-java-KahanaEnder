package test;



public class Motor {
public static void main(String args[]) {

}

int numeroCilindros;
String tipo;
int registro;

void cambiarRegistro(int registro) {
this.registro = registro;
}

void asignarTipo(String tipo) {
if (tipo == "electrico" || tipo == "gasolina") {
this.tipo = tipo;
}
}

}