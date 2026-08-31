package sS_Codigo;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {

    private static int totalQtdProdutoVendidos;
    private static double valorTotalVendas;

    public static int getTotalQtdProdutoVendidos() {
        return totalQtdProdutoVendidos;
    }

    public static void setTotalQtdProdutoVendidos(int totalQtdProdutoVendidos) {
        Produto.totalQtdProdutoVendidos = totalQtdProdutoVendidos;
    }

    public static double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public static void setValorTotalVendas(double valorTotalVendas) {
        Produto.valorTotalVendas = valorTotalVendas;
    }

    // Lista de sushis cadastrados
    public static ArrayList<Produto> produto = new ArrayList<>();

    //
    private int codProduto;
    private String tipo;          // Ex: Hot Roll, Temaki, Sashimi, Hossomaki…
    private String[] recheio = new String[4];       // Ex: Salmão, Atum, Kani, Camarão 
    private String peixe;   // Ex: 4 unidades, 8 unidades, 12 unid.
    private int quantDisponivel;
    private double quantVendas;
    private double precoCusto;
    private double precoVenda;

    Scanner entrada = new Scanner(System.in);

    // Getters e Setters
    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getRecheio() {
        return recheio;
    }

    public void setRecheio(String[] recheio) {
        this.recheio = recheio;
    }

    public int getQuantDisponivel() {
        return quantDisponivel;
    }

    public void setQuantDisponivel(int quantDisponivel) {
        this.quantDisponivel = quantDisponivel;
    }

    public double getQuantVendas() {
        return quantVendas;
    }

    public void setQuantVendas(double quantVendas) {
        this.quantVendas = quantVendas;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getPeixe() {
        return peixe;
    }

    public void setPeixe(String peixe) {
        this.peixe = peixe;
    }

    public void cadastrar(int cod, String tipo, String acrescimo[], String peixe, double precoCusto, int qtdDisponivel,int quantVendas) {
        this.codProduto = cod;
        this.tipo = tipo;
        this.recheio = acrescimo;
        this.peixe = peixe;
        this.precoCusto = precoCusto;
        this.quantDisponivel = qtdDisponivel;
        this.quantVendas = quantVendas;

        calcularPrecoVenda();
    }

    public static int gerarCod() {
        int ultimoCod;
        if (Produto.produto.size() == 0) {
            ultimoCod = 0;
        } else {
            int ultimaPos = Produto.produto.size() - 1;
            ultimoCod = Produto.produto.get(ultimaPos).getCodProduto();
        }
        int proxCod = ultimoCod + 1;
        return proxCod;
    }

    public void calcularPrecoVenda() {
        double lucro = getPrecoCusto() * 0.50; // 50% de lucro para sushi
        setPrecoVenda(lucro + getPrecoCusto());
    }

    public void listaDeOpcoes() {
        System.out.println(
                "Cod: " + this.codProduto
                + " | Tipo: " + getTipo()
                + " | Peixe: " + getPeixe()
                + " | Qtd disponível: " + this.getQuantDisponivel()
                + " | VALOR: R$" + getPrecoVenda()
        );
    }

    public boolean vender(int qtd, int qtdDisponivel) {
        if (qtd <= getQuantDisponivel()) {
            double valorDaVenda = this.precoVenda * qtd;
            totalQtdProdutoVendidos += qtd;
            valorTotalVendas += valorDaVenda;

            setQuantDisponivel(getQuantDisponivel() - qtd);
            return true;
        } else {
            return false;
        }
    }
}
