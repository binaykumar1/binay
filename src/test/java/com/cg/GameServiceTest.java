package com.cg;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cg.bean.Game;
import com.cg.repo.GameRepo;
import com.cg.service.GameService;
import com.cg.service.GameServiceImpl;

public class GameServiceTest {

	private GameService service;
	@Mock
	private GameRepo repo;

	@Before
	public void init() {

		MockitoAnnotations.initMocks(this);
		service = new GameServiceImpl(repo);
	}

	@Test
	public void test_createGame_success() {
		Game game = new Game("VollyBall", (byte) 16);

		when(repo.save(game)).thenReturn(true);

	    assertEquals(game, service.add(new Game("VollyBall", (byte) 16)));
	//	assertEquals(1, 1);
	}

	@Test(expected = NullPointerException.class)	
	public void test_createGame_throwsExceptionForIlllegalArguments() {

		service.add(new Game("VollyBall", (byte) 16));
		service.add(new Game(null, (byte) 16));
		service.add(new Game("VollyBall", (byte) 0));
		service.add(null);

	}

	/*
	 * @Test public void test_createGame_success() { Customer customer = new
	 * Customer("AAA", "9850276767", new Wallet(new BigDecimal(400)));
	 * when(repo.save(customer)).thenReturn(true); assertEquals(customer,
	 * service.createWallet("AAA", "9850276767", new BigDecimal(400))); }
	 * 
	 * @Test(expected = IllegalArgumentException.class) public void
	 * test_createWallet_throwsExceptionForIlllegalArguments() {
	 * service.createWallet(null, "9850276767", new BigDecimal(400));
	 * service.createWallet("AAA", null, new BigDecimal(400));
	 * service.createWallet("AAA", "9850276767", null); }
	 * 
	 * @Test public void test_showBalance_success() { Customer customer = new
	 * Customer("AAA", "9850276767", new Wallet(new BigDecimal(400)));
	 * when(repo.find("9850276767")).thenReturn(customer); assertEquals(customer,
	 * service.showBalance("9850276767")); }
	 * 
	 * @Test(expected = IllegalArgumentException.class) public void
	 * test_showBalance_throwsExceptionForIllegalArguments() {
	 * service.showBalance(null); }
	 * 
	 * @Test public void test_showBalance_returnsNullForInvalidAccount() {
	 * when(repo.find("9876544")).thenReturn(null);
	 * assertTrue(service.showBalance("9876544") == null); } // 1. Success // 2. If
	 * balance is less than the amount // 3. invalid mobile no
	 * 
	 * @Test public void test_withdraw_success() { Customer customer = new
	 * Customer("AAA", "9850276767", new Wallet(new BigDecimal(400)));
	 * when(repo.find("9850276767")).thenReturn(customer); assertEquals(new
	 * BigDecimal(200), service.withdraw("9850276767", new
	 * BigDecimal(200)).getWallet().getBalance()); }
	 * 
	 * @Test(expected = ci.training.exceptions.InsufficientBalanceException.class)
	 * public void test_withdraw_insufficientBalance() { Customer customer = new
	 * Customer("AAA", "9850276767", new Wallet(new BigDecimal(400)));
	 * when(repo.find("9850276767")).thenReturn(customer);
	 * service.withdraw("9850276767", new BigDecimal(500)); }
	 * 
	 * @Test public void test_withdraw_returnsNullForInvalidAccount() {
	 * when(repo.find("9876544")).thenReturn(null);
	 * assertTrue(service.withdraw("9876544", new BigDecimal(9999)) == null); } //
	 * 1. success // 2. amount should be valid // 3. invalid mobile no.
	 * 
	 * @Test public void test_deposit_success() { Customer customer = new
	 * Customer("AAA", "9850276767", new Wallet(new BigDecimal(400)));
	 * when(repo.find("9850276767")).thenReturn(customer); assertEquals(new
	 * BigDecimal(600), service.deposit("9850276767", new
	 * BigDecimal(200)).getWallet().getBalance()); }
	 * 
	 * @Test(expected = IllegalArgumentException.class) public void
	 * test_deposit_amountShouldNotBeLessThanZero() { service.deposit("9850276767",
	 * new BigDecimal(-200)); }
	 * 
	 * @Test public void test_deposit_returnsNullForInvalidAccount() {
	 * when(repo.find("9876544")).thenReturn(null);
	 * assertTrue(service.deposit("9876544", new BigDecimal(9999)) == null); }
	 */

}