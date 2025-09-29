package treinoJava7;

public class Empregado {
    private static int totalEmpregados = 0;

    private int codigoEmpregado;
    private String nomeEmpregado;
    private String cargoEmpregado;
    private double salarioEmpregado;

    public Empregado() {
        totalEmpregados++;
        this.codigoEmpregado = totalEmpregados;
    };
    public Empregado(String nomeEmpregado, String cargoEmpregado, double salarioEmpregado) {
        totalEmpregados++;
        this.codigoEmpregado = totalEmpregados;
        this.nomeEmpregado = nomeEmpregado;
        this.cargoEmpregado = cargoEmpregado;
        this.salarioEmpregado = salarioEmpregado;
    }

    public static int getTotalEmpregados() {
        return totalEmpregados;
    }

    public static void setTotalEmpregados(int totalEmpregados) {
        Empregado.totalEmpregados = totalEmpregados;
    }

    public int getCodigoEmpregado() {
        return codigoEmpregado;
    }

    public void setCodigoEmpregado(int codigoEmpregado) {
        this.codigoEmpregado = codigoEmpregado;
    }

    public String getNomeEmpregado() {
        return nomeEmpregado;
    }

    public void setNomeEmpregado(String nomeEmpregado) {
        this.nomeEmpregado = nomeEmpregado;
    }

    public String getCargoEmpregado() {
        return cargoEmpregado;
    }

    public void setCargoEmpregado(String cargoEmpregado) {
        this.cargoEmpregado = cargoEmpregado;
    }

    public double getSalarioEmpregado() {
        return salarioEmpregado;
    }

    public void setSalarioEmpregado(double salarioEmpregado) {
        this.salarioEmpregado = salarioEmpregado;
    }

    public void imprimirDados() {
        System.out.println("Codigo: " + this.codigoEmpregado);
        System.out.println("Nome: " + this.nomeEmpregado);
        System.out.println("Cargo: " + this.cargoEmpregado);
        System.out.println("Salario: " + this.salarioEmpregado);
    }

    public static void totalEmpregados() {
        System.out.println("Total de empregados: " + totalEmpregados);
    }
}
