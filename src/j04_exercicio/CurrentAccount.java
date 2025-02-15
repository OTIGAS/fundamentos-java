package j04_exercicio;

public class CurrentAccount {
    private String customerName;
    private String dateBirth;

    private int accountNumber;
    private int agencyNumber;

    private double accountBalance;

    public CurrentAccount(
            String customerName,
            String dateBirth,
            int accountNumber,
            int agencyNumber,
            double initialBalance
    ) {
        this.customerName = customerName;
        this.dateBirth = dateBirth;
        this.accountNumber = accountNumber;
        this.agencyNumber = agencyNumber;
        this.accountBalance = initialBalance;
    }

    public void withdrawValue (double value) {
        double auxAccountBalance = accountBalance - value;
        if (auxAccountBalance >= 0) {
            accountBalance = auxAccountBalance;
            System.out.println("Saldo atual: R$" + accountBalance);
        } else {
            System.out.println(
                    "Saldo da conta insuficiente, Saldo atual: R$" + accountBalance
            );
        }
    }

    public void transferValue (double value) {
        double auxAccountBalance = accountBalance - value;
        if (auxAccountBalance >= 0) {
            accountBalance = auxAccountBalance;
            System.out.println("Saldo atual: R$" + accountBalance);
        } else {
            System.out.println(
                    "Saldo da conta insuficiente, saldo atual: R$" + accountBalance
            );
        }
    }

    public void cancelAccount (String reason) {
        System.out.println("Conta cancelada - Motivo: " + reason);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(int agencyNumber) {
        this.agencyNumber = agencyNumber;
    }
}
