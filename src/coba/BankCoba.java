package coba;

import pertemuan4.Bank;

public class BankCoba {
    public static void main(String[] args) {
        Bank hengky = new Bank("Hengky","2310010571");
        
        
        hengky.setNama("cuejb");
        hengky.setSaldo(5000);
        
        hengky.panggilSout();
    }
}
