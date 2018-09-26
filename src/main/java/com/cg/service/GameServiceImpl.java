//package com.cg.service;
//
//import com.cg.bean.Game;
//
//public class GameServiceImpl implements GameService {
//
//	@Override
//	public Game add(Game id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}

package com.cg.service;

import com.cg.bean.Game;
import com.cg.repo.GameRepo;

public class GameServiceImpl implements GameService {

	private GameRepo repo;

	public GameServiceImpl(GameRepo repo) {
		super();
		this.repo = repo;
	}

	public Game add(Game g) {
		if (g.getGameName() == null || g.getNoOfPlayers() < 1) {
			throw new IllegalArgumentException();
		}
		Game game = new Game("VollyBall", (byte) 16);
		game = g;
		if (repo.save(game)) {
			return game;
		}
		return null;
	}

}