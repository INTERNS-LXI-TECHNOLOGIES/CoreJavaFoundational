import java.util.Map;
import java.util.HashMap;

    public abstract class AtmOperationImp implements AtmOperationInt {
       Atm atm = new Atm();
        private Map<Double, String> ministatement;
            private Map<Long, Double> moneyTransfer;

                  public AtmOperationImp() {
                     this.ministatement = new HashMap<>();
                        this.moneyTransfer = new HashMap<>();

                     moneyTransfer.put(101010L, 12.0);
                   moneyTransfer.put(202020L, 14.0);

    }

             public double viewBalance() {
          System.out.println("Available balance : " + atm.getBalance());
       return atm.getBalance();


    }

    @Override
              public void deposit(double deposit) {
                    ministatement.put(deposit, "Amount Deposited");
                        System.out.println(deposit + " deposited Successfully ");
                                 atm.setBalance(atm.getBalance() + deposit);
                                         viewBalance();
    }

    @Override
                                                                        public void withdraw(double withdraw) {
                                                                         ministatement.put(withdraw, "Amount Withdrawn");
                                                                        if (withdraw % 100 == 0 || withdraw % 500 == 0) {
                                                                     if (withdraw <= atm.getBalance()) {
                                                                  System.out.println("Collect the cash" + withdraw);
                                                              atm.setBalance(atm.getBalance() - withdraw);
                                                          viewBalance();
                                                                     }
                                                                        }    else {
                                                  System.out.println("Please enter the amount in multiples of 100, 500");
        }
    }
    @Override
                                           public String miniStatement() {
                                        System.out.println("Last Transaction");
                                    for (Map.Entry<Double, String> m : ministatement.entrySet()) {
                                System.out.println(m.getKey() + " " + m.getValue());
                            }

                          return null;
                    }

                    public void fundTransfer(long personAccountNumber, double amount) {
                if (moneyTransfer.containsKey(personAccountNumber)) {
             double senderBalance = atm.getBalance();
           double personBalance = moneyTransfer.get(personAccountNumber);

        if (amount > 0 && amount <= senderBalance) {
            ministatement.put(amount,"debited to"+ moneyTransfer);
        atm.setBalance(senderBalance - amount);
          moneyTransfer.put(personAccountNumber, personBalance + amount);
             System.out.println("Fund transfer successful.");
                System.out.println("Updated balance: " + atm.getBalance());
            }     else {
                    System.out.println("Invalid amount or insufficient balance.");
            }
        }               else System.out.println("Recipient account not found.");
    }
}
