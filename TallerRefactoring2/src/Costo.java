import java.util.Objects;

public final class Costo {
    private double valor;

    public Costo(double valor) {
        this.valor=valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0) throw new IllegalArgumentException("El costo no puede ser negativo");
        this.valor = valor;
    }

    public Costo aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 1) {
            throw new IllegalArgumentException("Porcentaje inválido (0..1)");
        }
        return new Costo(valor * (1 - porcentaje));
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Costo)){ 
            return false;
        }
        Costo other = (Costo) o;
        return Double.compare(this.valor, other.valor) == 0;
    }
}
