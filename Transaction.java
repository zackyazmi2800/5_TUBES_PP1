package Tubes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zack
 */
class Transaction {
    private String transaksiId;
    private double jumlah;
    private String tipeTransaksi; // "Deposit,Withdraw dan Transfer"

    public Transaction(String transaksiId, double jumlah, String tipeTransaksi) {
        this.transaksiId = transaksiId;
        this.jumlah = jumlah;
        this.tipeTransaksi = tipeTransaksi;
    }

    public String getTransaksiId() {
        return transaksiId;
    }

    public double getJumlah() {
        return jumlah;
    }

    public String getTipeTransaksi() {
        return tipeTransaksi;
    }

    @Override
    public String toString() {
        return "Transaction{" + 
               "ID Transaksi = " + transaksiId + 
               ", Jumlah = RP." + jumlah + 
               ", Tipe Transaksi = " + tipeTransaksi +
               "}";
    }
}
