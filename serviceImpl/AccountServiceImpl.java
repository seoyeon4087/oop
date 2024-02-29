package serviceImpl;

import model.AccountDTO;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    public static AccountService getInstance;
    private static AccountService instance = new AccountServiceImpl();
    List<AccountDTO> accounts;
    private AccountServiceImpl() {
        this.accounts = new ArrayList<>();
    }
    public static AccountService getInstance() {
        return instance;
    }

    @Override
    public String createAccount(AccountDTO account) {
        return null;
    }

    @Override
    public String deposit(AccountDTO account) {
        return null;
    }

    @Override
    public String withdraw(AccountDTO account) {
        return null;
    }

    @Override
    public String getBalance(String accountNumber) {
        return null;
    }

    @Override
    public String cancelAccount() {
        return null;
    }

    @Override
    public List<AccountDTO> getAccount() {
        return null;
    }
}
