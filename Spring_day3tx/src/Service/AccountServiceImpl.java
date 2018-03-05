package Service;

import org.springframework.transaction.support.TransactionTemplate;

import Dao.AccountDao;

public class AccountServiceImpl implements AccountService {

	private AccountDao ad;
	private TransactionTemplate tt;
	
	public void setTt(TransactionTemplate tt) {
		this.tt = tt;
	}

	public void setAd(AccountDao ad) {
		this.ad = ad;
	}

	@Override
	public void transfer(Integer from, Integer to, Double money) {
		// TODO Auto-generated method stub

		ad.addmoney(to, money);
		int i=1/0;
		ad.dropmoney(from, money);
	}

}
